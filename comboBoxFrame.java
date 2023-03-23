import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import javax.swing.AbstractAction.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class comboBoxFrame extends JFrame
{
      private JComboBox imagesJComboBOX;
      private JLabel label;
      
      private static final String[] names =
         { "bug1.gif" , "bug2.gif" ,  "travelbug.gif" , "buganim.gif" }
      private Icon[] icons = {
          new ImageIcon( getClass().getResource( names[0] ) ),
          new ImageIcon( getClass().getResource( names[1] ) ),
         new ImageIcon( getClass().getResource( names[3] ) ) };
      
        public comboBoxFrame(JComboBox imagesJComboBox)
        {
           super("Testing jComboBox" );
           setLayout( new FlowLayout());
           
         imagesJComboBox = new JComboBox( names);
         imagesJComboBOX.setMaximumRowCount(3);
         {
             public void itemStateChanged( ItemEvent event )
             {
                if( event.getStateChange()== ItemEvent.SELECTED)
                  label.setIcon(icons[   
                    imagesJComboBox.getSlectedIndex ()  ]);
         
            }
        }
        );
       
               add( imagesJComboBox);
               label = new JLabel(icons[0]);
               add(label);

        

