package defaultt.methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStringsJava8 {
	
	public static void main(String[] args) {
		List<String> livros = new ArrayList<>();
		livros.add("Hobbit");
		livros.add("Fortaleza Digital");
		livros.add("Harry Potter e a Pedra Filosofal");
		
		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		livros.sort(comparador);
		
		System.out.println(livros);
	}

}
