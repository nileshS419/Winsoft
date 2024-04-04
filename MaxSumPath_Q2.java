package javaquestions;
public class MaxSumPath_Q2 
{
   
    public static int FindMaxSumpath(int A[], int B[])
    {
        int iAlength = A.length;
        int iBlength = B.length;

        int i = 0;
        int j = 0;
        int sumA = 0;
        int sumB = 0;
        int maxSum = 0;

        while(i < iAlength && j < iBlength)
        {
            if(A[i] < B[j])
            {
                sumA = sumA + A[i++];
            }
            else if(A[i] > B[j])
            {
                sumB = sumB + B[j++];
            }
            else
            {
                maxSum = maxSum + Math.max(sumA,sumB) + A[i];
                sumA = 0;
                sumB = 0;
                i++;
                j++;
            }
        }

        while(i < iAlength)
        {
            sumA = sumA + A[i++];
        }

        while(j < iBlength)
        {
            sumB = sumB + B[j++];
        }
        maxSum = maxSum + Math.max(sumA,sumB);
        return maxSum;
    } 

    public static void main(String Arg[]) throws Exception
    {
        int[] X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
        int[] Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };
        int maxsum = 0;

        maxsum = FindMaxSumpath(X,Y);
        System.out.println("the max sum path is : "+ maxsum);
    } 

}
