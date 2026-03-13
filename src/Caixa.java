import java.util.Scanner;

public class Caixa {
    public static void main (String[] args) throws Exception {
        try (Scanner sc = new java.util.Scanner(System.in)){
            double saldo = 0.0;
            int opcao;

            do {
                System.out.println("\n--- CAIXA ELETRÔNICO ---");
                System.out.println("1- Saldo");
                System.out.println("2- Depósito");
                System.out.println("3- Saque");
                System.out.println("4- Sair");

                opcao = sc.nextInt();

                switch (opcao){
                    case 1:
                        System.out.printf("Este é o seu saldo atual: R$ %.2f%n " ,saldo);
                        break;
                    case 2:
                        System.out.println("Insira um valor a ser depositado");
                        double valorDeposito = sc.nextDouble();

                        if (valorDeposito > 0){
                            saldo += valorDeposito;
                            System.out.println("Depósito realizado com sucesso");
                        }else {
                            System.out.println("Valor inválido, repita o processo por gentileza");
                        }break;
                    case 3:
                        System.out.println("Insira um valor válido que deseja sacar");
                        double valorSaque = sc.nextDouble();

                        if (valorSaque > 0 && valorSaque <= saldo){
                            saldo -= valorSaque;
                            System.out.println("Saque realizado com sucesso: Retire seu dinheiro na boca do caixa abaixo");
                        }else if (valorSaque > saldo){
                            System.out.println("Erro, saldo insuficiente");
                        }else {
                            System.out.println("Valor para saque inválido");
                        }break;
                    case 4:
                        System.out.println("Encerrando sessão, volte sempre");
                        break;
                    default:
                        System.out.println("Opção inválida: Tente novamente");
                }
            }while (opcao != 4);
        }
    }
}
