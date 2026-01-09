import java.util.Scanner;

class Plastic2D {
    double length, width;
    double cost = 40; // per square ft

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }

    void calculateCost() {
        double area = length * width;
        System.out.println("Cost of 2D sheet = Rs " + (area * cost));
    }
}

class Plastic3D extends Plastic2D {
    double height;
    double cost3D = 60; // per cubic ft

    void input3D() {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    void calculateCost3D() {
        double volume = length * width * height;
        System.out.println("Cost of 3D box = Rs " + (volume * cost3D));
    }
}

public class Main13 {
    public static void main(String[] args) {
        Plastic3D obj = new Plastic3D();
        obj.input3D();
        obj.calculateCost3D();
    }
}
