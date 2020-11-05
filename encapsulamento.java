/*      ## ENCAPSULAMENTO ##

Partindo do exemplo do cálculo de médias, vamos supor que a escola decidiu mudar a forma de calcular a média
e decidiu dar um peso maior à terceira prova. Para isso precisaremos alterar a fórmula de cálculo.

public double calcularMediaProvas (double nota1, double nota2, double nota3){
    return (nota1 + nota2 + nota3)/3;
};
*/

// Alterando a fórmula dentro do método

    public double calcularMediaProvas (double nota1, double nota2, double nota3){
        return (nota1 + nota2 + 2*nota3)/4;
    };
    
/* Se garantirmos que esse cálculo estará restrito a uma única parte (no caso, um único método)
dentro do sistema, precisaremos realizar a alteração uma única vez. 

Isso é uma caracteristica do encapsulamento, que nos possibilita alterarmos apenas a parte necessária do programa
*/

// MÉTODOS SETTERS E GETTERS

/* No encapsulamento, os atributos das classes são do tipo private.
   Para que sejam acessados e utilizados em outras partes do sistema, são utilizados métodos especiais: os chamados métodos setters e getters.
   
   
   Suponhamos que uma Classe A esteja encapsulada e nela haja uma variável, do tipo private, chamada “nota”.

   Suponhamos, ainda, que exista outra variável de mesmo nome nas classes superiores. Para diferenciá-las na programação, utilizamos as palavras reservadas super e this.

   Ambas são criadas implicitamente, quando um objeto é instanciado na memória, sendo que:

   this – referencia a variável que está dentro da classe em que estamos trabalhando.
   super – referencia a variável que está na superclasse.
   
   Ex. 
   super.nota ->  refere-se à variável nota que está na classe “mãe”, externa.
   this.nota -> refere-se à variável interna da classe.
   
   */
   
   public class Aluno {
   		private int matricula; //variavel privada do tipo int que não pode ser acessada por outras classes
		
		public void setMatricula(int numeroMatricula){ //Metodo que recebe um agrupamento do tipo int e altera o valor da variavel privada matricula
			this.matricula = numeroMatricula;
		}
		
		public int getMatricula(){ //Método getMatricula que retonar o valor da variavel privada matricula
			return this.matricula;
		}
   
   }
   
   
   
   
