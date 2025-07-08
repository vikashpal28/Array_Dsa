
import java.util.Arrays;

public class Second_largest {

    public static void main(String[] args) {
       int[] num = {-10, -40, -25, -12, -25, -10};
       System.out.print("second largest number :- ");
       System.out.print(get_number(num));
       System.out.println();

        
    }

   static int get_number(int[] num){
      int n = num.length;
      Arrays.sort(num);
     int largest = num[n-1];
      for(int i = n-2;i>=0;i--){
        if(num[i] != largest){
            return num[i];
        }
      }
      return -1;

    }
}

// output:-
// second laegest number :- 6