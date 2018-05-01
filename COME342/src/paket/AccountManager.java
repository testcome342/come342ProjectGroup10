package paket;

public class AccountManager extends StaffMember {

	void setAccountManager(int staffno, String staffName, String staffStartDate, String staffEmailAddress)
	{
		super.setStaff(staffno, staffName, staffStartDate, staffEmailAddress);
	}
}
