package pl.it.camp.dziedziczenie.db;

public abstract class _5kat implements _Figure {
    private int a, b, c, d, e;
    private final int perimeter;

    public _5kat(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.perimeter = getA() + getB() + getC() + getD() + getE();
    }

    public static boolean isPentagon(int a, int b, int c, int d, int e) {
        if ((a <= 0) || (b <= 0) || (c <= 0) || (d <= 0) || (e <= 0)) return false;
        int[] boki = new int[]{a, b, c, d, e};
        int max = boki[0];
        for (int i = 0; i < boki.length; i++) {
            if (boki[i] > max) {
                max = boki[i];
            }
        }
        if (((a + b + c + d + e) - max) <= max) {
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
                .append(this.getD()).append(", ")
                .append(this.getE())
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

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getPerimeter() {
        return perimeter;
    }
}
