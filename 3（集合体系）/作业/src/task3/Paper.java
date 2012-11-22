package task3;

import java.util.HashMap;

public class Paper {

	private HashMap<String ,Question> qstset;

	public HashMap<String ,Question> getQstset() {
		return qstset;
	}

	public void setQstset(HashMap<String ,Question> qstset) {
		this.qstset = qstset;
	}

	public Paper() {
		this.qstset=new HashMap<String ,Question>();
	}
	
	public Paper(HashMap<String ,Question> qstset) {
		super();
		this.qstset = qstset;
	}
	
}
