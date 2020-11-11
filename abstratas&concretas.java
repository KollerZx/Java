/*Quando criamos uma aplicação, podemos definir classes que nem sempre serão instanciadas, mas poderão ser herdadas por outras classes. 
Essas classes são criadas para serem modelos de outras classes, e não são utilizadas diretamente.

Em uma programação Java, chamamos esse tipo de classe de abstrata (tipo abstract).

A classe abstrata não pode ser instanciada (usada por um objeto durante a execução do programa), 
sendo usada apenas como a classe “mãe” (superclasse) de outras classes, por meio de herança.
*/

/*Usando o exemplo de uma escola, em que Aluno e Professor são subclasses da classe Pessoa

No entanto, não faz sentido inserirmos uma pessoa na classe Pessoa*/

abstract class Pessoa { // define a classe pessoa abstrata
    String nome;
}

public class Aluno extends Pessoa { // configurando a classe aluno para herdar as caracteristicas de Pessoa
    String matricula;
}

public class Professor extends Pessoa {
    String usuário //variável destinada ao usuario no sistema da escola
}

public class Servente extends Pessoa {
    String turno; // Turno de trabalho
}

/* Como vimos, não poderemos usar a classe Pessoa em um objeto (“João” ou “Pedro”). 
Temos de utilizar as subclasses que herdam as características da superclasse Pessoa.

Nesse caso, aplicamos o conceito de abstração, já que Pessoa contém os dados relevantes e essenciais de uma pessoa 
(por exemplo, nome, data de nascimento, sexo etc.), que serão herdados pelas subclasses.
*/

/* Modificador final
 Além de definirmos valores constantes, podemos utilizar o modificador final para restringir a herança de classes e métodos. 
 
 Em outras palavras, uma classe com o modificador final, não poderá ser estendida (não poderá ter subclasses).
 */

/*Vamos exemplificar com a classe das figuras geométricas
Sabendo que Geometria é uma classe, não faz sentido utilizarmos um objeto chamado "geometria", certo?

Identificamos as formas geométricas por meio de subclasses, isto é, por meio de formas como quadrado, círculo etc.

Dessa forma, podemos dizer que a classe Geometria é abstrata. Inclusive, o mais correto é dizer que Geometria é uma superclasse abstrata,
pois a existência de objetos dessa classe sempre dependerá da implementação de uma subclasse (concreta).*/

//Define a classe Geometria como abstrata
abstract class Geometria { 
    public abstract double area();
    public abstract double perimetro(); 
}

/*Quando um objeto é instanciado na memória, são criadas duas referências implícitas: super e this.
super -> faz a referencia superclasse do objeto
this -> faz referencia ao próprio objeto
*/

/ *O construtor da classe Quadrado chama o método super.
Isso significa que o construtor da classe Quadrado está chamando o construtor de sua superclasse Geometria!
Esse é um “truque” para executarmos o construtor de uma classe abstrata. */

final class Quadrado extends Geometria {
    Quadrado(double lado){
        super();
    }
    @Override //Sobrescrevendo o método area
    public double area(){
        //chama o método da superclasse
        return 200;
    }
    @Override
    public double perimetro(){
        return 0;
    }
}
/* Além de podermos definir uma classe como final, indicando que ela não poderá ter subclasses, também podemos ter um método marcado como final, 
o que indica que ele não poderá ser sobrescrito por uma classe herdeira.
Dessa forma, uma classe normal pode possuir um de seus métodos modificados como final.
Isso significa que a classe poderá ser estendida, mas a subclasse não poderá sobrescrever esse método final.*/


public class Aluno {
    private int matricula;
    
    //construtor
    public Aluno(int numeroMatricula){ //Argumento requerido pelo construtor
        System.out.println("Construindo um aluno - matricula: " + numeroMatricula);
        this.matricula = numeroMatricula; //utiulizando o this para alterar o valor da variavel privada matricula
    }
}




