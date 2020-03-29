package volodymyr.task2;

import java.util.HashSet;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
		Set<Practica> pra = new HashSet<>();
		
		pra.add(new Practica("Vania", 22));
		pra.add(new Practica("Vika", 25));
		pra.add(new Practica("Iryna", 24));
		pra.add(new Practica("Roma", 28));
		pra.add(new Practica("Valentyna", 20));

		System.out.println("Before sorting: ");
		for(Practica practica : pra) {
			System.out.println(practica);
			
		}
		System.out.println();
		System.out.println("After sorting use Comparable: ");
		pra.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).forEach(x-> System.out.println(x));
		
		System.out.println("\nAfter sorting use Comparator: ");
		pra.stream().sorted((a, b) -> !a.getName().equals(b.getName()) ? a.getName().compareTo(b.getName())
				: a.getNumber() - b.getNumber()).forEach(x -> System.out.println(x));
	}

}
