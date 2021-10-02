package state.pattern;

public class Demo {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		
		canvas.setCurrentTool(new EraserTool());
		canvas.mouseDown();
		canvas.mouseUp();
	}

}
