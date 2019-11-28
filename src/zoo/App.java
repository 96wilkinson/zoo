package zoo;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Dog animal1 = new Dog();
		Animal animal2 = new Tiger();
		List<Animal> zoo = new ArrayList<>();
		zoo.add(animal1);
		zoo.add(animal2);
		for (Animal a : zoo) {
			a.move();
		}
		

//		Dog a = new Dog();
//		a.move();
//		a.fetch();
//		
//		Animal b = new Tiger();
//		b = new Tiger();
//		b.move();
		
		
	}
}
