package Sa;

import java.util.Scanner;

    public class Tes {
        public static void main(String[] args) {

            try {System.exit(0);
                Scanner s = new Scanner(System.in);
                int a = s.nextInt();
                int b = s.nextInt();
                int arr[] = {2, 3, 4, 5, 6};
                int index = s.nextInt();
                //throw new ArithmeticException("/by zero");
                System.out.println(a / b);//arithmatic exceptions
                System.out.println(arr[index]);
            } catch (ArrayIndexOutOfBoundsException obj) {
                System.out.println();
            } catch (ArithmeticException obj)//handler
            {
                System.out.println(obj);
            } catch (Exception obj) {
                System.out.println(obj);
            } finally {
                System.out.println("inside finaly block");
            }
        }
    }

