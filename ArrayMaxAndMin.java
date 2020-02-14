package simple;

public class ArrayMaxAndMin {
	public static void main(String args[]) {
		int []array= {3,5,8,1,5,8,0};
//		int max=0;
		int max=array[0];
		int min =array[0];
		for(int index=1;index<=array.length-1;index++) {
			if(array[index]>max) {
				max=array[index];
			}
			if (array[index]<min) {
				min=array[index];
				
			}
			
		}
		System.out.println("max is"+ " =" + max);
		System.out.println("min is"+ "=" + min);
	}

}
