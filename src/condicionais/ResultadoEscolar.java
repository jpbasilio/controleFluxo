package condicionais;

public class ResultadoEscolar {

    public static void aluno(double nota){

        if(nota >= 7){
            System.out.println("Aluno Aprovado!");
        } else if (nota >= 5){
            System.out.println("Aluno de Recuperação");
        } else {
            System.out.println("Aluno Reprovado!");
        }

    }

    public static void alunoComCondicaoTernaria(double nota1){

        String resultado = nota1 >= 7 ? "Aprovado" :
                nota1 >= 5 /*&& nota1 < 7*/? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
