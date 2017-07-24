package assignment_4;

public class Part_3_Hospital {
	public static void main(String[] args) {
		Part_3_Receptionist recept = new Part_3_Receptionist();
		recept.stall();
		System.out.println();
		
		Part_3_Nurse nurse = new Part_3_Nurse();
		nurse.vital();
		nurse.getDoc();
		System.out.println();
		
		Part_3_Doctor doc = new Part_3_Doctor();
		doc.diagonse();
		doc.health();
		System.out.println();
		
		Part_3_Janitor janitor = new Part_3_Janitor();
		janitor.mop();
		System.out.println();
		
		Part_3_Surgeon surg = new Part_3_Surgeon();
		surg.putUnder();
		surg.diagonse();
		System.out.println();
		
		Part_3_Administrator admin = new Part_3_Administrator();
		admin.fire();
		
	}
}
