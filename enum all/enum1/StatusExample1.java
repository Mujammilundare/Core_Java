public class StatusExample1 {   
  
    public enum Status
		{   
        STATUS_OPEN(0),   
        STATUS_STARTED(1),   
        STATUS_INPROGRESS(2),   
        STATUS_ONHOLD(3),   
        STATUS_COMPLETED(4),   
        STATUS_CLOSED(5);   
           
        private final int status;   
           
        Status(int aStatus)
			{   
            this.status = aStatus;   
          }   
        
		public int status()
			{   
            return this.status;   
        }   
    }      
       
    public static void main(String[] args)
		{   
        for (Status stat: Status.values())
			{   
            System.out.println(stat + "value is "+ new Integer(stat.status()));   
            }   
    }   
}  
