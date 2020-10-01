// Estruturas de Decisão

if (<expressao logica>) {
    <declaração>;
}
else if(<expressao>){
    <declaração>;
}
else {
    <declaração>;
}
/*A estrutura switch apresenta características próprias quando definida. 
Por exemplo, os tipos de dados primitivos válidos na expressão serão apenas do tipo char ou dos tipos inteiros (int, byte, short, long).*/

public class SwitchSimplesExemplo{
    public class void main (String[] args){
        char indice = 'b';
        String resultado = "";
        switch (indice){
            case 'a':
                resultado +='a';
                break;
            case 'b':
                resultado +='b';
                break;
            case 'c':
                resultado +='c';
                break;
            default:
                resultado +='d';
                break;
        }
        System.out.println(resultado);
    }
}

/*Muito semelhante à instrução condicional if, o operador ternário é uma forma mais simples de executar uma sentença lógica dependendo do resultado. 
Vejamos a sintaxe desse operador a seguir:*/

 (<condição>)? <instrução se true> : <instrução se false>
 
 /*Outra forma de utilizá-lo é atribuindo o resultado do valor da expressão booleana a uma variável:
 
 variavel =  (<condição>)? <instrução se true>: <instrução se false>;*/

//Exemplo de uso do operador ternário

public class OperadorTernario {
    public class void main (String[] args){
        int media = 6;
        System.out.println(media>=6?"Aprovado":"Reprovado");
    }
 }

//Essa sintaxe pode ser encontrada nas instruções 'SE' de planilhas eletrônicas, como o Excel.

//Laços de repetição

// while

public class WhileExemplo {
    public class void main (String[] args){
        int cont = 0;                                                 //cont inicia valendo 0
        while (cont < 10) {                                          // ao entrar no laço é testado se cont é menor que 10
            System.out.prinln("Contagem Progressiva "+ cont++);     //Se for, imprime na tela o valor de cont, e incrementa +1 em seu valor, e retorna para o teste do While.
        }
    }
}
// do while
public class DoWhileExemplo {
    public class void main (String[] args){
        int d = 10;
        do {
           System.out.println(d++); //No caso 'do while' a instrução é executada primeiro, para depois realizar o teste da condição
                                    //Dessa forma a instrução sempre será executada ao menos uma vez
        }while (d <= 20);
    }
}

// for
public class ForExemplo {
    public class void main (String[] args){
        for (int x=1; x<=5; x++){
            System.out.println("x = "+x);
        }
    }
}


