package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachConsumerAnonimo {

	public static void main(String[] args) {
		List<String> livros = new ArrayList<>();
		livros.add("Hobbit");
		livros.add("Fortaleza Digital");
		livros.add("Harry Potter e a Pedra Filosofal");

		livros.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
	}

}
