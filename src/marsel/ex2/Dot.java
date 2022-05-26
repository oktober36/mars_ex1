package marsel.ex2;

public class Dot implements Comparable<Dot> {
    double x;
    double y;
    double module;
    int quart;

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
        module = Math.sqrt(x * x + y * y);
        quart = x * y > 0 ? (x > 0 ? 1 : 3) : (x < 0 ? 2 : 4);
    }




    @Override
    public int compareTo(Dot o) {
        return Double.compare(o.module, module);
    }

    @Override
    public String toString() {
        return "Dot(" + x + ";" + y + ")";
    }
}
