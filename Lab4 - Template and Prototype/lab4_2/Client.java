package lab4_2;

public class Client {
	public static void main(String[] args) {
		Employee developer1 = new Employee(1, "Panday", "Chandra", "1000 N 4th Street", "Fairfield", "IA", "52557",
				null, null);
		Employee developer2 = new Employee(2, "Zere", "Meweal", "1000 N 4th Street", "Fairfield", "IA", "52557", null,
				null);
		Employee developer[] = new Employee[] { developer1, developer2 };
		Employee supervisor = new Employee(3, "Sapkota", "Indra", "1100 S 3rd Street", "Ottuwmna", "IA", "52321", null,
				developer);
		developer1.setSupervisor(supervisor);
		developer2.setSupervisor(supervisor);
		
		Employee supervisorStaffs[] = new Employee[] { supervisor };
		
		Employee departmentHead = new Employee(4, "Lu", "Hanhong", "1100 N 4th Street", "Chicago", "IL", "61211", null, supervisorStaffs);
		supervisor.setSupervisor(departmentHead);

		/*System.out.println("=================After Clonning=================");
		Employee supervisor2 = (Employee)supervisor.clone();
		
		supervisor2.setFirstname("Supervisor Name Changed");
		supervisor2.getSupervisor().setFirstname("Prof. Hanhong");
		supervisor2.getStaff()[0].setFirstname("Staff Name Changed");
		System.out.println(supervisor2);
		
		
		System.out.println("==========Real Object============================");
		System.out.println(supervisor);*/
		System.out.println("=================After Clonning=================");
		Employee developer11 = (Employee)developer1.clone();
		
		developer11.setFirstname("Developer1 Name Changed");
		developer11.getSupervisor().setFirstname("Indira");
		developer11.getSupervisor().getSupervisor().setFirstname("Department Head Name");
		System.out.println(developer11);
		
		
		System.out.println("==========Real Object============================");
		System.out.println(developer1);
	}
}
