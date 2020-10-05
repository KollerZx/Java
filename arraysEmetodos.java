/*Na linguagem Java, os arrays (matrizes/vetores) são tratados como objetos. 
No momento de sua declaração, determinamos o tamanho exato do array, que não poderá mais ser alterado.*/

int arrayVar = new int[4];

/* Tipos de Variaveis para os Arrays
Primitivos
• int
• double
• char
• boolean
• short

Tipo Referência (especificando os objetos)
• String
• Double
• Integer
*/

// Exemplos de arrays no Java

String[] cursos;
cursos = new String[4];
cursos [0] = "Redes";
cursos [1] = "Internet";
cursos [2] = "Sistemas";
cursos [3] = "Manutencao";

//ou

String[] cursos = {"Redes", "Internet","Sistemas","Manutencao"};

//ou

DataNasc dates[];
dates = new DataNasc[3];
dates[0] = new DataNasc(01, 01, 1998);
dates[1] = new DataNasc(07, 09, 1995);
dates[2] = new DataNasc(25, 12, 1990);

//ou

DataNasc dates[] = { new DataNasc[3], new DataNasc(01, 01, 1998) , new DataNasc(07, 09, 1995),
new DataNasc(25, 12, 1990); }

//ou

double[] notas = {8.0, 7.5, 9.0, 8.5};
//formato reduzido

//ou

double[] notas = new double[] {8.0, 7.5, 9.0, 8.5};

//Métodos de Arrays

// Arraycopy
/*O método arraycopy permite copiar o conteúdo de um array para outro array, independente do tamanho.

Basta que os arrays tenham as mesmas característica e natureza, como char para char, int para int etc.*/

public class ArrayCopy {
    /* Objetivo: Transferir os conteúdos de um array NOMECURSO para outro array
     CODCURSO com as mesmas características e propriedades, mas com tamanhos
     diferentes, utilizando o método arraycopy.
     */
    public static void main(String[] args) {
         /* ENTRADA e PROCESSAMENTO DE DADOS */
         /* Array unidimensional NOMECURSO com tamanho de 7 elementos [0] a [6] */
        char[] NOMECURSO = {'S', 'I', 'S', 'T', 'E', 'M', 'A'};

         /* Array unidimensional CODCURSO com tamanho de 4 elementos [0] a [3] */
        char[] CODCURSO = new char[4];

         /* Transferência do conteúdo entre os arrays utilizando o método arraycopy */
        System.arraycopy(NOMECURSO, 0, CODCURSO, 0, 4);

         /* SAÍDA DE DADOS */
         /* Apresentação do resultado do processamento: Transferência do
         conteúdo entre arrays unidimensionais
         */
         System.out.println(new String(CODCURSO));
    }
}

//Arrays.sort

import java.util.*;
/* IMPORTANTE:
 Definição da classe java.util.* para utilização do método Arrays.sort
*/
public class ArraySort {
/* OBJETIVO:
 Classificação dos elementos númericos de um array, utilizando o método
 Arrays.sort da classe java.util.*
 */

     /* Método principal */
     public static void main(String[] args) {

         /* Definição dos valores numéricos de um array Unidimensional */
         String idx[] = {"A", "E", "C", "B", "D"};

         /* Apresentação dos valores de um array ANTES da classificação */
         System.out.println("Valores de um array para ORDENAR/CLASSIFICAR:");
         
         for (String valor : idx) {
            System.out.println(valor + "\t");
         }

         /* sobre a sintaxe => for(int valor : idx) {}
         A variável valor, declarada internamente na estrutura do for
         deve ser definida com o mesmo tipo que os dados do array (idx),
         neste caso está como int. Ela faz parte do loop e a informação armazenada
         em valor será o elemento atual do próprio array. A expressão lógica é o
         próprio array envolvido no loop.
         A sintaxe comum do laço for é:
         for (inicialização;condição;incremento ou decremento){conteudo;} */

           /* Execução do método sort para classificação/ordenação do array */
         Arrays.sort(idx);

         /* Apresentação dos valores numéricos ORDENADOS/CLASSIFICADOS de um
         array utilizando o método sort
         */

         System.out.println("Valores de um array ORDENADO/CLASSIFICADO:");
         
         for (String valor : idx) {
             System.out.print(valor + "\t");
         }

     }

}

