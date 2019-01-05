package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		String reqInputDTO = "q=fetch+redirect+post&oq=fetch+redirect+post&aqs=chrome..69i57j0j69i60l2j69i61j0.10378j0j7&sourceid=chrome&ie=UTF-8";
		String[] strArr = reqInputDTO.split("[\\&,\\=]");
		System.out.println(strArr[0]);
	}

}

