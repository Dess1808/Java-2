/*
 * 
 * A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos de
    indústrias que são altamente poluentes do meio ambiente. O índice de poluição
    aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1o grupo são
    intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do
    1o e 2o grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos
    os grupos devem ser notificados a paralisarem suas atividades. Faça um programa que
    leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos
    de empresas. O algoritmo só deve parar de rodar quando o usuário responder "S" na
    seguinte pergunta, "Deseja encerrar o programa?".

    range de 0.05 - 0.25
    se valor == 0.3 - alertar grupo 1
    se valor == 0.4 - alertar grupo 1 & 2
    se valor >= 0.5 - alertar grupo 1, 2, & 3
    parar somente com a estrada do usuario
*/


//package problems;

import java.util.Scanner;

public class PopulationIndex {
    public static void main(String[] args) {
        String yesNo;
        double value;
        Scanner yesNoInput = new Scanner(System.in);
        Scanner valueInput = new Scanner(System.in);

        //loop com condicao 
        while(true){

            //autos codigos rodando!!
        	System.out.println("Insira um valor entre 0.05 - 0.25");
         	value = valueInput.nextDouble();
            
         	//logic
         	if (value == 0.3) {
         		System.out.println("Parar atividades grupo 1");
         	}else if (value == 0.4) {
         		System.out.println("Para atividades grupo 1 & 2");
         	}else if (value >= 0.5 && value <= 0.25) {
         		System.out.println("Para atividades de todos os grupos (1, 2 e 3)"); //verificar bug
         	}else {
         		System.out.println("Fora do indice aceitavel");
         	}
         	
        	//end?
            System.out.println("Deseja para o programa?");
            yesNo = yesNoInput.nextLine();
            
            if (yesNo.equals("S") || yesNo.equals("s")) {
            	System.out.println("Terminado!");
            	break;
            }
        }	
    }
}
