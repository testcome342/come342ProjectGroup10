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
	
	
	int adminstaffSayas�=0;
	int creativestaffSayas�=0;
	int accountmanagerSayas�=0;
	

	
	
	
	
	ArrayList<ConceptNotes> konseptNotlar�=new ArrayList<>();

	int kampanyaCalisanSayisi=0;
	int konseptNotlar�Say�s�=0;
	
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
   
void setCampaignWorkers()
    {
	
	System.out.print("how many creative staff you wanna assign to this campaign=");
	int manyCreative=Integer.parseInt(giris.nextLine());
	System.out.println("please enter the (staffName) for creative staff that is going to be assign to this campaign");
	for(int x=0;x<manyCreative;x++)
	{
		  //System.out.println("please enter the information for creative staff that is going to be assign to this campaign(staffName)");
		  System.out.print("name= ");
		  String staffName=giris.nextLine();
	
	  creativeStaffs[creativestaffSayas�]=new CreativeStaff();
	  creativeStaffs[creativestaffSayas�].setStaffName(staffName);
	  creativestaffSayas�++;
	}
	System.out.println("**********added*************");
	
    }
    void getCampaignWorkers()
    {
    	
    	System.out.println("creative staff");
    	System.out.println("-------------------");
    	
    		for(int x=0;x<creativestaffSayas�;x++)
    		{
    			System.out.print((x+1)+". ");
    			creativeStaffs[x].getStaffName();
    		}
    	
    }
    
      
            
     
      void setConceptNote()
      {
    
      }
    
	void getConceptNote()
      {
		
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
