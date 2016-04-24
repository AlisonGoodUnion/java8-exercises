package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorAnonimo {

	public static void main(String[] args) {
		List<String> livros = new ArrayList<>();
		livros.add("Hobbit");
		livros.add("Fortaleza Digital");
		livros.add("Harry Potter e a Pedra Filosofal");

		livros.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() < s2.length())
					return -1;

				if (s1.length() > s2.length())
					return 1;

				return 0;
			}
		});
	}

}
