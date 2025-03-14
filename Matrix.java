import java.util.Scanner;
public class Matrix
{
    public static void main(String[] args) {
        int row,col,n,m;
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        row=s.nextInt();
        System.out.println("ENTER NUMBER OF COLUMNS");
        col=s.nextInt();
        int matA[][]=new int[row][col];
        System.out.println("Enter elements of matrix");
        for(n=0;n<row;n++)
        {
            for(m=0;m<col;m++)
            {
                matA[n][m]=s.nextInt();
            }
        }
        System.out.println("Matrix");
        System.out.println("_______________");
        for(n=0;n<row;n++)
        {
            for(m=0;m<col;m++)
            {
                System.out.print(matA[n][m]+"\t");
        }
    System.out.println();
        }
    }

}
