package Alex.com.Homework;

public class TrainTicket {
    String name;
    int number;
    int roundtrip;





    public TrainTicket(String name,int number,int roundtrip){
        this.name=name;
        this.number=number;
        this.roundtrip=roundtrip;

    }



    public double getamount(){
        int oneway=number-roundtrip;
        double onewayprice=1000;
        double roundtripprice=2000*0.9;
        double sum=(oneway*onewayprice)+(roundtrip*roundtripprice);
        return sum;

    }

}

