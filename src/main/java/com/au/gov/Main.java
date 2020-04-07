package com.au.gov;

import com.au.gov.service.ChildrenGameService;
import com.au.gov.service.ChildrenGameServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("Enter the size of children standing in circle");
            Scanner sc = new Scanner(System.in);
            int noOfChildren = sc.nextInt();
            System.out.println("Enter the number to eliminate recursively");
            sc = new Scanner(System.in);
            int noToEliminate = sc.nextInt();
            ChildrenGameService childrenGameService = new ChildrenGameServiceImpl();
            if(noOfChildren > 0 && noToEliminate > 0) {
                System.out.println("The remaining child in the circle is : "+childrenGameService.playGame(noOfChildren, noToEliminate));
            } else {
                System.out.println("Invalid input");
            }
        } catch (Exception e) {
            System.out.println("Please enter valid number");
        }

    }
}
