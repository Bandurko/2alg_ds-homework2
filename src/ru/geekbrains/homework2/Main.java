/*
Реализовать алгоритм пирамидальной сортировки (сортировка кучей).
* */
package ru.geekbrains.homework2;
public class Main {
    public static void main(String[] args) {

        int[] array = ArrayUtils.prepareArray();
        System.out.println("Массив случайных чисел");
        ArrayUtils.printArray(array);

        System.out.println();

        System.out.println("Массив отсортированый методом пирамидальной сортировки (сортировка кучей)");
        HeapSort.sort(array);
        ArrayUtils.printArray(array);

    }
}