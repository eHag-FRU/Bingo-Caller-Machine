import java.util.ArrayList;
import java.util.Random;

public class main {

    public static void main(String [] args) {
        CallerCard card = new CallerCard();

        card.display();

        Caller caller = new Caller(card);

        caller.nextNumber();


    }
}