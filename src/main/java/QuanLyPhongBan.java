/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class QuanLyPhongBan extends javax.swing.JFrame {

 
    public QuanLyPhongBan() {
        initComponents();
        setInitialState();
    }
    
    
    private void setInitialState() {
        try {
            // Vô hiệu hóa các trường nhập liệu
            txt_manv.setEnabled(false);
            txt_Hovaten.setEnabled(false);
            dc_Ngaysinh.setEnabled(false);
            cb_gioitinh.setEnabled(false);
            cb_phongban.setEnabled(false);
            txt_dienthoai.setEnabled(false);
            txt_email.setEnabled(false);
            dc_Ngayvaolam.setEnabled(false);
            // Vô hiệu hóa các nút
            btn_luu.setEnabled(false);
            btn_cạpnhat.setEnabled(false);
            btn_xoa.setEnabled(false);
            // Kích hoạt các nút
            btn_Them.setEnabled(true);
            btn_Timkiem.setEnabled(true);
            btn_thoat.setEnabled(true);
            // Tải dữ liệu
            load_cbPhongban();
            load_Nhanvien();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbSinhVien = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTK_Hovaten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTK_manv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_manv = new javax.swing.JTextField();
        dc_Ngaysinh = new com.toedter.calendar.JDateChooser();
        txt_dienthoai = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dc_Ngayvaolam = new com.toedter.calendar.JDateChooser();
        txt_Hovaten = new javax.swing.JTextField();
        cb_gioitinh = new javax.swing.JComboBox<>();
        cb_phongban = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_Nhanvien = new javax.swing.JTable();
        btn_Timkiem = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        btn_luu = new javax.swing.JButton();
        btn_cạpnhat = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();

        tbSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSinhVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbSinhVien);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Họ và tên");

        txtTK_Hovaten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTK_HovatenActionPerformed(evt);
            }
        });

        jLabel3.setText("Mã NV");

        txtTK_manv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTK_manvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTK_Hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(txtTK_manv, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTK_Hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTK_manv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jLabel1.setText("Thông tin tìm kiếm ");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Mã nhân viên ");

        jLabel6.setText("Ngày sinh ");

        jLabel7.setText("Điện thoại ");

        jLabel8.setText("Email ");

        jLabel9.setText("Giới tính ");

        jLabel10.setText("Họ và tên ");

        jLabel11.setText("Phòng ban ");

        jLabel12.setText("Ngày vào làm ");

        txt_Hovaten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HovatenActionPerformed(evt);
            }
        });

        cb_gioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Chọn giới tính ---", "Nam", "Nữ ", "Khác" }));

        cb_phongban.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dc_Ngaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txt_manv)
                    .addComponent(txt_dienthoai)
                    .addComponent(txt_email))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel10))
                        .addComponent(jLabel9)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Hovaten)
                    .addComponent(cb_gioitinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_phongban, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dc_Ngayvaolam, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_manv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_Hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(dc_Ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_dienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(cb_phongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(dc_Ngayvaolam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel4.setText("THông tin chi tiết ");

        tb_Nhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_Nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_NhanvienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_Nhanvien);

        btn_Timkiem.setText("Tìm kiếm ");
        btn_Timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimkiemActionPerformed(evt);
            }
        });

        btn_Them.setText("Thêm ");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_luu.setText("Lưu ");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        btn_cạpnhat.setText("Cập nhật ");
        btn_cạpnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cạpnhatActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa ");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_thoat.setText("Thoát ");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(btn_Timkiem))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane3))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btn_Them)
                .addGap(52, 52, 52)
                .addComponent(btn_luu)
                .addGap(53, 53, 53)
                .addComponent(btn_cạpnhat)
                .addGap(54, 54, 54)
                .addComponent(btn_xoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_thoat)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_Timkiem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them)
                    .addComponent(btn_luu)
                    .addComponent(btn_cạpnhat)
                    .addComponent(btn_xoa)
                    .addComponent(btn_thoat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     Connection con;
    Map<String, String> phongbanMap = new HashMap<>();
    
    private void load_cbPhongban() throws ClassNotFoundException {
        try {
            con = Connect.ConnectDB.KetnoiDB();
            String sql = "SELECT * FROM Phongban";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            cb_phongban.removeAllItems();
            cb_phongban.addItem("--Chọn phòng ban--");
            phongbanMap.put("--Chọn phòng ban--", "");
            while (rs.next()) {
                String tenpb = rs.getString("Tenphongban");
                cb_phongban.addItem(tenpb);
                phongbanMap.put(tenpb, rs.getString("Maphongban"));
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Lỗi tải danh sách phòng ban: " + ex.getMessage());
        }
    }
    
    private void load_Nhanvien() {
        try {
            tb_Nhanvien.removeAll();
            con = Connect.ConnectDB.KetnoiDB();
            String sql = "SELECT Manv, Tennv, Ngaysinh, Gioitinh, Tenphongban, Dienthoai, Email, Ngayvaolam " +
                         "FROM Nhanvien nv JOIN Phongban pb ON nv.Maphongban = pb.Maphongban";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            String[] head = {"Mã NV", "Họ và tên", "Ngày sinh", "Giới tính", "Phòng ban", "Điện thoại", "Email", "Ngày vào làm"};
            DefaultTableModel tb = new DefaultTableModel(head, 0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("Manv"));
                v.add(rs.getString("Tennv"));
                v.add(rs.getDate("Ngaysinh"));
                v.add(rs.getString("Gioitinh"));
                v.add(rs.getString("Tenphongban"));
                v.add(rs.getString("Dienthoai"));
                v.add(rs.getString("Email"));
                v.add(rs.getDate("Ngayvaolam"));
                tb.addRow(v);
            }
            tb_Nhanvien.setModel(tb);
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Lỗi tải dữ liệu nhân viên: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private  boolean checkTrungManv(String manv){
        boolean kq = false;
        try {
            con = Connect.ConnectDB.KetnoiDB();
            String sql = "SELECT * FROM Nhanvien WHERE Manv = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, manv);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                kq = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CapNhatLoaiSach.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    private boolean isValidAge(java.util.Date ngaysinh) {
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(ngaysinh);
        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age >= 18 && ngaysinh.before(today.getTime());
    }
    
    private void clearForm() {
        txt_manv.setText("");
        txt_Hovaten.setText("");
        dc_Ngaysinh.setDate(null);
        cb_gioitinh.setSelectedIndex(0);
        cb_phongban.setSelectedIndex(0);
        txt_dienthoai.setText("");
        txt_email.setText("");
        dc_Ngayvaolam.setDate(null);
    }
    
    
    
    private void txtTK_HovatenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTK_HovatenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTK_HovatenActionPerformed

    private void txtTK_manvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTK_manvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTK_manvActionPerformed

    private void tbSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSinhVienMouseClicked
       
    }//GEN-LAST:event_tbSinhVienMouseClicked

    private void tb_NhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_NhanvienMouseClicked
        int i = tb_Nhanvien.getSelectedRow();
        DefaultTableModel tb = (DefaultTableModel) tb_Nhanvien.getModel();
        txt_manv.setText(tb.getValueAt(i, 0).toString());
        txt_Hovaten.setText(tb.getValueAt(i, 1).toString());
        try {
            dc_Ngaysinh.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(tb.getValueAt(i, 2).toString()));
        } catch (Exception e) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, e);
        }
        cb_gioitinh.setSelectedItem(tb.getValueAt(i, 3).toString());
        cb_phongban.setSelectedItem(tb.getValueAt(i, 4).toString());
        txt_dienthoai.setText(tb.getValueAt(i, 5).toString());
        txt_email.setText(tb.getValueAt(i, 6).toString());
        try {
            dc_Ngayvaolam.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(tb.getValueAt(i, 7).toString()));
        } catch (Exception e) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, e);
        }
        // Kích hoạt các trường và nút
        txt_manv.setEnabled(false);
        txt_Hovaten.setEnabled(true);
        dc_Ngaysinh.setEnabled(true);
        cb_gioitinh.setEnabled(true);
        cb_phongban.setEnabled(true);
        txt_dienthoai.setEnabled(true);
        txt_email.setEnabled(true);
        dc_Ngayvaolam.setEnabled(true);
        btn_cạpnhat.setEnabled(true);
        btn_xoa.setEnabled(true);
        btn_luu.setEnabled(false);
    }//GEN-LAST:event_tb_NhanvienMouseClicked

    private void btn_TimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimkiemActionPerformed
       try {
            String manv = txtTK_manv.getText().trim();
            String tennv = txtTK_Hovaten.getText().trim();
            con = Connect.ConnectDB.KetnoiDB();
            String sql = "SELECT Manv, Tennv, Ngaysinh, Gioitinh, Tenphongban, Dienthoai, Email, Ngayvaolam " +
                         "FROM Nhanvien nv JOIN Phongban pb ON nv.Maphongban = pb.Maphongban " +
                         "WHERE Manv LIKE ? AND Tennv LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + manv + "%");
            ps.setString(2, "%" + tennv + "%");
            ResultSet rs = ps.executeQuery();
            String[] head = {"Mã NV", "Họ và tên", "Ngày sinh", "Giới tính", "Phòng ban", "Điện thoại", "Email", "Ngày vào làm"};
            DefaultTableModel tb = new DefaultTableModel(head, 0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("Manv"));
                v.add(rs.getString("Tennv"));
                v.add(rs.getDate("Ngaysinh"));
                v.add(rs.getString("Gioitinh"));
                v.add(rs.getString("Tenphongban"));
                v.add(rs.getString("Dienthoai"));
                v.add(rs.getString("Email"));
                v.add(rs.getDate("Ngayvaolam"));
                tb.addRow(v);
            }
            tb_Nhanvien.setModel(tb);
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Lỗi tìm kiếm: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_TimkiemActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
       try {
            String manv = txt_manv.getText().trim();
            int confirm = JOptionPane.showConfirmDialog(this,
                    "Bạn có chắc chắn muốn xóa nhân viên mã: " + manv + " không?",
                    "Xác nhận xóa",
                    JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) {
                return;
            }
            con = Connect.ConnectDB.KetnoiDB();
            String sql = "DELETE FROM Nhanvien WHERE Manv = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, manv);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            con.close();
            load_Nhanvien();
            clearForm();
            setInitialState();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Lỗi xóa nhân viên: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void txt_HovatenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HovatenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_HovatenActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
         txt_manv.setEnabled(true);
        txt_Hovaten.setEnabled(true);
        dc_Ngaysinh.setEnabled(true);
        cb_gioitinh.setEnabled(true);
        cb_phongban.setEnabled(true);
        txt_dienthoai.setEnabled(true);
        txt_email.setEnabled(true);
        dc_Ngayvaolam.setEnabled(true);
        // Kích hoạt nút Lưu, vô hiệu hóa Cập nhật, Xóa
        btn_luu.setEnabled(true);
        btn_cạpnhat.setEnabled(false);
        btn_xoa.setEnabled(false);
        // Xóa trắng form
        clearForm();
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
         try {
            // Lấy dữ liệu
            String manv = txt_manv.getText().trim();
            String tennv = txt_Hovaten.getText().trim();
            java.util.Date ngaysinh = dc_Ngaysinh.getDate();
            String gioitinh = cb_gioitinh.getSelectedItem().toString();
            String tenpb = cb_phongban.getSelectedItem().toString();
            String dienthoai = txt_dienthoai.getText().trim();
            String email = txt_email.getText().trim();
            java.util.Date ngayvaolam = dc_Ngayvaolam.getDate();

            // Kiểm tra không để trống
            if (manv.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mã nhân viên không được để trống!");
                return;
            }
            if (tennv.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Họ và tên không được để trống!");
                return;
            }
            if (ngaysinh == null) {
                JOptionPane.showMessageDialog(this, "Ngày sinh không được để trống!");
                return;
            }
            if (gioitinh.equals("--Chọn giới tính--")) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn giới tính!");
                return;
            }
            if (tenpb.equals("--Chọn phòng ban--")) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn phòng ban!");
                return;
            }
            if (dienthoai.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Điện thoại không được để trống!");
                return;
            }
            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email không được để trống!");
                return;
            }
            if (ngayvaolam == null) {
                JOptionPane.showMessageDialog(this, "Ngày vào làm không được để trống!");
                return;
            }

            // Kiểm tra regex
            if (!dienthoai.matches("^[0-9]{10}$")) {
                JOptionPane.showMessageDialog(this, "Số điện thoại phải là 10 chữ số và chỉ chứa số!");
                return;
            }
            if (!isValidAge(ngaysinh)) {
                JOptionPane.showMessageDialog(this, "Nhân viên phải từ 18 tuổi trở lên và ngày sinh phải trước ngày hiện tại!");
                return;
            }
            if (checkTrungManv(manv)) {
                JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại!");
                return;
            }

            // Thêm vào cơ sở dữ liệu
            con = Connect.ConnectDB.KetnoiDB();
            String sql = "INSERT INTO Nhanvien (Manv, Tennv, Ngaysinh, Gioitinh, Dienthoai, Email, Maphongban, Ngayvaolam) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, manv);
            ps.setString(2, tennv);
            ps.setDate(3, new Date(ngaysinh.getTime()));
            ps.setString(4, gioitinh);
            ps.setString(5, dienthoai);
            ps.setString(6, email);
            ps.setString(7, phongbanMap.get(tenpb));
            ps.setDate(8, new Date(ngayvaolam.getTime()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Thêm mới thành công");
            con.close();
            load_Nhanvien();
            clearForm();
            setInitialState();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Lỗi thêm nhân viên: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_luuActionPerformed

    private void btn_cạpnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cạpnhatActionPerformed
       try {
            // Lấy dữ liệu
            String manv = txt_manv.getText().trim();
            String tennv = txt_Hovaten.getText().trim();
            java.util.Date ngaysinh = dc_Ngaysinh.getDate();
            String gioitinh = cb_gioitinh.getSelectedItem().toString();
            String tenpb = cb_phongban.getSelectedItem().toString();
            String dienthoai = txt_dienthoai.getText().trim();
            String email = txt_email.getText().trim();
            java.util.Date ngayvaolam = dc_Ngayvaolam.getDate();

            // Kiểm tra không để trống
            if (tennv.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Họ và tên không được để trống!");
                return;
            }
            if (ngaysinh == null) {
                JOptionPane.showMessageDialog(this, "Ngày sinh không được để trống!");
                return;
            }
            if (gioitinh.equals("--Chọn giới tính--")) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn giới tính!");
                return;
            }
            if (tenpb.equals("--Chọn phòng ban--")) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn phòng ban!");
                return;
            }
            if (dienthoai.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Điện thoại không được để trống!");
                return;
            }
            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email không được để trống!");
                return;
            }
            if (ngayvaolam == null) {
                JOptionPane.showMessageDialog(this, "Ngày vào làm không được để trống!");
                return;
            }

            // Kiểm tra regex
            if (!dienthoai.matches("^[0-9]{10}$")) {
                JOptionPane.showMessageDialog(this, "Số điện thoại phải là 10 chữ số và chỉ chứa số!");
                return;
            }
            if (!isValidAge(ngaysinh)) {
                JOptionPane.showMessageDialog(this, "Nhân viên phải từ 18 tuổi trở lên và ngày sinh phải trước ngày hiện tại!");
                return;
            }

            // Cập nhật cơ sở dữ liệu
            con = Connect.ConnectDB.KetnoiDB();
            String sql = "UPDATE Nhanvien SET Tennv = ?, Ngaysinh = ?, Gioitinh = ?, Dienthoai = ?, Email = ?, Maphongban = ?, Ngayvaolam = ? WHERE Manv = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tennv);
            ps.setDate(2, new Date(ngaysinh.getTime()));
            ps.setString(3, gioitinh);
            ps.setString(4, dienthoai);
            ps.setString(5, email);
            ps.setString(6, phongbanMap.get(tenpb));
            ps.setDate(7, new Date(ngayvaolam.getTime()));
            ps.setString(8, manv);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            con.close();
            load_Nhanvien();
            clearForm();
            setInitialState();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Lỗi cập nhật nhân viên: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyPhongBan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_cạpnhatActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this,
                "Bạn có muốn thoát chương trình không?",
                "Xác nhận thoát",
                JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_thoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhongBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new QuanLyPhongBan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Timkiem;
    private javax.swing.JButton btn_cạpnhat;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cb_gioitinh;
    private javax.swing.JComboBox<String> cb_phongban;
    private com.toedter.calendar.JDateChooser dc_Ngaysinh;
    private com.toedter.calendar.JDateChooser dc_Ngayvaolam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbSinhVien;
    private javax.swing.JTable tb_Nhanvien;
    private javax.swing.JTextField txtTK_Hovaten;
    private javax.swing.JTextField txtTK_manv;
    private javax.swing.JTextField txt_Hovaten;
    private javax.swing.JTextField txt_dienthoai;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_manv;
    // End of variables declaration//GEN-END:variables
}
