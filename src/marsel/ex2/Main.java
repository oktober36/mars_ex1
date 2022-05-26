package marsel.ex2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 2, count = 0;
        List<Dot> dots = new ArrayList<>();
        double[] xmas = new double[15];
        double[] fmas = new double[15];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            double x = in.nextDouble();
            double y = Function.function(x);
            xmas[i] = x;
            fmas[i] = y;
            if (Area.inArea(x, y))
                count ++;
            else {
                Dot dot = new Dot(x, y);
                if (dot.quart == 3)
                    dots.add(dot);
            }
        }
        Collections.sort(dots);
        System.out.println("х:" + Arrays.toString(xmas));
        System.out.println("f(х):" + Arrays.toString(fmas));
        System.out.println("Кол-во точек в области:");
        System.out.println(count);
        if (dots.size() > 0){
            System.out.println("Наиболее удаленная не из области, в 3 четверти:");
            System.out.println(dots.get(dots.size() - 1));
        } else
            System.out.println("Точек не из области, в 3 четверти нет");
    }
}
