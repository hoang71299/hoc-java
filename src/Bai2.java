import java.util.Scanner;

public  class Bai2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu 1 ");
        double a = scanner.nextDouble();
        System.out.print("Nhap so thu 2 ");
        double b = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap dau ");
        String c = scanner.nextLine();
        double kq;
        switch (c){
            case "+":
                kq = a+b;
                break;
            case "-":
                kq = a-b;
                break;
            case "*":
                kq = a*b;
                break;
            case "/":
                kq = a/b;
                break;
            default:
                System.out.println("sai cu phap");
                return;
        }
        System.out.println(kq);
    }
}