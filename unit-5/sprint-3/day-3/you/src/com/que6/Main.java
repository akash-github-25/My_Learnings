package com.que6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		Mycallable[] s= {new Mycallable(10),
				new Mycallable(11),
				new Mycallable(14),
				new Mycallable(13),
				new Mycallable(80),
				new Mycallable(9)
				};
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(Mycallable j:s){
		Future f= service.submit(j);
		System.out.println(f.get());
		}
//		service.shutdown();

	}

}
