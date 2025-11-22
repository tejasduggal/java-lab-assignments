
public class pattern {
    public static void main(String[] args) {
        int i=1;
        while(i!=5){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
      // System.out.println();
        i=5;
        while(i!=0){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}