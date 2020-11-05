// MÉTODO CONSTRUTOR

/*	O nome desse método já nos dá uma pista de sua função, não é mesmo?

	Pois então! Os chamados métodos construtores de uma classe têm a função de “construir” um objeto quando a classe é iniciada, 
	isto é, instanciam um objeto com informações básicas.
	Para declararmos um método construtor, devemos realizar as mesmas ações que utilizamos com os demais métodos. 
	Nesse caso, no entanto, utilizaremos o nome da classe. */

public class Caneta {

	String marca;
	boolean tinta;
	String corTinta;
	
	public Caneta(){ // método construtor que define alguns valores padrão 
		marca = "Pilot";
		tinta = true;
		corTinta = "azul";
	}
}
   /*Sempre que for iniciado um objeto Caneta, ele estará com as informações de marca Pilot e tinta azul.
   
   ## Observe que o método foi declarado com o mesmo nome da classe, o que indica ao compilador Java que queremos que ele seja um construtor. ##
   
   */
   
   // INICIAÇÃO DE UM OBJETO
   
   /* Para se iniciar um objeto é utilizada a palvra-chave 'new', de forma a construir/instanciar esse objeto
   	
	## Sempre que instanciamos um objeto, o construtor da classe é executado ##
	
	Se declararmos o construtor, ele será executado com nossos parâmetros. Se não o declararmos, o Java irá construir o objeto sem parâmetros.
   */
   
   public class Aluno {
   		private String nome;
		private int matricula;
		
		public Aluno(int numeroMatricula){ //Construtor que recebe um atributo
			this.matricula = numeroMatricula;
			
			System.out.println("Novo aluno - matrícula " + this.matricula);
		}
		public Aluno(String nomeAluno, int numeroMatricula){ //Construtor que recebe dois atributos
			this.nome = nomeAluno;
			this.matricula = numeroMatricula;
			
			System.out.println("Novo aluno - nome: " + this.nome + " - matrícula: " + this.matricula);
			
		}
   }
   
   public class Sistema {
   		public static void main (String[] args){
			Aluno joao = new Aluno(25484);
			Aluno renato = new Aluno("Renato", 35874);
		}
   }
   
   /* dentro do método main, o construtor não é explicitamente chamado, mas é executado na criação de um novo objeto Aluno – 
   dessa vez, com o parâmetro inserido. Dessa forma, ao executarmos new Aluno, o construtor da classe Aluno é chamado e recebe o parâmetro. */
