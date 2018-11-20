package finalactivity;
import java.io.*;

public class FinalActivity {

    public static void main(String[] args) throws IOException {
           display();
    }
    public static void display() throws IOException{
        BufferedReader jd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What do you want to do?"
                + "Factorial or"
                + " Fibonacci\n");
        while (true) {
            System.out.print("Enter choice: ");
            String cho = jd.readLine();
            if (cho.equals("Factorial")) {
                factorial();
            } else if (cho.equals("Fibonacci")) {
                fibonacci();
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
    
    public static void fibonacci() throws IOException {
         BufferedReader jd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many elements you want to enter? ");
        int res = Integer.parseInt(jd.readLine());
        int number[] = new int[res];
        int cut = 0;
        for (int j = 0; j < res; j++) {
            System.out.print("Enter Element for index " + j + " :");
            int k = Integer.parseInt(jd.readLine());
            number[cut] = k;
            cut++;
        }
        for (int l = 0; l < number.length; l++) {
            System.out.print("f(" + number[l] + ")\t");
        }
        System.out.println("");
        for (int o = 0; o < number.length; o++) {
            System.out.print("" + fibo(number[o]) + "\t");
        }
        System.exit(0);
    }

    public static int fibo(int x) {
        if (x <= 1) {
            return x;
        } else {
            return fibo(x - 1) + fibo(x - 2);
        }
    }

    public static void factorial() throws IOException {
         BufferedReader jd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many elements you want to enter? ");
        int factUser = Integer.parseInt(jd.readLine());
        int nim[] = new int[factUser];
        int tcount = 0;
        for (int i = 0; i < factUser; i++) {
            System.out.print("Enter Element for index " + i + " :");
            int u = Integer.parseInt(jd.readLine());
            nim[tcount] = u;
            tcount++;
        }
        for (int y = 0; y < nim.length; y++) {
            System.out.print("f(" + nim[y] + ")\t");
        }
        System.out.println("");
        for (int q = 0; q < nim.length; q++) {
            System.out.print("" + fact(nim[q]) + "\t");
        }
        System.exit(0);
    }

    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * fact(n - 1));
        }
    }
        
    }
    
    

