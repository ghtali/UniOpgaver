package Opgaver_05;

public class Point {

			int x,y;
			
			public Point(int x, int y){
				
				this.x = x;
				this.y = y;
				
			}

			@Override
			public String toString() {
				return "(" + x + "," + y + ")";
			}
			
			
			
			public int getX() {
				return x;
			}

			public void setX(int x) {
				this.x = x;
			}

			public int getY() {
				return y;
			}

			public void setY(int y) {
				this.y = y;
			}

			public boolean equals(Point p){
					return (this.x == p.getX() && this.y == p.getY());
			
			
				
			}
			
			public void move(int dx, int dy){
				
				this.x += dx;
				this.y += dy;
				
			}
			
			
		

	

}
