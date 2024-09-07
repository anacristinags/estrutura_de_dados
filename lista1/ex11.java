/*
11) Crie uma matriz bidimensional quadrada para armazenar 9 valores inteiros
informados pelo usuário. Depois, calcule e mostre na tela o determinante da
matriz.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int numero = 0;
        int soma = 0, sub = 0, result =0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Informe os 9 valores da matriz 3x3:");
        for(int i =0; i < 3; i++){
            for (int j =0; j < 3; j ++){
                numero = scn.nextInt();
                matriz[i][j] = numero;
            }
        }

        soma = (matriz[0][0]*matriz[1][1]*matriz[2][2])+
                (matriz[0][1]*matriz[1][2]*matriz[2][0])+
                (matriz[0][2]*matriz[1][0]*matriz[2][1]);

        sub = (matriz[0][1]*matriz[1][0]*matriz[2][2])+
                (matriz[0][0]*matriz[1][2]*matriz[2][1])+
                (matriz[0][2]*matriz[1][1]*matriz[2][0]);

        result = soma - sub;

        System.out.println("Matriz:");
        for (int[] i: matriz){
            System.out.println(Arrays.toString(i));
        }

        System.out.println("O determinante é: "+result);
    }
}
