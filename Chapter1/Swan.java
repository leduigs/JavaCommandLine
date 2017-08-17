public class Swan{
	int numEggs;
	{System.out.println("Instance initializer - New Swan creating");}  //Instance initializer
	{System.out.println("Instance initializer - New Swan creating");}  //Instance initializer
	public static void main(String[] args){
		Swan mother = new Swan();
		mother.numEggs = 1;
		System.out.println("Mother has " + mother.numEggs +  " eggs!");
	}

}