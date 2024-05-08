import javax.swing.*;
import java.awt.*;
public class App {
    public static void main(String[] args) throws Exception {
        JFrame f = new JFrame("File Explorer");
        f.setSize(1000, 1400);
        f.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=0;
        c.weighty=.3;
        c.gridheight=1;
        c.gridwidth=100;
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.add(new FilePanel("File Name", "File Path", "File Type"),c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=1;
        c.weighty=.3;
        c.gridheight=1;
        c.gridwidth=100;
        f.add(new FilePanel("File Name", "File Path", "File Type"),c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=2;
        c.weighty=.3;
        c.gridheight=1;
        c.gridwidth=100;
        f.add(new FilePanel("File Name", "File Path", "File Type"),c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=2;
        c.weighty=.3;
        c.gridheight=1;
        c.gridwidth=100;
        f.add(new FilePanel("File Name", "File Path", "File Type"),c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=3;
        c.weighty=.3;
        c.gridheight=1;
        c.gridwidth=100;
        f.add(new FilePanel("File Name", "File Path", "File Type"),c);


        f.setVisible(true);
    }
}
