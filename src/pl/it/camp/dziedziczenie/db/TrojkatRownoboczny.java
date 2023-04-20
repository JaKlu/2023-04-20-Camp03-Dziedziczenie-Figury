package pl.it.camp.dziedziczenie.db;

public class TrojkatRownoboczny extends _3kat {
    public TrojkatRownoboczny(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Trójkąt Równoboczny | Boki: ")
                .append(super.toString()).toString();
    }
}
