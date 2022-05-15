package HW_9.HW_9_1;

import org.apache.commons.lang3.StringUtils;

public class Abbr {
    public static String getAbbr(String value, int size){
        return value.substring(0,size-3) + "...";
    }



}
