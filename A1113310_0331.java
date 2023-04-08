import java.util.Scanner;

public class A1113310_0331 {
    public static void main(String[] args) {
        Animal.showinfo();

        
        Animal A = new Animal("A", 1.1, 52, 100);
        Animal B = new Animal("B", 1.5, 99, 200);
        Human C = new Human("C", 1.9, 80, 150, "Male");
        Human D = new Human("D", 1.8, 78, 130, "Male");
        Human E = new Human("E", 1.7, 48, 120, "Female");
        SnowQueen F = new SnowQueen("F", 1.7, 50, 120, "Female", "YES");

        
        A.show();
        System.out.println();
        B.show();
        System.out.println();
        C.show();
        System.out.println();
        D.show();
        System.out.println();
        E.show();
        System.out.println();
        F.show();
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X and Y values for A : ");
        int x1 = scanner.nextInt();
        double y1 = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;
        double distance1 = A.distance(x1, y1);
        System.out.println("Running distance of A: " + distance1 + " km");

        System.out.print("Enter X and Y values for B : ");
        int x2 = scanner.nextInt();
        double y2 = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;
        double distance2 = B.distance(x2, y2);
        System.out.println("Running distance of B: " + distance2 + " km");

        System.out.print("Enter X and Y values for C : ");
        int x3 = scanner.nextInt();
        double y3 = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;
        double distance3 = C.distance(x3, y3);
        System.out.println("Running distance of C: " + distance3 + " km");

        System.out.print("Enter X and Y values for D : ");
        int x4 = scanner.nextInt();
        double y4 = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;
        double distance4 = D.distance(x4, y4);
        System.out.println("Running distance of D: " + distance4 + " km");

        System.out.print("Enter X and Y values for E : ");
        int x5 = scanner.nextInt();
        double y5 = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;
        double distance5 = E.distance(x5, y5);
        System.out.println("Running distance of E: " + distance5 + " km");

        System.out.print("Enter X and Y values for F : ");
        int x6 = scanner.nextInt();
        double y6 = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;
        double distance6 = F.distance(x6, y6);
        System.out.println("Running distance of F: " + distance6 + " km");
    }
}