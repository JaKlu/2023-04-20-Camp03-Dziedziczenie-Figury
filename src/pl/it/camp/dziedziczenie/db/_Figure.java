package pl.it.camp.dziedziczenie.db;

import java.util.InputMismatchException;

public interface _Figure {

    static _Figure whichFigureAmI(String[] input) throws InputMismatchException, NumberFormatException {
        int[] inputInt = new int[input.length];

        for (int j = 0; j < inputInt.length; j++) {
            inputInt[j] = Integer.parseInt(input[j]);
        }

        switch (inputInt.length) {
            case 1:
                return _Figure.whichFigureAmI(inputInt[0]);
            case 3:
                return _Figure.whichFigureAmI(inputInt[0], inputInt[1], inputInt[2]);
            case 4:
                return _Figure.whichFigureAmI(inputInt[0], inputInt[1], inputInt[2], inputInt[3]);
            case 5:
                return _Figure.whichFigureAmI(inputInt[0], inputInt[1], inputInt[2], inputInt[3], inputInt[4]);
            case 6:
                return _Figure.whichFigureAmI(inputInt[0], inputInt[1], inputInt[2], inputInt[3], inputInt[4], inputInt[5]);
            default:
                break;
        }
        return null;
    }

    static _0kat whichFigureAmI(int a) {
        if (!(_0kat.isDisk(a))) {
            return null;
        }
        return new _0kat(a);
    }

    static _3kat whichFigureAmI(int a, int b, int c) {
        if (!(_3kat.isTriangle(a, b, c))) {
            return null;
        }
        if (a == b && b == c) {
            return new TrojkatRownoboczny(a, b, c);
        }
        if (a == b || b == c || a == c) {
            return new TrojkatRownoramienny(a, b, c);
        }
        return new TrojkatRoznoboczny(a, b, c);
    }

    static _4kat whichFigureAmI(int a, int b, int c, int d) {
        if (!(_4kat.isQuadrangle(a, b, c, d))) {
            return null;
        }
        int[] boki = new int[]{a, b, c, d};
        int temp;
        for (int i = 0; i < boki.length; i++) {
            for (int j = 0; j < boki.length - 1; j++) {
                if (boki[j + 1] < boki[j]) {
                    temp = boki[j + 1];
                    boki[j + 1] = boki[j];
                    boki[j] = temp;
                }
            }
        }
        if (boki[0] == boki[1] && boki[1] == boki[2] && boki[2] == boki[3]) {
            return new Kwadrat(boki[0]);
        }
        if (boki[0] == boki[1] && boki[2] == boki[3]) {
            return new Prostokat(boki[0], boki[2]);
        }
        return new Czworokat(a, b, c, d);
    }

    static _5kat whichFigureAmI(int a, int b, int c, int d, int e) {
        if (!(_5kat.isPentagon(a, b, c, d, e))) {
            return null;
        }
        if (a == b && b == c && c == d && d == e) {
            return new PieciokatForemny(a);
        }
        return new Pieciokat(a, b, c, d, e);
    }

    static _6kat whichFigureAmI(int a, int b, int c, int d, int e, int f) {
        if (!(_6kat.isHexagon(a, b, c, d, e, f))) {
            return null;
        }
        if (a == b && b == c && c == d && d == e && e == f) {
            return new SzesciokatForemny(a);
        }
        return new Szesciokat(a, b, c, d, e, f);
    }
}
