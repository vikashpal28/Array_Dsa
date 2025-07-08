public class consective {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,1,1,1};
        int n = arr.length;
        System.out.println(number(arr, n));
    }

    public static int number(int[] arr,int n){
        int count = 1;
        int maxCount = 0;
     for(int i = 1;i<n;i++){
     if(arr[i] == arr[i-1]){
        count++;
     }
     else{
        maxCount = Math.max(maxCount,count);
        count = 1;
     }
     
    
    
     }
     return Math.max(maxCount, count);
     
    }
}

// Maximum consecutive one’s (or zeros) in a binary array