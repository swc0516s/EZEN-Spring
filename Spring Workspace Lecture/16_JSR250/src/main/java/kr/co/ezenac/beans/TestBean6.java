package kr.co.ezenac.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class TestBean6 {
	@Resource
	private DataBean1 data100;
	@Resource
	private DataBean2 data200;

	@Bean
	public DataBean1 getData100() {
		return data100;
	}
	
	@Bean
	public DataBean2 getData200() {
		return data200;
	}

}
