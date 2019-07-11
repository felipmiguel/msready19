package com.msready19.raist213.demoseapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@LocalServerPort
	private int port;

	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}

	TestRestTemplate restTemplate = new TestRestTemplate();

	@Test
	public void contextLoads() {
	}

	@Test
	public void testEcho() {
		String source = "Hello from ready!";
		HttpEntity<String> entity = new HttpEntity<String>(source);
		ResponseEntity<String> response = restTemplate.exchange(createURLWithPort("/"), HttpMethod.POST, entity,
				String.class);

		String expected = source;

		assertEquals(expected, response.getBody());
	}

}
