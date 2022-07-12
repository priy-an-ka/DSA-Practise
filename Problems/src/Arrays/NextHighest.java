package Arrays;

public class NextHighest {
    public static void nextHighest(int arr[]) {

        int highest=-1;
        int[] output = new int[arr.length];
        int index = arr.length-1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(i==arr.length - 1)
            {
                output[index--] = highest;
                highest = arr[i];
            }
            else if(i==arr.length - 2)
            {
                output[index--] = highest;
                if(arr[i]>highest)
                    highest = arr[i];

            }

            else
            {
                if(arr[i+1]>arr[i])
                    output[index--] = arr[i+1];
                else
                    output[index--] = highest;
                if(arr[i]>highest)
                    highest = arr[i];
            }


        }
        for(int i=0;i<output.length;i++)
        {
            System.out.print(output[i]+" ");
        }
    }


    public static void main(String args[]) {

        int[] arr = {12,13,1,6,9};
        nextHighest(arr);

    }
}
