package interfaceStudents;

public interface Icourse {
	
	public String getId();
	public int getYear();
	public boolean completed();	
	public Isubject getSub();
	public int getScore() throws Exception;
	public void setScore(int score) throws Exception;
	public void setScore(String score) throws Exception;
	
	
	
	public static boolean courseOk(int year, Isubject sub) {
		return year >= 2010 && year <= 2020 && sub != null;
	}

}
