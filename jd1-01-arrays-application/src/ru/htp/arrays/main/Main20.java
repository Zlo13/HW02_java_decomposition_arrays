package ru.htp.arrays.main;

public class Main20 {

//  20. Дан целочисленный массив с количеством элементов п. Сжать массив, 
//	выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
//	Примечание. Дополнительный массив не использовать. 

	public static void main(String[] args) {

		int[] mas = { 5, 19, 3, 6, 5, 8, 14, 2, 2, 58 };

		for (int i = 1; i < mas.length; i = i + 2) {

			mas[i] = 0;

		}

		for (int i = 0; i < mas.length; i++) {

			System.out.print("  " + mas[i]);

		}

	}

}
