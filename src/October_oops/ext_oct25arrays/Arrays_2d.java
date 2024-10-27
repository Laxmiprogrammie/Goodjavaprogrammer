package October_oops.ext_oct25arrays;

public class Arrays_2d {
    public static void main(String[] args){
        int[][]  matrix ={{1,2,3},{4,5,6},{7,8,9}};//3 rows ,3 columns

        for(int i=0;i< matrix.length;i++){ //here matrix.length give length of rows
            for(int j=0;j<matrix[i].length;j++){ //here first row of length means ,length column it giving
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }




    }


}
