import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class UserInterfaceSet extends UserInterface {

	JTextField displaySet2;
	private JTextField displayResult;
	CalcEngineSet calcSet;
	
	public UserInterfaceSet(CalcEngineSet engine) {
		super(engine);
		calcSet = engine;
		// TODO Auto-generated constructor stub
	}
	
	protected void makeFrame() {
        frame = new JFrame(calc.getTitle());
        
        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new BorderLayout(8, 8));
        contentPane.setBorder(new EmptyBorder( 10, 10, 10, 10));

        display = new JTextField();
        contentPane.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 2));
            addButton(buttonPanel, "Union");
            addButton(buttonPanel, "Intersection");
            addButton(buttonPanel, "Subtraction");
            addButton(buttonPanel, "Clear");
            
            addButton(buttonPanel, "Push Set A");
            addButton(buttonPanel, "Push Set B");
            addButton(buttonPanel, "Length Set A");
            addButton(buttonPanel, "Length Set B");
            
//            addButton(buttonPanel, "0");
//            addButton(buttonPanel, "+");
//            addButton(buttonPanel, "-");
//            addButton(buttonPanel, "*");
//            addButton(buttonPanel, "=");
//            
        contentPane.add(buttonPanel, BorderLayout.CENTER);

        status = new JLabel(calc.getAuthor());
        contentPane.add(status, BorderLayout.SOUTH);

        frame.pack();
	}
	
	public void actionPerformed(ActionEvent event) {
		
	}

}
