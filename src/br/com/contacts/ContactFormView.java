package br.com.contacts;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JDialog;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ContactFormView extends JDialog  implements ActionBarListener{

	private static final long serialVersionUID = 1L;
	private JTextField tfId;
	private JTextField tfName;
	private JTextField tfEmail;
	private JTextField tfPhone;
	private JComboBox cbType;
	private IContactController controller;



	/**
	 * Create the dialog.
	 */
	public ContactFormView(IContactController controller) {
		this.controller = controller;
		this.setTitle("Cadastro de contatos");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 454, 355);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("5dlu"),},
			new RowSpec[] {
				RowSpec.decode("5dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("5dlu"),}));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, "2, 2, fill, fill");
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("5dlu:grow"),
				RowSpec.decode("fill:max(139dlu;default):grow"),}));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "1, 1, fill, fill");
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("5dlu"),
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JButton btnSalvar = new JButton("Salvar");
		panel_1.add(btnSalvar, "1, 1");
		
		JButton btnRemover = new JButton("Remover");
		panel_1.add(btnRemover, "3, 1");
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "1, 3, fill, fill");
		panel_2.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("20dlu"),
				RowSpec.decode("5dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("20dlu"),
				RowSpec.decode("5dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("20dlu"),
				RowSpec.decode("5dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("20dlu"),
				RowSpec.decode("5dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("20dlu"),
				RowSpec.decode("5dlu"),}));
		
		JLabel lbId = new JLabel("Código");
		panel_2.add(lbId, "1, 1");
		
		tfId = new JTextField();
		panel_2.add(tfId, "1, 2, fill, fill");
		tfId.setColumns(10);
		
		JLabel lbName = new JLabel("Nome");
		panel_2.add(lbName, "1, 4");
		
		tfName = new JTextField();
		panel_2.add(tfName, "1, 5, fill, fill");
		tfName.setColumns(10);
		
		JLabel lbEmail = new JLabel("Email");
		panel_2.add(lbEmail, "1, 7");
		
		tfEmail = new JTextField();
		panel_2.add(tfEmail, "1, 8, fill, fill");
		tfEmail.setColumns(10);
		
		JLabel lbPhone = new JLabel("Telefone");
		panel_2.add(lbPhone, "1, 10");
		
		tfPhone = new JTextField();
		panel_2.add(tfPhone, "1, 11, fill, fill");
		tfPhone.setColumns(10);
		
		JLabel lbType = new JLabel("Tipo");
		panel_2.add(lbType, "1, 13");
		
		cbType = new JComboBox(controller.getContactTypes().toArray());
		panel_2.add(cbType, "1, 14, fill, fill");
		setVisible(true);
		configureListeners();

	}
	
	private void configureListeners() {
		tfName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				controller.onNameChange(tfName.getText());
			}
		});
		
		tfEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				controller.onEmailChange(tfEmail.getText());
			}
		});
		
		tfPhone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				controller.onPhoneChange(tfPhone.getText());
			}
		});
		
		cbType.addItemListener((event)->{
			System.out.println(event.getItem());
			String itemValue = (String) event.getItem();
			controller.onTypeChange(!itemValue.isEmpty() ? ContactType.valueOf(itemValue): null);
		} );
		
		
	}

	@Override
	public void onSave() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onCreate() {
		clear();
		
	}

	@Override
	public void onDelete() {
		clear();
		
	}
	
	private void clear() {
		this.tfId.setText("");
		this.tfName.setText("");
		this.tfEmail.setText("");
		this.cbType = new JComboBox(controller.getContactTypes().toArray());
	}

}
