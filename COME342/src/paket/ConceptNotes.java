package paket;
import java.util.*;
public class ConceptNotes {
       public String ConceptNote;
       public String NoteTitle;
       public String whoCreate;
       public String time;
    
    
     ConceptNotes()
     {
    	 
     }
     ConceptNotes(String ConceptNotes,String NoteTitle,String whoCreate,String time)
     {
    	 setConceptNotes(ConceptNotes,NoteTitle,whoCreate,time);
     }
      void setConceptNotes(String ConceptNotes,String NoteTitle,String whoCreate,String time)
     {
    	 this.ConceptNote=ConceptNotes;
    	 this.NoteTitle=NoteTitle;
    	 this.whoCreate=whoCreate;
    	 this.time=time;
     }
       void getConceptNotes()
     {
    	
    	System.out.println("ConceptNote= "+ConceptNote);
    	System.out.println("  NoteTitle= "+NoteTitle);
    	System.out.println("  whoCreate= "+whoCreate);
    	System.out.println("  time= "+time);
    	System.out.println("--------------------------");
     }
    
     
     
     
     
     
}
