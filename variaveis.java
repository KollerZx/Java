//Tipos de Variaveis Primitivas

//Textual
char x = 'a';
String y = 'Exemplo de cadeia de caracteres'; //Na verdade, String é uma classe
String nome = 'Henrique';

//Inteiro
byte num = 8; // 8 bits / -128 a 127 (inclusive)
short z = 10; // 16 bits / -32.768 a 32.767 (inclusive)
int x = 5, y = 99; // 32 bits / -2.147.483.648 a 2.147.483.647 (inclusive)
 
//Quando declaramos uma variavel como Long, é necessario acrescentar um parâmetro L no final, para que o valor não seja interpretado como int (padrao java)
long num = 34L; // 64 bits / 9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 (inclusive)

//Fracionários

/*Para declarar uma variavel do tipo float é obrigatório usarmos a literal F no sufixo do valor, caso contrário será considerada como do tipo double
Utilizada quando o nivel de precisão é simples, apenas 32 bits de informação são necessários para representar um numero real(fracionário)*/

float nota = 6.5f; // faixa de 1,4E-45 a 3,4E+38 - Precisão de 7 digitos

/*O tipo double é considerado o valor padrão (default) e é o mais utilizado. Variáveis com casas decimais do tipo double são tipos de dados de dupla precisão.
Nesse caso, são necessários 64 bits de informação para representar um número real (fracionário), uma vez que esse tipo exige mais precisão do que o tipo float.*/

double x1 = 4.15, x2 = 4.30, x3 = 3.73; // 4,9E-324 a 1,7E+308 - Precisão de 15 digitos
double pi = 3.14D;

//Lógicos ou Booleano
/* O tipo boolean, também conhecido como tipo lógico é utilizado para armazenar apenas dois valores: true ou false. 
No entanto, o tipo lógico não tem nenhuma função quando declarado individualmente. 
Desse modo, valores do tipo lógico são aplicados junto com os operadores relacionais.
> Maior que
< Menor que 
>= Maior ou igual
<= Menor ou igual
== Igual a 
!= Diferente de
*/

boolean fim = true;





