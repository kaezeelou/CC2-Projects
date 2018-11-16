package arraylist;
import java.util.ArrayList;

public class Arrays {
    
    
    public static void main(String[] args) {
        
        
        int[]num={3,9,15,20,65,23,18,4,2,14};
        System.out.print("Elements: " );
        for (int i = 0; i < num.length; i++){
            if(num[1]< num[num.length-1]) {
                System.out.print(num[i]);
                System.out.print(",");
            }
            
        
        }
        
       ArrayList<Integer> even;
        even = new ArrayList();
       ArrayList <Integer> odd;
        odd = new ArrayList();
        System.out.println("\n");
        System.out.println("Even\t" +"Odd");
        
        for (int i = 0; i < num.length; i++){
            
            if(num[i]%2==0){
                even.add(num[i]);
            }
            else {
                odd.add(num[i]);
            }
        }
        
        for(int x=0;x<even.size()&& x< odd.size();x++){
            System.out.println(even.get(x)+"\t"+odd.get(x));
        
        }
    }
    
}