package pl.it.camp.dziedziczenie.db;

public class Szesciokat extends _6kat {
    public Szesciokat(int a, int b, int c, int d, int e, int f) {
        super(a, b, c, d, e, f);
    }

    public String toString() {
        return new StringBuilder().append("Sześciokąt | Boki: ")
                .append(super.toString())
                .toString();
    }
}
