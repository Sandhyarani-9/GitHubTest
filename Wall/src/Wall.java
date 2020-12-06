public class Wall {
    //parameters
    private double width;
    private double height;

    //constructor
    public Wall() {
    }
    public Wall(double width, double height) {
        this.width=width;
        this.height=height;
        if(width<0){
            this.width=0;
        }
        if(height<0){
            this.height=0;
        }
    }

    //getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    //setters
    public void setWidth(double width) {
        if(width<0) {
            this.width = 0;
        }
        else{
            this.width=width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height=0;
        }
        else{
            this.height=height;
        }
    }

    //extra method
    public double getArea() {
        return (this.width * this.height);
    }

}
