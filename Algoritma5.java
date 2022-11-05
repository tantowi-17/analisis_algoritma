public class Algoritma5 {
    
    public static void main(String a[]){    
        int[] nim = {9,14,3,2,43,11,58,22};    
        System.out.println();    
            
        int n = nim.length;  
        for (int j = 1; j < n; j++) {  
            int key = nim[j];  
            int i = j-1;  
            while ( (i > -1) && ( nim [i] > key ) ) {  
                nim [i+1] = nim [i];  
                i--;  
            }  
            nim[i+1] = key;
        }    
           
        System.out.println("After Insertion Sort");    
        for(int i:nim){    
            System.out.print(i+" ");    
        }    
    }    
}    
