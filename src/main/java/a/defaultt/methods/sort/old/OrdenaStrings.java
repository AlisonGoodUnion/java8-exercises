package a.defaultt.methods.sort.old;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
	
	public static void main(String[] args) {
		List<String> livros = new ArrayList<>();
		livros.add("Hobbit");
		livros.add("Fortaleza Digital");
		livros.add("Harry Potter e a Pedra Filosofal");
		
		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		Collections.sort(livros, comparador);
		
		System.out.println(livros);
	}
	
}
