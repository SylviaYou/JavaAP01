package AP01;

public class Matrix {
    private int [][] mat;
    public Matrix(int[][] m)
    { mat = m;}
    public void reverserAllRows()
    {
        for(int[] row: mat)
        {
            ArrayUtil.reverseArray(row);
        }
    }
    public void reverseMatrix()
    {
        reverserAllRows();
        int mid = mat.length/2;
        for(int i = 0; i < mid; i++)
        {
            for(int col= 0; col <mat[0].length; col++ )
            {
                int temp = mat[i][col];
                mat[i][col] = mat[mat.length -i -1][col];
                mat[mat.length-i-1][col] = temp;
            }
        }
    }

    public static  void main(String[] args) {
        int[][] mat = new int[3][];
        for (int i = 0; i < 3; i++) {
            mat[i] = new int[4];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++)
                mat[i][j] = (1 + j + 1 * i * 4);
        }
        Matrix m = new Matrix(mat);
        m.reverserAllRows();

        int[][] mat2 = new int[3][];
        for (int i = 0; i < 3; i++)
        {
            mat2[i] = new int[2];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++)
                mat2[i][j] = (1 + j + 1 * i * 2);
        }

        Matrix m2 = new Matrix(mat2);
        m2.reverseMatrix();
    }
}
