package ball.mac.no.rmuttnews.utility;

/**
 * Created by masterung on 23/12/2017 AD.
 */

public class MyConstant {

    private String urlPostUserString = "http://androidthai.in.th/rmutt/addDataMaster.php";
    private String urlGetUserString = "http://androidthai.in.th/rmutt/getAllDatamac.php";


    private String[] columnUserStrings = new String[]{
            "user_ID",
            "email",
            "password",
            "firstname",
            "lastname",
            "status"};


    public String[] getColumnUserStrings() {
        return columnUserStrings;
    }

    public String getUrlGetUserString() {
        return urlGetUserString;
    }

    public String getUrlPostUserString() {
        return urlPostUserString;
    }
}   // Main Class
