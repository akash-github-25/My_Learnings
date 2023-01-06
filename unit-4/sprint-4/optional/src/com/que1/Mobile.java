package com.que1;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};
    public static void searchOutdatedModel(String companyName,String... Model) {
    	
    	try {
    		Mobile m=new Mobile();
			for(int i=0;i<m.outdatedModels.length;i++) {
				for(int j=0;j<Model.length;j++) {
					if(m.outdatedModels[i].equals(Model[j])) {
						System.out.println(m.outdatedModels[i]+"_OUTDATED");
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.que1.Mobile.searchOutdatedModel("TATA","note4","note5","note34");
	}

}
