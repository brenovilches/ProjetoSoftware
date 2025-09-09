import entidades.Pagamento;
import entidades.PagamentoBoleto;
import entidades.PagamentoPix;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pagamento> pagamentos = new ArrayList<>();

        while (true) {

            System.out.println("\n1 - Cadastrar Pagamento");
            System.out.println("2 - Listar Pagamentos");
            System.out.println("3 - Sair\n");
            String opcao = sc.nextLine();

            if (opcao.equals("1")) {
                System.out.println("Cadastro de Pagamento");

                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();

                System.out.println("Digite a data do pagamento: ");
                String dataPagamento = sc.nextLine();

                System.out.println("Digite o valor do pagamento: ");
                double valorPagamento = sc.nextDouble();
                sc.nextLine();

                System.out.println("Informe o método e pagamento: ");
                System.out.println("1 - BOLETO");
                System.out.println("2 - PIX");
                System.out.println("3 - CRÉDITO");
                int metodoPagamento = sc.nextInt();
                sc.nextLine();


                Pagamento pagamento = null;
                switch (metodoPagamento) {
                    case 1:
                        System.out.println("Digite o código de barras: ");
                        String codigoBarras = sc.nextLine();
                        pagamento = new PagamentoBoleto(nome, valorPagamento, dataPagamento, codigoBarras);
                        break;
                    case 2:
                        System.out.println("Digite a chave Pix: ");
                        String chavePix = sc.nextLine();
                        pagamento = new PagamentoPix(nome, valorPagamento, dataPagamento, chavePix);
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        continue;
                }
                pagamentos.add(pagamento);
            }
            else if (opcao.equals("2")) {
                System.out.println("\nLISTA DE PAGAMENTO\n");
                for (Pagamento pagamento : pagamentos) {
                    System.out.println(pagamento.toString());
                }
            }




        }
    }
}