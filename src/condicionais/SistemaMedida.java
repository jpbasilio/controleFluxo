package condicionais;

public class SistemaMedida {

    public static String getTamanho(String tamanho){
        String result;
        switch (tamanho){
            case "P":
                result = "PEQUENO";
                break;
            case "M":
                result = "MEDIO";
                break;
            case "G":
                result = "GRANDE";
                break;
            default:
                result = "INDEFINIDO";
                break;
        }
        return result;
    }
}
