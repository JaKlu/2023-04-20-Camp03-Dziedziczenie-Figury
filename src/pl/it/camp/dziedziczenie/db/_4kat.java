package pl.it.camp.dziedziczenie.db;

public abstract class _4kat implements _Figure {
    private int a, b, c, d;
    private final int perimeter;

    public _4kat(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.perimeter = this.a + this.b + this.c + this.d;
    }


    public static boolean isQuadrangle(int a, int b, int c, int d) {
        if ((a <= 0) || (b <= 0) || (c <= 0) || (d <= 0)) return false;
        int[] boki = new int[]{a, b, c, d};
        int max = boki[0];
        for (int i = 0; i < boki.length; i++) {
            if (boki[i] > max) {
                max = boki[i];
            }
        }
        if (((a + b + c + d) - max) <= max) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        return new StringBuilder()
                .append(this.getA()).append(", ")
                .append(this.getB()).append(", ")
                .append(this.getC()).append(", ")
                .append(this.getD())
                .append(" | Obwód: ").append(this.getPerimeter())
                .toString();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getPerimeter() {
        return perimeter;
    }


}
