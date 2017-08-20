package Day01;

public class Bank {
	
    private static int idInit = 1000;
	private int id;
	private String password;
	private String balance;
	
	public Bank(String password, String balance) {
		super();
		this.id  = idInit++;
		this.password = password;
		this.balance = balance;
	}
	private static double cute;
	private static double minBalance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public static double getCute() {
		return cute;
	}
	public static void setCute(double cute) {
		Bank.cute = cute;
	}
	public static double getMinBalance() {
		return minBalance;
	}
	public static void setMinBalance(double minBalance) {
		Bank.minBalance = minBalance;
	}
	
	public void t(){
		System.out.println("id="+this.id +" password="+this.password +" balance="+ this.balance +" cute="+this.cute +" minBalance="+this.minBalance);
	}
}
