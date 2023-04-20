package pl.it.camp.dziedziczenie.db;

public class Czworokat extends _4kat {
    public Czworokat(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    public String toString() {
        return new StringBuilder().append("Czworokąt | Boki: ")
                .append(super.toString())
                .toString();
    }
}
