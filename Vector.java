
public class Vector {
	private double[] vec;
	public Vector() {
		double[] var = {1,2,3};
		vec = var;
	}
	public Vector(double[] a) {
		vec = a;
	}
	
	public Vector plus(Vector that) {
		int len;
		int longer;
		int len2;
		if (vec.length < that.data().length) { len = vec.length; len2 = that.data().length; longer =0;} else {len = that.data().length; len2 = vec.length; longer = 1;}
		double ret[] = new double[len2];
		for (int i = 0;i < len; i++) {
			ret[i] = vec[i] + that.data()[i];
		}
		if (longer == 0) {
			for (int x = len; x <len2; x++) {
				ret[x] = that.data()[x];
			}
		} else {
			for (int x = len2; x <len; x++) {
				ret[x] = vec[x];
			}
		}
		return (new Vector(ret));
	}
	
	public double[] data() {
		return vec;
	}
	
	public void returnVec() {
		for(double x : vec) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		double[] var = {1,4,5,4,5,6,7,8};
		Vector v = new Vector();
		Vector v2 = new Vector(var);
		v.plus(v2).returnVec();
	}
}
