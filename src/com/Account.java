package com;

public class Account {
    public String name = "Nguyen Phan Thien Phu";
    public double money = 1000000;
    public String[] history = new String[5];

    public Account() {
    }

    public Account(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdrawalMoney(double x) {
        money -= x;
    }

    public void depositMoney(double y) {
        money += y;
    }

    public void setHistory(String str) {
        String[] history1 = new String[5];
        for (int i = 0; i < history.length; i++){
            history1[i] = history[i];
        }
        history[0] = str;
        for (int j = 1; j < history.length; j++){
            history[j] = history1[j-1];
        }
    }

    public void getHistory() {
        if (history[0] == null) {
            System.out.println("\nYou haven't made a transaction yet");
        } else {
            for(int i = 0; i < history.length; i++) {
                if (history[i] != null){
                    System.out.println("\nYou " + history[i] + " vnd");
                }
            }
        }
    }

    public String toString(){
        return "Your account balance is: " + getMoney();
    }
}
