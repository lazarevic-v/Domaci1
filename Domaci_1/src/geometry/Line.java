package geometry;

public class Line 
{
	private Point startPoint;
	private Point endPoint;
	private boolean selected;

	
	public Line() {
		
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.selected = selected;
	}

	public Point getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public double length() {
        double c = startPoint.getX() - endPoint.getX();
        double d = startPoint.getY() - endPoint.getY();
        double e = Math.sqrt(c*c + d*d);
        return e;
    }
	
}
