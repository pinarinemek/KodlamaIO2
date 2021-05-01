package kodlamaIO2;

public class StudentUserManager extends UserManager {
	
	public void watchLesson(User user) {
		System.out.println(user.getFirstName()+" dersi izledi.");
	}
}
