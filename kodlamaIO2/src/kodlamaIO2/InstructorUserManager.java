package kodlamaIO2;

public class InstructorUserManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" ders ekledi.");
	}
}
