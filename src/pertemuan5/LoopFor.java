package pertemuan5;

public class LoopFor {
    public static void main(String[] args) {
       
        // 0,2,4,6,8,10
        for (int i = 0; i <= 10; i+=2) {
            System.out.print(i+ " ,");
        }
        
        
        // 0,1,3,5,7,9
        for (int i = 1; i <= 10; i+=2) {
            System.out.println(i+ " ,");
        }
        
        for (int i = 10; i >= 1; i--) {
            System.out.print(i+"");
        }
        
        
        for (int i = 10; i >= 1; i-=2) {
            System.out.println(i+"");
        }
    }
}