package com.teska;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    //s.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
    //s.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem
    public static void main(String[] args) {
    int[] simpleArray = {1456, 24654, 3, 4654, 534245, 634, 7, 8, 9}; //tak można zainicjować tylko raz, każda następna modyfikacja musi być już na konkrentnych pozycjach
   // printArray(simpleArray);
        System.out.println(Arrays.toString(simpleArray)); //drukuje jako obiekt array, czyli surowy strumień [z nawiasami]

        printArray(reverseArray(simpleArray));
        System.out.println(Arrays.toString(simpleArray));

        Arrays.parallelSort(simpleArray); //może być .sort jeśli chcemy tylko jeden wątek ale wtedy wolniej
        System.out.println(Arrays.toString(simpleArray));

        //printArray(readUsingScanner(3));


    }


    public static void printArray(int[] array){
        for (int i : array) //można też użyć simpleArray.lenght przy normalnej pętli for
        {
            System.out.print(i + " ");
        }
    }

    public static int[] readUsingScanner(int input){
        int[] createdArray = new int [input]; //nowa macierz o podanej przez nas wielkości
        for (int i : createdArray) //dla wszystkich elementów createdArray
        {
            System.out.println("Enter value: ");
            int value = s.nextInt(); //jeśli user poda jakąś wartość int to ją zapisz do value
            s.nextLine(); //czekaj aż user coś wpisze i naciśnie enter
            createdArray[i] = value; // zapisz 'value' do kolejnej pozycji na macierzy
        }
        return createdArray; //zwróć całą macierz
    }

    public static int[] reverseArray(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2; // bo wystarczy posortować tylko połowę

        for (int i=0; i < halfLength;i++) //przestań zanim dojdziesz do połowy, skoro zamieniamy miejscami to wykonujemy dwie zamiany, więc wystarczy połowa
        {
        int temp = array[i]; // przypisz ten co został od końca za ten z przodu
        array[i] = array[maxIndex-i]; // zamień kolejny z tym samym od końca (lustrzanie)
        array[maxIndex-i] = temp; // ten sam od końca staje się kolejnym z przodu
        }
    return array;

    }


    }

