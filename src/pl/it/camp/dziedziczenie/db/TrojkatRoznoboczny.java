package pl.it.camp.dziedziczenie.db;

public class TrojkatRoznoboczny extends _3kat {
    public TrojkatRoznoboczny(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Trójkąt Różnoboczny | Boki: ")
                .append(super.toString()).toString();
    }
}
