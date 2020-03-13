package Classes;


class MCQ extends Question{
		
  private int correctAnswer;
  private String[] choices;
		
  MCQ(String text, String qID, double pGrade, int correcrAnswer, String[] choices){
     super(text, qID, pGrade);
     this.correctAnswer = correcrAnswer;
     this.choices = choices;
  }//constructor.
		
  MCQ(Question q){
     this(((MCQ)q).text, ((MCQ)q).qID, ((MCQ)q).pGrade, ((MCQ)q).correctAnswer, ((MCQ)q).choices);		
  }//copy constructor.


		
  public String formattedQ() {
     
     String str = "";
        
     for (int i=0; i<4; i++) 
        if (choices[i] == null)
           break;
        else
           str += (i+1)+ ":" +choices[i]+ "\n"; 
        
     return String.format("Choose the correct answer:%n%s:%s%n%s", qID, text, str);
  }
		
		
  public String formattedQwithA() {  	
     return formattedQ() +"\nCorrect Answer is" +choices[correctAnswer] +"\n";
  }
	   
	   //Setter, Getter.

  public int getCorrectAnswer() {
     return correctAnswer;
  }

  public void setCorrectAnswer(int correctAnswer) {
     this.correctAnswer = correctAnswer;
  }

  public String[] getChoices() {
     return choices;
  }

  public void setChoices(String[] choices) {
     this.choices = choices;
  }

	   
}//End MCQ class.

