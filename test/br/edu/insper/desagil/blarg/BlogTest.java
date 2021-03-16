package br.edu.insper.desagil.blarg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class BlogTest {

	@Test
	public void adicionaDoisPosts() {
		List<String> tags1 = new ArrayList<>();
		tags1.add("comida");
		tags1.add("mcdonalds");

		List<String> tags2 = new ArrayList<>();
		tags2.add("comida");
		tags2.add("burgerking");

		Blog blog = new Blog("MINHA VIDA");
		blog.addPost("Almoço de Hoje", "Fui comer no McDonald's", tags1);
		blog.addPost("Janta de Hoje", "Fui comer no Burger King", tags2);

		Map<String, List<Post>> postsPerTag = blog.getPostsPerTag();
		assertEquals(3, postsPerTag.size());
		assertEquals(2, postsPerTag.get("comida").size());
		assertEquals(1, postsPerTag.get("mcdonalds").size());
		assertEquals(1, postsPerTag.get("burgerking").size());
	}

}
