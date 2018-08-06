	private static int[] bubbelSortDescending(int[] list){
		boolean swapped = true; 
		while(swapped){	
			swapped = false;
			for(int i=0;i<=list.length-2;i++){
				if(list[i] < list[i+1]){
					//Swap list[i] and list[i+1]
					int temp = list[i+1];
					list[i+1] = list[i];
					list[i] = temp;
					swapped = true;
				}
			}
		}
		return list;
		
	}
	 