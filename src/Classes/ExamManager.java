package Classes;


import java.io.*;                                                               
class ExamManager{
	
   private QuestionBank qBank;

   
//constructor
   public ExamManager(String courseName){ //try catch FileNotFoundException,IOException
        
      File inFile = new File(courseName+".ser");
     
      qBank = new QuestionBank(courseName);
      
      if( !(inFile.exists())) {
         System.out.println("File not found.");
        
         return;
      }
      
            
   
      try{
         System.out.println("File is found."); 
         qBank.loadQuestions(courseName);         
      
      }
      catch(FileNotFoundException e){e.getMessage();}
      catch(ClassNotFoundException e){e.getMessage();}
      catch(IOException e ){e.getMessage();}
   }
   

//getter and setter
   public QuestionBank getqBank(){
      return qBank;
   }

   public void setqBank(QuestionBank qBank){
      this.qBank=qBank;
   }

//METHOD1
   public boolean addNewQuestion(Question q){
      return qBank.addQuestion(q);
   }

//METHOD2
   public void removeChapterQuestions(String chapterName){
      
      String[] chQID = new String[qBank.countChapterQuestions(chapterName)];              
      Question[] chQ = qBank.getChapterQuestion(qBank.countChapterQuestions(chapterName),chapterName);   
      
      for(int i=0; i<chQ.length; i++)
         chQID[i] = chQ[i].getqID();
      
      qBank.removeAllQuestion(chQID);                                 
   }

//METHOD3
   public double generateExam(String header, int n, String chapterName, boolean withAnswer) throws FileNotFoundException { //try catch IOException
      
      double totalG = 0.0;
   
      try{
      //      File outFile = new File(qBank.getCourseName()+"Exam.txt");
         String fileName = qBank.getCourseName().toLowerCase() + "Exam.txt";
         FileOutputStream SF = new FileOutputStream(fileName);
         ObjectOutputStream OF = new ObjectOutputStream(SF);
         PrintWriter PF = new PrintWriter(OF);
      
         PF.println(header);
      
         Question[] randQ;
         
         if(chapterName.equals(""))
            randQ = qBank.getRandomQuestions(n);
         else
            randQ = qBank.getChapterQuestion(n, chapterName);
         
       
         
         for (int i=0; i<randQ.length; i++) {
         
            if(randQ[i] != null){
               if(withAnswer)        
                  (OF).writeObject(randQ[i].formattedQwithA());
               else
                  (OF).writeObject(randQ[i].formattedQ());
            
               totalG=totalG+randQ[i].getpGrade();
            }  
         }
         PF.close();
         OF.close();
      
      }//try
      catch(IOException e){System.out.println(e.getMessage());
      }
      
      return totalG;
   
   }

//METHOD4
   public void exportQBank() throws IOException{
      qBank.saveQuestions();}


} //End ExamManager.


