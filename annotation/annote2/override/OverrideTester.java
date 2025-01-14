public class OverrideTester 
		{

  @Override
  public String tostring() 
	  {
				return super.toString() + " [OverrideTester Implementation]";
	}

  @Override
  public int hashCode() 
	  {
			return toString().hashCode();
	}

  /**
   * Uncomment to see @Override in action on a misspelled method
  @Override
  public int hasCode() {
    return toString().hashCode();
  }
  */
}
