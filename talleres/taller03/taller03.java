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
    
    public static void punto2(String base, String s, int j){
        if (j == 0){
            for(int i = 0; i < s.length(); i++){
                punto2("", s.substring(i), 1);
            }
        } else if (s.length() == 0){
            System.out.println(base);
        }
        else
        {
            for (int i = 1; i <= s.length(); i++){
                combinations(base + s.charAt(0), s.substring(i), i);
            }
        }
    }
    
    public static void punto3(String[] s, String a, int i, int n) {
        if (n == 0) {
            System.out.println(act);
        } else {
            for (int j = 0; j < i; j++) {
                if (!act.contains(elem[j])) { 
                    punto3(s, act + elem[j], i - 1, n);
                }
            }
        }   
    }
}
