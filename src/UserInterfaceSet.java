import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class UserInterfaceSet extends UserInterface {

    private JTextField input;
    private JTextField setA;
    private JTextField setB;
    private JTextField result;
    CalcEngineSet calcSet;

    public UserInterfaceSet(CalcEngineSet engine) {
        super(engine);
        calcSet = engine;
        // TODO Auto-generated constructor stub
    }

    protected void makeFrame() {
        frame = new JFrame(calc.getTitle());

        JPanel contentPane = (JPanel) frame.getContentPane();
        contentPane.setLayout(new GridLayout(8, 2));
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel inputLabel = new JLabel("Input");
        contentPane.add(inputLabel);
        input = new JTextField();
        contentPane.add(input);

        addButton(contentPane, "Push to Set A");
        addButton(contentPane, "Push to Set B");

        JLabel setALabel = new JLabel("Set A");
        contentPane.add(setALabel);
        setA = new JTextField();
        contentPane.add(setA);

        JLabel setBLabel = new JLabel("Set B");
        contentPane.add(setBLabel);
        setB = new JTextField();
        contentPane.add(setB);
//        JPanel buttonPanel = new JPanel(new GridLayout(4, 2));
        addButton(contentPane, "Union");
        addButton(contentPane, "Intersection");
        addButton(contentPane, "Subtraction");
        addButton(contentPane, "Clear");

        JLabel resultLabel = new JLabel("Result");
        contentPane.add(resultLabel);
        result = new JTextField();
        contentPane.add(result);

        status = new JLabel(calc.getAuthor());
        contentPane.add(status);

//
////            addButton(buttonPanel, "0");
////            addButton(buttonPanel, "+");
////            addButton(buttonPanel, "-");
////            addButton(buttonPanel, "*");
////            addButton(buttonPanel, "=");
////
//        contentPane.add(buttonPanel, BorderLayout.CENTER);
//
//        status = new JLabel(calc.getAuthor());
//        contentPane.add(status, BorderLayout.SOUTH);

        frame.pack();
    }

    public void actionPerformed(ActionEvent event) {

    }

}
