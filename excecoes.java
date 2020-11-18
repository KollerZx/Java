// Uma exceção é um evento ou valor ilegal (decorrente de uma falha) que é previsto no desenvolvimento de uma aplicação.

// A aplicação a seguir irá tentar acessar um indice inexistente no array alunos, causando uma exceção

public class Sistema{
    public static void main (String[] args){
        System.out.println("Rodando o sistema");
        
        Aluno[] alunos = new Aluno[50];
        
        System.out.println(alunos[74]);
    }
}
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 74 ....

// Usando uma estrutura de decisão para a prevenção de exceções

public class Sistema{
    public static void main (String[] args){
        System.out.println("Rodando o sistema");
        
        Aluno[] alunos = new Aluno[50];
        
        int indice = 74; //definindo o valor do indice que iremos acessar
        
        if(indice >=0 && indice <50){ // Validando o valor do indice para que não ocorra uma exceção
            System.out.prinln(alunos[indice]);
        }else{
            System.out.println("Aluno inexistente");
        }
        
    }
}

/* Mas nem sempre as exceções deverão ser tratadas com estrutura de decisão.

Imaginemos que um método realize dezenas de operações com os argumentos recebidos. Nesse caso, se tratarmos as exceções utilizando comandos de decisão,
o código poderá ficar extenso e confuso, dificultando seu entendimento e eventuais manutenções.

No Java, utilizamos três comandos básicos que permitem esse tratamento de exceções:

• try -> Bloco de comandos que pode gerar uma exceção.
Quando sabemos que determinado conjunto de instruções pode gerar algum tipo de exceção, devemos inserir esses comandos dentro de um bloco try.

• catch -> Bloco de comandos alternativos ao try. Se comandos dentro do bloco try gerarem uma exceção, serão executados os comandos do bloco catch.

O bloco catch é opcional e, normalmente, é utilizado em conjunto com um bloco try, formando o que é chamado de bloco try-catch.

• finally -> Comando utilizado para definir as ações que serão executadas ao final de um bloco try-catch. Independentemente do bloco processado, ele será sempre executado.

Caso o bloco catch não seja definido, ao ocorrer uma exceção dentro do bloco try, o programa desviará para o finally.

*/

public class Sistema{
    public static void main (String[] args){
        System.out.println("Rodando o sistema");
        
        Aluno[] alunos = new Aluno[50];
        
        int indice = 74;
        
        //tratamento de exceções
        try {
            //tenta executar esse comando
            System.out.println(alunos[indice]);
        }
        catch(ArrayIndexOutOfBoundsException erro){
            //se houver algum erro no bloco anterior
            //esse comando será executado
            System.out.println("Aluno inexistente");
        }
        catch(Exception erro){
            // pode-se usar um catch para cada tipo de erro
            //possivel no bloco try
            System.out.println("excessão inesperada");
        }
        finally {
            //esse comando será executado sempre
            System.out.println("Executou o finally");
        }
    }
}

