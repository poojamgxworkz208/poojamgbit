package com.xworkz.movieapp;

import com.xworkz.movieapp.dto.CastDTO;
public class Movie{
	
private static final Object castName = null;
private CastDTO[] cast;
private int index;

public Movie(int size) {
	cast = new CastDTO[size];
}
public boolean createCast(CastDTO cast){
boolean CastAdded=false;
System.out.println("inside createCast method");

if(cast!=null){
	this.cast[index++]=cast;
	CastAdded=true;
}
else {
	System.out.println("No Cast added");
	return CastAdded=false;
}
return CastAdded;
}

public boolean updateCastNoByCastId(int CastId,long CastNo){
	System.out.println("inside the updateCastNoByCastId");
	boolean update=false;
	if(CastId>0 && CastNo>0){
		for(int i=0;i<cast.length;i++){
			if(cast[i].getCastNo()== CastId){
				System.out.println("Cast Id is found now update the contact"+CastId);
				cast[i].setCastNo(CastNo);
				update=true;
			}
			else
				System.out.println("Cast Id is found now update the contact");
				update=false;
		}
	}
	return update;
}

public CastDTO getCastByName(String CastName){
	CastDTO dto = null;
		if(CastName!=null){
			for(int i=0;i<cast.length;i++){
				if(cast[i].getCastName().equals(CastName)){
					System.out.println("Cast name is:"+CastName);
			   dto=cast[i];
				}
				else
				System.out.println("Cast Name not found");
			}
		}
	return dto;
	}
	
	public CastDTO getCastById(int CastId){
		CastDTO dto = null;
		if(CastId!=0){
			for(int i=0;i<cast.length;i++){
				if(cast[i].getCastId() == CastId){
					System.out.println("Cast Id is:"+CastId);
					dto=cast[i];
				}
				else
				System.out.println("CastId not found");
			}
		}
	return dto;
	}
	
	public CastDTO getCastByNo(long CastNo){
		CastDTO dto = null;
			if(CastNo!=0){
				for(int i=0;i<cast.length;i++){
					if(cast[i].getCastNo()== CastNo){
						System.out.println("Cast Id is:"+CastNo);
						dto=cast[i];
					}
					else
					System.out.println("CastNo not found");
				}
			}
		return dto;
		}
		
		public void getAllCastDetails(){
			for(int i=0;i<cast.length;i++){
				System.out.println(cast[i]);
			}
		}
		
		
	}

	
