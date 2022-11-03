import inheritance.Bicycle;
import inheritance.MountainBike;
import polymorphism.Circle;
import polymorphism.Shapes;
import polymorphism.Triangle;
import polymorphism2.Animal;
import polymorphism2.Cat;
import polymorphism2.Cow;
import polymorphism2.Dog;

public class main {
	
//	public static void main (String[] args) {
//		 Bicycle bc = new Bicycle(3,100);
//		 
//		 bc.speedUp(5);
//		 
//		 System.out.println(bc.toString());
//		
//		 MountainBike mb = new MountainBike(3, 100, 25);
//		 
//		 System.out.println("=======================");
//		 
//	     System.out.println(mb.toString());
//	     
//	     
//	     Bicycle bc2 = new MountainBike(4, 105, 30);
//	     System.out.println(bc2.toString());
//	}
//	
//	public static void main(String[] args) {
//	    Shapes myShape = new Shapes();  // Create a Shapes object
//	    Shapes myTriangle = new Triangle();  // Create a Triangle object
//	    Shapes myCircle = new Circle();  // Create a Circle object
//	    myShape.area();
//	    System.out.println("=======================");
//	    myTriangle.area();
//	    System.out.println("=======================");
//	    myCircle.area();
//	  }
	
	public static void main(String[] args) {
		//poly - override & overloading
		
	    Animal myAnimal = new Animal();  // Create a Animal object
	    Animal myCat = new Cat();  // Create a Cat object
	    Animal myDog = new Dog();  // Create a Dog object
	    Animal myCow = new Cow();  // Create a Dog object
	    
//	    Animal myAnimal = new Animal();  // Create a Animal object
//	    Cat myCat = new Cat();  // Create a Cat object
//	    Dog myDog = new Dog();  // Create a Dog object
//	    Cow myCow = new Cow();  // Create a Dog object
//	    
	    myAnimal.animalSound();
	    myCat.animalSound();
	    myDog.animalSound();
	    myCow.animalSound();
	  }

}
