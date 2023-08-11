package aula02;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		eMedia(50, 60, 80);
	}
	public static void eMedia(double ap1, double ap2, double ac) {
		double media = (ap1 + ap2) * 0.4 + ac * 0.2;
        System.out.println(media);
	}
		
}
