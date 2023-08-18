import java.util.Scanner;

public class teste {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int op;
        do {
        System.out.println("Escolha uma opção abaixo:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        op = ler.nextInt();

        switch(op) {
            case 1: {
                do {
                    System.out.print("Digite um valor: ");
                    int n1 = ler.nextInt();
                    System.out.print("Digite outro valor: ");
                    int n2 = ler.nextInt();
                    int resultado = n1 + n2;

                    System.out.println("O resultado é " + resultado);

                    System.out.println("Deseja continuar em Soma?");
                    System.out.println("Digite um novo valor: ");
                    System.out.println("Ou digite 2 para sair de Soma");
                    int novoValor = ler.nextInt();
                    while(true) {
                        if(novoValor == 2) {
                            break;
                        } else {
                            System.out.println(resultado + novoValor);
                            break;
                        }
                    }
                } while (op == 1);
                break;
            }
            case 2: {
                do {
                    System.out.print("Digite um valor: ");
                    int n1 = ler.nextInt();
                    System.out.print("Digite outro valor: ");
                    int n2 = ler.nextInt();
                    int resultado = n1 - n2;

                    System.out.println("O resultado é " + resultado);

                    System.out.println("Deseja continuar em Subtração?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    op = ler.nextInt();
                } while (op == 1);
                break;
            }
            case 3: {
                do {
                    System.out.print("Digite um valor: ");
                    int n1 = ler.nextInt();
                    System.out.print("Digite outro valor: ");
                    int n2 = ler.nextInt();
                    int resultado = n1 * n2;

                    System.out.println("O resultado é " + resultado);

                    System.out.println("Deseja continuar em Multiplicação?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    op = ler.nextInt();
                } while (op == 1);
                break;
            }
            case 4: {
                do {
                    System.out.print("Digite um valor: ");
                    int n1 = ler.nextInt();
                    System.out.print("Digite outro valor: ");
                    int n2 = ler.nextInt();
                    int resultado = n1 / n2;

                    System.out.println("O resultado é " + resultado);

                    System.out.println("Deseja continuar em Divisão?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    op = ler.nextInt();
                } while (op == 1);
                break;
            }
            default: {
                System.out.println("Opção inválida!");
            }
        }
        } while (op > 0 && op <= 4);

        
        ler.close();
    }

}
