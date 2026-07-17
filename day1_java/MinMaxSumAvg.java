package day1_java;

public class MinMaxSumAvg {
    public static void main(String []args)
    {
        int []arr ={ 2,7,9,10,34};
        int sum = 0;
        int mini = arr[0];
        int maxi = arr[0];
        float avg = 0;
        int n = arr.length;

        for(int i =0;i<n;i++)
        {
            sum+=arr[i];
            if(arr[i]>maxi)
            {
                maxi=arr[i];
            }
            if(arr[i]<mini)
            {
                mini = arr[i];
            }
        }

        avg = (float)( sum ) / n;

        
        System.out.println("maximum -> " +  maxi + "\nMinimum-> "+ mini + "\nSum ->  "+ sum + "\nAverage-> "+avg);


    }
}
