package task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestExam {
  
	public static void main(String[] args) {
	
		/*Exam��   ������
		���ԣ�����ѧ��  һ�ſ���
		��ʾ��ѧ������HashSet���
        Paper��   ������  
		���ԣ���������
		��ʾ���������HashMap��ţ�keyΪString����ʾ��ţ�valueΪ�������
        Student��     ѧ����
		���ԣ�����   һ�Ŵ��   һ�ſ���
        Question��    ������
		���ԣ���� ��Ŀ����    ����ѡ��    ��ȷ��
		��ʾ������ѡ����ArrayList
        AnswerSheet��    �����
		���ԣ�ÿ����Ĵ�    
		��ʾ�������ÿ����Ĵ���HashMap��ţ�keyΪString����ʾ��ţ�valueΪѧ���Ĵ�
                ���⣺ΪExam�����һ������������Ϊ����ѧ���о�����ӡ�ɼ����������Ρ�������*/
		
	/* ��д���� */
    ArrayList<String> option1=new ArrayList<String>();
    option1.add("A:Yes��");
    option1.add("B:true��");
    option1.add("C:Certarly!");
	Question qst1=new Question("1","Is wp a yingmo?",option1,"A");
	
	ArrayList<String> option2=new ArrayList<String>();
    option2.add("A:yelei��");
    option2.add("B:wangpeng��");
    option2.add("C:dongzheng!");
	Question qst2=new Question("2","What is this animal?",option2,"C");
	
	ArrayList<String> option3=new ArrayList<String>();
    option3.add("A:cat��");
    option3.add("B:Dog��");
    option3.add("C:Bird!");
	Question qst3=new Question("3","what is this ?",option3,"A");
	 
	ArrayList<String> option4=new ArrayList<String>();
    option4.add("A:��");
    option4.add("B:��");
    option4.add("C:��");
	Question qst4=new Question("4","1+1��ʲô����²�����2?",option4,"B");
	
	ArrayList<String> option5=new ArrayList<String>();
    option5.add("A:2��");
    option5.add("B:8��");
    option5.add("C:0��");
	Question qst5=new Question("5","�м�����?",option5,"B");
	
	
	/* �����Ծ� */
	Paper pp=new Paper();
	pp.getQstset().put("1", qst1);
	pp.getQstset().put("2", qst2);
	pp.getQstset().put("3", qst3);
	pp.getQstset().put("4", qst4);
	pp.getQstset().put("5", qst5);

	
	/* ����ѧ����� */
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
	
	/* ����ѧ����Ϣ */
	Student []stu=new Student [5];
		
    stu[0]=new Student(1,"wangpeng",pp,asr[0]);	
    stu[1]=new Student(2,"dongzheng",pp,asr[1]);
    stu[2]=new Student(3,"yelei",pp,asr[2]);
    stu[3]=new Student(4,"huihui",pp,asr[3]);
    stu[4]=new Student(5,"zhoucong",pp,asr[4]);
    
	/* ���忼�� */
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
