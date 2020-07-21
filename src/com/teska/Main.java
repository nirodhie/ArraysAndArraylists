package com.teska;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    //s.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
    //s.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem
    public static void main(String[] args) {
    int[] simpleArray = {1456, 24654, 3, 4654, 534245, 634, 7, 8, 9}; //tak można zainicjować tylko raz
    printArray(simpleArray);


    printArray(readUsingScanner(3));


    }


    public static void printArray(int[] array){
        for (int i : array) //można też użyć simpleArray.lenght przy normalnej pętli for
        {
            System.out.println(i);
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

    }

