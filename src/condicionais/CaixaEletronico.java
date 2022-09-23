package condicionais;

public class CaixaEletronico{

    public static void saque(double saldo, double valorSolicitado){

        //controle de fluxo
        //condicional simples
        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual \t*** " + saldo + " ***");
        }else {
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo atual \t*** " + saldo + " ***");
        }
    }
}
