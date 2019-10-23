/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.profile.demo2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author okt19
 */
public class MainApp {
    public static void main(String[] args) {
        
        InputStream file = MainApp.class.getClassLoader().getResourceAsStream("env.properties");
        
                try {
            // membuka file properties

            Properties prop = new Properties();
            prop.load(file);
            System.out.println(prop.getProperty("env.msg"));

        } catch (IOException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (file != null) try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
