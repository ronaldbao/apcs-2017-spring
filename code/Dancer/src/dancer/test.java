package dancer;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dancer a =new Acrobat();
		a.act();
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		
		//String s=(String)(9);
		String c="ssss";
		char[]b=c.toCharArray();
		System.out.println(b);
		for(int i=0;i<b.length;i++){
		System.out.println(b[i]);	
		}
		    
		}

}
