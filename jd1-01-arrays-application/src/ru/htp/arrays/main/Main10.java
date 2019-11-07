package ru.htp.arrays.main;

import java.util.Random;
import java.util.Scanner;

public class Main10 {
	
// 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. 

	public static void main(String[] args) {
		
		int a;

		a = enterNum("Укажите длинну массива");
		
		int [] mas = lengthMas(a);
		
		randomMasElement(mas);
		printMas(mas);
		
		printAi(mas);
		

	}
	public static void printAi (int [] mas) {
		int temp;
		for (int i = 0; i < mas.length; i++) {
			//System.out.println(i + " === " + mas[i]);
			if (i > mas[i]) {;
			temp = mas[i];
			System.out.printf("%4d",temp);}
			
			
		}
		
	}
	public static int enterNum(String mesage) {
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

	public static int[] lengthMas(int a) {
		int[] mas = new int[a];
		return mas;
	}

	public static void randomMasElement(int[] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
		}

	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d", mas[i]);
		}
		System.out.println();
		System.out.println("  --------------------------------------");
	}

	public static void print(String mesage, int a) {
		System.out.println(mesage + a);
	}


}
