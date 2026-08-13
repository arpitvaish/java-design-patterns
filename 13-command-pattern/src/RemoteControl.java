import java.util.ArrayDeque;
import java.util.Deque;

/**
 * INVOKER — triggers commands without knowing what they do or who does it.
 * Because each command is an object, the invoker can keep a history and
 * support undo. It could just as easily queue them, log them, or replay them.
 */
public class RemoteControl {
    private final Deque<Command> history = new ArrayDeque<>();

    public void press(Command command) {
        command.execute();
        history.push(command);   // remember it so we can undo
    }

    public void pressUndo() {
        if (history.isEmpty()) {
            System.out.println("(nothing to undo)");
            return;
        }
        Command last = history.pop();
        System.out.print("↩ undo: ");
        last.undo();
    }
}
