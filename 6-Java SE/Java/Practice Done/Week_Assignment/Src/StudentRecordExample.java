public class StudentRecordExample {
	public static void main(String[] args) {
		
		StudentRecord annaRecord =new StudentRecord();
		
		
		StudentRecord.increaseStudentCount();
		
		
		StudentRecord beahRecord =new StudentRecord();
		
		
		StudentRecord.increaseStudentCount();
		
		
		StudentRecord crisRecord =new StudentRecord();
		
		
		StudentRecord.increaseStudentCount();
		
		
		annaRecord.setName("Anna");
		beahRecord.setName("Beah");
		crisRecord.setName("Cris");
		
		// Print anna's name.
		System.out.println("Name = " + annaRecord.getName());
		
		// Print number of students.
		System.out.println("Student Count = "+StudentRecord.getStudentCount());
	}
}