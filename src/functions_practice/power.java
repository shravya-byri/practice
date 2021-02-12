package functions_practice;

public class power {
    public static void main(String[] args) {
        System.out.print(power1(2,3));
    }

    static int power( int num, int pow){
        if(pow == 0) return 1;
        int result = 1;
        for (int i = 1; i<= pow; i++){
            result = result * num;
        }
        return result;
    }
    static int power1(int num, int pow){
        if(pow < 1) return 1;
        else return num * power1(num, pow-1);
    }
}
