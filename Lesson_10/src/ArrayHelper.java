
public class ArrayHelper {
	/*
	 * src = {1,6,3,2}
	 * value = 8
	 * position = 2
	 * insertElement() -> {1,6,8,3,2}
	 * 
	 * src = {1,6,3,2}
	 * value = 8
	 * position = 20
	 * insertElement() -> {1,6,3,2}
	 * 
	 * src = {}
	 * value = 8
	 * position = 0
	 * insertElement() -> {8}
	 * */
								//    {1,6,3,2}       8            2
	public static int[] insertElement(int[] src, int value, int position) {
		
		if(src==null || position<0 || position > src.length) return src;
		
		int[] res = new int[src.length+1]; // res = {0,0,0,0,0}
		for(int i = 0; i<position; i++) {
			res[i] = src[i];
		}
		// res = {1,6,0,0,0}
		res[position] = value;
		// res = {1,6,8,0,0}
		for(int i=position; i<src.length; i++) {
			res[i+1] = src[i];
		}
		// res = {1,6,8,3,2}
		return res;
	}
	//                   <--------------
	// src - {8,4,1,56,8,3,2,4,6,7,98,3,2} - 13
	// position - 4
	// res - {8,4,1,56,3,2,4,6,7,98,3,2} - 12
	public static int[] removeElement(int[] src, int position) {
		
		if(src==null || position<0 || position > src.length) return src;
		
		for(int i=position+1; i<src.length; i++) {
			src[i-1] = src[i];
		}
		int[] res = new int[src.length-1];
		for(int i=0; i<res.length; i++) {
			res[i] = src[i];
		}
		return res;
	}
}
