package SecSemesterCSA;

public class sViTester {
	public static void main(String[] args) {

// to use cats you need to refer to the class it is in, but 
// no object is needed since it is static.
		System.out.println("Initialized 'cats' value from program run.");
		System.out.println("cats: " + staticVsInstance.cats);
		staticVsInstance.cats = staticVsInstance.cats + 1;
		System.out.println("\nAdded 1 to 'cats' in this class");
		System.out.println("cats: " + staticVsInstance.cats);
		System.out.println();

// This line won't compile because 'rabbits' was declared private		
//		System.out.pritnln("rabbits: " + staticVsInstance.rabbits);
		
// dogs and mice cannot be accessed since they ONLY
// exist inside objects that have been created
// these two lines will not compile
//		System.out.println(staticVsInstance.dogs);
//		System.out.println(staticVsInstance.mice);
		
// Create an object
		System.out.println("Creating 'animals' as a staticVsInstance object passed value of 10");
		staticVsInstance animals = new staticVsInstance(10);
// dogs can be accessed using this object
// because it's a public instance variable
		System.out.println("dogs in 'animals' object: " + animals.dogs);
		
// mice cannot because it was declared private
//		System.out.println(animals.mice);
		
// using a getter method mice can be accessed (if one was created):
		System.out.println("mice in 'animals' object: " + animals.getMice());
		
// Note that cats has been changed because the object's constructor changed it.
		System.out.println("cats is not an instance variable, but is changed by\nthe object's constructor when the object was created");
		System.out.println("cats: " + staticVsInstance.cats);
		System.out.println();
		
// calling the main from staticVsInstance
		System.out.println("Running the main from staticVsInstance class");
		staticVsInstance.main(args);
	}
}
