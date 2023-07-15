package com.driver;

public class Pizza {

    private int TotalPrice;
    private Boolean isVeg;

    private int  BasePrice;
    private String bill;

    private int CheesePrice;

    private int toppingPrice;

    private int PaperBag;
    private boolean IsExtraCheese;

    private boolean IsExtraToppings;


    private boolean IsPaperBagAdded;


    private boolean IsBillGenerated;



   //Constructor means here only intialising of variable is done
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            BasePrice=300;
            toppingPrice=70;
        }
        else{
            BasePrice=400;
            toppingPrice=120;
        }
        CheesePrice=80;
        PaperBag=20;
        TotalPrice=BasePrice;
        bill= "Base Price Of The Pizza: "+BasePrice+"\n";
    }

    public int getPrice(){
        return this.TotalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(IsExtraCheese==false){
            TotalPrice=TotalPrice+CheesePrice;
            IsExtraCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(IsExtraToppings==false){
            TotalPrice=TotalPrice+toppingPrice;
            IsExtraToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!IsPaperBagAdded){
            TotalPrice=TotalPrice+PaperBag;

            IsPaperBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!IsBillGenerated){
            IsBillGenerated=true;
            if(IsExtraCheese){
                bill= bill+ "Extra Cheese Added: "+CheesePrice+"\n";

            }
            if(IsExtraToppings){
                bill= bill+ "Extra Toppings Added: "+toppingPrice+"\n";
            }
            if(IsPaperBagAdded){
                bill=bill+ "Paperbag Added: "+PaperBag+"\n";
            }
            bill=bill +"price: "+TotalPrice+"\n";
        }
        return this.bill;
    }
}
