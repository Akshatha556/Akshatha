

import java.util.Scanner;
public class MatrixAddition {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size N for the matrices:");
int n = scanner.nextInt();
int [][] matrixA = new int [n][n];
int [][] matrixB = new int [n][n];
int [][] sumMatrix = new int [n][n];
System.out.println("enter the elements of matrix A");
for(int i=0; i<n; i++){
for(int j=0; j<n; j++){
matrixA[i][j] = scanner.nextInt();
}
}
System.out.println("enter the elements of matrix B");
for(int i=0; i<n; i++){
for(int j=0; j<n; j++){
matrixB[i][j] = scanner.nextInt();
}
}
for(int i=0; i<n; i++){
for(int j=0; j<n; j++){
sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
}
}
System.out.println("\nSum of the two matrices (A + B):");
for(int i=0; i<n; i++){
for(int j=0; j<n; j++){
System.out.println(sumMatrix[i][j]+"\t");
}
system.out.println();
}
scanner.close;
}
}