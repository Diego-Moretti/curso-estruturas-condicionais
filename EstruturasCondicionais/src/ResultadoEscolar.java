
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 3;

        /*
        cenário 1
        if(nota >= 7)
            System.out.println("Aprovado");
        else if(nota >5 && nota < 7)//true ou false
            System.out.println("Prova Recuperação");
        else
            System.out.println("Reprovado"); 
        */

        //cenário 2
        /*
         * String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
         * System.out.println(resultado);
         */
        
        //cenário 3
        String resultado = nota >= 7 ? "Aprovado": nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado); 
    }
}
