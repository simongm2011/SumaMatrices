import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nColumnas,matriz2[][],nFilas2,nColumnas2;
        boolean simetrica = true;
        //Primera matriz
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Filas Matriz 1: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Columnas Matriz 1:"));
        //Segunda matriz
        nFilas2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Filas Matriz 2:"));
        nColumnas2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Columnas Matriz 2: "));
        matriz = new int[nFilas][nColumnas];
        matriz2 = new int[nFilas2][nColumnas2];

        if (nFilas != nFilas2 || nColumnas != nColumnas2){
            JOptionPane.showMessageDialog(null,"Error: las matrices deben ser del mismo tamaño");
            return;
        }

        System.out.println("Digite una matriz 1: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]:");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Digite una matriz 2: ");
        for (int i = 0; i < nFilas2; i++) {
            for (int j = 0; j < nColumnas2; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]:");
                matriz2[i][j] = entrada.nextInt();
            }
        }
        int matriz3[][] = new int[nFilas][nColumnas];
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                matriz3[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i < nFilas; i++) {//numero de filas
            for (int j = 0; j < nColumnas; j++) {//numero de columnas
                System.out.print(matriz3[i][j]+" ");
            }
            System.out.println();
        }
    }
}