package Alex.com.Report_Interface;

public interface Report {
    public void load();
    public void read();

}
// Interface介面，只會有方法名稱，也就是要幫你做什麼事情
// 不需要寫需要怎樣的功能，也就是方法的本體，換言之，就是方法(){裡面的程式敘述區段}
// Interface介面 適合用在實作具有統一標準規範物件，
// 也就是定義一個Report統一標準物件，裡面該包含load、read方法
// 但Interface裡面的方法的內容請他自己完成，
// 也就是finacereport與healcarereport裡面load、read方法裡要放入什麼資料與功能方法
// 請自行完成