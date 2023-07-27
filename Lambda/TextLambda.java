package Lambda;

public class TextLambda {

	public static void main(String[] args) {
		// used method of interface b using implemention classes
		Sum sum = new SumImp();
		System.out.println(" add " + sum.add(10, 20));
		Sum sum1 = new Sum() {
			public int add(int a, int b) {
				return a + b;
			}
		};
		System.out.println(" add " + sum1.add(20, 20));
		
		//LambdaExpresion:=>
		//With type with  parenthesis name with curly braces 
		Sum sum2 = (int x, int y) -> {
			return (x + y);
		};
		System.out.println(" add " + sum2.add(30, 30));
	
		//Without type with  parenthesis name with curly braces 
		Sum sum4 = (x, y) -> {
			return (x + y);
		};
		System.out.println(" add " + sum4.add(50, 50));

		+
		
		
		//Without type with  parenthesis name without curly braces with return type  
		Sum sum3 = (x, y) -> (x + y);
		System.out.println(" add " + sum3.add(40, 40));
		
		Msg m = () -> "hi";
		System.out.println(" Msg " + m.Hello());

		 
        //without type parenthesis curlybraces
		GetValue get = x->x;
		System.out.println(" Get value "+get.getValue(100));
	}
}
