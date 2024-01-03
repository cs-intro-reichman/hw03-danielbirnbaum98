
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
    
    String s_converted = "";
    int length = s.length();
    for (int i = 0; i < length; i++) 
    {
        char c = s_original.charAt(i);
        if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
        {
            c = (char)(c + 32);
        }

            s_converted = s_converted + c;
        

    }
        return s_converted;
    
}
}
