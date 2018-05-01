package paket;


import java.util.*;

public class Test {

	public static void main(String[] args) {
		BackStage begin=new BackStage();
		String toDo;
		Scanner input=new Scanner(System.in);
		System.out.println("------------------AGATE LTD-----------------");
		System.out.println("(add client)(add campaign)(assign Staff to Campaign)(create Concept Notes)(browse concept notes)");
		while(true)
		{
			System.out.println("\r\n" + "PLEASE WRITE WHAT YOU WANT TO DO");
			toDo = input.nextLine();
			if (toDo.equalsIgnoreCase("add client"))
			{
				begin.addNewClient();
			}
			if (toDo.equalsIgnoreCase("get All Clients"))
			{
				begin.getAllClients();
			}
        	if (toDo.equalsIgnoreCase("add campaign"))
			{
				begin.addNewCampaign();
			}
			if (toDo.equalsIgnoreCase("Get Client Campaign"))
			{
				begin.GetClientCampaigns();
			}
			if (toDo.equalsIgnoreCase("assign Staff to Campaign"))
			{
				begin.AssignStafftoCampaign();
			}
			if (toDo.equalsIgnoreCase("get staff For Campaign"))
			{
				begin.getAllStaffForCampaign();
			}
			if (toDo.equalsIgnoreCase("create Concept Notes"))
			{
				begin.AddConceptNotes();
			}
			if (toDo.equalsIgnoreCase("browse concept notes"))
			{
				begin.getAllConceptNotes();
			}
		}

	}

}
