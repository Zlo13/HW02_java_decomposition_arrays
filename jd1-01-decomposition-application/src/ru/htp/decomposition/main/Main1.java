package ru.htp.decomposition.main;

import java.util.Random;

public class Main1 {

	/*
	 * 1. Треугольник задан координатами своих вершин. Написать метод для вычисления
	 * его площади.
	 */

	public static void main(String[] args) {

		int x1, y1;
		int x2, y2;
		int x3, y3;

		double a, b, c;

		double p, s;

		x1 = randomValue(10);
		y1 = randomValue(10);
		x2 = randomValue(10);
		y2 = randomValue(10);
		x3 = randomValue(10);
		y3 = randomValue(10);

		a = side(x2, x1, y2, y1);
		b = side(x3, x3, y3, y2);
		c = side(x1, x2, y1, y3);

		print("Сторон треугольника А = ", a);
		print("Сторон треугольника В = ", b);
		print("Сторон треугольника С = ", c);

		p = perimeter(a, b, c);
		line();
		print("Периметр треугольника = ", p);

		s = area(a, b, c, p);
		line();
		print("Площадь треугольника = ", s);

	}

	public static double area(double a, double b, double c, double p) {
		double value;
		value = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c)); // округлил для красоты :)
		return value;
	}

	public static double perimeter(double a, double b, double c) {
		double value;
		value = a + b + c;
		return value;
	}

	public static double side(int x1, int y1, int x2, int y2) {
		double value;
		value = Math.sqrt(Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2);
		return value;
	}

	public static int randomValue(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit);

	}

	public static void print(String mesage, double a) {
		System.out.println(mesage + a);
	}

	public static void line() {
		System.out.println("-----------------------------");
	}

}
