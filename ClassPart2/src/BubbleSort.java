public class BubbleSort {
	public static void main(String[] args) {
		// TODO 버블 정렬

		int data[] = {8, 7, 9, 2, 3, 6};
		
		long start = System.nanoTime(); //시간 측정
		for(int row=0; row<data.length-1; row++) {
			for(int col=0; col<data.length-1- row; col++) {
				if(data[col] > data[col+1]) { // 좌우 비교후 자리바꿈
					//<오른쪽값을 왼쪽으로 내림차순, >오름차순
					int temp = data[col];
					data[col] = data[col+1];
					data[col+1] = temp;
				}
			}	
		}
		long end = System.nanoTime();
		
		//문제:열의 비교횟수를 1씩 줄여나가기
		System.out.println("정렬 후...");
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + "\t");
		
		System.out.println("\n\n걸린 시간 : " + (end - start) + "ns");
	}
}
