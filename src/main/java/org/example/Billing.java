package org.example;

public class Billing {
    private int billId;
    private int memberId;
    private double amount;
    private boolean paid;

    public Billing(int billId, int memberId, double amount, boolean padi) {
        this.billId = billId;
        this.memberId = memberId;
        this.amount = amount;
        this.paid = paid;
    }
    public int getBillId(){
        return billId;
    }
    public void setBillId(int billId){
        this.billId = billId;
    }
    public int getMemberId(){
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public double getAmount(){
        return amount;
    }
    public boolean isPaid(){
        return paid;
    }
    public void setPaid(boolean paid){
        this.paid = paid;
    }
}
