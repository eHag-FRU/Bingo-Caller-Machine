public class CallerCard {
    static int cardLength;
    static int cardCollums;
    Object[][] card;

    public CallerCard() {
        card = new Object[5][15];

        for (int j = 0; j < 5; j++)  {
            for (int k = 0; k < 15; k++) {
                card[j][k] = " - ";
            }
        }

        cardLength = 15;
        cardCollums = 5;
    }

    public void add(int number) {
        if (number <= 15) {
            card[0][number - 1] = number;
            System.out.println("Successfully added " + number + " to the caller card");
        }

        if (number > 15 && number <= 30) {
            card[1][number - (cardLength + 1)] = number;
            System.out.println("Successfully added " + number + " to the caller card");
        }

        if (number > 30 && number <= 45) {
            card[2][number - (cardLength * 2)] = number;
            System.out.println("Successfully added " + number + " to the caller card");
        }

        if (number > 45 && number <= 60) {
            card[3][number - (cardLength * 3)] = number;
            System.out.println("Successfully added " + number + " to the caller card");
        }

        if (number > 60 && number <= 75) {
            card[4][number - (cardLength * 4)] = number;
            System.out.println("Successfully added " + number + " to the caller card");
        }

        this.display();
    }

    public void display() {
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1 -> System.out.print("B|");
                case 2 -> System.out.print("I|");
                case 3 -> System.out.print("N|");
                case 4 -> System.out.print("G|");
                default -> System.out.print("O|");
            }
            for (int n = 1; n < cardLength; n++) {

                System.out.print(card[i - 1][n]);


                /*if (i == 2) {
                    System.out.print("[" + (cardLength + n) + "] ");

                    card[i - 1][n - 1] = cardLength + n;

                } else if (i == 3) {
                    System.out.print("[" + ((cardLength * 2) + n) + "] ");

                    card[i - 1][n - 1] = (cardLength * 2) + n;

                } else if (i == 4) {
                    System.out.print("[" + ((cardLength * 3) + n) + "] ");

                    card[i - 1][n - 1] = (cardLength * 3) + n;

                } else if (i == 5) {
                    System.out.print("[" + ((cardLength * 4) + n) + "] ");

                    card[i - 1][n - 1] = (cardLength * 4) + n;

                } else {
                    System.out.print("[" + n + "] ");

                    card[i - 1][n - 1] = n;

                }*/
            }
            System.out.print(" |");
            System.out.printf("\n");


        }
    }
}
