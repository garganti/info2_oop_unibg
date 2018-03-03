

public class UsoAssegnamento {
	
	public static void main(String[] args) {
		
		int y = 10;
		
		int x = 100 * (y = 20);
		
		System.out.println(x); // 2000
		System.out.println(y); // 20 
		
		String s = "oggi";
		String p = (s = s.toUpperCase()) + " è una bella giornata";
		
		System.out.println(p); // OGGI è un bella ..
		System.out.println(s);
		
		int b = 22;
		// SBAGLIATO IN JAVA ok in C
		int a =  (b == 20);
		
		boolean c = (b==20);
		
		int l = 10;
		System.out.println(l++); // 10		
		System.out.println(l++); //	11					
		System.out.println(++l); //	13	
		System.out.println(l+=--l); //	13	
					
				
				
				
				
	}

}
