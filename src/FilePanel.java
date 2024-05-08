import javax.swing.*;
import java.awt.*;
import java.io.*;
class FilePanel extends JPanel{
    public FilePanel(File file){
        this(file.getName().split(".")[0], file.getPath(), file.getName().split(".")[0]);
    }
    public FilePanel(String fileName, String filePath, String fileType){
        setSize(400,40);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        c.gridheight=3;
        c.weightx=.6;
        c.ipadx=10;
        add(new JLabel("File Name: " + fileName),c);
        c.gridx=2;
        c.gridy=0;
        c.gridheight=1;
        c.weightx=.4;
        c.ipadx=10;
        add(new JLabel("File Path: " + filePath),c);
        c.gridx=2;
        c.gridy=1;
        c.gridheight=1;
        c.weightx=.4;
        c.ipadx=10;
        add(new JLabel("File Type: " + fileType),c);
    }
}