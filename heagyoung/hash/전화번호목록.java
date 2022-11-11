import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);

        //Arrays.sort(phone_book,Comparator.comparing(String::length));
        /*for (int j=0;j<phone_book.length-1;j++){
            //System.out.println(phone_book[j]);
            int size_=phone_book[j].length();
            for(int k=j+1;k<phone_book.length;k++){
                if(size_==phone_book[k].length())
                    continue;
                //System.out.println(phone_book[k]);
                if(phone_book[k].startsWith(phone_book[j])){
                    answer= false;
                    return answer;
                }
            }
        }*/
        for (int j=0;j<phone_book.length-1;j++){
            if(phone_book[j+1].startsWith(phone_book[j])){
                    answer= false;
                    return answer;
                }
        }
        return answer;
    }
}
