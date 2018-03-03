import javax.sql.rowset.serial.SerialArray;

import serial.Serial;
import episodi.Episode;
import episodi.EpisodeLO;



public class Prova {

	public static void main(String[] args) {
		Episode e1 = new Episode("Leonard meets Penny", "trama");
		Episode e2 = new Episode("Leonard meets PENNY", "trama");
		System.out.println(e1.equals(e2));
		System.out.println(e1 == e2);
		System.out.println(e1.equals("Leonard meets Penny"));
		
		
		Episode e3 = new Episode("Leonard meets Sheldon","");
		e1.setNext(e3);
		
		Episode e4 = new EpisodeLO("Sheldon compra il PC", "", "it");
		e3.setNext(e4);
		
		Serial bbt = new Serial("big bang theory",e1);
		System.out.println(bbt.toString());
		

	}

}
