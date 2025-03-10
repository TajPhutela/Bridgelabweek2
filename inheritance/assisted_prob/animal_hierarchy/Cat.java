package inheritance.assisted_prob.animal_hierarchy;

public class Cat extends Animal {
	Cat(String name,int age){
		super(name,age);
	}
	@Override
	void makeSound() {
		System.out.println(super.getName()+" meaw");
	}
}
