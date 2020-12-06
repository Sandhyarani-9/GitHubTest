public class Point {
    private int x;
    private int y;

    public Point(){
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
public void point(){
        int x=0;
        int y=0;
    }
    public void point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int distance(int pointX,int pointY){
        pointX=x;
        pointY=y;
        int distance;
        distance= (int) Math.sqrt((pointX)*(pointX)-(pointY)*(pointY));
        return distance;
       }
}

