package com.example.java;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //1st task

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st string");
        String firstString = scanner.nextLine();

        System.out.println("Enter 2nd string");
        String secondString = scanner.nextLine();

        String concatString = firstString.concat(secondString);

        String resultString = concatString.replaceAll("[Pp]", "");

        System.out.println(resultString);


       //2nd task
        Computer workDestop = new Computer("HP", 27);
        Computer homeLaptop = new Computer("Apple", 13);
        Computer cloudServer = new Computer("Dell", 0);

        workDestop.computerType = ComputerType.desktop;
        homeLaptop.computerType = ComputerType.laptop;
        cloudServer.coreNumber = 32;


        System.out.println(workDestop);
        System.out.println(homeLaptop);
        System.out.println(cloudServer);


        //3rd task

        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " +myRect.area());








    }
}
