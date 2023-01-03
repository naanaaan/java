package ch08.ex03;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void stop() {
		System.out.println("버스가 멈춥니다.");
	}
}
