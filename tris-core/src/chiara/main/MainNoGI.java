package chiara.main;

import chiara.controller.Controller;
import chiara.model.Figure;

import java.util.Scanner;

import static chiara.controller.Controller.DIM;

public class MainNoGI {

    private static Controller controller;
    private static String player;

    private static int x;
    private static int y;

    public static void main( String[] args ) throws Exception {

        controller = new Controller();

        Scanner in = new Scanner( System.in );
     /*   System.out.println( "Hi. Enter your name.." );
        String name = in.next();
        System.out.println( "Hi " + name + ", and welcome to Tic-Tac-Toe." );
        System.out.println();
        System.out.println( "Press 1 if you want to play with the x item or press 2 if you want to play with the o item" );
        player = in.next();
        if ( player.equals( "1" ) )
            player = "x";
        else
            player = "o";
        System.out.println( "Congratulation, you picked the " + player + "!" );*/
        player = "x";
        System.out.println();
        System.out.println("~~~~~ Ready to play? ~~~~~");
        System.out.println();
        System.out.println("Here the positions available:");
        System.out.println(" X-Y ");
        controller.printAvailablePositions();
        controller.printMatrix();
        System.out.println("Enter your X position:");
        x=in.nextInt();
        System.out.println("Enter your Y position:");
        y=in.nextInt();
        controller.move(player,x,y );
        controller.printMatrix();

    }


}