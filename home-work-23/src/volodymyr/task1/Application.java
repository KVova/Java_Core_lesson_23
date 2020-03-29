package volodymyr.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Press 1 to add");
		System.out.println("Press 2 to remove");
		System.out.println("Press 3 to change");
		System.out.println("Press 4 to sort by Name");
		System.out.println("Press 5 to sort by Length");
		System.out.println("Press 6 to sort by Width");
		System.out.println("Press 7 to sort by Weight");
		System.out.println("Press 8 to search by index");
		System.out.println("Press 9 to exit");
	}

	public static void main(String[] args) {

		ArrayList<Commodity> commodityList = new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {

			case "1":
				System.out.println("Before add: " + commodityList);
				System.out.println("Enter name of commodity");
				String name = sc.next();
				System.out.println("Input length");
				Integer length = sc.nextInt();
				System.out.println("Input width");
				Integer width = sc.nextInt();
				System.out.println("Input weight");
				Integer weight = sc.nextInt();
				
				AddRemRep.addCommodity(commodityList, name, length, width, weight);
				System.out.println("After add: " + commodityList);
				break;
			case "2":
				System.out.println("Before remove: " + commodityList);
				System.out.println("Enter name of commodity to remove: ");
				name = sc.next();
				AddRemRep.removeCommodity(commodityList, name);
				System.out.println("After remove: " + commodityList);
				break;
			case "3":
				
				System.out.println("Enter name of commodity which you want change: ");
				String oldName = sc.next();
				System.out.println("Input new name");
				name = sc.nextLine();
				System.out.println("Input new length");
				length = sc.nextInt();
				System.out.println("Input new width");
				width = sc.nextInt();
				System.out.println("Input new weight");
				weight = sc.nextInt();
				
				System.out.println("Before change: " + commodityList);
				System.out.println("After change: ");
				AddRemRep.changeCommodity(commodityList, oldName, name, length, width, weight);
				
				break;
			case "4":
				System.out.println("Before sort: " + commodityList);
				System.out.println("After sort: ");
				SortBy.sortByName(commodityList);
				
				break;
			case "5":
				System.out.println("Before sort: " + commodityList);
				System.out.println("After sort: ");
				SortBy.sortByLength(commodityList);
				
				break;
			case "6":				
				System.out.println("Before sort: " + commodityList);
				System.out.println("After sort: ");
				SortBy.sortByWidth(commodityList);
				
				break;
			case "7":
				System.out.println("Before sort: " + commodityList);
				System.out.println("After sort: ");
				SortBy.sortByWeigth(commodityList);
				
				break;
			case "8":
				System.out.println("Enter name:");
				name = sc.next();
				System.out.println("Before sort: " + commodityList);
				System.out.println("After sort: ");
				SortBy.sortByShowI(commodityList, name);
				
				break;
			case "9":
				System.exit(0);

			}
		}
	}
}