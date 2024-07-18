package mutilevel;

class MainClass {
	public static void main(String[] args) {
		Department d=new Department ();
		System.out.println("University name"+d.universityname);
		System.out.println("College exams"+d.collegename);
		System.out.println("Department name"+d.departmentname);

		System.out.println("__________________");
		d.giveAssignments();
		d.conductExams();
		d.conductInternals();

	}
}

