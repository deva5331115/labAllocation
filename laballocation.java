import java.util.Arrays;
import java.util.Scanner;
public class LabAlloction {
    public static void main(String args[]){
        int room=0;
        Scanner scan=new Scanner(System.in);
        int labs[]=new int[3];
        for(int i=0;i<3;i++){
            labs[i]=scan.nextInt();
        }
        int min=labs[0];
        int j=0;
        int n=scan.nextInt();
        for(int i=1;i<3;i++){
            if(min>labs[i]-n && labs[i]-n >=0){
                min=labs[i];
                j=i;
            }
        }
        System.out.println("Lab"+(j+1));
    }
}
