package com.luxkapotter.springbootcleanarch;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.luxkapotter.springbootcleanarch.infrastructure.persistence.UserEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SpringBootCleanarchApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateUserSuccess() {

		var user = new UserEntity("User 1", "12345678", "user@mail.com");

		webTestClient
			.post()
			.uri("/users")
			.bodyValue(user)
			.exchange()
			.expectStatus().isOk()
			.expectBody()
			.jsonPath("$").exists()
			.jsonPath("$.email").isEqualTo(user.getEmail())
			.jsonPath("$.username").isEqualTo(user.getUsername());

	}

	@Test
	void testCreateUserFailure(){

		webTestClient
			.post()
			.uri("/users")
			.bodyValue(
				new UserEntity(" ", " ", " ")
			).exchange()
			.expectStatus().isBadRequest();
	}

}
