package paket;
import java.util.*;
public class Client {
	
	private String companyName;
	private String companyAddress;
	private String contactName;
	private String contactEmail;
	ArrayList<Campaign> kampanyalari=new ArrayList<>();

public	int kampanyaSayisi=0;
	Scanner input=new Scanner(System.in);
	
	Client()
	{
		
	}
	Client(String companyName,String companyAddress,String contactName,String contactEmail)
	{
		setClientInfo ( companyName, companyAddress, contactName,contactEmail);
	}
	
	public void setClientInfo (String companyName,String companyAddress,String contactName,String contactEmail)
	{
		this.companyName=companyName;
		this.companyAddress=companyAddress;
		this.contactName=contactName;
		this.contactEmail=contactEmail;
	}
	public void getClientInfo()
	{
		
		System.out.println("companyName= "+companyName);
		System.out.println("  companyAddress= "+companyAddress);
		System.out.println("  contactName= "+contactName);
		System.out.println("  contactEmail= "+contactEmail);

		
	}
	
	public void listofClientNames()
	{
		System.out.println(companyName+" ");
	}
	

	String getClientCompanyName()
	{
		return companyName;
	}
	void addNewCampaign()
	{
		boolean eklendi = false;
		boolean eklendi2 = false;
		String title,campaignStartDate,campaignFinishDate;
		int estimatedCost;
		System.out.print("how many campaigns you want to add?==");
		int manyCampaign = Integer.parseInt(input.nextLine());
		if(kampanyaSayisi>0)
		{
			for (int x = 0; x < manyCampaign; x++)
			{
				
				System.out.print("title= ");
				title=input.nextLine();
				for (int k = 0; k < kampanyaSayisi; k++)
				{
					if (title.equalsIgnoreCase(kampanyalari.get(k).getCampaignTitle()))
					{
						eklendi=true;
					}
				}
				if (eklendi != true)
				{
					 Campaign temp=new Campaign();
					
					 System.out.print("campaignStartDate= ");
					 campaignStartDate=input.nextLine();
					 System.out.print("campaignFinishDate= ");
					 campaignFinishDate=input.nextLine();
					 System.out.print("estimatedCost= ");
					 estimatedCost=Integer.parseInt(input.nextLine());
					 temp.createCampaign(title, campaignStartDate, campaignFinishDate, estimatedCost);
					 kampanyalari.add(temp);
					 kampanyaSayisi++;
					 System.out.println("**********added*************");   //System.out.println("title'ý kontrol edip ekledim");
				}
				else if (eklendi = true)
				{
					System.out.println("this title  has been added before");
					break;
				}
			}
		}
		else if(kampanyaSayisi==0)
		{
			for (int b = 0; b <= manyCampaign; b++)
			{
				
				System.out.print("title= ");
				title = input.nextLine();
				if (kampanyaSayisi > 0)
				{
					for (int k = 0; k < kampanyaSayisi; k++) {
						if (title.equalsIgnoreCase(kampanyalari.get(k).getCampaignTitle())) {
							eklendi2 = true;
						}
					}
					if (eklendi2 != true)
					{
						 Campaign temp=new Campaign();
						 
						 System.out.print("campaignStartDate= ");
						 campaignStartDate=input.nextLine();
						 System.out.print("campaignFinishDate= ");
						 campaignFinishDate=input.nextLine();
						 System.out.print("estimatedCost= ");
						 estimatedCost=Integer.parseInt(input.nextLine());
						 temp.createCampaign(title, campaignStartDate, campaignFinishDate, estimatedCost);
						 kampanyalari.add(temp);
						 kampanyaSayisi++;
						 System.out.println("**********added*************");   //System.out.println("title'ý kontrol edip ekledim");
					}
					else if (eklendi2 = true) 
					{
						System.out.println("this title has been added before");

					}
				}
				else if (kampanyaSayisi == 0)
				{
					 Campaign temp=new Campaign();
					
					 System.out.print("campaignStartDate= ");
					 campaignStartDate=input.nextLine();
					 System.out.print("campaignFinishDate= ");
					 campaignFinishDate=input.nextLine();
					 System.out.print("estimatedCost= ");
					 estimatedCost=Integer.parseInt(input.nextLine());
					
					
					temp.createCampaign(title, campaignStartDate, campaignFinishDate, estimatedCost);
					kampanyalari.add(temp);
					kampanyaSayisi++;
					manyCampaign--;
					System.out.println("**********added*************");                //System.out.println("direk ekledim");
					
				}
			}
		}
		

		
	}
	void getClientCampaign()
	{
		if(kampanyaSayisi==0)
		{
			System.out.println("no campaign has been add to this campaign");
		}
		else
		{
			for(int i=0;i<kampanyaSayisi;i++)
			{
				 System.out.print((i+1)+".");
				kampanyalari.get(i).getCampaignInfo();
				System.out.println("************************");
			}
		}
	}
	
	
	
};
