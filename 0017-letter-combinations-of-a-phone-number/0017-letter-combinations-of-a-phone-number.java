import java.io.*;
import java.util.*;
class Solution {
    public List<String> letterCombinations(String digits) {
         int[] arr = new int[digits.length()];
         List<String> list = new ArrayList<>();
        
         Hashtable<Integer, String> ht1 = new Hashtable<>();
         ht1.put(2, "abc");
         ht1.put(3, "def");
         ht1.put(4, "ghi");
         ht1.put(5, "jkl");
         ht1.put(6, "mno");
         ht1.put(7, "pqrs");
         ht1.put(8, "tuv");
         ht1.put(9, "wxyz");
         
        for(int i=0;i<digits.length();i++){
           arr[i] = Integer.parseInt(String.valueOf(digits.charAt(i)));
        }
        int i = 0;
        if(digits.equals("")){
          return list;
        }
        
        backTrack(list, ht1, arr, new StringBuilder(), i);
        
      return list;
        
    }
    
    public void backTrack(List<String> list,  Hashtable<Integer, String> ht1, int[] arr, StringBuilder sb, int i){
         if(i==arr.length){
           list.add(sb.toString());
           return;
         }
         String s = ht1.get(arr[i]);
         for(int j = 0;j<s.length();j++){
           sb.append(s.charAt(j));
           backTrack(list, ht1, arr, sb, i+1);
           sb.setLength(sb.length() - 1);
         }
    }
}