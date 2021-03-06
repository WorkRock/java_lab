package e2017.exam1;
public class Example07 { 
	static String getFileExtension(String path) { 
		int index = path.lastIndexOf(".");
		if(index == -1)
			return null;
		return path = path.substring(index+1);
	} 
	public static void main(String[] args) { 
		String[] a = { "c:/data/student/lecture.docx",
				"c:/www/mainpage.html",
		"c:/program files/java/readme" }; 
		for (String s : a) {
			String extension = getFileExtension(s); 
			System.out.printf("%s ", extension); 
		} 
	} 
}
