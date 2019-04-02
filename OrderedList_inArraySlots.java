public class OrderedList_inArraySlots {
	// Fields
	private int[] refArray;
	private int filled = 0;
	// Constructors
	public OrderedList_inArraySlots(){
		refArray = new int[10];
	}
	
	// Methods
	/** 
      @return the number of elements in this list
    */
	public String toString() {
		String array = "[";
		for (int i = 0; i< refArray.length - 1 ; i++){
			array += refArray[i] + ",";
		}
		array += refArray[refArray.length - 1] + "] \n";
		array += "Size of List: " + this.size();
		return array;   
    }
	
	public int get( int index ) {
		return refArray[index];
    }
	
	private void expand() {
		int[] newArray = new int [refArray.length*2];
		for (int i = 0; i < refArray.length; i++){
			newArray [i] = refArray [i];
		}
		refArray = newArray;
    }
	
    public int size() {
		return refArray.length;
    }
	
	public void add(int val) {
		if (filled == size()) {
			expand();
		}
		for (int i = 0; i < filled; i ++) {
			if (val < refArray[i]){
				int x = refArray[i];
				refArray[i] = val;
				val = x;
			}
		}
		refArray[filled] = val;
		filled ++;
		
	}
	
	public int remove(int index) {
		 int length = this.refArray.length;
		 int removed = this.refArray[index];
		 for (int i = index; i < length; i ++){
			 if (i == length - 1) {
				 this.refArray[i] = 0;
			 } else {
				this.refArray[i] = this.refArray[i + 1];
			 }
		 }
		 filled --;
		 return removed;
    }
}
	
