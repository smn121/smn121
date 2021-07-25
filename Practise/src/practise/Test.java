package practise;

public class Test {
	public static void main(String[] args) {
		Parent p=new Child();
		p.nand();
		p.nand1();
		
		Parent a= new Parent();
		a.nand();
		a.nand1();
		//a.nand2();
		
		Child b= new Child();
		b.nand();
		b.nand1();
		b.nand2();
		
		Child c= (Child)p;
		c.nand();
		c.nand1();
		c.nand4();
		//p.nand2();

		//

	}
	
}
