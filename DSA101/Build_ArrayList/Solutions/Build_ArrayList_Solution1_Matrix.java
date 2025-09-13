import java.util.Scanner;

class Build_ArrayList_Solution1_Matrix {
    // Define properties here
    int row;
    int col;
    int[][] arr;

    // Define constructor here
    Build_ArrayList_Solution1_Matrix(int r, int c)
    {
        row=r;
        col=c;
        arr=new int[r][c];
    }

    void input(Scanner sc){
        // Use the Scanner object passed as argument for taking input and not a new Scanner object
        // Complete the function

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

    }

    Matrix add(Matrix x){
        // Complete the function

        Matrix ans = new Matrix(this.row, this.col);
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                ans.arr[i][j]=x.arr[i][j]+this.arr[i][j];
            }
        }
        return ans;
    }

    Matrix subtract(Matrix x){
        // Complete the function

        Matrix ans = new Matrix(this.row, this.col);
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                ans.arr[i][j]=this.arr[i][j]-x.arr[i][j];
            }
        }
        return ans;

    }

    Matrix transpose(){
        // Complete the function
        Matrix ans = new Matrix(col,row);
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                //System.out.println("evenbefore");
                //System.out.println("before");
                ans.arr[j][i]=this.arr[i][j];
                //System.out.println("after");
            }
        }
        return ans;
    }

    void print(){
        // Complete the function
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(this.arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

/*
    Matrix a = new Matrix(10, 5)  // 10 rows, 5 columns
	a.input() 
	Matrix b = new Matrix(10, 5)  // 10 rows, 5 columns
	b.input()
    Matrix c1 = a.add(b)
    Matrix c2 = a.subtract(b)
    Matrix c3 = a.transpose()
    a.print()
*/