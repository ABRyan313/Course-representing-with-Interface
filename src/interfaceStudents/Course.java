package interfaceStudents;

public class Course implements Icourse {

	private int year;
	private Isubject sub;
	private int score = Integer.MIN_VALUE;

	public Course(int year, Isubject sub) throws Exception {
		if (!Icourse.courseOk(year, sub))
			throw new Exception("Invalid course!");
		this.year = year;
		this.sub = sub;
	}

	public String getId() {
		return year + "-" + sub.getId();
	}

	public int getYear() {
		return year;
	}

	public Isubject getSub() {
		return sub;
	}

	public boolean completed() {
		return score > Integer.MIN_VALUE;
	}
	
	public int getScore() throws Exception{
		if (score == Integer.MIN_VALUE) throw new Exception("Not completed");
		return score;
	}
	
	public void setScore(int score) throws Exception{
		if(!scoreOk(score)) throw new Exception("Illegal character!");
		this.score = score;
	}
	
	public void setScore(String score) throws Exception{
		try {
			int number = Integer.parseInt(score);
			if (!scoreOk(number)) throw new Exception("Illegal Score");
			this.score = number;
		}
		catch(Exception E) {
			System.out.println("Illegal score!");
		}
	}
	
	public String toString() {
		return sub.toString();
	}
	
	public boolean scoreOk(int score) {
		return true;
	}

}
