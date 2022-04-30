package kr.co.ezenac.beans;

public class TestBean1 {
	
	private int data1;
	private double data2;
	private String data3;
	
	public TestBean1() {
		System.out.println("TestBean1의 기본 생성자");
		this.data1=0;
		this.data2=0.0;
		this.data3=null;
	}

	public void printData() {
		System.out.printf("data1 : %d\n",data1);
		System.out.printf("data2 : %f\n",data2);
		System.out.printf("data3 : %s\n",data3);
	}
}
