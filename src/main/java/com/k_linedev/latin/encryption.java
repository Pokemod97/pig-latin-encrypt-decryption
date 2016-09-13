package com.k_linedev.latin;

import java.util.ArrayList;

/**
 * Created by caden on 7/10/2016.
 */
public class encryption {
    /**
     * Encrypt to pig latin
     *
     * @param emessage
     * @return lmessage + " "
     */
    public static String encrypt(String emessage) {
        String ewords[] = emessage.split("\\s+");
        ArrayList<String> lwords = new ArrayList<String>();
        for (String eword : ewords) {
            lwords.add(latin(eword.trim()));
        }
        String lmessage = "";
        for (String lword : lwords) {
            lmessage += lword + " ";
        }
        return lmessage;
    }
    private encryption(){

    }

    private static String latin(String eword) {
        return eword.substring(1) + eword.substring(0, 1) + "ay";

    }
}
