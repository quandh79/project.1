package Baitap;

import java.util.Scanner;

public class Account {
    public int id;
    public String name;
    public int balance;

    public Account() {
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    Scanner sc = new Scanner(System.in);
    // nap tien
    public int credit (){
        int amount;
        amount = sc.nextInt();
        if(amount >0){
            balance = balance + amount;

        }else {
            System.out.println("So tien nap vao khong hop le");
        }
        return balance;
    }

    // thanh toan tien
    public int debit (){
        int amount;
        amount = sc.nextInt();
        if(amount < balance){
            balance = balance - amount;

        }else{
            System.out.println("Thanh toan khong thanh cong");
        }
        return balance;
    }
    // chuyen khoan
    public int tranferTo(){

    }

}
w