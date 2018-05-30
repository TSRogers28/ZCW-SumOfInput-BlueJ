/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.*;
public class SumOfInput {

    public static void main(String[] args){

    }
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    public int getSum(int input){
        System.out.println("Enter a number");     
        int sum = 0;
        for(int x = 0; x <= input; x++){
            sum += x;
        }
        System.out.println(sum);
        return sum;
    }
}

