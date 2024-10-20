package AtividadesSemestre2.OrientaçãoObjeto.OrdemServiço;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class POO1 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        List<OrdemServiço> lista = new ArrayList<>();
        int id = 0;
        String nomeCliente = "";
        String nomeProfissional = "";
        Double valorServiçoHora = 0.0;
        Double valorKmDeslocamento = 0.0;
        Double nroHorasTrabalhadas = 0.0;
        Double nroKmPercorrido = 0.0;
        Double faturamento = 0.0;

        int loop;

        System.out.println("Informe quantos registros deseja fazer: ");
        loop = ler.nextInt();

        for(int i = 0; i < loop; i++){
        System.out.println("Digite o Id: ");
        id = ler.nextInt();
        ler.nextLine();

        System.out.println("Informe o nome do Cliente: ");
        nomeCliente = ler.nextLine();

        System.out.println("Informe o nome do Profissional: ");
        nomeProfissional = ler.nextLine();

        System.out.println("Digite o valor do serviço por hora: ");
        valorServiçoHora = ler.nextDouble();

        System.out.println("Informe o numero de horas trabalhadas: ");
        nroHorasTrabalhadas = ler.nextDouble();

        System.out.println("Digite o numero de km percorrido: ");
        nroKmPercorrido = ler.nextDouble();

        System.out.println("Informe o preço do Km deslocado: ");
        valorKmDeslocamento = ler.nextDouble();

        OrdemServiço ordemserviço = new OrdemServiço(id, nomeCliente, nomeProfissional, valorServiçoHora, valorKmDeslocamento, nroHorasTrabalhadas, nroKmPercorrido, valorKmDeslocamento);

        lista.add(ordemserviço);

        }
        System.out.println("Lista de Cadastro: " + loop);
        System.out.println("-----------------------------------------------");
        for(OrdemServiço ordemserviço : lista){
            ordemserviço.status();
            ordemserviço.ValorPagar();
            faturamento+=ordemserviço.getValorPagar();
            System.out.println("------------------------------------------");
    }
    System.out.println("Faturamento: " + faturamento);
    System.out.println("------------------------------------------");
}
}
