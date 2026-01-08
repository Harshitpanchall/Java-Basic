package SingleInheritance;

public class Student extends Person {
	
	protected int enrollment;
	protected int photo;
	
	public int getEnrollment() {
		return enrollment;
		
	}
	
	public void setEnrollment(int enrollment) {
		this.enrollment = enrollment;
		
	}
	
	public int getPhoto() {
		return photo;
		
	}
	
	public void setPhoto(int photo) {
		this.photo = photo;
	}

}
