package cn.dubbo.bean;

import java.io.Serializable;

public class Movie implements Serializable {
	private Integer id;
	private String movieNmae;
	private Double price;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMovieNmae() {
		return movieNmae;
	}
	public void setMovieNmae(String movieNmae) {
		this.movieNmae = movieNmae;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
