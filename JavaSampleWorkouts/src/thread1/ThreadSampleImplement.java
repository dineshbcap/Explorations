package thread1;

import java.util.*;

public class ThreadSampleImplement implements Runnable{
	private static Hashtable<String, Long> racerWithTime = new Hashtable<String, Long>();
	private long startTime, endTime;
	public void run(){  
		try{
			startTime = System.currentTimeMillis();
			for(int count=1; count<=1000; count++){
				Thread.sleep(5);
				//System.out.println("thread is running... : " +Thread.currentThread().getName() + " ============== Count : "+ count);
				if(count==1000){
					endTime = System.currentTimeMillis();
					racerWithTime.put(Thread.currentThread().getName(), endTime-startTime);
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}  
	}  
	public static void main(String args[]) throws InterruptedException{
		ThreadGroup tt = new ThreadGroup("Group-A");
		
		ThreadSampleImplement t1=new ThreadSampleImplement();
		Thread th1 = new Thread(tt,t1,"Racer---1");
		
		Thread th2 = new Thread(tt,t1,"Racer---2");
		
		Thread th3 = new Thread(tt,t1,"Racer---3");
		
		Thread th4 = new Thread(tt,t1,"Racer---4");
		
		Thread th5 = new Thread(tt,t1,"Racer---5");
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		
		boolean flag =true;
		while(flag){
			if(tt.activeCount()==0){
				
				sortValue(racerWithTime);
				
				Set<String> racerName=racerWithTime.keySet();

				for (String stringRacerName : racerName) {
					System.out.println(stringRacerName +" Completes Race In :: "+ racerWithTime.get(stringRacerName));
				}
				break;
			}
		}
	
	}
	public static void sortValue(Hashtable<String, Long> t){

	       //Transfer as List and sort it
	       @SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList<Map.Entry<String, Long>> l = new ArrayList(t.entrySet());
	       Collections.sort(l, new SortClass());

	       System.out.println(l);
	    }

	
	
	
}  

class SortClass implements Comparator<Map.Entry<String, Long>>{

	@Override
	 public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
	
}