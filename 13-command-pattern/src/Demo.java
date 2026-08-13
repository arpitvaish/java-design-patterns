/**
 * Demo: the remote (invoker) presses commands and can undo them in reverse
 * order. The remote knows nothing about lights — it just executes Commands.
 */
public class Demo {
    public static void main(String[] args) {
        Light livingRoom = new Light("Living Room");
        Light kitchen    = new Light("Kitchen");

        RemoteControl remote = new RemoteControl();

        remote.press(new LightOnCommand(livingRoom));
        remote.press(new LightOnCommand(kitchen));
        remote.press(new LightOffCommand(livingRoom));

        System.out.println("\n-- undo the last 3 actions --");
        remote.pressUndo();   // undo living room OFF -> turns it back ON
        remote.pressUndo();   // undo kitchen ON      -> OFF
        remote.pressUndo();   // undo living room ON   -> OFF
        remote.pressUndo();   // nothing left
    }
}
