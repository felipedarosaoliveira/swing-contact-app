package br.com.contacts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TaskFormView extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TaskFormView dialog = new TaskFormView();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TaskFormView() {
		setBounds(100, 100, 470, 185);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20dlu"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20dlu"),
				FormSpecs.RELATED_GAP_ROWSPEC,}));
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, "2, 1, fill, fill");
			panel.setLayout(new FormLayout(new ColumnSpec[] {
					ColumnSpec.decode("50dlu"),
					FormSpecs.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("50dlu"),
					FormSpecs.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("50dlu"),
					FormSpecs.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("50dlu"),},
				new RowSpec[] {
					RowSpec.decode("fill:default"),}));
			{
				JButton btnNovo = new JButton("Novo");
				panel.add(btnNovo, "1, 1");
			}
			{
				JButton btnSalvar = new JButton("Salvar");
				panel.add(btnSalvar, "3, 1");
			}
			{
				JButton btnRemover = new JButton("Remover");
				panel.add(btnRemover, "5, 1");
			}
			{
				JButton btnVoltar = new JButton("Voltar");
				panel.add(btnVoltar, "7, 1");
			}
		}
		{
			JLabel lblCdigo = new JLabel("Código");
			getContentPane().add(lblCdigo, "2, 3");
		}
		{
			textField = new JTextField();
			getContentPane().add(textField, "2, 5, fill, fill");
			textField.setColumns(10);
		}
		{
			JLabel lblDescrio = new JLabel("Descrição");
			getContentPane().add(lblDescrio, "2, 7");
		}
		{
			textField_1 = new JTextField();
			getContentPane().add(textField_1, "2, 9, fill, fill");
			textField_1.setColumns(10);
		}
	}

}
