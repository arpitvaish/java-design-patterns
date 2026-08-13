/**
 * COMMAND interface — wraps a request as an object.
 * execute() does the action; undo() reverses it.
 */
public interface Command {
    void execute();
    void undo();
}
