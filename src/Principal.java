import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O PODEROSO CHEFÃO";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(7);

        System.out.println("Soma das notas");
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliações");
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println("Nota média");
        System.out.println(meuFilme.pegaMedia());

    }
}

