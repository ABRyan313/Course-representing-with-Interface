package interfaceStudents;

import java.util.ArrayList;
import java.util.Iterator;

public class Institution implements Iterable<ITeam1>{
	
	private static Institution instance = null;
	public final static String NAME = "Daffodil International University";
	private ArrayList <ITeam1> list = new ArrayList <>();
	
	private Institution(){
		
	}
	
	public static Institution getInstance() {
		
		if(instance == null) {
			synchronized(Institution.class) {
				if(instance == null) instance = new Institution();
			}
		}
		return instance;
		
	}
	
	public ITeam1 getTeam(String name) throws Exception{
		for(ITeam1 t: list) {
		if(t.getName().equals(name))
			return t;
	}
		throw new Exception("There is no team with the name \" + name");
	}
	
	public void add (ITeam1 ... teams ) {
		for(ITeam1 t: teams)
			list.add(t);
	}

	
	public Iterator<ITeam1> iterator() {
		return list.iterator();
	}
	

}
