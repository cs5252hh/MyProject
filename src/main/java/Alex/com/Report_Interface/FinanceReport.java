package Alex.com.Report_Interface;

public class FinanceReport implements Report {
    @Override
    public void load() {
        System.out.println("Load Finance Report");
    }

    @Override
    public void read() {
        System.out.println("Print Finance Report");

    }
}
