package chap8;

public class Animal {
	public void cry() {
		System.out.println("어흥");
	}
	
}


class Bird extends Animal {
    public void cry() {
        System.out.println("짹짹");
    }
    
}

class Cat extends Animal {
	public void cry() {
        System.out.println("냐옹");
    }
}

class Dog extends Animal {
	public void cry() {
        System.out.println("왈왈");
    }
}
 
