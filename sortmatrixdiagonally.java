
public class sortmatrixdiagonally {
	public static int[][] diagonalSort(int[][] mat) {
        int count;
        int tempVal = 0;
        int tempRow = 0;
        int tempColumn = 0;
        boolean diagonalComplete;
        boolean smallerFound;
       
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                diagonalComplete = false;
                smallerFound = false;
                count = 1;
                tempVal = mat[i][j];
                while(!diagonalComplete) {                       
                    if((i+count < mat.length) && (j+count < mat[0].length)) {            
                        System.out.println(" i:"+i+" j:"+j+ " count: " +count);                                                     
                        if((Integer.compare(mat[i][j], mat[i+count][j+count]) == 1) && Integer.compare(tempVal, mat[i+count][j+count]) == 1) {
                            tempVal = mat[i+count][j+count];
                            tempRow = i+count;
                            tempColumn = j+count;
                            smallerFound = true;
                            System.out.println(" i:"+i+" j:"+j+ " count: " +count+ " temp: " +tempVal);
                        }
                       
                        count++;
                    }
                   
                    else
                        diagonalComplete = true;                                                                           
                }
               
                if(smallerFound) {
                    mat[tempRow][tempColumn] = mat[i][j];
                    mat[i][j] = tempVal;
                }
               
                //System.out.println(Arrays.deepToString(mat));
               
            }
	}
       
return mat;
}
}
