package marsel.ex2;

class Function {
    public static double function(double x){
        if (x < -1)
            return Math.pow(Math.cos(x), 2) * (Math.pow(x, 2) + 2);
        else if (x > -1 && x < 3*Math.PI)
            return (Math.pow(x, 3) + 3)/(2*x - 1/(x+2)) * x/(1+x);
        else
            return 7 + 5.0/9;
    }
}
