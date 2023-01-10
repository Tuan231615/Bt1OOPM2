import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao so b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao so c: ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        }else if(delta == 0){
            System.out.println("Phuong trinh co 1 nghiem la: " + (-b/(2*a)));
        }else {
            System.out.println("Phuwong trinh co nghiem 1 la:" + quadraticEquation.getRoot1() + " va co nghiem 2 la: " + quadraticEquation.getRoot2());
        }
    }
}