package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import stream.Curso;

public class OptionalTest {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		Optional<Curso> primeiroCurso = cursos.stream().filter(c -> c.getAlunos() > 50).findFirst();
		primeiroCurso.ifPresent(c -> System.out.println(c.getNome()));

		Curso curso = primeiroCurso.orElse(new Curso("Ruby", 10));
	}
}
