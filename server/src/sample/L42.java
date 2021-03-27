package sample;

class Cash {

    public static void main(String[] args) {
        BankAccount obj;
        obj = new BankAccount();
        obj.setBalance(10000);
        obj.withdrawBalance(1000);
    }
}

class BankAccount {
    int balance; //残高
    
    void setBalance (int price){
        this.balance = price;
    }
    void withdrawBalance (int price){
        if((this.balance - price) > 0) {
            balance -= price;
            System.out.println("残高は：" + balance + "円です。");
        } else 
            System.out.println("残高が足りません。");
    }
}