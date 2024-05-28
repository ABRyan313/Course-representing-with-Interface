package interfaceStudents;
import java.util.*;

public class Student implements Istudent{
	
	private static int number;
	private int id;
	private String name;
	private String mail;
	ArrayList <Icourse> courses = new ArrayList<>();
	
	public Student(String name, String mail, Icourse ... course) throws Exception {
		
		if(!Istudent.studentOk(name, mail)) throw new Exception("Invalid name/mail");
		this.name = name;
		this.mail = mail;
		
		
		for(Icourse c : course)
			courses.add(c);
		
		id = ++number;  
	}
	
	static {
		number = 1000;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getCount() {
		return courses.size();
	}

	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) throws Exception {
		
		if(!Istudent.studentOk(mail, name)) throw new Exception ("invalid name/mail");
		this.mail = mail;
		
	}
	
	public Icourse getCourse(int n) {
		return courses.get(n);
	}
	
	
	
	public Icourse getCourses( String id) throws Exception {
		for(Icourse c : courses)
			if(c.getId().equals(id))
				return c;
		throw new Exception("Course not found");
	}

	

	public ArrayList<Icourse> getCourses(int year) {
		ArrayList <Icourse> list = new ArrayList<>();
		for(Icourse c: courses)
			if(c.getYear() == year)
				list.add(c);
		return list;
	}
	
	public void add(Icourse course) throws Exception{
		for (Icourse c : courses) {
			if(course.getId().equals(c.getId()))
				throw new Exception ("Course is already added");
			courses.add(course);
		}
	}

	public String toString() {
		return "[" + id + "] " + name;
	}

	
	
	

}
