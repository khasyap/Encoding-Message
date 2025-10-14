import java.io.*;
import java.util.*;
class UserMainCode
  {
    public String encodeMessage(String input1, int input2){
      int sum=0;
      for(char c:input1.toCharArray()){
        sum+=(int)c;
      }
      int endIndex=input1.lenght();
      while(sum>input2 && endIndex>0){
        endIndex--;
        sum-=(int) input1.charAt(endIndex);
      }
      if(sum>input2){
        return "";
      }
      return input1.substring(0,endIndex);
    }
  }
