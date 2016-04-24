package lambda;

import java.util.ArrayList;
import java.util.List;

public class ComparadorLambda {

	public static void main(String[] args) {
		List<String> livros = new ArrayList<>();
		livros.add("Hobbit");
		livros.add("Fortaleza Digital");
		livros.add("Harry Potter e a Pedra Filosofal");

		livros.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
	}
}
