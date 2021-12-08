package com.company;
import java.util.Scanner;
import java.lang.System;
import java.io.PrintStream;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Lütfen hesaplaması yapilacak sayiyi giriniz");
        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();

        System.out.println("girilen sayi :" +sayi+ "sayinin faktoriyeli :"+ faktoriyel(sayi));
    }
    public static int faktoriyel(int sayi){
        int fakt=1;
        for(int i=1;i<=sayi;i++){
            fakt=i*fakt;
        }
        return fakt;
    }
}
