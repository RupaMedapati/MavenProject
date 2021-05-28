package week1.day1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practice3 {
    public static void main(String[] args) {
        String str="bhavanib";
        char[] ch=str.toCharArray();
        int count;
        Map<Character,Integer> hs=new LinkedHashMap<>();
        for(int i=0;i<ch.length;i++){
            if(hs.containsKey(ch[i])){
               count= hs.get(ch[i]);
               count++;
               hs.replace(ch[i],count);
            }
            else
                hs.put(ch[i],1);
            hs.get(ch[i]);
        }
        int maxval = 0;
        char maxkey = ' ';

       for(Map.Entry<Character,Integer> m: hs.entrySet() ) {
          // int maxval = 0;
         //  char maxkey = ' ';
           if (m.getValue() > 0) {
               maxval = m.getValue();
               maxkey = m.getKey();
               //System.out.println(maxval);
               // System.out.println(maxkey);
               //System.out.println(m.getKey().r);
//break;
           }
       }
           System.out.println(maxval);
            System.out.println(maxkey);
       // System.out.println(args[1]+args[2]+args[3]);
            }

    }

