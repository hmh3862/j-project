import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass extends JFrame implements ActionListener {
	JButton jb;

	MainClass(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AccessibleContext ac = getAccessibleContext();
		ac.setAccessibleDescription("Accessibility Demo1 description.");

		ac = getRootPane().getAccessibleContext();
		ac.setAccessibleName("Root pane");
		ac.setAccessibleDescription("Root pane description");

		ac = getGlassPane().getAccessibleContext();
		ac.setAccessibleName("Glass pane");
		ac.setAccessibleDescription("Glass pane description");

		ac = getLayeredPane().getAccessibleContext();
		ac.setAccessibleName("Layered pane");
		ac.setAccessibleDescription("Layered pane description");

		ac = getContentPane().getAccessibleContext();
		ac.setAccessibleName("Content pane");
		ac.setAccessibleDescription("Content pane description");

		JPanel p = new JPanel();
		ac = p.getAccessibleContext();
		ac.setAccessibleName("Panel");
		ac.setAccessibleDescription("Panel description");

		jb = new JButton("Press Me");
		jb.addActionListener(this);
		jb.setToolTipText("Press me for accessibility information.");
		p.add(jb);

		getContentPane().add(p);

		setSize(200, 75);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		dumpInfo(getAccessibleContext());
	}

	void dumpInfo(AccessibleContext ac) {
		System.out.println("Name = " + ac.getAccessibleName());
		System.out.println("Description = " + ac.getAccessibleDescription());

		int nChildren = ac.getAccessibleChildrenCount();

		for (int i = 0; i < nChildren; i++)
			dumpInfo(ac.getAccessibleChild(i).getAccessibleContext());
	}

	public static void main(String[] args) {
		new MainClass("Accessibility Demo1");
	}
}