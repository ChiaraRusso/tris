package chiara.controller;

import java.util.concurrent.ThreadLocalRandom;

import static chiara.controller.Controller.DIM;

public class AIController {

    public int getX() {
        return ThreadLocalRandom.current().nextInt( 0, 2 );
    }

    public int getY() {
        return ThreadLocalRandom.current().nextInt( 0, 2 );
    }

    public void generateOpponentPosition( String m[][], String opponent ) {
        for ( int i = 0; i < DIM; i++ ) {
            for ( int j = 0; j < DIM; j++ ) {
                if ( m[ i ][ j ].equals( " " ) ) {
                    m[ i ][ j ] = opponent;
                    return;
                }
            }
        }
    }
}
