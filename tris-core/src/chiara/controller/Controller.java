package chiara.controller;


import chiara.model.Circle;
import chiara.model.Cross;

public class Controller {

    public static final Integer DIM = 3;

    private String[][] field;

    public Controller() {
        this.field = new String[ DIM ][ DIM ];

        for ( int i = 0; i < DIM; i++ ) {
            for ( int j = 0; j < DIM; j++ )
                field[ i ][ j ] = "";
        }
    }

    // x and y are the position you want to go
    public void move( final String player, final int x, final int y ) {

        for ( int i = 0; i < DIM; i++ ) {
            for ( int j = 0; j < DIM; j++ ) {
                if ( i == x ) {
                    if ( j == y ) {
                        if ( field[ x ][ y ].equals( "" ) ) {
                            field[ x ][ y ] = player;
                        } else
                            System.out.println( "Position is already occupied" );
                    }
                }
            }
        }

    }


    public void printMatrix() {

        System.out.println();
        System.out.println( "  0   1   2" );
        System.out.println();
        System.out.println( "0  " + field[ 0 ][ 0 ] + "  |" + field[ 0 ][ 1 ] + "|" + field[ 0 ][ 2 ] );
        System.out.println( "  ----------" );
        System.out.println( "1  " + field[ 1 ][ 0 ] + "  |" + field[ 1 ][ 1 ] + "|" + field[ 1 ][ 2 ] );
        System.out.println( "  ----------" );
        System.out.println( "2  " + field[ 2 ][ 0 ] + "  |" + field[ 2 ][ 1 ] + "|" + field[ 2 ][ 2 ] );
        System.out.println();
    }

    public void printAvailablePositions() {
        for ( int i = 0; i < DIM; i++ ) {
            for ( int j = 0; j < DIM; j++ ) {
                if ( field[ i ][ j ].equals( "" ) )
                    System.out.println( "(" + i + "-" + j + ")" );
            }
        }
    }

    public boolean isOver() {
        return true;
    }

    public String[][] getField() {
        return field;
    }
}
