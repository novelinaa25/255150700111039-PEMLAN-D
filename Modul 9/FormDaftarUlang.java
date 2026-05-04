package Modul9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormDaftarUlang extends JFrame {
    private JTextField txtNama, txtTglLahir, txtNoDaftar, txtTelp, txtEmail;
    private JTextArea txtAlamat;
    private JButton btnSubmit;

    public FormDaftarUlang() {
        setTitle("Form Online Daftar Ulang");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Inisialisasi & Tambah Komponen
        addLabelAndField("Nama Lengkap:", txtNama = new JTextField(20), 0, gbc);
        addLabelAndField("Tanggal Lahir:", txtTglLahir = new JTextField(20), 1, gbc);
        addLabelAndField("Nomor Pendaftaran:", txtNoDaftar = new JTextField(20), 2, gbc);
        addLabelAndField("No. Telp:", txtTelp = new JTextField(20), 3, gbc);
        
        gbc.gridx = 0; gbc.gridy = 4;
        add(new JLabel("Alamat:"), gbc);
        txtAlamat = new JTextArea(3, 20);
        txtAlamat.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        gbc.gridx = 1;
        add(new JScrollPane(txtAlamat), gbc);

        addLabelAndField("E-mail:", txtEmail = new JTextField(20), 5, gbc);

        btnSubmit = new JButton("Submit");
        gbc.gridx = 1; gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.EAST;
        add(btnSubmit, gbc);

        // Event Listener
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validateInput()) {
                    int confirm = JOptionPane.showConfirmDialog(null, 
                        "Apakah anda yakin data yang Anda isi sudah benar?", 
                        "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
                    
                    if (confirm == JOptionPane.OK_OPTION) {
                        showResultWindow();
                    }
                }
            }
        });
    }

    private void addLabelAndField(String label, JTextField field, int y, GridBagConstraints gbc) {
        gbc.gridx = 0; gbc.gridy = y;
        add(new JLabel(label), gbc);
        gbc.gridx = 1;
        add(field, gbc);
    }

    private boolean validateInput() {
        if (txtNama.getText().isEmpty() || txtTglLahir.getText().isEmpty() || 
            txtNoDaftar.getText().isEmpty() || txtTelp.getText().isEmpty() || 
            txtAlamat.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Semua kolom harus terisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void showResultWindow() {
        JFrame resFrame = new JFrame("Data Mahasiswa");
        resFrame.setSize(350, 300);
        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setText(
            " Nama                : " + txtNama.getText() + "\n" +
            " Tanggal Lahir       : " + txtTglLahir.getText() + "\n" +
            " No. Pendaftaran     : " + txtNoDaftar.getText() + "\n" +
            " No. Telp            : " + txtTelp.getText() + "\n" +
            " Alamat              : " + txtAlamat.getText() + "\n" +
            " E-mail              : " + txtEmail.getText()
        );
        area.setFont(new Font("Monospaced", Font.PLAIN, 12));
        area.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        resFrame.add(area);
        resFrame.setVisible(true);
    }
}