package com.gtropy.apps;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class DictionaryAppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void AllWordShouldExistInTheDictionary()
    {
        ReadFile readFile = new ReadFile();
        ArrayList<String> lines = readFile.readLinesFromFile("src\\test\\resources\\list.txt");

        Dictionary dictionary = new Dictionary();

        for (String word : lines) {
            dictionary.insert(word);
        }

        boolean isWordExists = false;
        for (String word : lines) {
            boolean isExists = dictionary.search(word);
            if(isExists) {
                System.out.println(word);
                isWordExists = true;
            }
            else {
                isWordExists = false;
                break;
            }
        }
        assertTrue("all word should exist in dictionary", isWordExists);
    }
}
