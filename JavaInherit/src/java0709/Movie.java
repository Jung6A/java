package java0709;

public class Movie {
	//인스턴스 변수의 제어자는 private
	private String title; //제목
	private String director; //감독
	private int viewAge; //관람 연령
	
	public Movie() {}
	public Movie(String title,String director, int viewAge) { //매개변수 있는 생성자 메서드
		this.title=title;
		this.director=director;
		this.viewAge=viewAge;
	}
	
	//객체 인스턴스 변수 값 출력하기 위한 메서드: java의 대부분의 클래스가 가지고 있음
	@Override
	public String toString() {
		return this.title+", "+this.director+", "+this.viewAge;
	}
	
	//클래스의 객체 내부 인스턴스에 데이터를 저장하는 방법
	//set 메서드를 통해 데이터 저장
	//생성자 메서드로 데이터 저장
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getViewAge() {
		return viewAge;
	}
	public void setViewAge(int viewAge) {
		this.viewAge = viewAge;
	}
	
}
