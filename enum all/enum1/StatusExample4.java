public class StatusExample4 {   
  
    public enum Status{   
        STATUS_OPEN(0, "open"),   
        STATUS_STARTED(1, "started"),   
        STATUS_INPROGRESS(2, "inprogress"),   
        STATUS_ONHOLD(3, "onhold"),   
        STATUS_COMPLETED(4, "completed"),   
        STATUS_CLOSED(5, "closed");   
           
        private final int status;   
        private final String description;   
           
        Status(int aStatus, String desc){   
            this.status = aStatus;   
            this.description = desc;   
        }   
        public int status(){   
            return this.status;   
        }   
        public String description(){   
            return this.description;   
        }   
           
        public<STATUS> int compareTo(Status obj){   
            return 0;   
        }   
    }      
}  
