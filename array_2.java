import java.util.HashSet;
import java.util.Set;

public class array_2 {
    public static void main (String args[]){
        int candy[]={1,1,2,2,3,3,4,4};
        int diffCandy=Candy(candy);
        System.out.println("Different Candies are: " + diffCandy);
    }

    public static int Candy(int[] candy) {
        Set<Integer> differentCandies = new HashSet<>();
        for (int canType : candy) {
            differentCandies.add(canType);
        }
    int max = differentCandies.size();
    int allow=candy.length/2;
    return Math.min(max,allow);
    }
}

