package paket;

 public abstract  class StaffMember {
	    private  int staffno;
	    private  String staffName;
	    private  String staffStartDate;
	    private  String staffEmailAddress;
	  
	    public void setStaff(int staffno,String staffName,String staffStartDate,String staffEmailAddress)
	    {
	    	this.staffno=staffno;
	    	this.staffName=staffName;
	    	this.staffStartDate=staffStartDate;
	    	this.staffEmailAddress=staffEmailAddress;
	    }
	   public void setStaffName(String staffName )
	    {
	    	this.staffName=staffName;
	    }
	   public void getStaffName()
	   {
		   System.out.println(staffName+" ");
	   }
	    public void getStaffDetails()
	    {
	  	  System.out.println(staffno+" "+staffName+" "+staffStartDate+" "+staffEmailAddress);
	    }
	
	   

}
