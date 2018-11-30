
public class HourGlass {

	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		
		for(int i = 0;i < 6;i++) {
			for(int j = 0;j < 6;j++) {
				arr[i][j] = 0;
			}
		}
		arr[3][2] = 1;
		arr[3][3] = 1;
		arr[3][4] = 1;
		arr[4][3] = 1;
		arr[5][2] = 1;
		arr[5][3] = 1;
		arr[5][4] = 1;
		 int sum = 0;
	        int max_sum = Integer.MIN_VALUE;

	        for(int i = 0;i < 6;i++){
	            for(int j = 0;j < 6;j++){
	                if(i < 4 && j < 4){
	                    sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
	                                + arr[i+1][j+1] +
	                      arr[i + 2][j] + arr[i+2][j+1] + arr[i+2][j+2];
	                    System.out.println(sum);
	                }
	                if(sum > max_sum) max_sum = sum;
	            }
	            
	        }
	        System.out.println(max_sum);
	}

}
