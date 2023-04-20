package pl.it.camp.dziedziczenie.db;

public class TrojkatRownoramienny extends _3kat {
    public TrojkatRownoramienny(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Trójkąt Równoramienny | Boki: ")
                .append(super.toString()).toString();
    }
}
