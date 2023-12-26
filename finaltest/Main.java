package buoi7_Test.finaltest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tour> tours = new ArrayList<>();
        tours.add(new Tour("1", "Ha Long", 500000, 5, "2n1d", " oto"));
        tours.add(new Tour("2", "Thang Long", 1000000, 2, "2n2d", " oto"));
        tours.add(new Tour("3", "Hai phong", 30000, 4, "3n2d", " xe may"));
        Tour t = new Tour("4", "Ha Tinh", 7000000, 5, "7n6d", " may bay");

        TourManager manager = new TourManagerImpl(tours);
        manager.addTour(t);

        List<Tour> res = manager.sortedTour(false);
        for (Tour t1 : res){
            System.out.println(t1);
        }

        System.out.println(manager.getTotalStorage());
    }
}
