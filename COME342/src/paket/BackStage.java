package paket;

import java.util.ArrayList;
import java.util.Scanner;

public class BackStage {

	ArrayList<Client> Client = new ArrayList<>();

	Scanner input = new Scanner(System.in);

	public int clientSayacý = 0;
	int manyCampaign;

	void addNewClient() {
		
	}

	void getAllClients() {
		
	}

	void addNewCampaign() {
		
	}

	void GetClientCampaigns() {
	
	}

	void AssignStafftoCampaign() {
		if(clientSayacý==0)
		{
			System.out.println("there is no client has been add to system");
		}
		else
		{
			for(int k=0; k<clientSayacý;k++)
			{
				for(int p=0;p<Client.get(k).kampanyaSayýsý;p++)  //p<Client.get(k).kampanyalarý.size()
				{
					System.out.print((p+1)+". ");
					Client.get(k).kampanyalarý.get(p).ListoftitleNames();
				}
			}
			System.out.print("please type the campaign title to assign staff to campaign=");
			String coName5 = input.nextLine();

			for (int i = 0; i < clientSayacý; i++) {
				for (int j = 0; j < Client.get(i).kampanyalarý.size(); j++) {
					if (coName5.equalsIgnoreCase(Client.get(i).kampanyalarý.get(j).getCampaignTitle())) {
						Client.get(i).kampanyalarý.get(j).setCampaignWorkers();
					}
					
				}
			}
		}
		
	}

	void getAllStaffForCampaign() {
		if(clientSayacý==0)
		{
			System.out.println("no client has been add to the system please add client first");
		}
		else
		{
			for(int k=0; k<clientSayacý;k++)
			{
				for(int p=0;p<Client.get(k).kampanyaSayýsý;p++)  //p<Client.get(k).kampanyalarý.size()
				{
					System.out.print((p+1)+". ");
					Client.get(k).kampanyalarý.get(p).ListoftitleNames();
				}
			}
			System.out.print("please type the campaign title to get working staff for this campaing=");
			String coName6 = input.nextLine();
			for (int i = 0; i < clientSayacý; i++) {
				for (int j = 0; j < Client.get(i).kampanyalarý.size(); j++) {
					if (coName6.equalsIgnoreCase(Client.get(i).kampanyalarý.get(j).getCampaignTitle())) {
						Client.get(i).kampanyalarý.get(j).getCampaignWorkers();
					}
				}
			}

		}
	
	}

	void AddConceptNotes() {
	
	}

	void getAllConceptNotes() {
	

	}

}
