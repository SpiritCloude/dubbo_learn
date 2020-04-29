package cn.dubbo.service.Imp;

import cn.dubbo.bean.Movie;
import cn.dubbo.bean.Order;
import cn.dubbo.bean.User;
import cn.dubbo.service.MovieService;
import cn.dubbo.service.UserService;

public class UserServiceImp implements UserService {
	
	MovieService movieService;
	
	public MovieService getMovieService() {
		return movieService;
	}

	public void setMovieService(MovieService movieService) {
		this.movieService = movieService;
	}

	@Override
	public Order buyMovie(User user) {
		Movie movie = movieService.getNewMovie();
		System.out.println("RPC调用movieService.getNewMovie()");
		Order order = new Order();
		order.setMovieName(movie.getMovieNmae());
		order.setUserNmae(user.getUserName());
		return order;
		
	};
}
