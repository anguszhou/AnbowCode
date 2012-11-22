package task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestExam {
  
	public static void main(String[] args) {
	
		/*Exam类   考试类
		属性：若干学生  一张考卷
		提示：学生采用HashSet存放
        Paper类   考卷类  
		属性：若干试题
		提示：试题采用HashMap存放，key为String，表示题号，value为试题对象
        Student类     学生类
		属性：姓名   一张答卷   一张考卷
        Question类    试题类
		属性：题号 题目描述    若干选项    正确答案
		提示：若干选项用ArrayList
        AnswerSheet类    答卷类
		属性：每道题的答案    
		提示：答卷中每道题的答案用HashMap存放，key为String，表示题号，value为学生的答案
                问题：为Exam类添加一个方法，用来为所有学生判卷，并打印成绩排名（名次、姓名）*/
		
	/* 编写试题 */
    ArrayList<String> option1=new ArrayList<String>();
    option1.add("A:Yes！");
    option1.add("B:true！");
    option1.add("C:Certarly!");
	Question qst1=new Question("1","Is wp a yingmo?",option1,"A");
	
	ArrayList<String> option2=new ArrayList<String>();
    option2.add("A:yelei！");
    option2.add("B:wangpeng！");
    option2.add("C:dongzheng!");
	Question qst2=new Question("2","What is this animal?",option2,"C");
	
	ArrayList<String> option3=new ArrayList<String>();
    option3.add("A:cat！");
    option3.add("B:Dog！");
    option3.add("C:Bird!");
	Question qst3=new Question("3","what is this ?",option3,"A");
	 
	ArrayList<String> option4=new ArrayList<String>();
    option4.add("A:！");
    option4.add("B:？");
    option4.add("C:。");
	Question qst4=new Question("4","1+1在什么情况下不等于2?",option4,"B");
	
	ArrayList<String> option5=new ArrayList<String>();
    option5.add("A:2个");
    option5.add("B:8个");
    option5.add("C:0个");
	Question qst5=new Question("5","有几个猴?",option5,"B");
	
	
	/* 定义试卷 */
	Paper pp=new Paper();
	pp.getQstset().put("1", qst1);
	pp.getQstset().put("2", qst2);
	pp.getQstset().put("3", qst3);
	pp.getQstset().put("4", qst4);
	pp.getQstset().put("5", qst5);

	
	/* 定义学生答卷 */
	Answersheet []asr=new Answersheet[5];
	
	asr[0] = new Answersheet();
	asr[0].getAsrset().put("1", "B");
	asr[0].getAsrset().put("2", "B");
	asr[0].getAsrset().put("3", "B");
	asr[0].getAsrset().put("4", "B");
	asr[0].getAsrset().put("5", "B");
	
	asr[1] = new Answersheet();
	asr[1].getAsrset().put("1", "A");
	asr[1].getAsrset().put("2", "C");
	asr[1].getAsrset().put("3", "A");
	asr[1].getAsrset().put("4", "B");
	asr[1].getAsrset().put("5", "A");
	
	asr[2] = new Answersheet();
	asr[2].getAsrset().put("1", "A");
	asr[2].getAsrset().put("2", "C");
	asr[2].getAsrset().put("3", "A");
	asr[2].getAsrset().put("4", "B");
	asr[2].getAsrset().put("5", "B");
	
	asr[3] = new Answersheet();
	asr[3].getAsrset().put("1", "A");
	asr[3].getAsrset().put("2", "B");
	asr[3].getAsrset().put("3", "C");
	asr[3].getAsrset().put("4", "B");
	asr[3].getAsrset().put("5", "B");
	
	asr[4] = new Answersheet();
	asr[4].getAsrset().put("1", "B");
	asr[4].getAsrset().put("2", "A");
	asr[4].getAsrset().put("3", "C");
	asr[4].getAsrset().put("4", "B");
	asr[4].getAsrset().put("5", "A");
	
	/* 定义学生信息 */
	Student []stu=new Student [5];
		
    stu[0]=new Student(1,"wangpeng",pp,asr[0]);	
    stu[1]=new Student(2,"dongzheng",pp,asr[1]);
    stu[2]=new Student(3,"yelei",pp,asr[2]);
    stu[3]=new Student(4,"huihui",pp,asr[3]);
    stu[4]=new Student(5,"zhoucong",pp,asr[4]);
    
	/* 定义考试 */
    Exam ex=new Exam();
    ex.getStudentset().add(stu[0]);
    ex.getStudentset().add(stu[1]);
    ex.getStudentset().add(stu[2]);
    ex.getStudentset().add(stu[3]);
    ex.getStudentset().add(stu[4]);
	
    ex.setPp(pp);
	ex.Check(ex);
    
	
}
}
