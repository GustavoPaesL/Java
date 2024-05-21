
public class Main {
    public static void main(String[] args) {
        
        //String name = "bro";
        //int age = 21;
        //hello(name, age);

        int x = 3;
        int y = 4;

        int result = add(x,y);

        System.out.println(result);

    }    
    
    /*static void hello(String name, int age){
        System.out.println("Hello " + name);
        System.out.println("you are " + age + " years old");
    }*/

    static int add(int x, int y){
        int z = x + y;
        return z;
    }

}