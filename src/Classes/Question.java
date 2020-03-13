package Classes;

import java.io.*;                                                               
abstract class Question implements Serializable{
	 
   protected String text;
   protected String qID;
   protected double pGrade;
   
   
   Question (String text, String qID, double pGrade){
      setText(text);
      setqID(qID);
      setpGrade(pGrade);
   }//cons
    
   Question (Question q){
      this(q.text,q.qID,q.pGrade);
   }//copy cons
   
    
    
   public String getText(){
      return text;
   }
   
   public void setText (String text){
      this.text = text;
   }
   
   public String getqID(){
      return qID;
   }
   
   public void setqID(String qID){
      this.qID = qID;
   }
   
   public double getpGrade(){
      return pGrade;
   }
   
   public void setpGrade(double pGrade){
      this.pGrade = pGrade;
   }
   
   
   public abstract String formattedQ();
   public abstract String formattedQwithA(); 
} //End Question.
