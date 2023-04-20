package pl.it.camp.dziedziczenie.db;

public class SzesciokatForemny extends _6kat {
    private final double area;

    public SzesciokatForemny(int a) {
        super(a, a, a, a, a, a);
        this.area = Math.round((2.59808 * a * a) * 100d) / 100d;
    }

    public String toString() {
        return new StringBuilder().append("Sześciokąt foremny | Boki: ")
                .append(super.toString())
                .append(" | Pole: ").append(this.getArea())
                .toString();
    }

    public double getArea() {
        return area;
    }
}
