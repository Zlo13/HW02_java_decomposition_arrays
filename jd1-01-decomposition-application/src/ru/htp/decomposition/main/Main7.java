package ru.htp.decomposition.main;

import java.util.Random;

public class Main7 {

// 7. На плоскости заданы своими координатами n точек. Написать метод(методы), 
//	определяющие, между какими из пар точек самое большое расстояние. Указание. 
//	Координаты точек занести в массив. 

	public static void main(String[] args) {

		int[][] mas = masLenths(3);

		intRandomXY(mas);

		int x1 = mas[0][0];
		int y1 = mas[1][0];

		printMas(mas);

		serchMaxDistance(mas, x1, y1);

	}

	public static double serchMaxDistance(int[][] mas, int x1, int y1) {
		double value = 0;
		double temp = 0;

		for (int i = 0; i < mas.length + 1; i++) {

			int x2 = mas[0][i];
			int y2 = mas[1][i];

			value = serchDistancePoint(x1, y1, x2, y2);

			if (temp <= value) {
				temp = value;

			}
		}

		System.out.println("-----------------");
		System.out.println(temp);

		return temp;

	}

	public static double serchDistancePoint(int x, int y, int x1, int y1) {
		double value;
		value = Math.sqrt((Math.pow(x1 - x, 2)) + (Math.pow(y1 - y, 2)));
		return value;

	}

	public static void intRandomXY(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
	}

	public static int[][] masLenths(int j) {

		int[][] mas = new int[2][j];
		return mas;

	}

	public static void printMas(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

	}

	public static void printDistance(String mesage, double a) {
		System.out.println(mesage + a);
	}
}