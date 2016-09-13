package com.k_linedev.latin;

import java.util.ArrayList;

/**
 * Created by caden on 7/10/2016.
 */

//all static functions
public class decryption {
    public static String decrypt(String lmessage) {
        String lwords[] = lmessage.split("\\s+");
        ArrayList<String> ewords = new ArrayList<String>();
        for (String lword : lwords) {
            ewords.add(english(lword.trim()));
        }
        String emessage = "";
        for (String eword : ewords) {
            emessage += eword + " ";
        }
        System.out.println(ewords.size());
        System.out.println(emessage);
        return emessage;
    }

    private decryption(){

    }
    private static String english(String lword) {
        int length = lword.length();
        String eword = lword.substring(0, (length - 2));
        eword = eword.substring(eword.length() - 1) + eword.substring(0, eword.length() - 1);
        return eword;

    }


}
