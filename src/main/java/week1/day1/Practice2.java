package week1.day1;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {
    public static void main(String[] args) {


        String str = "ruparu";

        char[] ch = str.toCharArray();
        int count;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for(int i=0;i<ch.length;i++){
            if (hm.containsKey(ch[i])) {
              count=  hm.get(ch[i]);
                count++;
                hm.replace(ch[i],count);
            } else {
                hm.put(ch[i],1);
            }

        }

            for (Map.Entry x : hm.entrySet()) {

                System.out.println(x.getKey() + " " + x.getValue());

            }
        }
    }

