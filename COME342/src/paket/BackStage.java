package paket;

import java.util.ArrayList;
import java.util.Scanner;

public class BackStage {

	ArrayList<Client> Client = new ArrayList<>();

	Scanner input = new Scanner(System.in);

	public int clientSayaci = 0;
	int manyCampaign;

	void addNewClient() {
		boolean eklendi = false;
		boolean eklendi2 = false;
		String CompanyName, companyAddress, contactName, contactEmail;
		System.out.print("how many client you wanna add = ");
		int manyClient = Integer.parseInt(input.nextLine());

		if (clientSayaci > 0) {
			for (int x = 0; x < manyClient; x++) {

				//System.out.println("please enter the CompanyName,companyAddress,contactName,contactEmail");
                System.out.print("CompanyName= ");
				CompanyName = input.nextLine();

				for (int k = 0; k < clientSayaci; k++) {
					if (CompanyName.equalsIgnoreCase(Client.get(k).getClientCompanyName())) {
						eklendi = true;
					}

				}
				if (eklendi != true) {
					Client temp = new Client();
					System.out.print("companyAddress= ");
					companyAddress = input.nextLine();
					System.out.print("contactName= ");
					contactName = input.nextLine();
					System.out.print("contactEmail= ");
					contactEmail = input.nextLine();
					temp.setClientInfo(CompanyName, companyAddress, contactName, contactEmail);

					Client.add(temp);
					clientSayaci++;
					System.out.println("**********added*************");      //System.out.println("ismi kontrol edip ekledim");
				} else if (eklendi = true) {
					System.out.println("this company name has been added before");
					break;
				}

			}

		} else if (clientSayaci == 0) {
			for (int b = 0; b <= manyClient; b++) {

				//System.out.println("please enter the CompanyName,companyAddress,contactName,contactEmail");
                System.out.print("CompanyName= ");
				CompanyName = input.nextLine();
				if (clientSayaci > 0) {

					for (int k = 0; k < clientSayaci; k++) {
						if (CompanyName.equalsIgnoreCase(Client.get(k).getClientCompanyName())) {
							eklendi2 = true;
						}
					}
					if (eklendi2 != true) {
						Client temp = new Client();
						System.out.print("companyAddress= ");
						companyAddress = input.nextLine();
						System.out.print("contactName= ");
						contactName = input.nextLine();
						System.out.print("contactEmail= ");
						contactEmail = input.nextLine();
						temp.setClientInfo(CompanyName, companyAddress, contactName, contactEmail);

						Client.add(temp);
						clientSayaci++;
						System.out.println("**********added*************");  //System.out.println("ismi kontrol edip ekledim");
						

					} else if (eklendi2 = true) {
						System.out.println("this company name has been add before");
					}

				}

				else if (clientSayaci == 0) {
					Client temp = new Client();
                    System.out.print("companyAddress= ");
					companyAddress = input.nextLine();
					System.out.print("contactName= ");
					contactName = input.nextLine();
					System.out.print("contactEmail= ");
					contactEmail = input.nextLine();
					temp.setClientInfo(CompanyName, companyAddress, contactName, contactEmail);

					Client.add(temp);
					clientSayaci++;
					manyClient--;
					System.out.println("**********added*************");         //System.out.println("direk ekledim");
					
				}

			}

		}
	}

	void getAllClients() {
		if (clientSayaci != 0) {
			System.out.println("-------CLIENTS------");
			for (int i = 0; i < clientSayaci; i++) {
                System.out.print((i+1)+".");
				Client.get(i).getClientInfo();
				System.out.println("***********************");
			}
		}
		if (clientSayaci == 0) {
			System.out.println("no client has been added please add client first");
		}

		
	}

	void addNewCampaign() {
		if(clientSayaci==0)
		{
			System.out.println("there is no client please add new client first");
		}
		else
		{
			for(int x=0;x<clientSayaci; x++)
			{
			   System.out.print((x+1)+". ");
			   Client.get(x).listofClientNames();
			}
			System.out.print("please type the campany name to add campaign==");
			String ccName = input.nextLine();
			for (int i = 0; i < clientSayaci; i++) {
				if (ccName.equalsIgnoreCase(Client.get(i).getClientCompanyName())) {
					Client.get(i).addNewCampaign();
				}
			}
		}
		
	}

