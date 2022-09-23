package condicionais;

public class App {

    public static void main(String[] args) {

        System.out.println("**Exercício Caixa Eletronico**");
        CaixaEletronico.saque(25,40);

        System.out.println(" ");

        System.out.println("**Exercício Resultado Escolar**");
        ResultadoEscolar.aluno(7);
        ResultadoEscolar.aluno(6.5);
        ResultadoEscolar.aluno(4.5);
        ResultadoEscolar.aluno(5);
        ResultadoEscolar.aluno(6.9);

        System.out.println(" ");
        System.out.println("**Condição Ternária** ");
        ResultadoEscolar.alunoComCondicaoTernaria(7.5);
        ResultadoEscolar.alunoComCondicaoTernaria(6);
        ResultadoEscolar.alunoComCondicaoTernaria(4.5);

        System.out.println(" ");
        System.out.println("**Switch Case**");
        String tamanho = "M";
        String tamanhoSt = SistemaMedida.getTamanho(tamanho);
        System.out.println(tamanhoSt);

    }
}
