package chiara.main;

import chiara.controller.Controller;
import chiara.model.Figure;

import java.util.Scanner;

import static chiara.controller.Controller.DIM;

public class MainNoGI {

    private static Controller controller;

    public static void main( String[] args ) throws Exception {

        controller = new Controller();

        Scanner in = new Scanner(System.in);
        System.out.println("Hi. Enter your name..");
        String name = in.next();
        System.out.println("Hi "+name+", and welcome to Tic-Tac-Toe.");
        System.out.println();
        System.out.println("Press 1 if you want to play with the x item or press 2 if you want to play with the o item");
        String guest = in.next();
        if(guest.equals( "1" ))
            guest = "x";
        else
            guest = "o";
        System.out.println("Congratulation, you picked the "+guest+"!");
    }


    private void printMatrix(Boolean[][] field){

    }

    private void printPositionAvailable(Boolean[][] field){

    }
}
