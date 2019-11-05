package ru.htp.decomposition.main;

import java.util.Scanner;

public class Main6 {

// 6. Вычислить площадь правильного шестиугольника со стороной а, 
//	используя метод вычисления площади треугольника. 

	public static void main(String[] args) {

		double side, tri, hex;
		side = initSide("Сторона шестиугольника = ");

		tri = triangleArea(side);
		print("Площадь треугольника = ", tri);

		hex = hexagonArea(tri);
		print("Площадь шестиугольника = ", hex);

	}

	public static double hexagonArea(double a) {
		double hex;
		hex = a * 6;
		return hex;
	}

	public static double triangleArea(double a) {
		double tri;
		tri = Math.pow(a, 2) * Math.sqrt(3) / 4;
		return tri;
	}

	public static int initSide(String mesage) {
		int value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(mesage);

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println(mesage);
		}
		value = sc.nextInt();

		return value;

	}

	public static void print(String mesage, double a) {
		System.out.println(mesage + a);
	}

}
