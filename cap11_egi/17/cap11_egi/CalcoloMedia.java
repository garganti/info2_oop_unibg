package cap11_egi;

public class CalcoloMedia {

	static int mediaInt(int x, int y) {
		return x + ((x-y) / 2);.x ...
	}
	public static void main(String[] args) {
		System.out.println(mediaInt(6, 8));
		System.out.println(mediaInt(100, 100));
		System.out.println(
			mediaInt(Integer.MAX_VALUE,Integer.MAX_VALUE));
		
	}
}
