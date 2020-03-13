package Classes;

import java.io.*;                                                               // 
class QuestionBank{ 

 //attributes
   private String courseName;
   private int nOfQ;
   private Question[] qList; //composition

 //constructor
   public QuestionBank(String courseName){
      this.courseName = courseName;
      qList = new Question[100];
      nOfQ =0;
   }

   
 //getters and setters
   public String getCourseName(){
      return courseName;
   }

   public Question[] getqList(){
      return qList;
   }

   public int getnOfQ(){
      return nOfQ;
   }

   public void setCourseName(String cName){
      courseName = cName;
   }

 
   public void setqList(Question[] qArray){
      qList = qArray;
   }

   public void setnOfQ(int num){
      nOfQ = num;
   }



 //methods

 //---------------Method1----------------
   public int findQuestion(Question q){
    
      for(int i=0;i<nOfQ;i++){
         if((q.getText()).equals(qList[i].getText()) || (q.getqID()).equals(qList[i].getqID()))
            return i;
      
      } 
      return -1;  
   }


 //---------------Method2----------------
   public boolean addQuestion(Question q){
   
      if( (findQuestion(q) == -1) && (nOfQ != qList.length) ){
      
         if(q instanceof MCQ)
            qList[nOfQ++] = new MCQ(q);
             
         else
            if(q instanceof TrueFalseQ)
               qList[nOfQ++] = new TrueFalseQ(q);
                
            else
               if(q instanceof FillBlankQ)
                  qList[nOfQ++] = new FillBlankQ(q);
          
         return true; 
      }
    
      return false;    
   }


 //---------------Method3----------------
   public Question[] getRandomQuestions(int n) throws IllegalArgumentException{
    
      
      boolean notExist = true;
    
      if(nOfQ < n)
      throw new IllegalArgumentException();
      
      Question[] randomQ=new Question[n] ;
    
      int rand;
      int index = 0;
    
      for(int i=0; i<n; i++){
    	  
         rand = (int) (Math.random() * 100);
         notExist = true;
         
         if (qList[rand] == null) {
        	 i--;
         continue;
      }

         for (int k=0; k<index; k++)                    //Check if the question already exist.
        	 if (randomQ[k].getqID().equals(qList[rand].getqID()))
        		 notExist = false;                      //End check
             
         
         if(notExist && rand<randomQ.length && index<randomQ.length ){  
        	 
            if ( (findQuestion(qList[rand])) != -1) {
               if(qList[rand] instanceof MCQ)
                  randomQ[index++] = new MCQ((MCQ)qList[rand]);
                   
               else if(qList[rand] instanceof TrueFalseQ)
                  randomQ[index++] = new TrueFalseQ((TrueFalseQ)qList[rand]);
                      
               else if(qList[rand] instanceof FillBlankQ)
                  randomQ[index++]= new FillBlankQ((FillBlankQ)qList[rand]);
                     
            	}
            
         }else 
             i--;
         
      }//end loop
      return randomQ;
    
   }


 //---------------Method4----------------
   public int countChapterQuestions(String cName){
      
      int counter = 0;
      for(int i=0; i<nOfQ; i++)
         if( ( ((qList[i].getqID() ).substring( 0, (qList[i].getqID()).indexOf('_') )).toLowerCase() ).equals( cName.toLowerCase() ) )
            counter++;
    
      return counter;
   }

 //---------------Method5----------------
   public Question[] getChapterQuestion(int n, String cName){
          
      int size;
      int index = 0;
      int numOfQchapter = countChapterQuestions(cName);
    
      if(numOfQchapter < n)
         size = numOfQchapter;
      else
         size = n;
    
      Question[] chapterQuestions = new Question[size];
    
      for(int i=0; i<nOfQ;i++) //fixed
        
        if(index < chapterQuestions.length){
         if( (((qList[i].getqID()).substring(0 ,((qList[i].getqID() ).indexOf('_')))).toLowerCase()).equals( cName.toLowerCase() )){
            if(qList[i] instanceof MCQ)
               chapterQuestions[index++] = new MCQ((MCQ)qList[i]);
             
            else if(qList[i] instanceof TrueFalseQ)
               chapterQuestions[index++] = new TrueFalseQ((TrueFalseQ)qList[i]);
                
            else if(qList[i] instanceof FillBlankQ)
               chapterQuestions[index++] = new FillBlankQ((FillBlankQ)qList[i]);
         }//end biggest if
        }
      return chapterQuestions;
   }


 //---------------Method6----------------
   public void saveQuestions() throws IOException{
    
      File mainFile = new File(courseName+".ser");
     
      FileOutputStream mainOutputStream = new FileOutputStream(mainFile);
      ObjectOutputStream mainObjOutStream = new ObjectOutputStream(mainOutputStream);
    
      for(int i=0; i<nOfQ; i++)
         mainObjOutStream.writeObject(qList[i]);
    
      mainObjOutStream.close();
   }


 //---------------Method7----------------
   public int loadQuestions(String fName) throws ClassNotFoundException, IOException{  
      
      if(!(fName.equals(courseName))) 
         throw new IllegalArgumentException();
    
      int count = 0;

      ObjectInputStream mainObjInStream = new ObjectInputStream( new FileInputStream( new File(fName+".ser") ) );
    
    
      try {
       
       
         for(int i=0; i<qList.length ; i++) {
            addQuestion((Question) mainObjInStream.readObject());
            count++;
         }
      
      
      
      }catch(EOFException e) {
         System.out.println("Reached End of file.");
      }
          
      finally{ 
          
         mainObjInStream.close();    
         return count;
      }
    	 
   
   }


 //---------------Method8----------------
   public void removeAllQuestion(String ids[]){
    
	   
     for(int i=0; i<ids.length; i++){
        for(int j=0; j<nOfQ; j++)
         
             if (qList[j].qID.toLowerCase().equals(ids[i].toLowerCase())) {
               for(int k=j; k<nOfQ-1; k++) 
                  qList[k] = qList[k+1];
                  
               qList[--nOfQ] = null;
               break;
            }//if statement                
         }//search ID loop
 
   }
   
   
   
}