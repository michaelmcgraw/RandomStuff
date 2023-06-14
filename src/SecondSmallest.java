public class SecondSmallest {
    public static void main (String[] args){
        int [] intArray = new int[5];
        intArray[0] = 3;
        intArray[1]=2;
        intArray[2] =1;
        intArray[3]=4;
        intArray[4]=5;

        System.out.println(secondSmallest(intArray));

    }
    public static int secondSmallest(int [] intArray){
        int max = Integer.MAX_VALUE;
        int min =intArray[0];
        for (int i : intArray){
            if (i<max){
                max = i;
                min = i;
            }
        }
        int c =0;
        int[] newArray = new int[intArray.length-1];
        for (int i=0;i<intArray.length;i++){
            if (intArray[i]!= min){
                newArray[c] = intArray[i];
                c++;
            }
        }
        int newMax = Integer.MAX_VALUE;
        int newMin =newArray[0];
        for (int i : newArray){
            if (i<newMax){
                newMax = i;
                newMin = i;
            }
        }
        return newMin;
    }
}
