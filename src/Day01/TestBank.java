package Day01;

public class TestBank {
     public static void main(String[] args) {
    	 Bank.setCute(3.25);
    	 Bank.setMinBalance(0);
    	 Bank b = new Bank("aba","1234");
    	 Bank c = new Bank("egt","1234");
    	 Bank d = new Bank("a2a","1234");
    	 b.t();
    	 c.t();
    }
}
