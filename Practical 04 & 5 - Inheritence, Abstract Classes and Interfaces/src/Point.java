public class Point {
	
	public double x, y;
	private String color;
	
	public Point(){
		x = 0; 
		y = 0;
		setColor("black");
	}
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
		setColor("black");
	}
	
	public Point(double x, double y, String color){
		this.x = x;
		this.y = y;
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString(){
		return "("+x+", "+y+")";
    }

    public boolean equals(Object other){
        Point Other = (Point) other;
        if (this.x == Other.x && this.y == Other.y){
            return true;
        }else{
            return false;
        }
    }
}