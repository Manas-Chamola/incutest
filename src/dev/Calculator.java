package dev;

public class Calculator {

    public static int add (String str){
        if(str.equals(""))
        return 0;
        else if(str.contains(",")){
            String[] vals =str.split(",");
            return Integer.parseInt(vals[0])+Integer.parseInt(vals[1]);
        }
        else
        return Integer.parseInt(str);
    }

}
