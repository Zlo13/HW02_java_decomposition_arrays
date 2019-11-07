package ru.htp.arrays.main;

public class Main18 {

//	18*. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, 
//	в которые надо вставить игральные кубики. Но дверь открывается только в том случае, 
//	когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10. 
//	(Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу, которая 
//	разгадывает код замка при условии, что два кубика уже вставлены в ячейки. 

	public static void main(String[] args) {

		int[] mas = new int[10];

		printMas(mas);

		crackingCode(mas);

	}

	public static void crackingCode(int[] mas) {
		for (int i = 0; i < mas.length - 2; i++) {
			
			if (mas[i] == 10 - (mas[i + 1] + mas[i + 2])) {
				
				System.out.println("\n" + mas[i] + " open");
				
			} else {
				
				System.out.println("\n" + mas[i] + " close");
			}
		}
	}

	public static void printMas(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			mas[i] = ((int) (Math.random() * 6) + 1);

			System.out.printf("%3d", mas[i]);
			System.out.print(" ");
		}
	}

}
