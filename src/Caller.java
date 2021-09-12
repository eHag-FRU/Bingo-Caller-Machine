import java.util.ArrayList;
import java.util.Random;

public class Caller {
    Random ballPicker;
    ArrayList alreadyCalled;

    CallerCard card;

    public Caller(CallerCard card) {
        this.card = card;

        ballPicker = new Random();

        alreadyCalled = new ArrayList();
    }

    public void nextNumber() {
        int currentNumber = ballPicker.nextInt(75);

        System.out.println("The current number is: " + currentNumber);


        if (!alreadyCalled.contains(currentNumber) && currentNumber > 0) {
            card.add(currentNumber);
        }

    }

}