package org.example;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class Main {

static Integer bank = 1000;

    public static void main(String[] args) throws MalformedURLException {
        Scanner input = new Scanner(System.in);
        URL resource = Main.class.getResource("BlackJacjText.txt");
        System.out.println(resource );


    }
}