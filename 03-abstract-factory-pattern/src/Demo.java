/**
 * Demo: pick ONE factory up front (based on the user's theme setting),
 * then build a whole UI. Every widget is guaranteed to match — you
 * can't accidentally mix a Light button with a Dark checkbox.
 */
public class Demo {

    // The app code depends only on the abstract factory + product interfaces.
    static void buildUI(GUIFactory factory) {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        String userTheme = "dark";   // imagine this comes from user settings

        GUIFactory factory = userTheme.equals("dark")
                ? new DarkThemeFactory()
                : new LightThemeFactory();

        System.out.println("Rendering '" + userTheme + "' UI:");
        buildUI(factory);

        System.out.println("\nSwitch to light — one line changes:");
        buildUI(new LightThemeFactory());
    }
}
