package maths_quiz;

public class QuizServiceImpl implements QuizService {
	public void quiz(int type) {
		if(type == 1) {
		   Level el=new EasyLevel();
	        el.runLevel();
		}else if(type == 2) {
			Level hl=new HardLevel();
	        hl.runLevel();
		}
	}
}

