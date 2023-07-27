package Generic;

public class GenericTwoParameter <T,U> {
	T a;
	U b;
	GenericTwoParameter(T a,U b){
		this.a=a;
		this.b=b;
	}
	public void show() {
		System.out.println(" "+a+" "+b);
	}
	public static void main(String[] args) {
		
		GenericTwoParameter <Integer,String> isobj = new GenericTwoParameter<Integer, String>(10, "Ram");
		isobj.show();
		
		GenericTwoParameter<Float, Character> fcobj = new GenericTwoParameter<Float, Character>(10.44f, 'F');
		fcobj.show();
		
		GenericTwoParameter<Float, Double> fdobj = new GenericTwoParameter<Float, Double>(10.54f, 7417.414);
		fdobj.show();
	}
	
}
