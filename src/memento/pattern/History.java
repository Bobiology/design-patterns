package memento.pattern;

import java.util.ArrayList;
import java.util.List;

public class History {
 private List<EditorState> states= new ArrayList<>();
 
 public void push(EditorState state) {
	 states.add(state);
 }
 public EditorState pop() {
	 int lastIdx = states.size()-1;
	 EditorState lastState = states.get(lastIdx);
	 states.remove(lastState);
	 return lastState;
 }
}
