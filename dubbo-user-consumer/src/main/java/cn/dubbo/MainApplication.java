package cn.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.dubbo.bean.Order;
import cn.dubbo.bean.User;
import cn.dubbo.service.UserService;

public class MainApplication {
	
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        
        System.out.println("consumer启动。。。。");
        UserService userservice = context.getBean(UserService.class);
        User user = new User();
        user.setUserId("1");
        user.setUserName("哈哈");
        Order order = userservice.buyMovie(user);
        System.out.println(order);
        System.in.read(); // 按任意键退出
    }
}
