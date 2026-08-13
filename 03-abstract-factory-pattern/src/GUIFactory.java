/**
 * The Abstract Factory: creates a whole FAMILY of matching products.
 * One factory guarantees the button and checkbox belong to the same theme.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
