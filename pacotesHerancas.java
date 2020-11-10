// PACOTES

/* Um pacote de classes é um conjunto de classes localizadas na mesma estrutura ou no mesmo diretório, semelhante a uma biblioteca. 
Utilizamos os pacotes para organizar as classes, mantendo aquelas que possuem o mesmo assunto em um mesmo local. 

Para definir um pacote devemos utilizar a palavra reservada package. A palavra reservada package deve ser adicionada na primeira linha da classe.
O padrão de-termina ainda que o nome do pacote seja escrito em letras minúsculas, podendo conter várias palavras separadas por um ponto-final (.).
*/

package faculdade;
public class Aluno {
    // ...
}

/* Caso seja preciso utilizar classes de outros pacotes, precisamos importar a classe. Para isso, utilizamos a palavra reservada import*/

// import nomedopacote.NomeDaClasse;

/* Caso seja preciso utilizar classes de outros pacotes, precisamos importar a classe. Para isso, utilizamos a palavra reservada import.
Esse é o padrão para realizar a importação de uma classe. 
E quando precisarmos importar todas as classes de determinado pacote, usamos o caractere asterisco (*) ao final do nome do pacote*/

// import nomedopacote.*

/*Se existirem subpacotes (subdiretórios), somente serão importadas as classes do diretório indicado. 
Caso seja necessário importar as classes de um subpacote, deverá ser incluída uma instrução específica para importar esse subpacote.*/

// import nomedopacote.nomedosubpacote.*;

// HERANÇA

/*Como vimos, além das classes, podem existir subclasses. Podemos entender que as subclasses são as classes “filhas” de outras classes. Chamamos esse processo de herança.
A herança é bastante utilizada na definição de uma estrutura de classes.
Nesse contexto, os atributos gerais ficam nos níveis mais altos, e os atributos específicos, nas classes “filhas” ou subclasses.

O polimorfismo é a capacidade que as linguagens orientadas a objetos têm de criar e controlar diversas formas que derivam de uma forma maior, mais genérica.

Uma das vantagens de utilizarmos o recurso da herança é a reutilização do código.
Por meio da reutilização, o código pode ser acionado quando se identifica que existem variáveis e/ou métodos que irão se repetir em outras classes.

Para definirmos uma herança, utilizamos a palavra extends.*/

public class Animal {
    private String tipo;
    private String nome;
    
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = tipo;
    }
    
    public void som(){
        System.out.println("Au au!");
    }
}

public class Gato extends Animal { //herdando as caracteristicas da classe Animal
    public void Gato() {
        this.setTipo("mamíferos");
    }
    @Override   //Sobrescrevendo o método som
    public void som(){
        System.out.println("Miau!");
    }
}
public class Galinha extends Animal {
    public void Galinha(){
        this.setTipo("aves");
    }
    @Override
    public void som(){
        System.out.println("cocoricó!");
    }
}
public class Sapo extends Animal {
    public void Sapo(){
        this.setTipo("anfíbio");
    }
    @Override
    public void som(){
        System.out.println("Frog!");
    }
}
/* 
## No método de herança, não é necessário criar os atributos “nome” e “tipo” em todas as classes, pois eles já existem na superclasse Animal. ## 
*/

// Método main
/* No método main, serão instanciados os objetos e executada a saída das informações. */

public class Main {
    public static void main (String[] args){
        System.out.println("O Som dos meus animais!");
        
        Gato meuGato = new Gato();  //Instancia o objeto
        System.out.println("Meu gato faz");
        meuGato.som(); //Executa o método som do objeto
        
        Sapo meuSapo = new Sapo();
        System.ou.println("Meu sapo faz");
        meuSapo.som();
        
        Galinha minhaGalinha = new Galinha();
        System.out.println("Minha galinha faz");
        minhaGalinha.som();
        
    }
}
