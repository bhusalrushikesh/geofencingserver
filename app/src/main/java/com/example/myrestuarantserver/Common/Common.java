package com.example.myrestuarantserver.Common;

import com.example.myrestuarantserver.Model.Request;
import com.example.myrestuarantserver.Model.User;

public class Common {

    public static User currentUser;
    public static Request currentRequest;

    public static final  String UPDATE = "Update";
    public static final  String DELETE = "Delete";

    public static String convertCodeToStatus(String code){
        if(code.equals("0"))
            return "Placed";
        else if(code.equals("1"))
            return "On My Way";
        else
            return "Served";
    }
}
