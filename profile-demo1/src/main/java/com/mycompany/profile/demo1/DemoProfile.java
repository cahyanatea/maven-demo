/*
 * By: Asep Cahyana
 * Date: Rabu 23 Oktober 2019
 */
package com.mycompany.profile.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author okt19
 */
public class DemoProfile {
    
    public static void main(String[] args) {

        InputStream file = DemoProfile.class.getClassLoader().getResourceAsStream("db.properties");        
        try {
            // membuka file properties
            
            Properties prop = new Properties();
            prop.load(file);
            System.out.println(prop.getProperty("db.driverClassName"));
            System.out.println(prop.getProperty("db.url"));
            System.out.println(prop.getProperty("db.username"));
            System.out.println(prop.getProperty("db.password"));
            
        } catch (IOException ex) {
            Logger.getLogger(DemoProfile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (file != null) try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
