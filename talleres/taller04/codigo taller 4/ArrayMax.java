public class ArrayMax
{
    public ArrayMax() {}
    
    public int findMax(int[] A) {
        return auxArrayMax(A, A.length-1);
    }
    
    private int auxArrayMax(int[] A, int n) {
        int temp,max;
        if(n==0) max=A[0];
        else {
            max=A[n];
            temp=auxArrayMax(A,n-1);
            if(temp>max) max=temp;
        } return max;
    }
}
