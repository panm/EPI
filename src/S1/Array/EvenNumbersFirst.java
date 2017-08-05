package S1.Array;

public class EvenNumbersFirst {
    public static void main(String[] args)
    {
        int[] input1 = S1.Utility.RandomUtility.GetRandomIntegerArray(50000);
        int[] input2 = new int[input1.length];

        for(int i =0 ;i<input1.length;i++)
        {
            input2[i] = input1[i];
        }

        long startTime = System.currentTimeMillis();
        for(int i=0; i<100000;i++)
        {
            int[] results1 = UpdateArrayOpt(input1);

        }

        long stopTime = System.currentTimeMillis();
        long timeTaken = stopTime - startTime;

        System.out.println("First method took:" + timeTaken);

        startTime = System.currentTimeMillis();
        for(int i=0; i<100000;i++)
        {
            int[] results2 = UpdateArray(input2);

        }

        stopTime = System.currentTimeMillis();
        timeTaken = stopTime - startTime;

        System.out.println("Second method took:" + timeTaken);

        /*for (int i=0; i<results1.length; i++){
            System.out.print(results1[i]+ " ");
            System.out.print(results2[i]+ " ");
            System.out.println();

        } */
    }

    public static int[] UpdateArray(int[] inputArray)
    {
        int nextEven = 0, nextOdd = inputArray.length-1;

        while(nextEven<nextOdd)
        {
            if(inputArray[nextEven] % 2 == 0)
            {
                nextEven ++;
            }else {
                int temp = inputArray[nextEven];
                inputArray[nextEven] = inputArray[nextOdd];
                inputArray[nextOdd--] = temp;
            }
        }

        return inputArray;
    }

    public static int[] UpdateArrayOpt(int[] inputArray)
    {
        int nextEven = 0, nextOdd = inputArray.length-1;

        while(nextEven<nextOdd)
        {
            while(inputArray[nextEven] % 2 == 0 && nextEven < nextOdd)
            {
                nextEven++;
            }
            if(inputArray[nextOdd] % 2 == 0)
            {
                int temp = inputArray[nextEven];
                inputArray[nextEven] = inputArray[nextOdd];
                inputArray[nextOdd--] = temp;
            } else {
                nextOdd --;
            }
        }

        return inputArray;
    }
}
