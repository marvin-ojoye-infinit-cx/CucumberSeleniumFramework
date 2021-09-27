package cx.infinit.selenium.Uitities;

public enum BotComandEnum {
	/**
	 * return "reset";
	 */
	RESET {
	      public String getComand() {
	          return "reset";
	      }
	 },    
	  READ {
	      public String getComand() {
	          return "read";
	      }
	  },
	  SQL {
		  public String getComand() {
	          return "SQL";
	      }
	  };

	  public abstract String getComand();
}
