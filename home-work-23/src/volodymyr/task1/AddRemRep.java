package volodymyr.task1;

import java.util.ArrayList;
import java.util.ListIterator;

public class AddRemRep {

	public static void addCommodity(ArrayList<Commodity> commodityList, String name, int length, int width, int weight) {
		commodityList.add(new Commodity(name, length, width, weight));
	}
	
	
	public static void removeCommodity(ArrayList<Commodity> commodityList, String name) {
		java.util.Iterator<Commodity> iterator = commodityList.iterator();
		while(iterator.hasNext()) {
			Commodity tempCommodity = iterator.next();
			if(tempCommodity.getName().equals(name)) {
				iterator.remove();
			}
		}
	}
	
	public static void changeCommodity(ArrayList<Commodity> commodityList, String oldName, String name, int length, int width, int weight) {
		ListIterator<Commodity> iter = commodityList.listIterator();
		while(iter.hasNext()) {
			Commodity tempCommodity = iter.next();
			if(tempCommodity.getName().equals(oldName)) {
				iter.set(new Commodity(name, length, width, weight));
			}
		}
	}
}