package bootcamp.oop.basic.complex;

public class ComplexNum implements Complexable {

	double real;
	double img;

	public ComplexNum(double real, double img) {
		this.real = real;
		this.img = img;
	}

	public ComplexNum() {
		this.real = 0;
		this.img = 0;
	}

	@Override
	public void add(ComplexNum z) {
		this.real += z.real;
		this.img += z.img;

	}

	@Override
	public void subtract(ComplexNum z) {
		this.real -= z.real;
		this.img -= z.img;

	}

	@Override
	public void multiply(ComplexNum z) {
		this.real = (this.real * z.real) - (this.img * z.img);
		this.img = (this.real * z.img) + (this.img * z.real);

	}

	@Override
	public void divide(ComplexNum z) {
		double real2 = z.real;
		double img2 = z.img;
		double newReal = (real * real2 + img * img2) / (real2 * real2 + img2 * img2);
		double newImage = (img * real2 - real * img2) / (real2 * real2 + img2 * img2);
		this.real = newReal;
		this.img = newImage;

	}

	public static ComplexNum add(ComplexNum z1, ComplexNum z2) {
		ComplexNum res = new ComplexNum();
		res.real = z1.real + z2.real;
		res.img = z1.img + z2.img;
		return res;
	}

	public static ComplexNum subtract(ComplexNum z1, ComplexNum z2) {
		ComplexNum res = new ComplexNum();
		res.real = z1.real - z2.real;
		res.img = z1.img - z2.img;
		return res;
	}

	public static ComplexNum multiply(ComplexNum z1, ComplexNum z2) {
		ComplexNum res = new ComplexNum();
		res.real = (z1.real * z2.real) - (z1.img * z2.img);
		res.img = (z1.real * z2.img) + (z1.img * z2.img);
		return res;

	}

	public static ComplexNum divide(ComplexNum z1, ComplexNum z2) {
		ComplexNum res = new ComplexNum();
		res.real = (z1.real * z2.real + z1.img * z2.img) / (z1.real * z2.real + z1.img * z2.img);
		res.img = (z1.real * z2.real + z1.img * z2.img) / (z1.real * z2.real + z1.img * z2.img);

		return res;

	}

	@Override
	public ComplexNum conjugate() {

		return new ComplexNum(this.real, -1 * this.img);
	}

	@Override
	public double mag() {
		return StrictMath.sqrt(StrictMath.pow(this.real, 2) + StrictMath.pow(this.img, 2));
	}

	@Override
	public ComplexNum square() {

		double real = this.real * this.real - this.img * this.img;
		double imaginary = 2 * this.real * this.img;
		return new ComplexNum(real,imaginary);

	}

	@Override
	public String toString() {
		return "ComplexNum [real=" + real + ", img=" + img + "]";
	}

}
