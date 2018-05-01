package paket;
import java.util.*;
public class ConceptNotes {
    String ConceptNote;
    Scanner notinput=new Scanner(System.in);
    
     ConceptNotes()
     {
    	 
     }
     ConceptNotes(String ConceptNotes)
     {
    	 setConceptNotes(ConceptNotes);
     }
     void setConceptNotes(String ConceptNotes)
     {
    	 this.ConceptNote=ConceptNotes;
     }
     void getConceptNotes()
     {
    	
    	System.out.println(ConceptNote);
     }
    
     
     
     
     
     
}
