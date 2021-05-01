package kodlamaIO2;

public class Main {

	public static void main(String[] args) {
		
		StudentUser student = new StudentUser();
		student.setId(0);
		student.setFirstName("P�nar");
		student.setLastName("�nemek");
		student.setAge(19);
		student.setProfession("��renci");
		student.setEmail("student@gmail.com");
		student.setNationalIdentity("00000000000");
		student.setNumberPhone("5555555555");
		student.setSchool("s�leyman demirel �niversitesi");
		
		
		
		System.out.println(student.getAge());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getProfession());
		System.out.println(student.getEmail());
		System.out.println(student.getSchool());
		
		
		
		System.out.println("--------");
		
		InstructorUser �nstructor = new InstructorUser();
		�nstructor.setId(1);
		�nstructor.setAge(35);
		�nstructor.setFirstName("engin");
		�nstructor.setLastName("demiro�");
		�nstructor.setProfession("e�itmen");
		�nstructor.setEmail("�nstructor@gmail.com");
		�nstructor.setNationalIdentity("00000000000");
		�nstructor.setNumberPhone("5555555555");
		�nstructor.setSalary(00000);
		
		
		System.out.println(�nstructor.getAge());
		System.out.println(�nstructor.getFirstName());
		System.out.println(�nstructor.getLastName());
		System.out.println(�nstructor.getProfession());
		System.out.println(�nstructor.getEmail());
		
		
		
		System.out.println("-----");
		
		UserManager userManager = new UserManager();
		userManager.register(�nstructor);
		userManager.register(student);
		
		StudentUserManager studentUserManager = new StudentUserManager();
		studentUserManager.watchLesson(student);
		
		InstructorUserManager �nsInstructorUserManager = new InstructorUserManager();
		�nsInstructorUserManager.add(�nstructor);
		
		
		
		
		
		
	}

}
