package pl.it.camp.dziedziczenie.db;

public class Kwadrat extends _4kat {
    private final double area;

    public Kwadrat(int a) {
        super(a, a, a, a);
        this.area = a * a;
    }


    public String toString() {
        return new StringBuilder().append("Kwadrat | Boki: ")
                .append(super.toString())
                .append(" | Pole: ").append(this.getArea())
                .toString();
    }

    public double getArea() {
        return area;
    }

}
