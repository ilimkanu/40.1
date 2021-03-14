import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Toyota> cars = new HashSet<>();

        cars.add(new Toyota("Prius", 20365L));
        cars.add(new Toyota("Ist", 87435L));
        cars.add(new Toyota("Supra", 56294L));
        cars.add(new Toyota("Camry", 54256L));
        cars.add(new Toyota("Corolla", 74176L));

        System.out.println("Машины на складе:");
        for (Toyota toyota : cars){
            System.out.println(toyota);
        }

        System.out.println("-------------------------");

//        System.out.println("Покупатель приобрел модель Supra");
//        System.out.println(cars.remove("Supra"));

        System.out.println("На склад привезли модель Land Cruiser");
        cars.add(new Toyota("Land Cruiser", 45782L));
        for (Toyota toyota : cars){
            System.out.println(toyota);
        }

        System.out.println("-------------------------");

        System.out.println("Склад сгорел");
        cars.clear();
        System.out.println(cars);

        System.out.println("--------------------------");

        System.out.println("После сгорания, на склад завезли 2 новые модели");
        cars.add(new Toyota("Prius", 20365L));
        cars.add(new Toyota("Camry", 54256L));
        for (Toyota toyota : cars){
            System.out.println(toyota);
        }
    }
}
