package pertemuan5;

public class TugasLoopFor {
    public static void main(String[] args) {
       
        // 0,2,4,6,8,10
        for (int i = 2; i <= 10; i+=2) {
            System.out.print(i+ " ,");
        }
        
        System.out.println();
        // 0,1,3,5,7,9
        for (int i = 1; i <= 10; i+=2) {
            System.out.print(i+ " ,");
        }
        
        System.out.println();
        
        int b = 10;
        do {    
            System.out.print(b + " ,");
            b--;
        } while (b >= 1);
        
        System.out.println();
        
        int i = 9;
        do {     
            System.out.print(i+ " ,");
            i-=1;
        } while (i >= 1);
    }
}