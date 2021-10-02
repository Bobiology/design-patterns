package memento.pattern;

public class EditorState {
	private final String content;
	
	public EditorState(String conent) {
		this.content=conent;
	}

	public String getContent() {
		return content;
	}
}
