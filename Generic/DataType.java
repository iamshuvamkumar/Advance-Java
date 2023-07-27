package Generic;

public class DataType<T> {
    T a;
    public DataType( T a) {
	this.a=a;
	}
    public  void show() {
    	Class c1 = a.getClass();
    	System.out.println(c1.getName()+" ------ "+a);
    }
	public static void main(String[] args) {
		System.out.println("Integer ................obj......");
		DataType<Integer> iobj = new DataType<Integer>(245);
		iobj.show();
		
		System.out.println("Float .............obj ................");
		DataType<Float> fobj = new DataType<Float>(145.475f);
		fobj.show();
		
		System.out.println("Double.............obj...........");
		DataType<Double> dobj = new DataType<Double>(1542.6545454);
		dobj.show();
		
		System.out.println("String ..................obj...........");
		DataType<String> sobj = new DataType<String>("asd");
		sobj.show();
		
		System.out.println("Char .................obj....................");
		DataType<Character> cobj = new DataType<Character>('S');
		cobj.show();
	}

}
