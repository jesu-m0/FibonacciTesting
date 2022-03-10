public class FibonacciTest {

    //Calcula de manera recursiva el resultado
    public static int compute(int numero){

        if(numero < 0){
            throw new RuntimeException("El numero de ser mayor o igual a 0");
        } else if(numero==0){
            return 0;
        }else if(numero==1){
            return 1;
        }else{
            return compute(numero-1) + compute(numero-2);
        }
    }

}
