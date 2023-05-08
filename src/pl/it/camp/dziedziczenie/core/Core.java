package pl.it.camp.dziedziczenie.core;

import pl.it.camp.dziedziczenie.db._Figure;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Core {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        String inviteToInput = "Wpisz 1 liczbę oznaczającą promień koła, " +
                "lub od 3 do 6 liczb oddzielonych spacją oznaczających boki figury.";

        String wrongInput = "Z podanych długości odcinków nie można zbudować figury";

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

            if (input.length == 2 || input.length > 6) {
                System.out.println(inviteToInput);
                i--;
                continue;
            }

            try {
                if (_Figure.whichFigureAmI(input) == null) {
                    System.out.println(wrongInput);
                    i--;
                } else {
                    figures[i] = _Figure.whichFigureAmI(input);
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println(inviteToInput);
                i--;
            }
        }

        for (_Figure element : figures) {
            System.out.println(element);
        }
    }
}