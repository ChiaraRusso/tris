package chiara.model;

public class Circle implements Figure{

    private Integer x;
    private Integer y;

    public Integer getX() {
        return x;
    }
    public void setX( final Integer x ) {
        this.x = x;
    }
    public Integer getY() {
        return y;
    }
    public void setY( final Integer y ) {
        this.y = y;
    }

    public Circle x( Integer x ) {
        this.x = x;
        return this;
    }
    public Circle y( Integer y ) {
        this.y = y;
        return this;
    }
}
