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
	
	
	int adminstaffSayasý=0;
	int creativestaffSayasý=0;
	int accountmanagerSayasý=0;
	

	
	
	
	
	ArrayList<ConceptNotes> konseptNotlari=new ArrayList<>();

	int kampanyaCalisanSayisi=0;
	int konseptNotlariSayýsi=0;
	
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
	
    }
    void getCampaignWorkers()
    {
   
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
