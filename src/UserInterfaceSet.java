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

        frame.pack();
    }

    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if(command.equals("Push to Set A")){
            String text = input.getText();
            calcSet.addToSetA(text);
            input.setText(""); // clear input text field to enter a new element
            setA.setText(calcSet.getStringSetA());
        } else if(command.equals("Push to Set B")){
            String text = input.getText();
            calcSet.addToSetB(text);
            input.setText("");
            setB.setText(calcSet.getStringSetB());
        } else if(command.equals("Union")){
            calcSet.union();
            result.setText(calcSet.getStringResult()); // put result of operation to result text field (display)
        } else if(command.equals("Intersection")){
            calcSet.intersection();
            result.setText(calcSet.getStringResult()); // put result of operation to result text field (display)
        } else if(command.equals("Subtraction")){
            calcSet.subtraction();
            result.setText(calcSet.getStringResult()); // put result of operation to result text field (display)
        } else if(command.equals("Clear")){
            calcSet.clear();
            input.setText("");
            setA.setText("");
            setB.setText("");
            result.setText("");
        }
//        result.setText(calcSet.getStringResult());
    }

}
