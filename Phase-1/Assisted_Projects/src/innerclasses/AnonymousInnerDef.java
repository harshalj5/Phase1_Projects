package innerclasses;

public class AnonymousInnerDef {

		public static void main(String[] args) {
		AnonymousInner i = new 	AnonymousInner() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }
		}
