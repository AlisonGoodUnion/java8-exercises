package i.method.reference;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;

public class Comparador {
	public static void main(String[] args) {
		List<String> livros = new ArrayList<>();
		livros.add("Hobbit");
		livros.add("Fortaleza Digital");
		livros.add("Harry Potter e a Pedra Filosofal");

		livros.sort(comparing(String::length));
	}

}
