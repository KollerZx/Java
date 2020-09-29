/*As variáveis ou atributos definidos dentro de uma classe são inicializados por meio do construtor. Devemos lembrar que o construtor usa valores default.
Boolean é false
Tipos numérios é 0
Tipo referência é null
*/

//Criação de Objetos

//Atributos são as caractéristicas do objeto, como nome, tamanho, numero, etc..
//Métodos são os meios utilizados para se dar um nome ao objeto, um tamanho ou numero...

public class Jogador {
    private int numero;
    private String nome;
    
    public static void main(String[] args){
        Jogador jogador = new Jogador(); //Criação do objeto
        jogador.setNumero(10);
        jogador.setNome("Pele");
        System.out.println("O "+ jogador.getNome() + "foi um dos melhores camisa " + jogador.getNumero() + " de todos os tempos");
        System.out.println("referencia do objeto " + jogador);
    }
    public String getNome(){ // Método para pegar o valor da variável nome
        return nome;
    }
    public int getNumero(){ // Método para pegar o valor da variável número
        return numero;
    }
    public void setNome(String nome){ // Método para mudar o valor da variável nome
        this.nome = nome;
    }
    public void setNumero(int numero){ // Método para mudar o valor da variável número
        this.numero = numero;
    }
}

