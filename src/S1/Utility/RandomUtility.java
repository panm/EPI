package S1.Utility;

public class RandomUtility {

    public static int[] GetRandomIntegerArray(int length)
    {
        int[] anArray = new int[length];
        for(int i=0;i<anArray.length;i++)
        {
            anArray[i] = 0 + (int)(Math.random() * ((1000 - 0) + 1));
        }

        return anArray;
    }
}
