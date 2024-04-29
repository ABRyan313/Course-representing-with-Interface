package interfaceStudents;
import java.util.*;
import java.util.regex.*;

public interface Istudent {
	
	public int getId();
	public String getName();
	public void setName(String name);
	public int getCount();
	public String getMail();
	public Course getCourse(int n);
	public Course getCourses( String id) throws Exception;
	public ArrayList<Course> getCourses(int year);
	public String toString();
	
	public static boolean studentOk(String name, String mail) {
		return  name != null && name.length() > 0 && Email.mailOk(mail) ;
	}
	
	class Email{
		private static boolean mailOk(String mail) {
			String pattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9] {1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
				 Pattern p = Pattern.compile(pattern);
				 Matcher m = p.matcher(mail);
				 return m.matches();
		}
	}

}
