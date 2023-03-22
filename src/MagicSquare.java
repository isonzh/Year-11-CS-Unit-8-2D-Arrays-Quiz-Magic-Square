public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int checkSum=0;
        for(int i=0; i<array2d[0].length; i++){
            checkSum = checkSum + array2d[0][i];
        }
        return checkSum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        boolean magicRow = false;
        int sum=0;
     for(int i=1; i < array2d.length; i++){
         for(int j=0; j<array2d[0].length; j++){

             sum=sum+array2d[i][j];
         }
         if(sum==checkSum){
             sum=0;
             magicRow = true;
         }
         else{
             return false;
         }
     }
     return magicRow;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        int sum;
        for(int n=0; n<array2d[0].length;n++){
            sum=0;
        for (int i = 0; i<array2d.length; i++) {
            sum = sum + array2d[i][n];
        }
        if (sum != checkSum) return false;
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        int diaSum1 = 0;
        int row1 = 0;
        int col1 = 0;
        while (row1 < array2d.length){
            diaSum1 = diaSum1+array2d[row1][col1];
            col1=col1+1;
            row1=row1-1;
        }

        int diaSum2 = 0;
        int row2 = 0;
        int col2 = array2d.length-1;
        while (row2 < array2d.length){
            diaSum2 = diaSum2+array2d[row2][col2];
            row2=row2+1;
            col2=col2-1;
        }
        if ((diaSum2 == checkSum)&&(diaSum2 == checkSum)){
            return true;
        }
    return false;
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        int  magicSum = calculateCheckSum(array2d);
        if (magicRows(array2d, magicSum) && magicColumns(array2d, magicSum) && magicDiagonals(array2d,magicSum))
            return true;
        else return false;

    }

}
