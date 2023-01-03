package ch08.ex06;

public interface Child1 extends Parent{
	public void method3();
	@Override
	public default void method2() {
		System.out.println("오버로딩");
	}
	Child1 child = new Child1() {

		@Override
		public void method1() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void method3() {
			// TODO Auto-generated method stub
			
		}
		
	};
	
}
