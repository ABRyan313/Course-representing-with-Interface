package interfaceStudents;

import java.util.ArrayList;

public interface ITeam1 extends Iterable<Istudent>{
	public String getName();
	 public void add(Istudent ... stud);
	 public boolean remove(int id);
	 public Istudent getStudent(int id) throws Exception;
	 public ArrayList<Istudent> findStudents(String name);
	 public ArrayList<Istudent> findStudents(String id, int year);
	 

}
