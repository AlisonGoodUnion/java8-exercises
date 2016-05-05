package b.defaultt.methods.sort.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import a.defaultt.methods.sort.old.ComparadorDeStringPorTamanho;

public class OrdenaStrings {
	
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
