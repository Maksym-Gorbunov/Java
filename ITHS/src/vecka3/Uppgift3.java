	private static boolean findNumber(int[] list, int number){
		for(int i=0;i<=list.length - 1;i++){
			if(list[i] == number){
				return true;
			}
		}
		
		return false;
		
	} 