
public class SistemaMedida {  
    public static void main(String[] args) {
        String sigla = "P";
         //Modo condicional if/else        
        /* if(sigla == "P"){
            System.out.println("PEQUENO");
        }
        else if(sigla == "M"){
            System.out.println("MEDIO");
        }
        else if(sigla == "G"){
            System.out.println("GRANDE");
        }
        else{
            System.out.println("INDEFINIDO");
        }
        */
        //MODO SWITCH CASE
        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
            }    
        }
    }
}