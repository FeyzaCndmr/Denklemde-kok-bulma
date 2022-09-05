import java.util.Scanner;

class Soru2 {
    public static void main(String[] args) {
        // ax^2 + bx + c = 0 için x1 ve x2 kökleri bulmak
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("(ax^2) + (bx) + (c)= 0 olacak şekilde a, b, ve c degerlerini giriniz.");
            System.out.print("a: ");
            int a = in.nextInt();
            System.out.print("b: ");
            int b = in.nextInt();
            System.out.print("c: ");
            int c = in.nextInt();
           
            double delta = (Math.pow(b, 2)) - (4 * a * c);
            if (delta > 0) {
                double x1 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
                double x2 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
                System.out.println("(" + a + "x^2)+" + "(" + b + "x)+" + "(" + c + ")" + " denkleminin kokleri :"
                        + "x1= " + x1 + " x2= " + x2);
            }
            if (delta < 0) {
                System.out.println("Denklemin Gerçel Kökü Yoktur.");
            }
            if (delta == 0) {
                double x = (-1 * b) / (2 * a);
                System.out.println("Çakışık kökü var x1= x2= " + x);
            }

        } finally {
            in.close();
        }
    }
}