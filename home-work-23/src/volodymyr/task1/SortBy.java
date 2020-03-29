package volodymyr.task1;

import java.util.ArrayList;

public class SortBy {

	public static void sortByName(ArrayList<Commodity> commodityList) {
		commodityList.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).forEach(a -> System.out.println(a));
	}
	
	public static void sortByLength(ArrayList<Commodity> commodityList) {
		commodityList.stream().sorted((a, b) -> a.getLength() - b.getLength()).forEach(a -> System.out.println(a));
	}

	public static void sortByWeigth(ArrayList<Commodity> commodityList) {
		commodityList.stream().sorted((a, b) -> a.getWeight() - b.getWeight()).forEach(a -> System.out.println(a));
	}
	
	public static void sortByWidth(ArrayList<Commodity> commodityList) {
		commodityList.stream().sorted((a, b) -> a.getWidth() - b.getWidth()).forEach(a -> System.out.println(a));
	}
	
	public static void sortByShowI(ArrayList<Commodity> commoditList, String name) {
		commoditList.stream().filter(x -> x.getName().equals(name)).forEach(a -> System.out.println(a));
	}
	
}