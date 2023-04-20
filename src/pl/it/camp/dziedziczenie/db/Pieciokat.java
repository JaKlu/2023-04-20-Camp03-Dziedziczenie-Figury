package pl.it.camp.dziedziczenie.db;

public class Pieciokat extends _5kat {
    public Pieciokat(int a, int b, int c, int d, int e) {
        super(a, b, c, d, e);
    }

    public String toString() {
        return new StringBuilder().append("Pięciokąt | Boki: ")
                .append(super.toString())
                .toString();
    }
}
