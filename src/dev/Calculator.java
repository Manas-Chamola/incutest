package dev;

public class Calculator {

    public static int add (String str){
        if(str.equals("")) {
            return 0;
        }
        else if(str.contains("-")){
            throw new RuntimeException();
        }
        else if(str.contains("\n")||str.contains("\\n")){
            String nums=extractInt(str);
            String data[]=nums.split(" ");
            return sumNumbers(data);
        }
        else if(str.contains(",")){
            String[] vals =str.split(",");
            if(vals.length==2) {
                return Integer.parseInt(vals[0]) + Integer.parseInt(vals[1]);
            }
            else{
                return sumNumbers(vals);
            }
        }
        else {
            return Integer.parseInt(str);
        }
    }

    static String extractInt(String str)
    {
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");

        if (str.equals(""))
            return "-1";

        return str;
    }

    static int sumNumbers(String [] vals){
        int total=0;
        for(int i=0; i<vals.length; i++) {
            if(Integer.parseInt(vals[i])<1001) {
                total += Integer.parseInt(vals[i]);
            }
        }
        return total;
    }

}
