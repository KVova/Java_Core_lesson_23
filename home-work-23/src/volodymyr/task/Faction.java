package volodymyr.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Faction {

	private String factionName;

	private Collection<Representative> factionArr = new ArrayList<>();

	
	public Faction(String factionName) {
		super();
		this.factionName = factionName;
	}
	
	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	public Collection<Representative> getFaction() {
		return factionArr;
	}

	@SuppressWarnings("unchecked")
	public void setFaction(Stream<Representative> stream) {
		this.factionArr = (Collection<Representative>) stream;
	}

	
	Supplier<Representative> factionRep = ()-> {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("��'� ��������? ");
		String firstName = scan.nextLine();

		System.out.println("������� ��������? ");
		String lastName = scan.nextLine();

		System.out.println("³� ��������? ");
		int age = scan.nextInt();

		System.out.println("���� ��������? ");
		double height = scan.nextDouble();

		System.out.println("���� ��������? ");
		double weight = scan.nextDouble();

		System.out.println("������� �������� ���/�? ");
		boolean giveGrafter = scan.hasNextBoolean();

		try {
			Representative MP = new Representative(weight, height, firstName, lastName, age, giveGrafter);
			factionArr.add(MP);
		} catch (Exception ex) {
			System.out.println("����� ������� ��� � � �������!");
		}
		
		return new Representative(weight, height, firstName, lastName, age, giveGrafter);
	};
	
	public void addRepresentative() {
		Representative representative1 = factionRep.get();
		
		if(representative1.isGrafter()) {
			representative1.giveGrafter();
		}
		factionArr.add(representative1);
	}
	
	
	@SuppressWarnings("unchecked")
	public void removeReprsentative() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("������� ��������, ����� ������ �������� � �������");
		String lastName = scan.nextLine();

		setFaction((Stream<Representative>) getFaction().stream().filter(e->e.getLastName().equalsIgnoreCase(lastName)).collect(Collectors.toList()));
		
	}
	
	public void displayAllGrafters() {

		Iterator<Representative> iterator = factionArr.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void displayGrafters() {
		getFaction().stream().filter(r -> r.isGrafter()).forEach(System.out::println);
	}
	
	public void displayMostGrafter() {
		Optional<Representative> findAll = getFaction().stream().findAny();
		
		if(findAll.isPresent()) {
			System.out.println("��������� ��������: " + findAll.get().toString());
		}else System.out.println("��������� ������");
	}

	public void displayAllRepresentativs() {
		Iterator<Representative> iterator = factionArr.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void clearFaction() {
		factionArr.clear();
	}

	@Override
	public String toString() {
		return "Faction [factionName=" + factionName + ", factionArr=" + factionArr + ", factionRep=" + factionRep
				+ "]";
	}
}