package QA27_7_1_Khramtsova;

class Rectangle extends Figure {
private double a;
private double b;

public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
}
@Override
double perimeter() {
    return 2 * (a + b);
}

@Override
    double square() {
        return a*b;
    }
}

