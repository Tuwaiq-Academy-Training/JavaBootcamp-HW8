public class Circle extends Shape{
    private double radius ;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle( double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        if(this.getRadius() > 0.0) {
            return Math.PI * Math.pow(this.getRadius(), 2);
        }
        return 0.0;
    }
    public double getPerimeter(){
        if(this.getRadius() > 0.0){
            return 2 * Math.PI * this.getRadius();
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Circle is" +
                "radius=" + this.getRadius() +
                "where its subclassof  "+ super.toString();
    }
}
