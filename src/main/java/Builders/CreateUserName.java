package Builders;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateUserName {
    public static String createUserName(){
        //getting and formatting current date
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyHHmmss");
        Date date = new Date();
        String currentdate = dateFormat.format(date);

        //genereting fresh user name
        String user ="Test"+currentdate;

        return user;
    }
}
