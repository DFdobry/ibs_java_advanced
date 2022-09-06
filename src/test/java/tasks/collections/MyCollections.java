package tasks.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class MyCollections {
    public static void main(String[] args) throws IOException {
        FileInputStream inputTxt = new FileInputStream("F:\\words.txt");
        int length = inputTxt.available();
        byte [] data = new byte[length];
        inputTxt.read(data);
        String words = new String(data);
        System.out.println(words);
        String str = words;
        String [] result = str.split(" ");
        Arrays.sort(result);
        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (String word : result)
        {
            if (!wordsCount.containsKey(word))
            {
                wordsCount.put(word, 0);
            }
            wordsCount.put(word, wordsCount.get(word) + 1);
        }

        int retries = 0;
        String s = null;
        for (String word : wordsCount.keySet())
        {
            System.out.println(word + " " + wordsCount.get(word));
            if (retries < wordsCount.get(word)) {
                retries = wordsCount.get(word);
                s = word;
            }
        }
        System.out.println("Самое повторяющееся слово: " + s + ", количество повторений: " + retries);
    }
}
