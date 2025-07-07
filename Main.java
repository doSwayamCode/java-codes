import java.util.*;
public class Main{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int a, b;

        if(a ==0){
            System.out.println("Alice");
        } else{
            System.out.println("Bob");
        }
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
    
            a = 0;
            b = 0;
    
            for(int i = 0; i < n; i++){
                if(arr[i] % 2 == 0){
                    a++;
                } else{
                    b++;
                }
            }
    
            if(a == 0){
                System.out.println("Alice");
            } else{
                System.out.println("Bob");
            }
            
            sc.close();




    }
}