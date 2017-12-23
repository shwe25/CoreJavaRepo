class MobileAccessing{
	static Mobile mob;
	public static void main(String[] arg){
		System.out.println("Main begins");
		System.out.println("Mob is "+mob);
		Mobile.call();
		Mobile.msg();
		mob = new Mobile();
		System.out.println("Mobile brand is "+mob.brand);
		System.out.println("Mobile color is "+mob.color);
		System.out.println("Mobile price is "+mob.price);
		
		System.out.println("Main ends");
	}//End of method
}//End of class