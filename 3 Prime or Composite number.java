import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int flag = 1;
        for(int i=2; i<num; i++){
            if(num%i==0){
                flag = 0;
                break;
            }
        }
        if(flag==1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
    }
}
