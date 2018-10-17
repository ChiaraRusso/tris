package chiara.controller;


public class Controller {

    public static final Integer DIM = 3;

    private String[][] field;

    public Controller() {
        this.field = new String[ DIM ][ DIM ];

        for ( int i = 0; i < DIM; i++ ) {
            for ( int j = 0; j < DIM; j++ )
                field[ i ][ j ] = " ";
        }
    }

    // x and y are the position you want to go
    public void move( final String player, final int x, final int y ) {

        for ( int i = 0; i < DIM; i++ ) {
            for ( int j = 0; j < DIM; j++ ) {
                if ( i == x ) {
                    if ( j == y ) {
                        if ( field[ x ][ y ].equals( " " ) ) {
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
        String fs = String.format(
                        "\t  %s | %s | %s  \n" +
                        "\t-------------\n"    +
                        "\t  %s | %s | %s  \n" +
                        "\t-------------\n"+
                        "\t  %s | %s | %s  \n\n",
                field[ 0 ][ 0 ],field[ 0 ][ 1 ],field[ 0 ][ 2 ],
                field[ 1 ][ 0 ],field[ 1 ][ 1 ],field[ 1 ][ 2 ],
                field[ 2 ][ 0 ],field[ 2 ][ 1 ],field[ 2 ][ 2 ]
        );

        System.out.println(fs);

    }

    public void printAvailablePositions(Thread t) throws InterruptedException {
        for ( int i = 0; i < DIM; i++ ) {
            for ( int j = 0; j < DIM; j++ ) {
                if ( field[ i ][ j ].equals( " " ) ){
                    t.sleep( 500 );
                    System.out.println( "(" + i + "-" + j + ")" );}
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
