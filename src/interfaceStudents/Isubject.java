package interfaceStudents;

public interface Isubject {
	
		public String getName();
		public String getId();	
		public void setName(String name) throws Exception;
		
		@SuppressWarnings("null")
		public static boolean subjectOK(String name, String id) {
			return name != null || name.length() > 0 && id != null || id.length() > 0;
		}

}
