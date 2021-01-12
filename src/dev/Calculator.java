package dev;

public class Calculator {

    public static int add (String str){
        if(str.equals(""))
        return 0;
        else if(str.contains(",")){
            String[] vals =str.split(",");
            if(vals.length==2) {
                return Integer.parseInt(vals[0]) + Integer.parseInt(vals[1]);
            }
            else{
                int total=0;
                for(int i=0; i<vals.length; i++)
                    total+=Integer.parseInt(vals[i]);
                return total;
            }
        }
        else
        return Integer.parseInt(str);
    }

}
