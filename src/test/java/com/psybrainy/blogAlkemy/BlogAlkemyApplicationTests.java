package com.psybrainy.blogAlkemy;

import com.psybrainy.blogAlkemy.persistence.crud.PostCrudRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogAlkemyApplicationTests {

	@Autowired
	private PostCrudRepository post;

	@Test
	void find_PostEntity() {

	}

}
