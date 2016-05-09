/**
 * Created by Tornike on 09.05.2016.
 */
public class Fibonaci {
    public int get(int n){
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++){
            int c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
}
