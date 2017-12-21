
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HangulTest {
    public static void main(String[] args) {
        String nickName = "t";
        
        try
        {
            Pattern pattern = Pattern.compile(".*[a-z¤¿-¤Ó-°¡-ÆR]+.*");
            
            Matcher matcher = pattern.matcher(nickName);
            
            if(matcher.matches()) {
            	System.out.println(matcher.group(0));
            } else {
                System.out.println("ÇÑ±Û ¹ÌÆ÷ÇÔ");
            }
        }
        catch(PatternSyntaxException pse)
        {
            System.err.println("ÆÐÅÏ Çü½ÄÀÌ ¾û¸ÁÀÌ´Ù.");
        }
    }
}
