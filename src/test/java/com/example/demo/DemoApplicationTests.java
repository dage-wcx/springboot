package com.example.demo;

import com.example.demo.entity.Userinfo;
import com.example.demo.service.IUserinfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private IUserinfoService userinfoServiceImpl;

	@Test
	public void queryAllUserinfo() {
		List<Userinfo> list = userinfoServiceImpl.queryAllUserinfo();
		for (Userinfo u : list) {
			System.out.println(u);
		}
	}

}
