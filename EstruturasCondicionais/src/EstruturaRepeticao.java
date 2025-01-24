public class EstruturaRepeticao {
    public static void main(String[] args) {
        /*
         * For
         * for (bloco de inicializacao; expressão booleana; bloco de incrementacao)
         * {
         *      comando que será executado até que a
         *      expressao de validacao torne-se falsa
         * }
         * 
         * for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++){
            System.out.println("Contando carneirinhos " + carneirinhos);
         }
        System.out.println("Joaozinho dormiu");
         * While
         * while (expressao booleana de validacao)
         * {
         *  comando que será executado ate que a
         *  expressao de validacao torne-se falsa
         * }
         * Do While
         */

         String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

         for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
         }
         // for each para trabalhar com array
         for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
         }

         
    }

}
