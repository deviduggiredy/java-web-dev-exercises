package org.launchcode.java.studios.studio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a phrase to be counted: ");
        String phrase = input.nextLine().toLowerCase();
        String phrase1 = phrase.replaceAll("[^a-zA-Z]", "");
        input.close();

        Map<Character,Integer> characterCounts = new HashMap<>();
       // String phase = "The quick brown fox jumps over the Lazy dog.";
        char[] charactersInPhase = phrase1.toCharArray();
        for(char character : charactersInPhase){
            if(characterCounts.containsKey(character)){
                characterCounts.put(character,characterCounts.get(character)+1);
            }else{
                characterCounts.put(character,1);
            }
        }for(Map.Entry<Character,Integer> oneChar : characterCounts.entrySet()){
            System.out.println(oneChar.getKey() +":"+oneChar.getValue());
        }
    }
}
