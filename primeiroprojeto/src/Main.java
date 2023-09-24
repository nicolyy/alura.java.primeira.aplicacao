
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("FILME: Top Gun Mave: Maverick");

        //Variaveis são em letras minusculas
        int ano = 2022;

        //Concatenação
        System.out.println("Ano de lançamento: " + ano);

        boolean incluidoNoPlano = true;
        double notaDoFiolme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("A nota média do filme é: " + media);
        String sinopse;
        //Formatação do texto em bloco
        sinopse = """
                Um texto aqui
                Um texto aqui
                Um texto aqui
                Um texto aqui
                Um texto aqui
                
                """;

        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);


    }
}