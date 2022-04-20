package bootcamp.oop.basic.complex;

public interface Complexable {
	void add(ComplexNum z);
	void subtract(ComplexNum z);
	void multiply(ComplexNum z);
	public void divide(ComplexNum z);
	ComplexNum conjugate();
	double mag();
	ComplexNum square();
	
	//public ComplexNum add(ComplexNum z1, ComplexNum z2);
	//ComplexNum subtract(ComplexNum z1, ComplexNum z2);
	//ComplexNum multiply(ComplexNum z1, ComplexNum z2);
	//ComplexNum divide(ComplexNum z1, ComplexNum z2);


}
