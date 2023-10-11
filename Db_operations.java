/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.*;

/**
 *
 * @author india
 */
public class Db_operations {

    public static ResultSet get_details(int pin) {
        ResultSet rs = null;
        try {
            Connection con = Db_connection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from atm_interface where pin=?");
            ps.setInt(1, pin);
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public static int update_withdrawl(int pin, int bal) {
        int i = 0;
        try {
            Connection con = Db_connection.getConnection();
            PreparedStatement ps = con.prepareStatement("update atm_interface set balance=" + bal + " where pin=?");
            ps.setInt(1, pin);
            i = ps.executeUpdate();
        } catch (Exception e) {
        }
        return i;
    }

    public static ResultSet bal(int pin) {
        ResultSet rs = null;
        try {
            Connection con = Db_connection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from atm_interface where pin=?");
            ps.setInt(1, pin);

            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public static int update_pin(int pin, int confirm) {
        int i = 0;
        try {
            Connection con = Db_connection.getConnection();
            PreparedStatement ps = con.prepareStatement("update atm_interface set pin=" + confirm + " where pin=?");
            ps.setInt(1, pin);
            i = ps.executeUpdate();
        } catch (Exception e) {
        }
        return i;
    }

    public static int update_amt(String acc, String name, int amt) {
        int i = 0;
        int j = 0;
        try {
            Connection con = Db_connection.getConnection();
            PreparedStatement ps = con.prepareStatement("update atm_interface set balance=" + amt + "  where acc_no=? && name=?");

            ps.setString(1, acc);
            ps.setString(2, name);

            i = ps.executeUpdate();

        } catch (Exception e) {
        }
        return i;
    }

    public static ResultSet get_info(String acc) {
        ResultSet rs = null;
        try {
            Connection con = Db_connection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from atm_interface where acc_no=?");
            ps.setString(1, acc);
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

}
