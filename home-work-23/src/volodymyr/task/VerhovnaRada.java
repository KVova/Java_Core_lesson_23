package volodymyr.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class VerhovnaRada {

	private static VerhovnaRada verhovnaRada;
	ArrayList<Faction> newFaction = new ArrayList<>();
	
	public static VerhovnaRada getVerhovnaRada() {
		return verhovnaRada;
	}

	public static void setVerhovnaRada(VerhovnaRada verhovnaRada) {
		VerhovnaRada.verhovnaRada = verhovnaRada;
	}

	public ArrayList<Faction> getNewFaction() {
		return newFaction;
	}

	public void setNewFaction(ArrayList<Faction> newFaction) {
		this.newFaction = newFaction;
	}

	Supplier<Faction> addFactionS = () -> {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть назву фракції: ");
		String factionName = scan.nextLine();
		Faction newF = new Faction(factionName);
		newFaction.add(newF);
		System.out.println("Створено нову фракцію: " + factionName);
		return new Faction(factionName);
	};

	public void addFaction() {
		getNewFaction().add(addFactionS.get());
	}
	
	public void removeFaction() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть назву фракції для видалення: ");
		String factionName = scan.nextLine();
		
		ArrayList<Faction> listFaction = (ArrayList<volodymyr.task.Faction>) getNewFaction().stream().filter(p->p.getFactionName().equals(factionName)).collect(Collectors.toList());
		setNewFaction(listFaction);
		System.out.println("Фракцію " + factionName + " було видалено.");
	}
	
	public void displayAllFaction() {
		Iterator<Faction> iterator = newFaction.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void addRepresentativeToSingleFaction() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть назву фракції ");
		String factionName = scan.nextLine().toLowerCase();
		
		Iterator<Faction> iterator = newFaction.iterator();
		while (iterator.hasNext()) {
			Faction next = iterator.next();

			if (next.getFactionName().toLowerCase().equals(factionName.toLowerCase())) {
				next.addRepresentative();
				break;
			} else {
		System.out.println("Такої фракції немає!");
//			}if(findAll.isPresent()) {
//				findAll.get().removeReprsentative();
//			}if(findAll.isPresent()) {
//				findAll.get().displayMostGrafter();
//			}if(findAll.isPresent()) {
//				findAll.get().displayAllGrafters();
//			}if(findAll.isPresent()) {
//				findAll.get().displayAllRepresentativs();
			}
		}
	}

	public void displayFaction() {
		try {
			System.out.println(getNewFaction());
		} catch (Exception ex) {
			System.out.println("Такої фракції не існує! ");
		}
	}

	public void removeRepresentativeFromSingleFaction() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть назву фракції ");
		String factionName = scan.nextLine().toLowerCase();
		
		Optional<Faction> findAll = getNewFaction().stream().filter(p -> p.getFactionName().equals(factionName)).findAny();
			if(findAll.isPresent()) {
				findAll.get().removeReprsentative();
//			}if(findAll.isPresent()) {
//				findAll.get().displayMostGrafter();
//			}if(findAll.isPresent()) {
//				findAll.get().displayAllGrafters();
//			}if(findAll.isPresent()) {
//				findAll.get().displayAllRepresentativs();
			}
		}
	
	public void displayMostGrafterInFaction() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть назву фракції \n");
		String factionName = scan.nextLine().toLowerCase();
		
		Optional<Faction> findAll = getNewFaction().stream().filter(p -> p.getFactionName().equals(factionName)).findAny();
			if(findAll.isPresent()) {
				findAll.get().displayMostGrafter();
//			}if(findAll.isPresent()) {
//				findAll.get().displayAllGrafters();
//			}if(findAll.isPresent()) {
//				findAll.get().displayAllRepresentativs();
			}
		}
	
	public void displayAllGrafterInFaction() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть назву фракції \n");
		String factionName = scan.nextLine().toLowerCase();
		
		Optional<Faction> findAll = getNewFaction().stream().filter(p -> p.getFactionName().equals(factionName)).findAny();
			if(findAll.isPresent()) {
				findAll.get().displayAllGrafters();
//			}if(findAll.isPresent()) {
//				findAll.get().displayAllRepresentativs();
			}
		}
	
	public void displayAllRepresentativesFromFaction() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть назву фракції \n");
		String factionName = scan.nextLine().toLowerCase();
		
		Optional<Faction> findAll = getNewFaction().stream().filter(p -> p.getFactionName().equals(factionName)).findAny();
			if(findAll.isPresent()) {
				findAll.get().displayAllRepresentativs();
			}
		}
	
//	public void addRepresentativeToSingleFaction() {
//		try {
//			newFaction().repeatCode().addRepresentative();
//		} catch (Exception ex) {
//			System.out.println("Такої фракції не існує! ");
//		}
//	}
//
//	public void removeRepresentativeFromSingleFaction() {
//		try {
//			repeatCode().removeReprsentative();
//		} catch (Exception ex) {
//			System.out.println("Такої фракції не існує! ");
//		}
//	}
//
//	public void displayAllGrafterInFaction() {
//		try {
//			repeatCode().displayAllGrafters();
//		} catch (Exception ex) {
//			System.out.println("Такої фракції не існує! ");
//		}
//	}
//
//	public void displayMostGrafterInFaction() {
//		try {
//			repeatCode().displayMostGrafter();
//		} catch (Exception ex) {
//			System.out.println("Такої фракції не існує! ");
//		}
//	}
//
//	public void displayAllRepresentativesFromFaction() {
//		repeatCode().displayAllRepresentativs();
//	}
	
	@Override
	public String toString() {
		return "VerhovnaRada [newFaction=" + newFaction + "]";
	}

	public static VerhovnaRada getInstance() {
		if (verhovnaRada == null) {
			verhovnaRada = new VerhovnaRada();
		}
		return verhovnaRada;
	}
	
}
