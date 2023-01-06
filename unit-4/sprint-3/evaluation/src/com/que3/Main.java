package com.que3;

public class Main {
	void messageToStudents(Evaluation evaluation) {
		if(evaluation instanceof DsaEvaluation) {
			System.out.println("Its a DSA Evaluation");
			DsaEvaluation d=(DsaEvaluation)evaluation;
			d.printNoOfQuestions();
			d.evaluationTiming();
			System.out.println("================================================================");
		}else if(evaluation instanceof CodingEvaluation) {
			System.out.println("Its a Coding Evaluation");
			CodingEvaluation c=(CodingEvaluation)evaluation;
			c.printNoOfQuestions();
			c.evaluationTiming();
			System.out.println("================================================================");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		m.messageToStudents(new DsaEvaluation(5));
		m.messageToStudents(new CodingEvaluation(4));
	}

}
