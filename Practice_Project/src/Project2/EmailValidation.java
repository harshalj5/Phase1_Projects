package Project2;
import java.util.regex.*;    
import java.util.*;    
public class EmailValidation{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("mph@loop.co.in");  
        emails.add("sunny65@quickr.com");  
        emails.add("Simplilearn.name@domain.com");  
        emails.add("gadgets#@domain.co.in");  
        emails.add("google@gmail.com");  
        emails.add("hotmail@com");  
        emails.add("@yahoo.com");  
        emails.add("shopskill#outlookS.com");  
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  