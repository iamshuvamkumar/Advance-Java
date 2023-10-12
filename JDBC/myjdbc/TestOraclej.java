package myjdbc;
class TestOracle{
	public static void main(String[]args){
		System.out.println("Start main ");
		try{
		System.out.print("Start try block");
		
		Class.forName(" ");
		
		System.out.println("End try block ");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}