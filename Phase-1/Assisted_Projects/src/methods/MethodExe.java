package methods;

public class MethodExe {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		MethodExe b=new MethodExe();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
		}


}
