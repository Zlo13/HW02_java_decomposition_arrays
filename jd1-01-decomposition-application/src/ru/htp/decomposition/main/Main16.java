package ru.htp.decomposition.main;

import java.util.Scanner;

public class Main16 {
	
// 16. Два простых числа называются «близнецами», если они отличаются друг 
//	от друга на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» 
//	из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения 
//	задачи использовать декомпозицию. 

	public static void main(String[] args) {

		int n;
		
		n = entreNum("Введите число больше 2:");

		twinsNum(n);

	
	}
	public static void twinsNum (int n) {

		for (int i = n; (i + 2) <= 2 * n; i++) {

			if (isSimple(i) && isSimple(i + 2))

				System.out.println(i + " + " + (i + 2));
		}
	}

	public static boolean isSimple(int a) {

		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0)
				return false;
		}
		return true;
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

}
