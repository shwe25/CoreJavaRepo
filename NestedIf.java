class NestedIf{
	public static void main(String[] args){
		System.out.println("Main started");
		int x = 15;
		System.out.println(x%3==0);
		if(x%3==0){
				if(x%5==0){
					System.out.println(x);
				}
				else{
						System.out.println(x+" not / by 3 & 5");
			}
		}
		else{
			System.out.println("condition fails");
		}
		System.out.println("Main ended");
	}
}