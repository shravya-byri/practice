import java.util.concurrent.SynchronousQueue;

public class onestar {
    public static void main(String[] args) {
       // System.out.println("shravya is a good girl");
        for(int i = 1; i <= 4; i++){
            System.out.print(i);
            for(int j = 1; j<= i; j++)
                if(i==j){
                    System.out.println("*");
                }
            else
                System.out.print("*");
        }


    }
}
