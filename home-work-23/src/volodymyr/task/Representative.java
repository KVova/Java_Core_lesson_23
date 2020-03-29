package volodymyr.task;

import java.util.Scanner;

public class Representative extends Human{

	private String firstName;
	private String lastName;
	private int age;
	private boolean grafter;
	private int grafterSize;

	public Representative(double weight, double height, String firstName, String lastName, int age, boolean grafter) {
		super(weight, height);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.grafter = grafter;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGrafter() {
		return grafter;
	}

	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}

	public int getGrafterSize() {
		return grafterSize;
	}

	public void setGrafterSize(int grafterSize) {
		this.grafterSize = grafterSize;
	}

	public void giveGrafter() {
		if (grafter == false) {
			
			System.out.println(" ��� ������� �� ���� ������");
			
		} else{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" ������ ���� ������: ");
			
			int graftSize = sc.nextInt();
			if (graftSize > 5000) {
				
				System.out.println("������ ��`������ ��������, c��� ������: " + graftSize);
			
			}else {
				grafterSize = graftSize;
			}
		}
	}

	@Override
	public String toString() {
		return "������� [��'� = " + firstName + ", ������� = " + lastName + ", ³� = " + age + ", �������� = "
				+ grafter + ", ���� ������ = " + grafterSize + "]";
	
	}
}
