package Classes;

class FillBlankQ extends Question{

	   private String correctAnswer;
		
	   public FillBlankQ(String text, String qID, double pGrade, String correctAnswer){
	      super(text, qID, pGrade);
	      this.correctAnswer=correctAnswer;
	   }//constructor
	   
	   public FillBlankQ(Question q){
	      super(q);
	      correctAnswer = ((FillBlankQ)q).correctAnswer;
	   }//copy constructor

	   
		//setter and getter
	   public void setCorrectAnswer(String correctAnswer){
	      this.correctAnswer = correctAnswer;
	   }

	   public String getCorrectAnswer(){
	      return correctAnswer;
	   }

		//METHOD1
	   public String formattedQ(){
	      return String.format("Fill the following blank\n"+qID+":"+text); 
	   }

		//METHOD2
	   public String formattedQwithA(){
	      return formattedQ()+"\n Correct Answer is: "+correctAnswer;
	   }


	}
