package BasicImpQuestions;

import java.util.Scanner;

public class SpiralPrint {
    public static void spiralPrnt(int arr[][]){
        int nRows=arr.length;
        if(nRows==0){
            return;
        }
        int mCols=arr[0].length;
        int i, rowStart=0, colStart=0;
        int numElements=nRows*mCols, count=0;

        while(count<numElements){
        for(i=colStart; count<numElements && i<mCols; ++i){
        System.out.println(arr[rowStart][i]+" ");
        count++;
        }
        rowStart++;
        for(i=rowStart; count<numElements && i<nRows; ++i){
            System.out.println(arr[i][mCols-1]+" ");
            count++;
        }
        mCols--;

        for(i=mCols-1; count<numElements && i>=colStart; --i){
            System.out.println(arr[nRows-1][i]+" ");
            count++;
        }
        nRows--;
        for(i=nRows-1; count<numElements && i>=rowStart; --i){
            System.out.println(arr[i][colStart]+" ");
            count++;
        }
        colStart++;
        }
    }

    public static int[][] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows= ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns= ");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];

        for(int i=0; i<rows ; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter the number of rows= "+ rows +" and columns= "+cols);
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
    int takeInp[][]=takeInput();
    spiralPrnt(takeInp);
    }
}







