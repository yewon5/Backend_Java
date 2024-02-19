public class MultiDimension {
	public static void main(String[] args) {
		// TODO 다차원 배열

/*
		//1차원 배열(선형배열)
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {6, 7, 8, 9, 10};
		int arr3[] = {11, 12, 13, 14, 15};

		//1차원 배열 → 2차원 배열
		int arr[][] = new int[3][5]; //3행 5열
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		
		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[1][2] = 8;
		arr[1][3] = 9;
		arr[1][4] = 10;
		
		arr[2][0] = 11;
		arr[2][1] = 12;
		arr[2][2] = 13;
		arr[2][3] = 14;
		arr[2][4] = 15;


		//위의 2차원 배열을 간단하게. 행은 {}로 한 번 더 묶어준다.
		int arr[][] = {
				{1, 2, 3, 4, 5}, 
				{6, 7, 8, 9, 10}, 
				{11, 12, 13, 14, 15}
				};
*/
		
/*		
 		//강사님 답. 
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		//하지만 숫자 말고 arr객체로 접근하는게 좋다.
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t"); //\t키를 이용해서 보기 좋게.
			}
			System.out.println();
		}
*/		
		//2차원 배열
		int arr1[][] = {
				{1, 2, 3, 4, 5}, 
				{6, 7, 8, 9, 10}, 
				{11, 12, 13, 14, 15}
		};
		int arr2[][] = {
				{1, 2, 3, 4, 5}, 
				{6, 7, 8, 9, 10}, 
				{11, 12, 13, 14, 15}
		};
		
		//2차원 배열 → 3차원 배열 
		int arr[][][] = { //[2][3][5] 3차원적으로 2행 2차원적으로 3행 5열
				{{1, 2, 3, 4, 5}, 
				{6, 7, 8, 9, 10}, 
				{11, 12, 13, 14, 15}},
				{{1, 2, 3, 4, 5}, 
				{6, 7, 8, 9, 10}, 
				{11, 12, 13, 14, 15}}
		};
		
		for(int i=0; i<arr.length; i++) { //arr.length; 2
			for(int j=0; j<arr[i].length; j++) { //arr[0].length; 3
				for(int k=0; k<arr[i][j].length; k++) { //arr[0][0].length; 5
				System.out.print(arr[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println("\n");
		}
	}
}
