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
    
    public String getTipo {
        
    }
}
