package kr.co.ezenac.main;

import kr.co.ezenac.beans.HelloWorld;
import kr.co.ezenac.beans.HelloWorldEn;
import kr.co.ezenac.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {

		HelloWorld hello1 = new HelloWorldKo();
		callMethod(hello1);
		HelloWorld hello2 = new HelloWorldKo();
		callMethod(hello2);
		
		HelloWorld hello3 = new HelloWorldEn();
		callMethod(hello3);
		HelloWorld hello4 = new HelloWorldEn();
		callMethod(hello4);

	}

	// public static void callMethod(HelloWorldEn hello){
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();

	}

}
