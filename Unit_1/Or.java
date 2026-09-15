public class Or {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnowing = false;
        boolean isCoveredInDew = false;
        boolean windshieldCoveredInLeaves = false;

        boolean windshieldWipersOn = false;

        if (isRaining || isSnowing || isCoveredInDew || windshieldCoveredInLeaves)
        {
            windshieldWipersOn = true;
        }

        if(windshieldWipersOn)
        {
            System.out.println("Oh how amazing. The windshield wipers are on! Can you even believe it!");
        }
        else
        {
            System.out.println("Yep, the wipers are off. Why would I turn them on? There's nothing to wipe off.");
        }
    }    
}
