/** Concrete factory: everything it builds is Light-themed. */
public class LightThemeFactory implements GUIFactory {
    @Override public Button createButton()     { return new LightButton(); }
    @Override public Checkbox createCheckbox() { return new LightCheckbox(); }
}
