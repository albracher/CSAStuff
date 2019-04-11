package SecSemesterCSA;

public class staticVsInstance {

	// cats will be a static int variable
			public static int cats = 5;
	// rabbit will be a private static int variable
			private static int rabbits = 100;
	// dogs will be a public int instance variable
			public int dogs;
	// mice will be a private int instance variable
			private int mice;
	
	// need a constructor to create values for instance variables.
	public staticVsInstance(int x) {
		cats = x;		// every time a new object is created, cats will be set to x
		dogs = cats * 2;
		mice = dogs * 2;
	}
	
	public int getMice() {
		return mice;
	}

	public int getDogs() {
		return dogs;
	}

	public int getCats() {
		return cats;
	}
	
	public static void main(String[] args) {
		System.out.println("cats: " + cats);
		System.out.println("rabbits: " + rabbits);
		
// The following two lines won't compiles because dogs and mice are instance variables only accessible through the object.
// Only static variables can be accessed directly without an object.		
//		System.out.println(dogs);	// can't access instance variable like this
//		System.out.println(mice);	// only static variables can be accessed like this
									// this is true even INSIDE the objects class.
		
// When we create an object, the dogs and mice will be created INSIDE that object.
		System.out.println("Creating a new object");
		staticVsInstance critters = new staticVsInstance(5);
		System.out.println("dogs: " + critters.dogs);

		System.out.println("mice: " + critters.mice);  // this only works here because it is being done from INSIDE the object
	}

}
