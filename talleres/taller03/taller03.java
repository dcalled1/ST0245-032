public class Taller03
{
    public static void punto1(int n, String a, String b, String c){
        if(n == 0){
            System.out.println("mueva la " + a + " para la " + c);
        }
        else{
            punto1(n -1, a, c, b);
            System.out.println("mueva la " + a + " para la " + c);
            punto1(n -1, b, a, c);
        }
    }
}