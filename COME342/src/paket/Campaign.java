package paket;
import java.util.*;
public class Campaign {
	private  String title;
	private  String campaignStartDate;
	private  String campaignFinishDate;
	private  int    estimatedCost;
	magazineAdvert  magazineAdverts[]=new magazineAdvert[150];
	NewspaperAdvert newspaperAdverts[]=new NewspaperAdvert[150];
	
	
	CreativeStaff creativeStaffs[]= new CreativeStaff[24];
	
	
//	int adminstaffSayisi=0;
	int creativestaffSayisi=0;
	//int accountmanagerSayisi=0;
	

	
	
	
	
	ArrayList<ConceptNotes> konseptNotlari=new ArrayList<>();

	int kampanyaCalisanSayisi=0;
	int konseptNotlariSayisi=0;
	
	Scanner giris=new Scanner(System.in);
	Campaign()
	{
		
	}
	Campaign(String title,String campaignStartDate,String campaignFinishDate,int estimatedCost)
	{
		createCampaign(title,campaignStartDate,campaignFinishDate,estimatedCost);
	}
 	void createCampaign(String title,String campaignStartDate,String campaignFinishDate,int estimatedCost)
  {
	  this.title=title;
	  this.campaignStartDate=campaignStartDate;
	  this.campaignFinishDate=campaignFinishDate;
	  this.estimatedCost=estimatedCost;
  }
 	
 	void getCampaignInfo()
	{
		
 		System.out.println("title= "+title);
		System.out.println("  campaignStartDate= "+campaignStartDate);
		System.out.println("  campaignFinishDate= "+campaignFinishDate);
		System.out.println("  estimatedCost= "+estimatedCost);
	}
   
 				////////////////
void setCampaignWorkers()
    {
	
	System.out.print("how many creative staff you wanna assign to this campaign=");
	int manyCreative=Integer.parseInt(giris.nextLine());
	System.out.println("please enter the (staffName) for creative staff that is going to be assign to this campaign");
	for(int x=0;x<manyCreative;x++)
	{
		  
		  System.out.print("name= ");
		  String staffName=giris.nextLine();
	
	  creativeStaffs[creativestaffSayisi]=new CreativeStaff();
	  creativeStaffs[creativestaffSayisi].setStaffName(staffName);
	  creativestaffSayisi++;
	}
	System.out.println("**********added*************");
	
    }
    void getCampaignWorkers()
    {
    	
    	System.out.println("creative staff");
    	System.out.println("-------------------");
    	
    		for(int x=0;x<creativestaffSayisi;x++)
    		{
    			System.out.print((x+1)+". ");
    			creativeStaffs[x].getStaffName();
    		}
    	
    }
    
      			////////////////
            
     //set and get methods added 
      
      void setConceptNote()
      {
    	  Scanner input18=new Scanner(System.in);
    	  System.out.print("how many concept notes you want to add ? == ");
			int many = Integer.parseInt(input18.nextLine());
      	
		  for(int i=0;i<many;i++)
		  {
			  ConceptNotes temp=new ConceptNotes();
			  String note;
 
			 System.out.print("Note =");
			   note=input18.nextLine();
			  
		
			   temp.setConceptNotes(note);
			   konseptNotlari.add(temp);
			  konseptNotlariSayisi++;
			  
		  }
      }
    
	void getConceptNote()
      {
		System.out.println("concept notes");
    	System.out.println("-------------------");
    	  for(int i=0;i<konseptNotlariSayisi; i++)
    	  {
    		  System.out.print((i+1)+". ");
    		  konseptNotlari.get(i).getConceptNotes();
    	  }
      }
	public String getCampaignTitle()
	{
		return title;
	}
	public void ListoftitleNames()
	{
		System.out.println(title+" ");
	}
      
	
  
}
