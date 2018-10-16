import java.util.Scanner;
class MaximumValue
{
    static int n;
    static double max=0;
    
    public static double findMaximum(double arr[]){
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
         n = s.nextInt();
         double[] arr = new double[n];
        
        //get values to the array
        for(int i=0;i<n;i++){
            arr[i]=s.nextDouble();
        }
         System.out.println("Maximum number is "+findMaximum(arr));
    }
}
