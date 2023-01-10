public class QuadraticEquation {
    double a, b, c, delta;

    QuadraticEquation() {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        return ((-b + Math.sqrt(b * b - 4 * a * c))/ 2 * a);
    }
    public double getRoot2(){
        return ((-b - Math.sqrt(b*b - 4*a*c))/2*a);
    }
}
