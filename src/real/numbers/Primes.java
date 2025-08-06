package real.numbers;

public class Primes {
	
	
	public static boolean isPrime(int num) {
		
		boolean isPrime=true;
		for (int i=2;i<num;i++ ) {
			if (num%i==0) {
				isPrime=false;
			}
		}
		return isPrime;
		
	}
	
	public static int[] getPrimes(int range) {
		
		int[] rangeOfNum = getRange(range);
		int compositeSize=getCompositeSize(range);
		
		int[] primes =new int[rangeOfNum.length-compositeSize];
		
		int index=0;
		
		while (index<(rangeOfNum.length-compositeSize)) {
			for (int comparePoint = 2; comparePoint <= range; comparePoint++) {
				if(isPrime(comparePoint)) {
					primes[index]=comparePoint; 
					index++;
				}
			}
		}
		return primes;
	}
	public static int[] getPrimes(int min,int max) {
		
		int[] rangeOfNum = getRange(min,max);
		int compositeSize=getCompositeSize(min,max);
		
		int[] primes =new int[rangeOfNum.length-compositeSize];
		int index=0;
		
		while (index<(rangeOfNum.length-compositeSize)) {
			for (int comparePoint = min; comparePoint <= max; comparePoint++) {
				if(isPrime(comparePoint)) {

					primes[index]=comparePoint; 
					index++;
					
				}
			}
		}
			
		return primes;
	}
	private static  int getCompositeSize (int rangeMin, int rangeMax) {
        int comparePoint=rangeMin;
        int compositeSize=0;
        
        while (comparePoint<=rangeMax) {    
            for (int loopVar=2; loopVar<comparePoint; loopVar++) {    
                if ((comparePoint%loopVar==0)&&(comparePoint<=rangeMax)) {
                    loopVar=0;
                    loopVar++;
                    comparePoint++;
                    compositeSize++;
                }
            }
            
            comparePoint++;
        }
        
        return compositeSize;
    }
    private static  int getCompositeSize (int rangeSize) {
        int comparePoint=2;
        int compositeSize=0;
        
        while (comparePoint<=rangeSize) {    
            for (int loopVar=2; loopVar<comparePoint; loopVar++) {    
                if ((comparePoint%loopVar==0)&&(comparePoint<=rangeSize)) {
                    loopVar=0;
                    loopVar++;
                    comparePoint++;
                    compositeSize++;
                }
            }
            
            comparePoint++;
        }
        
        return compositeSize;
    }
	
	
	
	private static  int[] getRange (int rangeSize) {
		int[] range =new int[rangeSize-1];
		
		for (int i = 2; i <rangeSize; i++) {
			range[i-2]=i;
			}
		return range;
		
	}
	
		private static  int[] getRange (int rangeMin, int rangeMax) {
			int[] range =new int[rangeMax-rangeMin+1];
			
			for (int i = rangeMin; i <rangeMax; i++) {
				range[i-rangeMin]=i;
				}
			
			return range;	
		}
	
		
		
}
