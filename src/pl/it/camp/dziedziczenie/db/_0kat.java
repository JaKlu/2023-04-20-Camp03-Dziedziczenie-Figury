package pl.it.camp.dziedziczenie.db;

public class _0kat implements _Figure {
    private int a;
    private final double perimeter;
    private final double area;

    public _0kat(int a) {
        this.a = a;
        this.perimeter = Math.round((2 * Math.PI * a) * 100d) / 100d;
        this.area = Math.round((Math.PI * a * a) * 100d) / 100d;
    }

    public static boolean isDisk(int a) {
        if (a <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Koło | Promień: ")
                .append(this.getA())
                .append(" | Obwód: ").append(this.getPerimeter())
                .append(" | Pole: ").append(this.getArea())
                .toString();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}
