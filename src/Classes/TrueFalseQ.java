package Classes;


class TrueFalseQ extends Question{
 	
   private boolean correctAnswer;
 	
   TrueFalseQ(String text, String qID, double pGrade, boolean correcrAnswer){
      super(text, qID, pGrade);
      this.correctAnswer = correcrAnswer;
   }//constructor
 	

   TrueFalseQ(Question q){
      this(((TrueFalseQ)q).text, ((TrueFalseQ)q).qID, ((TrueFalseQ)q).pGrade, ((TrueFalseQ)q).correctAnswer);		
   }//copy constructor.
 	
    
 	
   public String formattedQ() {
      return String.format("True or False:%n%s:%s%n", qID, text);
   }
 	
 	
   public String formattedQwithA() {
      return formattedQ() +"Correct Answer is" +correctAnswer +"\n";
   }

    
    //Setter, Getter.
    
   public boolean isCorrectAnswer() {
      return correctAnswer;
   }

   public void setCorrectAnswer(boolean correctAnswer) {
      this.correctAnswer = correctAnswer;
   }
  
}//End TrueFalseQ.
