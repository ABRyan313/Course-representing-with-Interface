package interfaceStudents;


import java.util.ArrayList;
import java.util.Iterator;

public class Team implements ITeam1{
	
	private String name;
	private ArrayList <Istudent> list = new ArrayList <>();
	
	public Team(String name) {
		this.name = name;
	}
	
	
	public Iterator<Istudent> iterator() {
		return list.iterator();
	}

	
	public String getName() {
		return name;
	}

	
	public void add(Istudent ... stud) {
		
		for(Istudent s: stud)
			list.add(s);
		
	}

	public boolean remove(int id) {
		for(int i = 0; i < list.size(); i++ ) {
			if(list.get(i).getId() == id) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	public Istudent getStudent(int id) throws Exception {
		for(Istudent s: list) 
			if(s.getId() == id) 
				return s;
		throw new Exception("Student not found");	
	}

	public ArrayList<Istudent> findStudents(String name) {
		ArrayList <Istudent> list = new ArrayList <>();
		for(Istudent s: list) {
			if(s.getName().contains(name)) {
				list.add(s);
			}
		}
		return list;
	}

	public ArrayList<Istudent> findStudents(String id, int year) {
		ArrayList <Istudent> list = new ArrayList<>();
		for(Istudent s: list) {
			for(Icourse c: s.getCourses(year)) {
				if(c.completed() && c.getSub().getId().equals(id))
					list.add(s);
			}
			
		}
		 return list;
	}
}
	
