
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String s_unique = "";
        int length = s.length();
        char c;
        for (int i = 0; i < length; i++)
        {
            c = s.charAt(i);
            if ((s_unique.indexOf(c) == -1) || (c == ' '))
            {
                s_unique = s_unique + c;
            }
            
        }
            
            return s_unique;
        }
        
    }

