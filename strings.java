/*Metodos de manipulação de Strings
Susbtituição - replace
busca {
    endWiths
    startsWith
    indexOf
    lastIndexOf
}
Comparação {
    equals
    equalsIgnoreCase
    compareTo
}
Concatenação {
    concat
    +
}
Substring
toLowerCase
toUpperCase
trim
charAt
lenght
*/
public class ExString {
    public static void main (String [] args)
    String v1 = "Sistema";
    String v2 = new String("sistema");
    
    /* equals
        Esse método verifica se as strings são identicas, considerando letras maiusculas e minusculas 
    */
    System.out.println("Exemplo com o metodo de comparacao: equals");
    if (v1.equals(v2)){
        System.out.println("Variaveis identicas => " + " v1: " + v1 " v2: " + v2);
    }
    else{
        System.out.println("Variaveis diferentes => " + " v1: " + v1 " v2: " + v2);
    }
    
    /* equalsIgnoreCase
        Esse método verifica se as strings são identicas ignorando letras maiusculas e minusculas.
    */
    System.out.println("Exemplo sem o metodo de comparaca: equalsIgnoreCase");
    if(v1.equalsIgnoreCase(v2)){
        System.out.println("Variaveis identicas => " + " v1: " + v1 " v2: " + v2);
    }
    else {
        System.out.println("Variaveis diferentes => " + " v1: " + v1 " v2: " + v2);
    }
    
}
