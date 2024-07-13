public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        String resultado = nota >=7 ? "Aprovado" : nota >= 55 && nota <7 ?  "Recuperaçao" : "Reprovado";

        System.out.println(resultado);
    }
}
