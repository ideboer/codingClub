import java.util.*;

public class Round3 {
    public static void main(String[] args) {

        int[] subArray1 = {2, 3, 9, 5};
        int[] subArray2 = {2, 3, 9, 5};
        int[] bigArray = {10, 2, 1};
        int smallestSub = subArray[0];
        int smallestBig = bigArray[0];
        int biggestSub = subArray[0];
        int biggestBig = bigArray[0];
        
        for (int i = 1; i < subArray.length; i++)   
        {  
            if (subArray[i] < smallestSub) {
                smallestSub = subArray[i];
            }
        }  

        System.out.println(smallestSub);

        for (int i = 1; i < bigArray.length; i++)   
        {  
            if (bigArray[i] < smallestBig) {
                smallestBig = bigArray[i];
            }
        }  

        System.out.println(smallestBig);

        for (int i = 1; i < subArray.length; i++)   
        {  
            if (subArray[i] > biggestSub) {
                biggestSub = subArray[i];
            }
        }  

        System.out.println(biggestSub);

        for (int i = 1; i < bigArray.length; i++)   
        {  
            if (bigArray[i] > biggestBig) {
                biggestBig = bigArray[i];
            }
        }  
        System.out.println(biggestBig);

        if (smallestSub > smallestBig && biggestSub < biggestBig) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}