package cap03;
public class UsoStrings{
	
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1 == s2);

		// attenzione 
		String s3 = "java";
		String s4 = "java";
		
		
		System.out.println(s3.equals(s4));
		
		System.out.println(s3 == s4);

		s4 = "c++";
		
	}
	
	
}