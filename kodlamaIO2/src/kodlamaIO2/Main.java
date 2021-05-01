package kodlamaIO2;

public class Main {

	public static void main(String[] args) {
		
		StudentUser student = new StudentUser();
		student.setId(0);
		student.setFirstName("Pýnar");
		student.setLastName("Ýnemek");
		student.setAge(19);
		student.setProfession("öðrenci");
		student.setEmail("student@gmail.com");
		student.setNationalIdentity("00000000000");
		student.setNumberPhone("5555555555");
		student.setSchool("süleyman demirel üniversitesi");
		
		
		
		System.out.println(student.getAge());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getProfession());
		System.out.println(student.getEmail());
		System.out.println(student.getSchool());
		
		
		
		System.out.println("--------");
		
		InstructorUser ýnstructor = new InstructorUser();
		ýnstructor.setId(1);
		ýnstructor.setAge(35);
		ýnstructor.setFirstName("engin");
		ýnstructor.setLastName("demiroð");
		ýnstructor.setProfession("eðitmen");
		ýnstructor.setEmail("ýnstructor@gmail.com");
		ýnstructor.setNationalIdentity("00000000000");
		ýnstructor.setNumberPhone("5555555555");
		ýnstructor.setSalary(00000);
		
		
		System.out.println(ýnstructor.getAge());
		System.out.println(ýnstructor.getFirstName());
		System.out.println(ýnstructor.getLastName());
		System.out.println(ýnstructor.getProfession());
		System.out.println(ýnstructor.getEmail());
		
		
		
		System.out.println("-----");
		
		UserManager userManager = new UserManager();
		userManager.register(ýnstructor);
		userManager.register(student);
		
		StudentUserManager studentUserManager = new StudentUserManager();
		studentUserManager.watchLesson(student);
		
		InstructorUserManager ýnsInstructorUserManager = new InstructorUserManager();
		ýnsInstructorUserManager.add(ýnstructor);
		
		
		
		
		
		
	}

}
