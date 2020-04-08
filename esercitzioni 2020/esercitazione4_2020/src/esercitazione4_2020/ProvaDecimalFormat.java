package esercitazione4_2020;

import java.text.DecimalFormat;
import static java.lang.Math.*;

public class ProvaDecimalFormat {

	public static void main(String[] args) {
		String pattern = "0000000000";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		String format = decimalFormat.format(23241);
		System.out.println(format);
		sin(5);
	}

}
