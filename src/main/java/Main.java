package main.java;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Main {

    @Test
    public void stringTask() {
        String source = "Selenium automates browsers. That's it! What you do  with that power is entirely up to you.";
        String result;

        StringBuilder reversedPhrase = new StringBuilder();
        StringBuilder finalVersion = new StringBuilder();
        reversedPhrase.append(source);
        reversedPhrase.reverse();

        List<String> reversedWords = Arrays.asList(reversedPhrase.toString().split(" "));

        for (int words = reversedWords.size() - 1; words > -1; words--) {
            finalVersion.append(reversedWords.get(words));
            finalVersion.append(" ");
        }
        result = finalVersion.toString();

        Assert.assertEquals(result, "muineleS setamotua .sresworb s'tahT !ti thaW uoy od htiw taht rewop si yleritne pu ot .uoy");
    }
}
