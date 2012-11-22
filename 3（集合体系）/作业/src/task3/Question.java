package task3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question {
	
	private String qstid;
	
	private String exp;
	
	private ArrayList<String> option;
	
	private String asr;

	public String getQstid() {
		return qstid;
	}

	public void setQstid(String qstid) {
		this.qstid = qstid;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public ArrayList<String> getOption() {
		return option;
	}

	public void setOption(ArrayList<String> option) {
		this.option = option;
	}

	public String getAsr() {
		return asr;
	}

	public void setAsr(String asr) {
		this.asr = asr;
	}

	public Question(String qstid, String exp, ArrayList<String> option, String asr) {
		super();
		this.qstid = qstid;
		this.exp = exp;
		this.option = option;
		this.asr = asr;
	}
	

}
