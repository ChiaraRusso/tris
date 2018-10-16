package chiara.controller;


import chiara.model.Circle;
import chiara.model.Cross;
import chiara.model.Figure;

public class Controller {

    public static final Integer DIM = 3;

    private Circle circle;
    private Cross cross;
    private Boolean[][] field;

    public Controller( final Circle circle, final Cross cross, final Boolean[][] field ) {
        this.circle = circle;
        this.cross = cross;
        this.field = field;
    }

    public Controller() {
        this.field = new Boolean[ DIM ][ DIM ];
        this.circle = new Circle();
        this.cross = new Cross();
    }

    // x and y are the position you want to go
    public void move( final Boolean[][] field, Figure f, final Integer x, final Integer y ) {

        for ( int i = 0; i < DIM; i++ ) {
            for ( int j = 0; j < DIM; j++ ) {
                if ( i == x ) {
                    if ( j == y ) {
                        if ( !field[ x ][ y ] ) {

                            field[ x ][ y ] = true;
                            f.setX( x );
                            f.setY( y );
                        } else
                            System.out.println( "Position is already occupied" );
                    }
                }
            }
        }

    }


    public boolean isOver() {
        return true;
    }

    public Circle getCircle() {
        return circle;
    }
    public void setCircle( final Circle circle ) {
        this.circle = circle;
    }
    public Cross getCross() {
        return cross;
    }
    public void setCross( final Cross cross ) {
        this.cross = cross;
    }
    public static Integer getDIM() {
        return DIM;
    }
}
