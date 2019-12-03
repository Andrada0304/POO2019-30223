package DoubleMatrix;

public class TestDoubleMatrix {
	public static void main(String[] args) {
		 // Creaza tablourile de intregi m1, m2
		 Double[][] m1 = new Double[][]{{1.2, 2.1, 3.3}, {4.0, 5.5, 6.1}, {1.0, 1.5, 1.3}};
		 Double[][] m2 = new Double[][]{{1.6, 1.0, 1.4}, {2.3, 2.7, 2.5}, {0.4, 0.3, 0.1}};
		 // Creaza o instanta de IntegerMatrix
		 DoubleMatrixx doubleMatrix = new DoubleMatrixx();
		 System.out.println("\nm1 + m2 is ");
		 GenericMatrix.printResult(
		 m1, m2, doubleMatrix.addMatrix(m1, m2), '+');
		 System.out.println("\nm1 * m2 is ");
		 GenericMatrix.printResult(
		 m1, m2, doubleMatrix.multiplyMatrix(m1, m2), '*');
		 }
}
