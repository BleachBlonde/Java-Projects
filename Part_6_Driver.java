package assignment_3;

public class Part_6_Driver {
	public static void main(String[] args) {
		Part_6_Task t1 = new Part_6_Task("Clean Room", 2);
		Part_6_Task t2 = new Part_6_Task("Sleep in", 5);
		Part_6_Task t3 = new Part_6_Task("Finish HW", 1);
		
		t1.setPriority(4);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
