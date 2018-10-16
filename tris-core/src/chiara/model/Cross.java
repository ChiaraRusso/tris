package chiara.model;

public class Cross implements Figure{

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

    public Cross x( Integer x ) {
        this.x = x;
        return this;
    }
    public Cross y( Integer y ) {
        this.y = y;
        return this;
    }
}
