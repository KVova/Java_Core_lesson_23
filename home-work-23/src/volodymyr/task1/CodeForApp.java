package volodymyr.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CodeForApp {

	private static Collection<Commodity> commodArr = new ArrayList<>();
	
	public static Collection<Commodity> getCommodArr() {
		return commodArr;
	}

	public static void setCommodArr(Collection<Commodity> commodArr) {
		CodeForApp.commodArr = commodArr;
	}

	static Supplier<Commodity> Commo = () -> {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Input date to add :");
		System.out.println("Input name");
		String name = sc.nextLine();
		System.out.println("Input length");
		Integer length = sc.nextInt();
		System.out.println("Input width");
		Integer width = sc.nextInt();
		System.out.println("Input weight");
		Integer weight = sc.nextInt();
		
		try {
			Commodity commod = new Commodity(name, length, width, weight);
			commodArr.add(commod);
		} catch (Exception ex) {
			System.out.println("This product already exists!");
		}
		
		System.out.println("After add: " + new Commodity(name, length, width, weight));
		return new Commodity(name, length, width, weight);
	};

	public static void add() {
		Commodity tempCommod = Commo.get();
		commodArr.add(tempCommod);
	}
	
	public static void remove() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name commodity what you want to delete: \n");
		String name = scan.nextLine();
		
		getCommodArr().stream().filter(e -> e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
	}
	
	
	
}