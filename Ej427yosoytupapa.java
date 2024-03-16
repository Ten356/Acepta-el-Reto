import java.util.Scanner;

/**
 *
 * @author TenM
 */
public class Ej427yosoytupapa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String s1 = "", s2 = "";
        int contador = 0;
      
            n = sc.nextInt();
            
         for (int i = 0; i < n; i++) {
                s1 = sc.next();
                s2 = sc.next();     
            if (s1.equals("Luke") && s2.equals("padre")  )  {
                System.out.println("TOP SECRET");

                    } else {
                    System.out.println(s1 + ", yo soy tu " + s2);
            }
            contador ++;
            }
        }
    }
    
