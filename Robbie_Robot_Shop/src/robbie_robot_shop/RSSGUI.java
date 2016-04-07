package robbie_robot_shop;

import javax.swing.*;

/**
 *
 * @author Fireurza
 */
public class RSSGUI 
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new RSSGUIMainFrame("Robbie Robot Shop");
                frame.setSize(900,700);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
