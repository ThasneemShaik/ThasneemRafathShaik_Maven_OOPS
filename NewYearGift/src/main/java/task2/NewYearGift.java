package task2;

public class NewYearGift {
	public static void main( String[] args )

    {
        Sweet silk=new choclates(8,"Silk",60,120,"milk");
        Sweet truffle=new cake(3,"Truffle",250,300,"chocolate");
        Sweet candyman=new candy(4,"candyman",10,2,"mango");
        Sweet melody=new candy(5,"melody",12,5,"chocolate");
        Gift gift1=new Gift();
        gift1.add(silk);
        gift1.add(candyman);
        gift1.add(truffle);
        gift1.add(melody);
        System.out.println("Sweets in Gift are :");
        System.out.println(gift1.toString());
        System.out.println("Total weight of your gift ="+gift1.totalWeight()+"gm");
        gift1.sort();
        System.out.println("After sorting according to price sweets in gift are :\n"+ gift1.toString());
    }
}
