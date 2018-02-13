public class ArrayMax
{
    public int ArrayMax(int[] A) {
        return aux(A, A.length);
    }
    
    private int aux(int[] A, int n) {
        int temp,max;
        if(n==0) max=A[0];
        else {
            max=A[n];
            temp=aux(A,n-1);
            if(temp>max) max=temp;
        }return max;
    }
}
