package ch02;

public class MyArray {

	int[] intArr;    // int array
	int count;       // array 안의 데이터 개수
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public MyArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	public void addElement(int num) {
		if(count >= ARRAY_SIZE) {
			System.out.println("not Enough memory");
			return;
		}
		intArr[count++] = num;
	}
	
	public void insertElement(int position, int num) {
		
		int i;
		// 인덱스가 0보다 작은 position || 중간 인덱스에 빈값이 들어가게 되는 position은 return error
		if( position < 0 || position > count ) {
			System.out.println("insert Error");
			return;
		}
		// 배열이 꽉 차서 더이상 데이터를 넣을 수 없을 때
		if( count >= ARRAY_SIZE ) {
			System.out.println("not enough memory");
			return;
		}
		
		// 기존에 있던 데이터들 한칸씩 뒤로 옮기기(맨 마지막 요소부터 옮겨야함)
		for( i = count -1; i >= position; i--) {
			intArr[i+1] = intArr[i];
		}
		// 뒤로 다 미루고 난 후, 비어있는 position 인덱스에 요소 넣기
		intArr[position] = num;
		count++;
		
	}
	
	public int removeElement(int position) {
		
		int ret = ERROR_NUM;
		// 배열이 비어있으면 return error
		if( isEmpty() ) {
			System.out.println("Array is Empty");
			return ret;
		}
		// 배열의 범위를 벗어난 position은 return error
		if( position < 0 || position > count -1 ) {
			return ret;
		}
		
		// 삭제되어 반환 할 값
		ret = intArr[position];
		
		int i;
		for( i = position; i < count - 1; i++) {
			intArr[i] = intArr[i+1];
		}
		count--;
		
		return ret;
		
	}
	
	public int getSize() {
		return count;
	}
	
	public boolean isEmpty() {
		
		if(count == 0){
			return true;
		}
		else return false;

	}
	
	public int getElement(int position) {
		
		if(position < 0 || position > count-1){
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
		
	}
	
	public void printAll() {
		
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}

	}
	
	public void removeAll() {
		
		for(int i=0; i<count; i++){
			intArr[i] = 0;
		}
		count = 0;

	}
	
	
}
