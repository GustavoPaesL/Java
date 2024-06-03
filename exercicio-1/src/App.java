import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[] a = new int[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(100);
        }

        System.out.println("Array desordenado:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int[] b = a;
        Arrays.sort(b);

        System.out.println();
        System.out.println("Array ordenado:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(a[i] + " ");
        };

        int x = 0;
        for (int i = 0; i < b.length; i++){
            x = x + b[i];
        };

        double m = x/10;

        System.out.println();
        System.err.println("média:");
        System.out.println(m);

        ArrayList<Integer> c = new ArrayList<>();

        for (int i = 0; i < b.length; i++){
            if (b[i] >= m) {
                c.add(b[i]);
            }
        };

        System.err.println("números maiores iguais a média:");
        for (int i = 0; i < c.size(); i++) {
            System.out.print(c.get(i) + " ");
        }


        int soma = 0;
        for(int i = 0; i < c.size(); i++){
            soma += c.get(i);
        }

        System.out.println();
        System.out.println("soma dos números maiores iaguais a média:");
        System.out.println(soma);

        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        for(int i = 0; i < c.size(); i++){
            if (c.get(i) % 2 == 0) {

                par.add(c.get(i));

            }
            else{

                impar.add(c.get(i));

            }
        }

        System.err.println("números pares:");
        for (int i = 0; i < par.size(); i++) {
            System.out.print(par.get(i) + " ");
        }
        System.out.println();

        System.err.println("números impares:");
        for (int i = 0; i < impar.size(); i++) {
            System.out.print(impar.get(i) + " ");
        }


    }
}