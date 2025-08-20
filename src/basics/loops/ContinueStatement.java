package basics.loops;

public class ContinueStatement {
    public static void main(String[] args) {

        for(int i = 1; i<= 10 ; i++){
            //skip the even values an continue with the next iteration
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }

    }
}
