package kodlamaIO2;

public class Main {

	public static void main(String[] args) {
		
		StudentUser student = new StudentUser();
		student.setId(0);
		student.setFirstName("Pınar");
		student.setLastName("İnemek");
		student.setAge(19);
		student.setProfession("öğrenci");
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
		
		InstructorUser ınstructor = new InstructorUser();
		ınstructor.setId(1);
		ınstructor.setAge(35);
		ınstructor.setFirstName("engin");
		ınstructor.setLastName("demiroğ");
		ınstructor.setProfession("eğitmen");
		ınstructor.setEmail("ınstructor@gmail.com");
		ınstructor.setNationalIdentity("00000000000");
		ınstructor.setNumberPhone("5555555555");
		ınstructor.setSalary(00000);
		
		
		System.out.println(ınstructor.getAge());
		System.out.println(ınstructor.getFirstName());
		System.out.println(ınstructor.getLastName());
		System.out.println(ınstructor.getProfession());
		System.out.println(ınstructor.getEmail());
		
		
		
		System.out.println("-----");
		
		UserManager userManager = new UserManager();
		userManager.register(ınstructor);
		userManager.register(student);
		
		StudentUserManager studentUserManager = new StudentUserManager();
		studentUserManager.watchLesson(student);
		
		InstructorUserManager ınsInstructorUserManager = new InstructorUserManager();
		ınsInstructorUserManager.add(ınstructor);
		
		
		
		
		
		
	}

}
