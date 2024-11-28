import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem toan ");
        double a = scanner.nextDouble();
        System.out.print("Nhap diem van ");
        double b = scanner.nextDouble();
        System.out.print("Nhap diem anh ");
        double c = scanner.nextDouble();
        double tb = (a + b + c) / 3;
        if (tb >= 8) {
            System.out.println("Giỏi");
        } else if (tb >= 6.5 && tb < 8) {
            System.out.println("khá");
        } else if (tb >= 5 && tb < 6.5) {
            System.out.println("trung binh");
        } else {
            System.out.println("Yếu");
        }
    }

}
