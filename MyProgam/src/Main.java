import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] sabor = {30, 28, 25, 38};
        int[] massa = {10, 15, 18};

        System.out.println("Ola! Pressione:");
        System.out.println("1 para pizza");
        System.out.println("2 para refrigerante");

        int opt = sc.nextInt();

        int saborPizza = 0;
        int massaOpt = 0;
        int preco = 0;

        switch (opt) {
            case 1:
                System.out.println("Qual sabor voce gostaria?");
                System.out.println("1- Mussarela");
                System.out.println("2- Peperoni");
                System.out.println("3- Frango c/ Catupiry");
                System.out.println("4- Marguerita");
                saborPizza = sc.nextInt();

                System.out.println("Qual massa voce gostaria?");
                System.out.println("1- Fina");
                System.out.println("2- Crocante");
                System.out.println("3- Pan");
                massaOpt = sc.nextInt();

                System.out.println("Quantas pizzas voce gostaria?");
                int qtd = sc.nextInt();

                preco = (sabor[saborPizza - 1] + massa[massaOpt - 1]) * qtd;

                break;

            case 2:
                int sorvete = 10;
                int refrigerante = 10;

                System.out.println("Gostaria de refrigerante ou sorvete?");
                System.out.println("1- Refrigerante");
                System.out.println("2- Sorvete");

                int rs = sc.nextInt();

                switch (rs) {
                    case 1:

                        System.out.println("Quantos refrigerantes voce gostaria?");
                        int qtdr = sc.nextInt();
                        preco = refrigerante * qtdr;
                        break;
                    case 2:
                        System.out.println("Quantos sorvetes voce gostaria?");
                        int qtds = sc.nextInt();
                        preco = sorvete * qtds;
                        break;
                }

                break;
        }

        System.out.println("Valor total: " + preco);
        
        // Verifica se o preço total é superior a 100 reais
        if (preco > 100) {
            System.out.println("Parabéns! Voce ganhou um desconto adicional de 10%!");
            preco *= 0.9; // Aplicando desconto adicional de 10%
            System.out.println("valor com desconto: " +preco);
        }
        
        System.out.println("Qual a forma de pagamento?");
        System.out.println("1- Credito - preco cheio");
        System.out.println("2- Debito - 3% desconto");
        System.out.println("3- pix - 5% desconto");

        int pag = sc.nextInt();

        switch (pag) {
            case 1:
                System.out.println("valor final: R$" + preco);
                break;
            case 2:
                preco *= 0.97; // Aplicando 3% de desconto
                System.out.println("valor final com desconto: " + preco);
                break;
            case 3:
                preco *= 0.95; // Aplicando 5% de desconto
                System.out.println("valor final com desconto: " + preco);
                break;
        }
        
     sc.close();
     
    }
}
