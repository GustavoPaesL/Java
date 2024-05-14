import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> food = new ArrayList<>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }

    }    
    
}