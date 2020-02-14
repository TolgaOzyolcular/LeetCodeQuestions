
public class MinimumAreaRectangle {
	
	public static int minAreaRect(int[][] points) {
        int area = Integer.MAX_VALUE;
       
        java.util.Arrays.sort(points, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if(Integer.compare(a[0], b[0]) == 0)
                        return Integer.compare(a[1], b[1]);
                else
                        return Integer.compare(a[0], b[0]);
                       
            }
        });
       
        System.out.println(Arrays.deepToString(points));
       
        for(int i = 0; i < points.length; i++) {
            boolean side1Found = false;
           
            int x1=0,x2=0,x3=0,x4=0,y1=0,y2=0,y3=0,y4=0;
           
            x1 = points[i][0];
            y1 = points[i][1];
           
            int j = i+1;
           
            while(!side1Found && j < points.length) {
                x2 = points[j][0];
                y2 = points[j][1];
               
                if((x1 == x2) && (y1 < y2)) {
                    System.out.println("Side 1 found: (" +x1+ "," +y1+ ")" +" (" +x2+ "," +y2+ ")");
                    side1Found = true;
                }
               
                else
                		j++;
            }
           
            if(side1Found) {
                            //System.out.println("looking for side 2");
                           
                boolean side2Found = false;
                for(int k = j+1; k < points.length; k++) {
                               
                    x3 = points[k][0];
                    y3 = points[k][1];
                   
                    if((x1 < x3) && (y1 == y3)) {
                   
                        int l = k+1;
                       
                        while(!side2Found && l < points.length) {
                            x4 = points[l][0];
                            y4 = points[l][1];
                           
                            if((x3 == x4) && (y2 == y4)) {
                                System.out.println("Side 2 found: (" +x3+ "," +y3+ ")" +" (" +x4+ "," +y4+ ")");
                                side2Found = true;
                               
                                if(((y2-y1) * (x3-x1)) < area)
                                    area = (y2-y1) * (x3-x1);

                               
                                k = points.length;
                            }
                           
                            else
                                l++;
                        }
                                   
                    }
                               
                }
            }

        }
       
        return area;
	}

}
