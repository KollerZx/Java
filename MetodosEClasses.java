// Definindo uma Classe


//Sintaxe
/* qualificador class Nome_da_classe{   
    //Variaveis
    //Metodos
}*/

//Qualificadores podem ser public, private e protect
public class Aluno{
    int matricula;
    String turno;
    int semestre;
}

//Metodos - Sintaxe

/* qualificador tipo_de_retorno identificador(nome do metodo) ( argumentos ){

} 

*/

//Exemplo calculo de media de notas de um aluno

public double calcularMediaProvas (double nota1, double nota2, double nota3){
    return (nota1 + nota2 + nota3)/3;
};

//Utilizando o método no programa

public class Sistema {
    
    public static void main (String[] args){
        Aluno aluno1 = new Aluno(); //Instaciando o objeto Aluno
        double notasAluno1 = aluno1.calcularMediaProvas(7.5, 8.8, 9.5); //Armazenando o retorno do método
        System.out.println("A media de notas do aluno1 é: " + notasAluno1);
    }
}

//Variaveis e Métodos do tipo Static

/*Se quisermos trabalhar com variáveis e métodos que sejam utilizadas por todos os objetos, devemos utilizar as do tipo static.
Dessa forma, um método ou uma variável do tipo static não faz parte do objeto instanciado de uma classe 
(objeto que está sendo processado no momento), mas da própria classe.*/

public class Calculadora {
    static int soma (int valor1, int valor2){
        return valor1 + valor2;
    }
}

public class Sistema {
    public static void main(String[] args){
        System.out.println("Realizando a soma de 2 valores");
        
        int numero1= 23;
        int numero2 = 44;
        
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + Calculadora.soma(numero1, numero2));
    }
}

// Método Main

/*O método estático mais conhecido é o main().

O método main é obrigatório em todas as classes executáveis, porque é utilizado para inicializar a aplicação, ou seja,
é o método que é chamado ao executar uma aplicação Java. Pode ser usado para realizar testes ou fornecer informações iniciais.
Dentro de um método main(), só podemos acessar métodos e variáveis estáticas (do tipo static).
Para acessarmos elementos não estáticos, precisamos criar uma instância de classe.*/

public class Main {
    public static void main (String[] args){
        Aluno joao = new Aluno(); //Instancia um objeto do tipo Aluno chamado joao
        System.out.println("Média: "+ joao.calcularMediaProvas(8.7, 9, 7.5)); //Chama o método calcularMediaProvas do objeto joao
    }
}
    
