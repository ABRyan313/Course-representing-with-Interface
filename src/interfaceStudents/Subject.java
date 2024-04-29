package interfaceStudents;



   public class Subject implements Isubject, IPoint{
	
	private String name;
	private String id;
	private int ects = 0;
	
	public Subject (String name, String id) throws Exception{
		this(name, id, 0);
	}
	
	public Subject(String name, String id, int ects) throws Exception {
		if(!Isubject.subjectOK(name, id))
			throw new Exception("Invalid name/id");
		if (ects < 0) throw new Exception("ECTS must be non-negative");
		this.name = name;
		this.id = id;
		this.ects = ects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception{
		if(!Isubject.subjectOK(name, id))
			throw new Exception("Invalid name");
		this.name = name;
	}

	public String getId() {
		return id;
	}
	
	@Override
	public int getECTS() {
		
		return ects;
	}

	@Override
	public void setECTS(int ects) throws Exception {
		if ( ects < 0 )throw new Exception ("ECTS must be non negative");
		this.ects = ects;
		
	}

	@Override
	public String toString() {
		return "Subject" + "[" + name + "," + id + "]";
	}

	

}
