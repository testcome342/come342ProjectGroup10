package paket;

import java.util.ArrayList;
import java.util.Scanner;

public class BackStage {

	ArrayList<Client> Client = new ArrayList<>();

	Scanner input = new Scanner(System.in);

	public int clientSayacı = 0;
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
		if(clientSayacı==0)
		{
			System.out.println("there is no client has been add to system");
		}
		else
		{
			for(int k=0; k<clientSayacı;k++)
			{
				for(int p=0;p<Client.get(k).kampanyaSayısı;p++)  //p<Client.get(k).kampanyaları.size()
				{
					System.out.print((p+1)+". ");
					Client.get(k).kampanyaları.get(p).ListoftitleNames();
				}
			}
			System.out.print("please type the campaign title to assign staff to campaign=");
			String coName5 = input.nextLine();

			for (int i = 0; i < clientSayacı; i++) {
				for (int j = 0; j < Client.get(i).kampanyaları.size(); j++) {
					if (coName5.equalsIgnoreCase(Client.get(i).kampanyaları.get(j).getCampaignTitle())) {
						Client.get(i).kampanyaları.get(j).setCampaignWorkers();
					}
					
				}
			}
		}
		
	}

	void getAllStaffForCampaign() {
		if(clientSayacı==0)
		{
			System.out.println("no client has been add to the system please add client first");
		}
		else
		{
			for(int k=0; k<clientSayacı;k++)
			{
				for(int p=0;p<Client.get(k).kampanyaSayısı;p++)  //p<Client.get(k).kampanyaları.size()
				{
					System.out.print((p+1)+". ");
					Client.get(k).kampanyaları.get(p).ListoftitleNames();
				}
			}
			System.out.print("please type the campaign title to get working staff for this campaing=");
			String coName6 = input.nextLine();
			for (int i = 0; i < clientSayacı; i++) {
				for (int j = 0; j < Client.get(i).kampanyaları.size(); j++) {
					if (coName6.equalsIgnoreCase(Client.get(i).kampanyaları.get(j).getCampaignTitle())) {
						Client.get(i).kampanyaları.get(j).getCampaignWorkers();
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
