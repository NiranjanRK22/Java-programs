package com.training.demos;
import java.util.Scanner;
import java.util.LinkedHashMap;
public class CountOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word:");
        String word = sc.next();
        char[] word_array = word.toCharArray();
        for (char c : word_array){
            if (map.containsKey(c)){
               map.put(c, map.get(c) + 1);
            }else{
               map.put(c, 1);
            }
         }
        System.out.println(map);
        sc.close();
	}

}
