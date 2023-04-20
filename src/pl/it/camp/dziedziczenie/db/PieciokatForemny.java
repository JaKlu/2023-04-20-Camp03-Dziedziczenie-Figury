package pl.it.camp.dziedziczenie.db;

public class PieciokatForemny extends _5kat {
    private final double area;

    public PieciokatForemny(int a) {
        super(a, a, a, a, a);
        this.area = Math.round((1.72048 * a * a) * 100d) / 100d;
    }

    public String toString() {
        return new StringBuilder().append("Pięciokąt foremny | Boki: ")
                .append(super.toString())
                .append(" | Pole: ").append(this.getArea())
                .toString();
    }

    public double getArea() {
        return area;
    }
}
