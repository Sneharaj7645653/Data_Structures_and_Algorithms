import java.util.Scanner;

class Build_ArrayList_Solution_Matrix {
    // Define properties here

    int row;
    int col;
    int[][] arr;

    // Define constructor here
    Build_ArrayList_Solution_Matrix(int r, int c)
    {
        row=r;
        col=c;
        arr=new int[r][c];
    }

    public void input(Scanner sc) {
        // Read input values for the matrix from the Scanner object
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

    }

    public Build_ArrayList_Solution_Matrix multiply(Build_ArrayList_Solution_Matrix other) {
        // Implement matrix multiplication logic here
        Build_ArrayList_Solution_Matrix ans = new Build_ArrayList_Solution_Matrix(row,other.col);
        for(int i=0; i<row;i++)
        {
            for(int j=0; j<other.col;j++)
            {
                int temp=0;
                for(int x=0; x<col; x++)
                {
                    temp+=arr[i][x]*other.arr[x][j];
                }
                ans.arr[i][j]=temp;
            }
        }
        return ans;
    }

    public int diagonalDifference() {
        // Implement diagonal difference calculation logic here
        if(row!=col)
        {
            return -1;
        }
        else
        {
            int sum1=0;
            int sum2=0;
            for(int i=0; i<row; i++)
            {
                for(int j=0; j<col; j++)
                {
                    if(i==j)
                    {
                        sum1+=arr[i][j];
                    }
                    if(i+j==row-1)
                    {
                        sum2+=arr[i][j];
                    }
                }
            }
            if(sum1<sum2)
                return sum2-sum1;
            else
                return sum1-sum2;
        }
    }

    public void print() {
        // Print the matrix column by column
        for(int i=0; i<col; i++)
        {
            for(int j=0; j<row; j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
}

/*
Matrix a = new Matrix(2, 3)
a.input()
Matrix b = new Matrix(3, 2)
b.input()

Matrix c = a.multiply(b)
c.print();

int diff = a.diagonalDifference();
System.out.println(diff);
*/