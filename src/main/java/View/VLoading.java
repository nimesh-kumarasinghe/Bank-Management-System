/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import java.lang.Thread;
/**
 *
 * @author DELL
 */
public class VLoading {
    public static void main(String[] args) {
        VSplash loading = new VSplash();
        loading.setVisible(true);
        try
        {
            Thread.sleep(1000);
            VLogin hh = new VLogin();
            loading.dispose();
            hh.show();
        }
        catch(Exception ex)
        {
        }
    }
}
