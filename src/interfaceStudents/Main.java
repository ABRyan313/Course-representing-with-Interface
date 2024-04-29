package interfaceStudents;


public class Main {

	public static void main(String[] args) {
		test1();

	}
	
	private static void test1() {
		
		try {
			Student std = new Student("AB", "abir4044@diu.edu.bd", new Course(2012, new Subject("Chaya", "HW")));
			Student std1 = new Student("BC", "bc@gmail.com", new Course(2013, new Subject("light of the seven", "GT")),
					new Course(2014, new Subject("The dark Knight", "DK")), new Course(2015, new Subject("The god of Thunder", "THOR")));
			
		
			
			
			std.getCourses("2012-HW").setScore(5);
			std1.getCourses("2013-GT").setScore(6);
			std1.getCourses("2013-GT").setScore(6);
			std1.getCourses("2015-THOR").setScore(9);
			
			print(std);
			print(std1);
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void print(Student stud) {
		System.out.println(stud);
		for(int i = 0; i < stud.getCount(); i++) {
			
			Course c = stud.getCourse(i);
			try {
				System.out.println(c +"," + (c.completed() ? + c.getScore() : "NOT COMPLETED"));
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}

}
