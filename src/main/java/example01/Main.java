package example01;

import io.cucumber.datatable.internal.difflib.StringUtills;
import org.junit.Assert;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String value = "You Only Live Once. But if You do it right. once is Enough";
        Assert.assertEquals("Khong dung so ky tu in hoa",countInHoa(value),7);
        Assert.assertEquals(vietInHoa(value),"You Only Live Once. But If You Do It Right. Once Is Enough");
        Assert.assertEquals(vietInHoa2(value),"You only live once. But if you do it right. Once is enough");
    }
    public static long countInHoa(String value){
        return value.chars().filter((s) -> Character.isUpperCase(s)).count();
    }
    public static String vietInHoa(String value){
        char[] charArray = value.toCharArray();
        boolean isSpace = true;
        for(int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(isSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    isSpace = false;
                }
            }
            else {
                isSpace = true;
            }
        }
        value = String.valueOf(charArray);
        return value;
    }
    public static String vietInHoa2(String value){
        String parts[] = value.split(Pattern.quote("."));
        String result = "";
        for(int i = 0; i < parts.length;i++){
            if(i == 0 || i ==1){
                result+= validate(parts[i].trim()) + ". ";
            }else{
                result+= validate(parts[i].trim());
            }

        }
        return result.trim();
    }
    public static String validate(String value){
        char[] charArray = value.toCharArray();
        for(int i =0; i< charArray.length;i++) {
            if (Character.isLetter(charArray[i])) {
                if (i == 0) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                }else {
                    charArray[i] = Character.toLowerCase(charArray[i]);
                }
            }
        }
        String result = String.valueOf(charArray);
        return result;
    }

}
