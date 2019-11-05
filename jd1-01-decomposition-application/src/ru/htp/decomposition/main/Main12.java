package ru.htp.decomposition.main;

import java.util.Scanner;

public class Main12 {

// 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) 
//	вычисления его площади, если угол между сторонами длиной X и Y— прямой. 

	public static void main(String[] args) {

		int x;
		int y;
		int z;
		int t;
		double s;

		x = entreNum("Сторона X = ");
		y = entreNum("Сторона Y = ");
		z = entreNum("Сторона Z = ");
		t = entreNum("Сторона T = ");

		s = areaQuad(x, y, z, t);

		print("Площадь четырех угольника = ", s);

	}

	public static double areaQuad(int x, int y, int z, int t) {

		double p = 0.5 * (x + y + z + t);

		double s = Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));

		return s;

	}

	public static int entreNum(String mesage) {
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(mesage);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(mesage);
		}

		value = sc.nextInt();
		return value;

	}

	public static void print(String mesage, double s) {
		System.out.println(mesage + s);
	}

}
