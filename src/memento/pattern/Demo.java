package memento.pattern;

public class Demo {
	public static void main(String[] args) {
		Editor editor =  new Editor();
		History history = new History();
		editor.setContent("bob");
		history.push(editor.createState());
		editor.setContent("will");
		history.push(editor.createState());
		editor.setContent("join");
		history.push(editor.createState());
		editor.setContent("AWS");
		history.push(editor.createState());
		editor.setContent("Soon");
		history.push(editor.createState());
		
		editor.restore(history.pop());
		editor.restore(history.pop());
		
		System.out.println(editor.getContent());
	}
}
