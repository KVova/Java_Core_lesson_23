package volodymyr.task;

import java.util.Comparator;

import volodymyr.task.Representative;

public class RepresentativeSizeOfGrafterComperator implements Comparator<Representative>{

	@Override
	public int compare(Representative o1, Representative o2) {
		return o1.getGrafterSize() > o2.getGrafterSize() ? 1: -1;
	}

}