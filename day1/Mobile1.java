package week1.day1;

public class Mobile1 {
public void makeCall() {
	String mobileModel;
	float mobileWeight;
	mobileModel="Micromax";
	mobileWeight=10.5f;
	System.out.println("MobileModel is" + mobileModel);
	System.out.println("MobileWeight is" + mobileWeight);
}
public void sendMsg() {
	boolean fullCharged;
	int mobileCost;
	fullCharged=true;
	mobileCost=10000;
	System.out.println("Mobile fullCharged is" + fullCharged);
	System.out.println("Mobile cost is"  + mobileCost);
}
public static void main(String[] args) {
	Mobile1 mob =new Mobile1();
	mob.makeCall();
	mob.sendMsg();
}
}
