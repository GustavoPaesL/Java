import java.util.Random;

public class DiceRoller {

    Random rd;
    int number;


    DiceRoller(){
        rd = new Random();
        number = 0;
        roll();
    }

    void roll(){
        number = rd.nextInt(6)+1;
        System.out.println(number);
    }

}
