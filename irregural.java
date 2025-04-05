public class irregural{
    public static void main(String args[]){
        int i, j;
        int n = 5, m = 5;
        int x[][];
        x = new int[n][m];
        for(i = 0;i< x.length;i++){
            x[i] = new int[i];

            for(j = 0;j< x[i].length;j++){

            x[i][j] = j+1;
           

            }
        }
        for(i = 0;i< x.length;i++){
            for(j = 0;j< x[i].length;j++){

           System.out.print(x[i][j]);
           System.out.print("   ");
           

            }
        }
    }
}