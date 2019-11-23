import java.util.*;

class gen<T>{
	T ob;
	gen(T o){
		ob=o;
	}
	void show(){
		System.out.println("Value: "+ob);
		System.out.println("Type: "+ob.getClass().getName());
	}
}

class genericsprg{
	public static void main(String args[]){
		gen<Integer> obj1=new gen<Integer>(10);
		obj1.show();
		gen<String> obj2=new gen<String>("hello");
		obj2.show();
	}
}
