public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibo(51));
    }
    public static int fibo(int n){
        if (n == 0){
            return 0;
        }else if (n == 1){
                return 1;
            }else{
                return fibo(n-1) + fibo(n-2);
            }
        }
    }
