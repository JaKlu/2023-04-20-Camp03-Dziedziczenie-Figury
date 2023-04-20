package pl.it.camp.dziedziczenie.core;

import pl.it.camp.dziedziczenie.db._Figure;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Core {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        String inviteToInput = "Wpisz 1 liczbę oznaczającą promień koła, " +
                "lub od 3 do 6 liczb oddzielonych spacją oznaczających boki figury.";

        String wrongInput = "Z podanych długości boków nie można zbudować ";

        String giveNumberGreaterThenZero = "Podaj liczbę większą od zera:";

        System.out.println("Ile figur?");
        int numberOfInputs = 0;

        while (true) {
            try {
                numberOfInputs = scanner.nextInt();
                scanner.nextLine();
                if (numberOfInputs <= 0) {
                    System.out.println(giveNumberGreaterThenZero);
                    continue;
                }
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println(giveNumberGreaterThenZero);
                scanner.nextLine();
            }
        }

        _Figure[] figures = new _Figure[numberOfInputs];

        System.out.println(inviteToInput);

        for (int i = 0; i < numberOfInputs; i++) {
            System.out.print("Figura " + (i + 1) + ": ");
            String figure = scanner.nextLine();

            String[] input = figure.trim().split(" ");
            int[] inputInt = new int[input.length];

            try {
                for (int j = 0; j < inputInt.length; j++) {
                    inputInt[j] = Integer.parseInt(input[j]);
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println(inviteToInput);
                i--;
                continue;
            }

            int a, b, c, d, e, f;
            switch (input.length) {
                case 1:
                    a = inputInt[0];
                    if (_Figure.whichFigureAmI(a) == null) {
                        System.out.println("Z podanej długości promienia nie można zbudować koła.");
                        i--;
                    } else {
                        figures[i] = _Figure.whichFigureAmI(a);
                    }
                    break;
                case 3:
                    a = inputInt[0];
                    b = inputInt[1];
                    c = inputInt[2];

                    if (_Figure.whichFigureAmI(a, b, c) == null) {
                        System.out.println(wrongInput + "trójkąta.");
                        i--;
                    } else {
                        figures[i] = _Figure.whichFigureAmI(a, b, c);
                    }
                    break;
                case 4:
                    a = inputInt[0];
                    b = inputInt[1];
                    c = inputInt[2];
                    d = inputInt[3];

                    if (_Figure.whichFigureAmI(a, b, c, d) == null) {
                        System.out.println(wrongInput + "czworokąta.");
                        i--;
                    } else {
                        figures[i] = _Figure.whichFigureAmI(a, b, c, d);
                    }
                    break;

                case 5:
                    a = inputInt[0];
                    b = inputInt[1];
                    c = inputInt[2];
                    d = inputInt[3];
                    e = inputInt[4];

                    if (_Figure.whichFigureAmI(a, b, c, d, e) == null) {
                        System.out.println(wrongInput + "pięciokąta.");
                        i--;
                    } else {
                        figures[i] = _Figure.whichFigureAmI(a, b, c, d, e);
                    }
                    break;
                case 6:
                    a = inputInt[0];
                    b = inputInt[1];
                    c = inputInt[2];
                    d = inputInt[3];
                    e = inputInt[4];
                    f = inputInt[5];

                    if (_Figure.whichFigureAmI(a, b, c, d, e, f) == null) {
                        System.out.println(wrongInput + "sześciokąta.");
                        i--;
                    } else {
                        figures[i] = _Figure.whichFigureAmI(a, b, c, d, e, f);
                    }
                    break;

                default:
                    System.out.println(inviteToInput);
                    i--;
                    break;
            }
        }

        for (_Figure element : figures) {
            System.out.println(element);
        }

    }
}