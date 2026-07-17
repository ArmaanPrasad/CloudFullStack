package day1_java;

public class Anagram {

    public static boolean isanagram(String str1,String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;

        }
        else
        {
            str1=str1.toLowerCase();
            str2=str2.toLowerCase();

            int []count = new int[256];

            for(int i =0;i<str1.length();i++)
            {
                count[str1.charAt(i)]++;
                count[str2.charAt(i)]--;

            }

          for(int i =0;i<count.length;i++)
          {
            if(count[i]!=0)
            {
                return false;
            }
          }
            
        }

        return true;
    }

    public static void main(String []args)
    {
        String str1="Listen";
        String str2 ="Silent";


       System.out.println(isanagram(str1,str2));
    }
}
