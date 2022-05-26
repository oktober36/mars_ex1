package marsel.ex2;

public class Area {
    public static boolean inArea(double x, double y){
        if (y>0){
            if (x>0)
                return y < x;
            else
                return y < 10 && x > -5;
        } else {
            if (x*x + y*y > 100)
                return false;
            return x > -10 && x < 10 && y < -5;
        }
    }
}
