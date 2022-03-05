package innerclasses;

public class InnerclassExm2 {


private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	InnerclassExm2  ob=new InnerclassExm2 ();  
	ob.display();  
	}
}

