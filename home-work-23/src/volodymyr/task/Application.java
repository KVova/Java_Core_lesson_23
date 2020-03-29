package volodymyr.task;

import java.util.Scanner;

public class Application {

	public static void menu() {
		System.out.println("������ 1 ��� ������ �������");
		System.out.println("������ 2 ��� �������� ��������� �������");
		System.out.println("������ 3 ��� ������� �� �������");
		System.out.println("������ 4 ��� �������� ��������� �������");
		System.out.println("������ 5 ��� ������� ��������� �������");
		System.out.println("������ 6 ��� ������ �������� � �������");
		System.out.println("������ 7 ��� �������� �������� � �������");
		System.out.println("������ 8 ��� ������� ������ ��������� ");
		System.out.println("������ 9 ��� ������� ���������� ��������� ");
	}
	
	public static void main(String[] args) {
		
		VerhovnaRada Verhovna = VerhovnaRada.getInstance();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		while (true) {
			menu();

			switch (scan.next()) {
			case "1": {
				Verhovna.addFaction();
				break;
			}
			case "2": {
				Verhovna.removeFaction();
				break;
			}
			case "3": {
				Verhovna.displayAllFaction();
				break;
			}
			case "4": {
				Verhovna.removeRepresentativeFromSingleFaction();
				break;
			}
			case "5": {
				Verhovna.displayFaction();
				break;
			}
			case "6": {
				Verhovna.addRepresentativeToSingleFaction();
				break;
			}
			case "7": {
				Verhovna.removeRepresentativeFromSingleFaction();
				break;
			}
			case "8": {
				Verhovna.displayAllGrafterInFaction();
				break;
			}
			case "9": {
				Verhovna.displayMostGrafterInFaction();
				break;
			}
			}
			System.out.println();
		
		}
	}
}