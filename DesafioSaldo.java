import java.util.Scanner;

public class DesafioSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeCliente = "Kelson Garcia";
        String tipoDeConta = "Corrente";
        double saldoInicial = 1701.0;
        double transferencia = 0;
        double deposito = 0;

        System.out.println("--------------------------------------");
        System.out.printf("Nome do Usuário:     %s",nomeCliente);
        System.out.printf("\nTipo de conta:       %s",tipoDeConta);
        System.out.printf("\nSaldo inicial:       %.2f\n",saldoInicial);
        System.out.println("--------------------------------------");

        int escolhaOpcao = 0;

        while(escolhaOpcao != 4){
            System.out.println("\nOperações possíveis na conta");
            System.out.println();
            System.out.println("1 - Consultar saldo da conta");
            System.out.println("2 - Transferir saldo da conta");
            System.out.println("3 - Recebimento de saldo na conta");
            System.out.println("4 - Sair");
            System.out.println("\nMe diga qual operação quer realizar na conta:");
            escolhaOpcao = scanner.nextInt();

            if(escolhaOpcao < 1 || escolhaOpcao > 4){
                System.out.println("Opção inválida, escolha um número válido\n");
            }
            if(escolhaOpcao == 1){
                System.out.printf("\nO saldo atual da conta é: %.2f\n",saldoInicial);
            }
            if(escolhaOpcao == 2){
                System.out.println("Quanto será o valor a ser transferido:");
                transferencia = scanner.nextDouble();
                if(transferencia > saldoInicial){
                    System.out.println("Saldo insuficiente para seguir a transferência!");
                }else{
                    System.out.printf("\nTransferência de R$%.2f realizada com sucesso\n",transferencia);
                    saldoInicial = saldoInicial - transferencia;
                }
            }
            if (escolhaOpcao == 3){
                System.out.println("Quanto saldo você vai receber:");
                deposito = scanner.nextDouble();
                System.out.println();
                System.out.printf("\nSeu recebimento de R$%.2f foi contabilizado com sucesso!\n",deposito);
                saldoInicial = saldoInicial + deposito;
            }
            if(escolhaOpcao == 4){
                break;
            }
        }
    }
}
