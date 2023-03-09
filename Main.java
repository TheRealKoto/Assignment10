
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
    public static void main(String args[]) throws Exception{
        if (args.length == 0){
            System.out.println("Please try again! input valid password");
            System.exit(1);
        }
        String password = args[0];
        int len = password.length();
        Set<Character> upperCaseLetter = new TreeSet<>();
        Set<Character> lowerCaseLetter = new TreeSet<>();
        Set<Character> numbers = new TreeSet<>();
        Set<Character> specialSymbols = new TreeSet<>();
        Map<String, Integer> count = new TreeMap<>();

        if (len < 8 || len > 16){
        
        System.out.println("password must be 8-16 characters long");
        System.exit(0); 
        
    }else{
        System.out.println("password is valid!"); 
    }
              
        for (int i = (int)'A'; i <=(int)'Z'; i++){            
            Character c = (char) i;
            upperCaseLetter.add(c);
            lowerCaseLetter.add(Character.toLowerCase(c));
        }
        for(int i=(int) '0'; i <= (int)'9';i++){
            Character c = (char) i;
            numbers.add(c);
        } 
        String str="~!@#$%^&*()-=+_";
        for(Character c: str.toCharArray()){
            specialSymbols.add(c);
        }
        for(Character c: str.toCharArray()){
            String key = "lowerCaseLetter";
            if(lowerCaseLetter.contains(c)){
                if (count.containsKey(key)){
                    count.put(key,count.get(key)+1);
                }else{
                    count.put(key,1);
                }
            }
            key = "upperCaseLetter";
            if(upperCaseLetter.contains(c)){
                if (count.containsKey(key)){
                    count.put(key,count.get(key)+1);
                }else{
                    count.put(key,1);
                }
            }
            key = "numbers";
            if(numbers.contains(c)){
                if (count.containsKey(key)){
                    count.put(key,count.get(key)+1);
                }else{
                    count.put(key,1);
                }
            }
            key = "specialSymbols";
            if(specialSymbols.contains(c)){
                if (count.containsKey(key)){
                    count.put(key,count.get(key)+1);
                }else{
                    count.put(key,1);
                }
            }
        }
        for (Entry<String, Integer> entry: count.entrySet()){
            System.out.println(entry.getKey()+": " + entry.getValue());
        }
        if (count.size() < 2){
            System.out.print("Bad Password valid password");

        }else{
            System.out.print("good password!");
        }
    }  
}   
       
        