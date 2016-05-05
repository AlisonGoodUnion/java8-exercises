package c.defaultt.methods.foreach.old;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<String> livros = new ArrayList<>();
		livros.add("Hobbit");
		livros.add("Fortaleza Digital");
		livros.add("Harry Potter e a Pedra Filosofal");

		for (String s : livros) {
			System.out.println(s);
		}

	}
}
