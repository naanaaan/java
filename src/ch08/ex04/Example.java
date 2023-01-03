package ch08.ex04;

public class Example {
	public static void main(String[] args){
		Implementation impl = new Implementation();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		

		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
