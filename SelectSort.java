package school;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = new int[5];
		
		array[0] = 10;
		array[1] = 23;
		array[2] = 14;
		array[3] = 89;
		array[4] = 45;	
		
		int n = 5;
		
		
		for(int i = 0; i<n-1; i++) {
			
			int small = array[i];
			int l = i;
			
			for(int j = i; j<n-1; j++) {
				
				if(array[j+1] < small) {
					small = array[j+1];
					l = j + 1;
				}
				
			}
			
			int key = array[i];
			array[i] = small;
			array[l] = key;
			
		}
		
		for(int x = 0; x<n; x++) {
			System.out.println(array[x]);
			
		}

	}

}
