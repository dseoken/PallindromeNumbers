
public class Pala extends ArrayStackQueue {
	static int operCS,operCC,operSQ;//operation counts,CompareStrings,CompareChars and StackQueue
	

	public static void main(String[] args) {
		String str="aabbccbbaa";
		boolean test = CompareStrings(str);
		boolean test2=CompareChars(str);
		boolean test3=StackQueue(str);
		System.out.println("Test is Rotator  "+ test );
		System.out.println("Test is Rotator  "+ test2 );
		System.out.println("Test is Rotator  "+ test3 );
		
		System.out.println("dec to bin is  "+ DecToBin("999") );
		

	}
	
	
	
	public static Boolean CompareStrings(String str){
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--){
			operCS++;
			reverse+=str.charAt(i);//append last digit of string to reverseString			
		}
		operCS++;
		
		if(str.equals(reverse)){//check if equals
			
			return true;
		}
		
		else{	return false;	}
	}//end of compareStrings
	
	
	
	
	
	public static Boolean CompareChars(String str){
			//for(int i=(str.length()-1),j=0;i=0 || j<str.length;i--,j++)//orginal,realised was comparing everything twice
		
		for(int i=(str.length()-1),j=0;i==j || j<=i;i--,j++){ //loop through chars of string front and back till meet or pass
			operCC++;
			if(str.charAt(i)!=str.charAt(j)){
				return false;					//return false if mismatch
						}		
	 		}//end of for loop
				
		
				return true; 
	
	}//end of compareChars
	
	
	
	public static Boolean StackQueue(String str){
		ArrayStackQueue S = new ArrayStackQueue();
		ArrayQueue Q = new ArrayQueue();
		
		for(int i=0;i<str.length();i++){//for loop to add digit to stack and queue
			S.push(str.charAt(i));
			Q.enqueue(str.charAt(i));
			operSQ+=2;
		}
		
		while(!S.isEmpty() && !Q.isEmpty()){
			operSQ+=3;
			if(S.pop()!=Q.dequeue()){ //if any mismatch return false
				return false;
			}		
		}
				return true;
	}//end of StackQeue


	
	
	public static String DecToBin(String str){
		
		int x=Integer.parseInt(str);
		str=Integer.toBinaryString(x);
		
		return str;
	}
	
	
	
	
	
	

}//end of class
