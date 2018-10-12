package java.main;

import java.controller.Controller;

public class MainNoGI {

    public static final Integer DIM = 3;

    private Controller controller;

    private Boolean[][] field = new Boolean[ DIM ][ DIM ];

    public void main( String[] args ) throws Exception {

        setUp( field );

    }

    private void setUp( Boolean[][] field ) {
        for ( int i = 0; i < DIM; i++ ) {
            for ( int j = 0; j < DIM; j++ ) {
                field[ i ][ j ] = false; //empty position
            }
        }
    }

    private void printMatrix(Boolean[][] field){

    }


}
