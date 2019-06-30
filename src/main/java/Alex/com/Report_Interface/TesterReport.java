package Alex.com.Report_Interface;

import Alex.com.Report_Interface.FinanceReport;
import Alex.com.Report_Interface.HealthCareReport;
import Alex.com.Report_Interface.Report;

import java.util.ArrayList;
import java.util.List;

public class TesterReport {
    public static void main(String[] args) {
        Report finacereport = new FinanceReport();
        // 父類別的參照資料型態可以方入子類別的物件

        Report healcarereport = new HealthCareReport();

        List < Report > reports = new ArrayList<>();
        //實作一個只能放Report型別的ArratList集合物件，並命名為reports

        reports.add(finacereport);
        reports.add(healcarereport);
        //將finacnereport與healthcarereport放入reports這個集合物件當中


        for (Report report: reports){
            report.load();
            report.read();

            //使用for each迴圈，給定Report型別 變數名稱為report
            //將 reports 集合物件裡面的資料依序放入report裡面

        }


    }

}
