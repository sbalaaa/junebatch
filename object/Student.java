import java.util.Objects;

public class Student {
	
	int studentId;
	String name;
	
	void studying() {
		
	}
	
	void playing() {
		
	}
	
	
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name, studentId);
		//return Objects.hash(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentId == other.studentId;
		//return studentId == other.studentId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}
	
	
	

}
