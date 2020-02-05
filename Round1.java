import java.util.*;

public class Round1 {
    public static void main( String[] args ){
        double[] originalHeights = new double[] {160, 200, 120, 150, 130};
        double[] heights = new double[] {160, 200, 120, 150, 130};

        double mean = 0;
        double mean1 = 0;

        for (int i = 0; i < heights.length; i++) {
            mean += heights[i];
        }

        mean /= heights.length;

        for (int i = 0; i < heights.length; i++) {
            heights[i] -= mean;
            heights[i] *= heights[i];
        }

        for (int i = 0; i < heights.length; i++) {
            mean1 += heights[i];
        }

        mean1 /= heights.length;
        double standardDev = Math.sqrt(mean1);

        System.out.println(standardDev);

        for (int i = 0; i < heights.length; i++) {
            if (originalHeights[i] < mean + standardDev && originalHeights[i] > mean - standardDev) {
                System.out.println(originalHeights[i] + ": true");
            }
            else {
                System.out.println(originalHeights[i] + ": false");
            }

        }

    }
}