	void GetClientCampaigns() {
		if(clientSayaci==0)
		{
			System.out.println("there is no client that has been add to the system");
		}
		else
		{
			for(int x=0;x<clientSayaci; x++)
			{
			   System.out.print((x+1)+". ");
			   Client.get(x).listofClientNames();
			}
			System.out.print("please type the company name to get campaigns==");
			String coName = input.nextLine();
			for (int i = 0; i < clientSayaci; i++) {
				if (coName.equalsIgnoreCase(Client.get(i).getClientCompanyName())) {

					Client.get(i).getClientCampaign();
				}
			}
		}
		
	}

	void AssignStafftoCampaign() {
		if(clientSayaci==0)
		{
			System.out.println("there is no client has been add to system");
		}
		else
		{
			for(int k=0; k<clientSayaci;k++)
			{
				for(int p=0;p<Client.get(k).kampanyaSayisi;p++)  //p<Client.get(k).kampanyalarý.size()
				{
					System.out.print((p+1)+". ");
					Client.get(k).kampanyalari.get(p).ListoftitleNames();
				}
			}
			System.out.print("please type the campaign title to assign staff to campaign=");
			String coName5 = input.nextLine();

			for (int i = 0; i < clientSayaci; i++) {
				for (int j = 0; j < Client.get(i).kampanyalari.size(); j++) {
					if (coName5.equalsIgnoreCase(Client.get(i).kampanyalari.get(j).getCampaignTitle())) {
						Client.get(i).kampanyalari.get(j).setCampaignWorkers();
					}
					
				}
			}
		}
		
	}

	void getAllStaffForCampaign() {
		if(clientSayaci==0)
		{
			System.out.println("no client has been add to the system please add client first");
		}
		else
		{
			for(int k=0; k<clientSayaci;k++)
			{
				for(int p=0;p<Client.get(k).kampanyaSayisi;p++)  //p<Client.get(k).kampanyalarý.size()
				{
					System.out.print((p+1)+". ");
					Client.get(k).kampanyalari.get(p).ListoftitleNames();
				}
			}
			System.out.print("please type the campaign title to get working staff for this campaing=");
			String coName6 = input.nextLine();
			for (int i = 0; i < clientSayaci; i++) {
				for (int j = 0; j < Client.get(i).kampanyalari.size(); j++) {
					if (coName6.equalsIgnoreCase(Client.get(i).kampanyalari.get(j).getCampaignTitle())) {
						Client.get(i).kampanyalari.get(j).getCampaignWorkers();
					}
				}
			}

		}
	
	}
// Adding new concept notes and listing the added notes functions added
	void AddConceptNotes() {
		if(clientSayaci==0)
		{
			System.out.println("there is no client in the system");
		}
		else
		{
			for(int k=0; k<clientSayaci;k++)
			{
				for(int p=0;p<Client.get(k).kampanyaSayisi;p++)  //p<Client.get(k).kampanyaları.size()
				{
					System.out.print((p+1)+". ");
					Client.get(k).kampanyalari.get(p).ListoftitleNames();
				}
			}
			System.out.print("please type the campaign title to add concept notes=");
			String coName8 = input.nextLine();
			for (int i = 0; i < clientSayaci; i++) {
				for (int j = 0; j < Client.get(i).kampanyalari.size(); j++) {
					if (coName8.equalsIgnoreCase(Client.get(i).kampanyalari.get(j).getCampaignTitle())) {

						Client.get(i).kampanyalari.get(j).setConceptNote();
					}
				}
			}
		}
	
	
	}

	void getAllConceptNotes() {
		for(int k=0; k<clientSayaci;k++)
		{
			for(int p=0;p<Client.get(k).kampanyaSayisi;p++)  //p<Client.get(k).kampanyaları.size()
			{
				System.out.print((p+1)+". ");
				Client.get(k).kampanyalari.get(p).ListoftitleNames();
			}
		}
		System.out.print("please type the campaign title to get concept notes for this campaign=");
		String coName10 = input.nextLine();
		for (int i = 0; i < clientSayaci; i++) {
			for (int j = 0; j < Client.get(i).kampanyalari.size(); j++) {
				if (coName10.equalsIgnoreCase(Client.get(i).kampanyalari.get(j).getCampaignTitle())) {
					Client.get(i).kampanyalari.get(j).getConceptNote();
				}
			}
		}

	}
}
