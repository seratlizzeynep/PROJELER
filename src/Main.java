import java.util.Scanner;
public class Main {



    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                try {

                    System.out.print("Birinci sayıyı girin: ");
                    int num1 = scanner.nextInt();

                    System.out.print("İkinci sayıyı girin: ");
                    int num2 = scanner.nextInt();


                    int result = divide(num1, num2);
                    System.out.println("Sonuç: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Hata: Sıfıra bölme hatası!");
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Hata: Geçersiz giriş! Lütfen bir sayı girin.");
                } finally {
                    scanner.close();
                    System.out.println("İşlem tamamlandı.");
                }
            }
            public static int divide(int a, int b) throws ArithmeticException {
                return a / b;
            }
        }


