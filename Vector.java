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
		return (new Vector(this.doMath(that, 1)));
	}
	public Vector minus(Vector that){
		return (new Vector(this.doMath(that, -1)));
		
	}
	
	public Vector scale(double alpha){
		for(int y = 0; y<vec.length; y++){
			vec[y] = alpha*vec[y];
		}
		return this;
	}
	
	public double dot(Vector b){
		double sum = 0;
		Vector[] use = findShorter(this,b);
		for(int i = 0; i<use[0].data().length; i++){
			sum += (use[0].data()[i]*use[1].data()[i]);
		}
		return sum;
	}
	
	public double magnitude(){
		return (Math.sqrt(this.dot(this)));
	}
	
	public double cartesian(int i) {
		return(this.data()[i]);
	}
	
	public String toString() {
		String s = "<";
		for(int x = 0; x < vec.length-1; x++) {
			s = s + Double.toString(vec[x]) + ", ";
		}
		s += Double.toString(vec[vec.length-1]) + ">";
		return s;
	}
	
	public Vector direction() {
		double mag = this.magnitude();
		double[] ret = new double[this.data().length];
		for(int i = 0; i<ret.length; i++) {
			ret[i] = (vec[i]/mag);
		}
		return (new Vector(ret));
	}
	
	public double[] doMath(Vector that, int i){
		//Returns array of this, that -> they are now properly formatted.
		Vector[] use = findShorter(this, that);
		double ret[] = new double[use[0].data().length];
		for(int x = 0; x < ret.length; x++){
			ret[x] = use[0].data()[x] + ((i)*(use[1].data()[x]));
		}
		return ret;
	}
	
	public Vector[] findShorter(Vector one, Vector two){
		//Returns shorter, longer
		Vector[] arr = {one, two};
		if(one.data().length <= two.data().length){
			//makeLonger
			arr[0] = one.makeLonger(two.data().length);
		}
		else{ arr[1] = two.makeLonger(one.data().length); }
		return arr;
	}
	
	public Vector makeLonger(int length){
		double[] newLen = new double[length];
		for(int i = 0; i< (this.data().length); i++){
			newLen[i] = this.data()[i];
		}
		for(int i = this.data().length; i<length;i++){
			newLen[i] = 0;
		}
		return (new Vector(newLen));
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
		v.minus(v2).returnVec();
		System.out.println();
		System.out.println(v.dot(v2));
		System.out.println(v.magnitude());
		System.out.println(v2.toString());
	}
}
