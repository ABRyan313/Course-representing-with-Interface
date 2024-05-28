package interfaceStudents;

public class Main {

	public static void main(String[] args) {
		// test1();
		Institution.getInstance().add(createTeam("Nokshal",
				createStudent("Abir", "AB4044@gmail", createCourse(2015, "Introduction to Java", "prg", 5, 7),
						createCourse(2015, "Algorithms", "ALG", 2, 7), createCourse(2015, "Database", "DB", 6, 8),
						createCourse(2016, "C programming", "CP", 3, 9)),
				createStudent("Jamal Kudu", "Jamal@kudu.com", createCourse(2017, "Animal", "BOL", 7, 2),
						createCourse(2017, "Engineering mathematics", "EM", 5, 7))),

				createTeam("A-10Warthog",
						createStudent("hobe keu", "hobeKeu@nomail", createCourse(2018, "Python", "PT", 3, 7),
								createCourse(2018, "Embedded Systems", "EM", 6, 8)),
						createStudent("Nafi", "Nafi@gmail", createCourse(2019, "Computer Networks", "CN", 7, 8),
								createCourse(2019, "Robotics", "RB", 7, 9))));
		print();

	}

	private static void print() {
		try {
		System.out.println(Institution.NAME);
		System.out.println();
		for (ITeam1 team : Institution.getInstance()) {
			System.out.println(team.getName());
			for (Istudent stud : team) {
				System.out.println();
				print1(stud);
			}
			System.out.println();
		}
	}
		catch(Exception E) {
			System.out.println(E.getMessage());
		}
	}

	private static ITeam1 createTeam(String name, Istudent ... stud) {
		ITeam1 t = new Team(name);

		t.add(stud);
		return t;
	}

	

	private static Istudent createStudent(String name, String mail, Icourse ... course) {

		try {
			return new Student(name, mail, course);

		} catch (Exception e) {
			return null;
		}

	}
	
	private static Icourse createCourse(int year, String name, String id, int ects, int score) {
		try {
			Icourse c = new Course(year, name, id);
			c.setScore(score);
			((IPoint) c.getSub()).setECTS(ects);
			return c;
		} catch (Exception e) {
			return null;
		}

	}

	/*
	 * private static void test1() {
	 * 
	 * try { Student std = new Student("AB", "abir4044@diu.edu.bd", new Course(2012,
	 * new Subject("Chaya", "HW"))); Student std1 = new Student("BC",
	 * "bc@gmail.com", new Course(2013, new Subject("light of the seven", "GT")),
	 * new Course(2014, new Subject("The dark Knight", "DK")), new Course(2015, new
	 * Subject("The god of Thunder", "THOR")));
	 * 
	 * 
	 * 
	 * 
	 * std.getCourses("2012-HW").setScore(5);
	 * std1.getCourses("2013-GT").setScore(6);
	 * std1.getCourses("2013-GT").setScore(6);
	 * std1.getCourses("2015-THOR").setScore(9);
	 * 
	 * print1(std); print1(std1);
	 * 
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * 
	 * }
	 */

	private static void print1(Istudent stud) {
		System.out.println(stud);
		for (int i = 1; i <= stud.getCount(); i++) {

			Icourse c = stud.getCourse(i);
			try {
				System.out.println(c + "," + (c.completed() ? +c.getScore() : "NOT COMPLETED"));
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

}
