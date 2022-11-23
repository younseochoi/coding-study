package heap;

import java.util.Arrays;

public class MinIntHeap {

	private int capacity = 10;
	private int size = 0;
	static int k=0;
	int[] items = new int[capacity];
	
	
	private int getLeftChildIndex(int parentIndex) {
		return 2*parentIndex+1;
	}
	
	private int getRightChildIndex(int parentIndex) {
		return 2*parentIndex+2;
	}
	
	private int getParentIndex(int childIndex) {
		return (childIndex-1)/2;
	}
	
	private boolean hasLeftChild(int index) {
		return getLeftChildIndex(index) <size;
	}
	
	private boolean hasRightChild(int index) {
		return getRightChildIndex(index) <size;
	}
	
	private boolean hasParent(int index) {
		return getParentIndex(index) >=0;
	}
	
	private int leftChild(int index) {
		return items[getLeftChildIndex(index)];
	}
	
	private int RightChild(int index) {
		return items[getRightChildIndex(index)];
	}
	
	private int parent(int index) {
		return items[getParentIndex(index)];
	}
	
	private void swap(int indexOne, int indexTwo) {
		int temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}
	
	private void ensureExtraCapacity() {
		if(size == capacity) {
			items = Arrays.copyOf(items, capacity*2);
			capacity *= 2;
		}
	}
	
	public int peek() {
		// 배열 비어있으면 예외처리 
		if (size == 0) throw new IllegalStateException();
		return items[0];
	}
	
	public int poll() {
		if(size==0) throw new IllegalStateException();
		int item = items[0];
		items[0] = items[size-1];
		size--;
		heapifyDown(0);
		return item;
	}
	public void add(int item) {
		ensureExtraCapacity();
		items[size] = item;
		size++;
		heapifyUp();
	}
	
	public void heapifyUp() {
		int index = size-1;
		while(hasParent(index) && parent(index)>items[index]) { // 부모가 있고 부모가 자식보다 큰 경우 스왑 
			swap(getParentIndex(index),index);
			index = getParentIndex(index);
		}
	}
	public void heapifyDown(int index) {
		//int index = 0;
		while(hasLeftChild(index)) { // 왼쪽 자식이 있는동안 
			int smallerChildIndex = getLeftChildIndex(index);
			if(hasRightChild(index) && RightChild(index)<leftChild(index)) {
				smallerChildIndex = getRightChildIndex(index);
			}
			
			if(items[index]<items[smallerChildIndex]) {
				break;
			}else {
				swap(index, smallerChildIndex);
			}
			index = smallerChildIndex;
			//System.out.println("인덱스 : "+index);
		}
	}
	public static void main(String[] args) {
		MinIntHeap heap = new MinIntHeap();
//		int [] item2 = new int[] {4,1,3,2,16,9,10,14,8,7};
		int [] item1 = new int[10];
		heap.size=item1.length;
		
		for(int i =0;i<heap.size;i++) {
			item1[i] = 10-i; // 10~1 역순 입력
		}
		
		heap.items = item1;
		
		// 자식이 있는 노드를 역순으로 돌며
		// 자식 < 부모 -> swap 
		// 배열을 힙으로 만들기
		for(int i=heap.size/2 ; i>=0 ; i--) 
			heap.heapifyDown(i);
			//minHeapify(item1,i); 
		
		// 힙 연산 
		//System.out.println(heap.peek());
		//System.out.println(heap.poll());
		//heap.add(0);
		//heap.add(-1);
		//heap.poll();

		while(heap.size>0)
			System.out.print(heap.poll()+" ");
		
	}
	

	//heapifyDown와 같은 기능 수행 
	// 자식 < 부모 -> swap
	public static void minHeapify(int[] arr, int i) {
		//int k = 0;
		int left_child = 2*i;
		int right_child = 2*i+1;
		
		if(left_child > arr.length-1) { //자식이 있는지 없는지 판단 
			return;
		}
		
		if(right_child <= arr.length-1) { // 오른쪽 자식이 있을 경우
			if(arr[left_child]<arr[right_child]) {
				k = left_child;
			}else {
				k = right_child;
			}
		}else { // 왼쪽 자식만 있을 경우
			k = left_child;
		}
		if(arr[i]<=arr[k]) return;
		
		int tmp = arr[i];
		arr[i] = arr[k];
		arr[k] = tmp;
//		System.out.println(arr[i] + ", "+arr[k]);
		minHeapify(arr, k);
	}

}
