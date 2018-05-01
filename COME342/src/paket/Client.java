package paket;
import java.util.*;
public class Client {
	
	private String companyName;
	private String companyAddress;
	private String contactName;
	private String contactEmail;
	ArrayList<Campaign> kampanyalarý=new ArrayList<>();

public	int kampanyaSayýsý=0;
	Scanner input=new Scanner(System.in);
	
	Client()
	{
		
	}
	Client(String companyName,String companyAddress,String contactName)
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
		
	}
	void getClientCampaign()
	{
		
	}
	
	
	
};
