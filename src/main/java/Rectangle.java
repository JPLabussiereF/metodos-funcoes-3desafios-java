public class Rectangle {

    double base;
    double height;

    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;

    }

    public double calculateArea(){
        return base * height;
    }

    public double calculatePerimeter(){
        return 2 * (base + height);
    }

    public boolean isSquare(){
        return base == height;
    }

}

