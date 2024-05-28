package QA27_7_1_Khramtsova;

class Circle extends Figure
{
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    double square() {
        return Math.PI*radius*radius;
    }
}
