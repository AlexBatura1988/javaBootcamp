package bootcamp.oop.basic.complex;

public class Runner {

	public static void main(String[] args) {
		ComplexNum c1 = new ComplexNum(5, 6);
		ComplexNum c2 = new ComplexNum(3, 4);
//		c1.multiply(c2);
//		c1.divide(c2);
		ComplexNum c3 = new ComplexNum();
		//c3 = ComplexNum.add(c1, c2);
		//c3 = ComplexNum.subtract(c1, c2);
		 c3 = c1.square();
		
		
		System.out.println(c3);
	}

	

}
