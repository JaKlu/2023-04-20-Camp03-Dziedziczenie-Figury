package pl.it.camp.dziedziczenie.db;

public class Prostokat extends _4kat {
    private final double area;

    public Prostokat(int a, int b) {
        super(a, a, b, b);
        this.area = a * b;
    }

    public String toString() {
        return new StringBuilder().append("Prostokąt | Boki: ")
                .append(super.toString())
                .append(" | Pole: ").append(this.getArea())
                .toString();
    }

    public double getArea() {
        return area;
    }
}
