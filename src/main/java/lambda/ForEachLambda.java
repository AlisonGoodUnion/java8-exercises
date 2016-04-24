package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambda {

	public static void main(String[] args) {
		List<String> livros = new ArrayList<>();
		livros.add("Hobbit");
		livros.add("Fortaleza Digital");
		livros.add("Harry Potter e a Pedra Filosofal");

		livros.forEach(s -> System.out.println(s));
	}

}
