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
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

	@Autowired
	private IUserinfoService userinfoServiceImpl;

	@Test
	public void queryAllUserinfo() {
		System.out.println("第一次查询");
		List<Userinfo> list = userinfoServiceImpl.queryAllUserinfo();
		for (Userinfo u : list) {
			System.out.println(u);
		}

		System.out.println("第二次查询");
		List<Userinfo> list1 = userinfoServiceImpl.queryAllUserinfo();
		for (Userinfo u : list1) {
			System.out.println(u);
		}
	}

	@Test
	public void queryUserinfoById(){
	    Userinfo u = userinfoServiceImpl.queryUserinfoById(1);
	    System.out.println(u);

	    Userinfo u1 = userinfoServiceImpl.queryUserinfoById1(1);
	    System.out.println(u1);

		Userinfo u2 = userinfoServiceImpl.queryUserinfoById(1);
		System.out.println(u2);
    }

}
