package cn.dubbo.service.imp;

import cn.dubbo.bean.Movie;
import cn.dubbo.service.MovieService;

public class MovieServiceImp implements MovieService {

	@Override
	public Movie getNewMovie() {
		Movie movie = new Movie();
		movie.setId(1);
		movie.setMovieNmae("头号玩家");
		movie.setPrice(39.9);
		System.out.println("查出。。。头号玩家");
		return movie;
	}

}
