import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class UserList extends JFrame{
	public JButton applyButton;
	public static String selectedUserList = "";
	public JCheckBox userCheckBox1;
	public JCheckBox userCheckBox2;
	public JCheckBox userCheckBox3;
	public JCheckBox userCheckBox4;
	public JCheckBox userCheckBox5;
	public StringBuilder sb = new StringBuilder();
	
	public UserList() {
		setBounds(100,100,450,300);
		JPanel panel = new JPanel();
		panel.setBounds(0,0,450,300);

		panel.setLayout(null);
		setContentPane(panel);
		
		JLabel label = new JLabel("채팅 상대를 선택하세요.");
		label.setBounds(10,15,200,30);
		panel.add(label);
		
		userCheckBox1 = new JCheckBox("user1");
		userCheckBox1.setBounds(0, 50, 70, 30);
		panel.add(userCheckBox1);
		
		userCheckBox2 = new JCheckBox("user2");
		userCheckBox2.setBounds(0, 90, 70, 30);
		panel.add(userCheckBox2);
		
		userCheckBox3 = new JCheckBox("user3");
		userCheckBox3.setBounds(0, 130, 70, 30);
		panel.add(userCheckBox3);
		
		userCheckBox4 = new JCheckBox("user4");
		userCheckBox4.setBounds(0, 170, 70, 30);
		panel.add(userCheckBox4);
		
		userCheckBox5 = new JCheckBox("user5");
		userCheckBox5.setBounds(0, 210, 70, 30);
		panel.add(userCheckBox5);
		
		applyButton = new JButton("apply");
		applyButton.setBounds(380,210,50,40);
		applyButton.addActionListener(listener);
		panel.add(applyButton);
		
	}
	
	ActionListener listener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(applyButton.equals(e.getSource())) {		
				if(userCheckBox1.isSelected() == true)
					sb.append("user1");
				if(userCheckBox2.isSelected() == true)
					sb.append(" user2");
				if(userCheckBox3.isSelected() == true)
					sb.append(" user3");
				if(userCheckBox4.isSelected() == true)
					sb.append(" user4");
				if(userCheckBox5.isSelected() == true)
					sb.append(" user5");
				selectedUserList = sb.toString();
				System.out.println("****************userList:" + selectedUserList);
				dispose();
			}
			
		}
	};
	
}
