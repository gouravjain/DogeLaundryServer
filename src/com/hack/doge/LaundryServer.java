package com.hack.doge;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.pubnub.api.*;

import org.json.*;


public class LaundryServer {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		final Pubnub pubnub = new Pubnub("pub-c-65d1278d-b1a4-41f2-9965-ccf858ee1243","sub-c-e14f8860-153b-11e4-b615-02ee2ddab7fe");
		
		
		/*try {
			   pubnub.subscribe("my_channel", new Callback(){public void successCallback(String channel, Object response) {
				   System.out.println(response.toString());
		   	   }} );
			 
		Callback callback = new Callback() {
			   public void successCallback(String channel, Object response) {
				   System.out.println(response.toString());
			   	   }
			   public void errorCallback(String channel, PubnubError error) {
				   System.out.println(error.toString());
			   		   }
			 };
			 
			 final Callback callback = new Callback() {
				   public void successCallback(String channel, Object response) {
					   final String unique_channel = response.toString();
				    // System.out.println(response.toString());
				   }
				   public void errorCallback(String channel, PubnubError error) {
					   //System.out.println(error.toString());
				   }
				 };
				 
				  final String unique_channel = "DBU2xr3MFfSmakBj1k7fVfMrv4eqib6fYU";
				 final Callback callback = new Callback() {
					   public void successCallback(String channel, Object response) {
						   final String unique_channel = response.toString();
					    // System.out.println(response.toString());
					   }
					   public void errorCallback(String channel, PubnubError error) {
						   //System.out.println(error.toString());
					   }
					 };
				 
				 try {
				     pubnub.subscribe("my_channel", new Callback() {
				 
				         @Override
				         public void connectCallback(String channel, Object message) {
				             pubnub.publish("my_channel", unique_channel, callback);
				         }
				         
				       }
				     );
			 
			*/
 
			 
			 Boolean washer[]=new Boolean[6];
				
				washer[0]=false;
				washer[1]=false;
				washer[2]=false;
				washer[3]=false;
				washer[4]=false;
				washer[5]=false;
				int degree[]={45,45,45,45,45,45};
				String time[]={"Wash","Wash","Wash","Dry","Dry","Dry"};
				 
				final JSONObject obj = new JSONObject();

			     
			     for(int i=0;i<6;i++){
			    	 if(washer[i]==false){
			    		 degree[i]=180;
			    	 }
			    	 else
			    	 {
			    		 time[i]="45";
			    	 }
			     }
			     obj.put("is_wash1", washer[0]);
			     obj.put("is_wash2", washer[1]);
			     obj.put("is_wash3", washer[2]);
			     obj.put("is_dry1", washer[3]);
			     obj.put("is_dry2", washer[4]);
			     obj.put("is_dry3", washer[5]);
			     obj.put("degree1", degree[0]);
			     obj.put("degree2", degree[1]);
			     obj.put("degree3", degree[2]);
			     obj.put("degree4", degree[3]);
			     obj.put("degree5", degree[4]);
			     obj.put("degree6", degree[5]);
			     obj.put("time1", time[0]);
			     obj.put("time2", time[1]);
			     obj.put("time3", time[2]);
			     obj.put("time4", time[3]);
			     obj.put("time5", time[4]);
			     obj.put("time6", time[5]);
			     
				 		 
			     final HashMap<String,String> startMap= new HashMap<String,String>();
			     startMap.put("DBU2xr3MFfSmakBj1k7fVfMrv4eqib6fYU", "is_wash1");
			     startMap.put("D7q4LKaKztPbNPUfczRqBTpem9my8RGuEm", "is_wash2");
			     startMap.put("D6jhJPGs1WpraFAXcm86zSZmYtYmec9nkC","is_wash3");
			     startMap.put("D7M7MNSd8DLbDbjH2Ti3TL8y52JJn4T7M5", "is_dry1");
			     startMap.put("DAC3xa3k53hcPS8hJQquKWpNruYRJiberf","is_dry2");
			     startMap.put("DG62w66J44mF3e5BNW57shYv2Tg1zD4qPF", "is_dry3");
			     
			     final HashMap<String,String> degreeMap= new HashMap<String,String>();
			     degreeMap.put("DBU2xr3MFfSmakBj1k7fVfMrv4eqib6fYU", "degree1");
			     degreeMap.put("D7q4LKaKztPbNPUfczRqBTpem9my8RGuEm", "degree2");
			     degreeMap.put("D6jhJPGs1WpraFAXcm86zSZmYtYmec9nkC","degree3");
			     degreeMap.put("D7M7MNSd8DLbDbjH2Ti3TL8y52JJn4T7M5", "degree4");
			     degreeMap.put("DAC3xa3k53hcPS8hJQquKWpNruYRJiberf","degree5");
			     degreeMap.put("DG62w66J44mF3e5BNW57shYv2Tg1zD4qPF", "degree6");
			     
