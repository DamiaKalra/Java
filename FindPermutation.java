import java.util.*;
public class FindPermutation {
    public static void FindPermutation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde"=>"ab"+"de"="abde"
            String NewStr=str.substring(0,i)+str.substring(i+1);
            FindPermutation(NewStr,ans+curr);
        }
    }
    public static void main(String args[]){
        String str="abc";
        FindPermutation(str,"");
    }
}
