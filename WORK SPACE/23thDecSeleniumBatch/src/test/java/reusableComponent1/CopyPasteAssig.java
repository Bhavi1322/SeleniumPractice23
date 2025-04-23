package reusableComponent1;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;

public class CopyPasteAssig {
	//Method to copy 
    public static String copyToClipboard(String text) {
        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
    
        // Method to paste text from clipboard
        String String;
		 pasteFromClipboard(); {
            Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
            try {
                return (String) clipboard1.getData(DataFlavor.stringFlavor);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        // Copy and paste test
        copyToClipboard("Hello from Java Clipboard!");
        System.out.println("Pasted text: " + pasteFromClipboard());

    }

	private static void pasteFromClipboard() {
		// TODO Auto-generated method stub
		
	}
}
