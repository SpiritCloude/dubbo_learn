package cn.dubbo.service;

import cn.dubbo.bean.Order;
import cn.dubbo.bean.User;

public interface UserService {
	public Order buyMovie(User user);
}
