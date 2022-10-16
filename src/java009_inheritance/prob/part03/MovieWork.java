package java009_inheritance.prob.part03;

public class MovieWork extends Movie {
	private int cinematic; // 작품성
	private int popular; // 대중성
	private int scenario; // 시나리오

	public MovieWork(String title, int director, int acter, int cinematic, int popular, int scenario) {
		super(title, director, acter);
		this.cinematic = cinematic;
		this.popular = popular;
		this.scenario = scenario;
	}

	@Override
	void display() {
		// 여기를 구현하세요.
		int total = director+ acter+cinematic+popular+scenario; 		
		String result="";
		System.out.printf("영화제목:%s\n",title);
		System.out.printf("감독 : %d, 배우 : %d",director,acter);
		System.out.printf(" 작품성:%d, 대중성:%d, 대본:%d\n", cinematic, popular, scenario);
		System.out.printf("영화총점 :%d\n",total);
		if (total >= 15)
			result = "☆☆☆☆☆";
		else if(total>=12)
			result = "☆☆☆☆";
		else if(total>=10)
			result = "☆☆☆";
		else
			result = "☆☆";
		System.out.println("영화평점 : " + result);	
	
		
	}
}