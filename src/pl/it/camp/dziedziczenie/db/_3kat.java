package pl.it.camp.dziedziczenie.db;

public abstract class _3kat implements _Figure {
    private int a, b, c;
    private final int perimeter;
    private final double area;

    public _3kat(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = this.a + this.b + this.c;
        this.area = (double) Math.round((
                Math.sqrt((double) getPerimeter() / 2
                        * ((double) getPerimeter() / 2 - getA())
                        * ((double) getPerimeter() / 2 - getB())
                        * ((double) getPerimeter() / 2 - getC())))
                * 100d) / 100d;
    }

    public static boolean isTriangle(int a, int b, int c) {
        if ((a <= 0) || (b <= 0) || (c <= 0)) return false;
        int[] boki = new int[]{a, b, c};
        int max = boki[0];
        for (int i = 0; i < boki.length; i++) {
            if (boki[i] > max) {
                max = boki[i];
            }
        }
        if (((a + b + c) - max) <= max) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.getA()).append(", ")
                .append(this.getB()).append(", ")
                .append(this.getC())
                .append(" | Obwód: ").append(this.getPerimeter())
                .append(" | Pole: ").append(this.getArea())
                .toString();
    }

    public double getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
