package eneity;


/*
 * 数据对象
 * 二维坐标
 */
public class Tuple {
	float x;
	float y;
	String country;
	public Tuple(){}
	
	public Tuple(float a,float b){
		this.x=a;
		this.y=b;
	}
	
	public void setXY(float a,float b){
		this.x=a;
		this.y=b;
	}
	
	public void setX(float a){
		this.x=a;
	}
	
	public void setY(float a){
		this.y=a;
	}
	
	public float getX(){
		return x;
	}
	public float getY(){
		return y;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
