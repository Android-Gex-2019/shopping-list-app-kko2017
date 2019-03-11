package ca.nbcc.shoppinglist;

//file: ShoppingList.java
//name: KwangEun Oh
//date: Feb. 7, 2019
//Type: Assignment1

public class ShoppingList {

    private int lemonCount;
    private int appleCount;
    private int bananaCount;
    private int orangeCount;
    private int kiwiCount;
    private int riceCount;
    private int wheatCount;
    private int tomatoCount;
    private int melonCount;
    private int mandarinCount;

    private String lemonName;
    private String appleName;
    private String bananaName;
    private String orangeName;
    private String kiwiName;
    private String riceName;
    private String wheatName;
    private String tomatoName;
    private String melonName;
    private String mandarinName;


    public ShoppingList() {

        lemonCount = 0;
        appleCount = 0;
        bananaCount = 0;
        orangeCount = 0;
        kiwiCount = 0;
        riceCount = 0;
        wheatCount = 0;
        tomatoCount = 0;
        melonCount = 0;
        mandarinCount = 0;

        lemonName = "Lemon";
        appleName = "Apple";
        bananaName = "Banana";
        orangeName = "Orange";
        kiwiName = "Kiwi";
        riceName = "Rice";
        wheatName = "Wheat";
        tomatoName = "Tomato";
        melonName = "Melon";
        mandarinName = "Mandarin";
    }

    public int getLemonCount() {
        return lemonCount;
    }

    public void setLemonCount(int count) {

        lemonCount = lemonCount + count;
    }

    public int getAppleCount() {
        return appleCount;
    }

    public void setAppleCount(int count) {
        appleCount = appleCount + count;
    }

    public int getBananaCount() {
        return bananaCount;
    }

    public void setBananaCount(int count) {

        bananaCount = bananaCount + count;
    }

    public int getOrangeCount() {
        return orangeCount;
    }

    public void setOrangeCount(int count) {

        orangeCount = orangeCount + count;
    }

    public int getKiwiCount() {
        return kiwiCount;
    }

    public void setKiwiCount(int count) {

        kiwiCount = kiwiCount + count;
    }

    public int getRiceCount() {
        return riceCount;
    }

    public void setRiceCount(int count) {

        riceCount = riceCount + count;
    }

    public int getWheatCount() {
        return wheatCount;
    }

    public void setWheatCount(int count) {

        wheatCount = wheatCount + count;
    }

    public int getTomatoCount() {
        return tomatoCount;
    }

    public void setTomatoCount(int count) {

        tomatoCount = tomatoCount + count;
    }

    public int getMelonCount() {
        return melonCount;
    }

    public void setMelonCount(int count) {
        melonCount = melonCount + count;
    }

    public int getMandarinCount() {
        return mandarinCount;
    }

    public void setMandarinCount(int count) {
        mandarinCount = mandarinCount + count;
    }

    public String getLemonName() {
        return lemonName;
    }

    public String getAppleName() {
        return appleName;
    }

    public String getBananaName() {
        return bananaName;
    }

    public String getOrangeName() {
        return orangeName;
    }

    public String getKiwiName() {
        return kiwiName;
    }

    public String getRiceName() {
        return riceName;
    }

    public String getWheatName() {
        return wheatName;
    }

    public String getTomatoName() {
        return tomatoName;
    }

    public String getMelonName() {
        return melonName;
    }

    public String getMandarinName() {
        return mandarinName;
    }
}
