import java.awt.Dimension;
class ReferenceTest {
	public static void main(String[] args) {
		Dimension d = new Dimension(5,10);
		ReferenceTest rt = new ReferenceTest();
		System.out.println("before modify()" + d.height); //10

		rt.modify(d);
		System.out.println("After modify()" + d.height);//11
	}
	void modify(Dimension dim) {
		dim.height = dim.height + 1;
		System.out.println("dim = " + dim.height);//11
	}
}
