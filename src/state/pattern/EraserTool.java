package state.pattern;

public class EraserTool implements Tool{

	@Override
	public void mouseDown() {
System.out.println("Eraser icon");		
	}

	@Override
	public void mouseUp() {
		System.out.println("Erasing content");
		
	}

}
