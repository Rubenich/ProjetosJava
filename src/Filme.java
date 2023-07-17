import java.util.Scanner;

public class Filme {

        String nome;
        int anoDeLancamento;
        int duracaoEmMinutos;
        boolean incluidoNoPlano;
        double somaDasAvaliacoes;
        double totalDeAvaliacoes;

        void exibeFichaTecnica(){ //Void serve pra devolver alguma coisa, devolve o vazio
                System.out.println("Nome do filme: " +nome);
                System.out.println("Ano de lançamento: "+anoDeLancamento);
        }
        void avalia(double nota){
                somaDasAvaliacoes += nota;
                totalDeAvaliacoes++;
        }

        double pegaMedia(){
                return somaDasAvaliacoes / totalDeAvaliacoes;
        }


}