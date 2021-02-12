package functions_practice;

public class factorial {
    public static void main(String[] args) {
        System.out.print(factor2(6));
    }

    static int factor(int num){
        int b = 1;
        for( int i = 1; i<= num; i++){

            b = b * i;
        }
        return b;
    }

    static int factor2( int num){
        if(num < 2) return 1;
        else return num * factor2( num - 1);



    }

}
