package reusableComponent1;
import java.awt.*;
import java.awt.datatransfer.*;

public class  AssignmentUtility {

    // Method to copy text to clipboard
    public static void copyToClipboard(String text) {
        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
    }

    // Method to paste text from clipboard
    public static String pasteFromClipboard() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        try {
            return (String) clipboard.getData(DataFlavor.stringFlavor);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to simulate pressing the Tab key
    public static void pressTabKey() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    // Sample usage
    public static void main(String[] args) {
        // Copy and paste test
        copyToClipboard("Hello from Java Clipboard!");
        System.out.println("Pasted text: " + pasteFromClipboard());

        // Press Tab (for demo purposes – it will move focus if any UI is open)
        pressTabKey();
    }

}
