package frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageCompression extends JFrame implements ActionListener{
	JLabel title,src,dest,com_qty;
	JButton select_src,sel_dest,convert;
	JComboBox<String> qty;
	JFileChooser file_src,file_dest;
	
	public ImageCompression(String ftitle) {
		super(ftitle);
		setLayout(null);
		
		title = new JLabel("Image Compression");
		title.setFont(new Font("Times New Roman", 2, 38));
		title.setBounds(180,50,400,75);
		add(title);
		
		src = new JLabel("");
		src.setBounds(50,130,200,30);
		add(src);
		
		dest = new JLabel("");
		dest.setBounds(350,130,200,30);
		add(dest);
		
		com_qty = new JLabel("Compress Quality");
		com_qty.setBounds(50,260,200,25);
		add(com_qty);
		
		qty = new JComboBox<>();
		qty.addItem("0.1");
		qty.addItem("0.2");
		qty.addItem("0.3");
		qty.addItem("0.4");
		qty.addItem("0.5");
		qty.addItem("0.6");
		qty.addItem("0.7");
		qty.addItem("0.8");
		qty.addItem("0.9");
		qty.addItem("1.0");
		qty.setBounds(200,260,100,25);
		add(qty);
		
		select_src = new JButton("Select Source path");
		select_src.setBounds(50,200,200,25);
		add(select_src);
		
		sel_dest = new JButton("Select Destination path");
		sel_dest.setBounds(350, 200, 200, 25);
		add(sel_dest);
		
		convert = new JButton("Convert image");
		convert.setBounds(200,320,200,25);
		add(convert);
		
		select_src.addActionListener(this);
		sel_dest.addActionListener(this);
		convert.addActionListener(this);
		
		setVisible(true);
		setSize(650,400);
		setLocation(170,100);
		
	}

	public static void main(String[] args) {
		ImageCompression ic = new ImageCompression("Image Compression");

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("Select Source path"))
		{
			file_src = new JFileChooser();
			file_src.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			file_src.setDialogTitle("Select Source path");
			file_src.setCurrentDirectory(new java.io.File("."));
			file_src.setAcceptAllFileFilterUsed(false);
			if(file_src.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
				src.setText(file_src.getSelectedFile().toString());
			}
			
		}else if(cmd.equals("Select Destination path"))
		{
			file_dest = new JFileChooser();
			file_dest.setCurrentDirectory(new java.io.File("."));
			file_dest.setDialogTitle("Select Destination path");
			file_dest.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			file_dest.setAcceptAllFileFilterUsed(false);
			if(file_dest.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
				dest.setText(file_dest.getSelectedFile().toString());
			}
			
		}else if(cmd.equals("Convert image"))
		{
			
		}
		
	}

}
