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
