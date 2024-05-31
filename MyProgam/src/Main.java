
public class Main {
    public static void main(String[] args) {    

        double x = add(1.3,2.7,3.5);

        System.out.println(x);

    }    
    
    static int add(int a, int b){

        System.out.println("ovload method #1");
        return a + b;

    }
    
    static int add(int a, int b, int c){

        System.out.println("ovload method #2");
        return a + b + c;

    }

    static double add(double a, double b){

        System.out.println("ovload method #1");
        return a + b;

    }
    
    static double add(double a, double b, double c){

        System.out.println("ovload method #2");
        return a + b + c;

    }
    

}