			     final HashMap<String,String> timeMap= new HashMap<String,String>();
			     timeMap.put("DBU2xr3MFfSmakBj1k7fVfMrv4eqib6fYU", "time1");
			     timeMap.put("D7q4LKaKztPbNPUfczRqBTpem9my8RGuEm", "time2");
			     timeMap.put("D6jhJPGs1WpraFAXcm86zSZmYtYmec9nkC","time3");
			     timeMap.put("D7M7MNSd8DLbDbjH2Ti3TL8y52JJn4T7M5", "time4");
			     timeMap.put("DAC3xa3k53hcPS8hJQquKWpNruYRJiberf","time5");
			     timeMap.put("DG62w66J44mF3e5BNW57shYv2Tg1zD4qPF", "time6");
			     
			     final HashMap<String,Boolean> washingMap= new HashMap<String,Boolean>();
			     washingMap.put("DBU2xr3MFfSmakBj1k7fVfMrv4eqib6fYU", false);
			     washingMap.put("D7q4LKaKztPbNPUfczRqBTpem9my8RGuEm", false);
			     washingMap.put("D6jhJPGs1WpraFAXcm86zSZmYtYmec9nkC",false);
			     washingMap.put("D7M7MNSd8DLbDbjH2Ti3TL8y52JJn4T7M5", false);
			     washingMap.put("DAC3xa3k53hcPS8hJQquKWpNruYRJiberf",false);
			     washingMap.put("DG62w66J44mF3e5BNW57shYv2Tg1zD4qPF", false);
			     
			     
		 //final String unique_channel = "DBU2xr3MFfSmakBj1k7fVfMrv4eqib6fYU";
		 final String welcome = "Welcome, Your 45 minute cycle has started.";
		 final String left = "5 Mins Remaining";
		 final String end="Thanks, your cycle has ended.";
		 final Callback callback = new Callback() {
			 @Override
	         public void successCallback(String channel, Object response) {
				 System.out.println(response.toString());
			 }			 
			   public void errorCallback(String channel, PubnubError error) {
				   //System.out.println(error.toString());
			   }
			 };
		 
		 try {
			 	pubnub.publish("my_channel", obj , callback);
		     	pubnub.subscribe("my_channel", new Callback() {
		 
		         @Override
		         public void successCallback(String channel, Object response) {
					   final String unique_channel = response.toString();
					   System.out.println(unique_channel);
					   if(startMap.containsKey(response.toString()) && !(Boolean)washingMap.get(response.toString()))
					   {
						   
					    JSONObject tempObj=new JSONObject();
					   try {
						washingMap.put(response.toString(),true);
						tempObj.put(startMap.get(unique_channel).toString(), true);
						tempObj.put(degreeMap.get(unique_channel).toString(), 45);
						tempObj.put(timeMap.get(unique_channel).toString(), "45");
						pubnub.publish("my_channel", tempObj , callback);
						pubnub.publish(unique_channel, welcome, callback);
					   int i=45;
					   while(i>0)
					   {
						   i=i-1;
						   tempObj=new JSONObject();
						   tempObj.put(timeMap.get(unique_channel), new Integer(i).toString());
						   pubnub.publish("my_channel", tempObj , callback);
						   if(i==5){
							   pubnub.publish(unique_channel, left, callback);
						   }
						   TimeUnit.SECONDS.sleep(1);
						   if(i==0){
							   tempObj=new JSONObject();
							   tempObj.put(startMap.get(unique_channel).toString(), false);
							   tempObj.put(degreeMap.get(unique_channel).toString(), 180);
							   if(startMap.get(unique_channel).toString().contains("dry"))
								   tempObj.put(timeMap.get(unique_channel).toString(), "Dry");
							   else
								   tempObj.put(timeMap.get(unique_channel).toString(), "Wash");
							   tempObj.put(response.toString(),false);
							   pubnub.publish("my_channel", tempObj , callback);
						   }
					   }
					   pubnub.publish(unique_channel, end, callback);
					   pubnub.publish(unique_channel, "end", callback);
					   
					   } catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				    // System.out.println(response.toString());
				   }
		         }
		         public void connectCallback(String channel, Object message) {
		             //pubnub.publish("my_channel", unique_channel, callback);
		         }
		         
		       }
		     );
				 
				
				     
				    
				
				    /* pubnub.subscribe(unique_channel, new Callback() {
		 
		       @Override
		       public void connectCallback(String channel, Object message) {
		           
		       }public void successCallback(String channel, Object response) {
				     //System.out.println(response.toString());
				   }});*/
				     
				    	 
		 }catch(Exception e){
			 
		 }
	}
}
