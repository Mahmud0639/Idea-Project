package book_super_inheritance.problem3Account;

public class Account {
    private String name;
    private long amount;

    public Account(String name,long amount){
        this.name = name;
        this.amount = amount;
    }
    public String getName(){
        return name;
    }
   public void deposit(long amount){
        this.amount +=amount;
   }

    public long getAmount() {
        return amount;
    }
    public void setAmount(long amount){
        this.amount = amount;
    }
}
