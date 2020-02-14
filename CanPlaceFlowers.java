
public class CanPlaceFlowers {
	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int numberofPlants = 0;
        int plantsAllowed = (int) Math.ceil(flowerbed.length/2.0);
       
        for(int i = 0; i < flowerbed.length; i++) {
                        if(flowerbed[i] == 1)
                                        numberofPlants++;
        }

        if(plantsAllowed == n + numberofPlants)
                        return true;
       
return false;
}

}
