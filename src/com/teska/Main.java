package com.teska;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
    int[] simpleArray = {1456, 24654, 3, 4654, 534245, 634, 7, 8, 9}; //tak można zainicjować tylko raz
    printArray(simpleArray);




    }


    public static void printArray(int[] array){
        for (int i : array) //można też użyć simpleArray.lenght przy normalnej pętli for
        {
            System.out.println(i);
        }
    }


    }

