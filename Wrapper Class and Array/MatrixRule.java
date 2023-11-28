import java.util.Scanner;
class Matrix
{
    private int rows;
    private int cols;
    private int[][] data;
    public Matrix(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }
    public void setElement(int row, int col, int value)
    {
        if (row >= 0 && row < rows && col >= 0 && col < cols)
        {
            data[row][col] = value;
        }
        else
        {
            System.out.println("Invalid matrix index.");
        }
    }
    public int getElement(int row, int col)
    {
        if (row >= 0 && row < rows && col >= 0 && col < cols)
        {
            return data[row][col];
        }
        else
        {
            System.out.println("Invalid matrix index.");
            return 0; // Return a default value if the index is invalid
        }
    }
    public int getRows()
    {
        return rows;
    }
    public int getCols()
    {
        return cols;
    }
    public static Matrix multiply(Matrix a, Matrix b)
    {
        int rowsA = a.getRows();
        int colsA = a.getCols();
        int rowsB = b.getRows();
        int colsB = b.getCols();   //if the number of columns in the first matrix (a) is equal to the number of rows in the second matrix (b), which is a requirement for multiplication.
        if (colsA != rowsB)
        {
            System.out.println("Matrix multiplication is not possible due to invalid dimensions.");
            return null;
        }
        Matrix result = new Matrix(rowsA, colsB);
        for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsB; j++)
            {
                int sum = 0;
                for (int k = 0; k < colsA; k++)
                {
                    sum += a.getElement(i, k) * b.getElement(k, j);
                }
                result.setElement(i, j, sum);
            }
        }
        return result;
    }
}
public class MatrixRule
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrix A");
        int rowsA, colsA;
        System.out.print("Enter the number of rows for matrix A: ");
        rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        colsA = scanner.nextInt();
        Matrix matrixA = new Matrix(rowsA, colsA);
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsA; j++)
            {
                int value = scanner.nextInt();
                matrixA.setElement(i, j, value);
            }
        }
        System.out.println("Matrix B");
        int rowsB, colsB;
        System.out.print("Enter the number of rows for matrix B: ");
        rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        colsB = scanner.nextInt();
        Matrix matrixB = new Matrix(rowsB, colsB);
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < rowsB; i++)
        {
            for (int j = 0; j < colsB; j++)
            {
                int value = scanner.nextInt();
                matrixB.setElement(i, j, value);
            }
        } // Check if the matrices can be multiplied and perform multiplication
        Matrix result = Matrix.multiply(matrixA, matrixB);
        if (result != null)
        {
            // Display the result
            System.out.println("Result of matrix multiplication:");
            for (int i = 0; i < result.getRows(); i++)
            {
                for (int j = 0; j < result.getCols(); j++)
                {
                    System.out.print(result.getElement(i, j) + " ");
                }
                System.out.println();
            }
        }
    }
}

