package Alex.com.PrintStars;

public class Construction {

    public void getStars1(int x){

        for (int i=0 ; i< x ; i++){
            for (int j=0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    /*public  void  getStars2(int x){

        for (int i=0; i> x; i--){
            for (int j=0; j> i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }*/



}
