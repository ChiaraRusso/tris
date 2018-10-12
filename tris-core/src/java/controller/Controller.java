package java.controller;

import java.model.Figure;

import static java.main.MainNoGI.DIM;

public class Controller {

    private Figure circle;
    private Figure cross;

    // x and y are the position you want to go
    public void move( final Boolean[][] field, final Integer x, final Integer y ) {

        for ( int i = 0; i < DIM; i++ ) {
            for ( int j = 0; j < DIM; j++ ) {
                if ( i == x ) {
                    if ( j == y ) {
                        if ( !field[ x ][ y ] )
                            field[ x ][ y ] = true;
                    }
                }
            }
        }

    }


    public boolean isOver() {
        return true;
    }

}
