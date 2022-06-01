/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallergui_q1;

/**
 *
 * @author James Josue Molina
 */
        
    
import static com.teamdev.jxbrowser.engine.RenderingMode.*;
 
import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.view.swing.BrowserView;
 
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
 
/**...*/
public final class Mapa {
    public static void execute(Principal principal) {
        Engine engine = Engine.newInstance(
            EngineOptions.newBuilder(HARDWARE_ACCELERATED)
                    .licenseKey("6P830J66YBNIS87GXAATSF6LHLLUR0OMK00QGGVQCQPT0XLBKO007WXOKA3BWE0AWC5D")
                    .build());


        Browser browser = engine.newBrowser();

        SwingUtilities.invokeLater(() -> {
          BrowserView view = BrowserView.newInstance(browser);

          JFrame frame = new JFrame("Swing BrowserView");
          frame.setSize(700, 600);
          
          JButton boton = new JButton("Obtener Coordenada");
          boton.setSize(200, 50);
          boton.setLocation(250,0);
          boton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                String url = browser.url();
                String[] url_1 = url.split("@");
                String[] url_2 = url_1[1].split(",");
                float x = Float.parseFloat(url_2[0]);
                float y = Float.parseFloat(url_2[1]);
                String lugar = (String)JOptionPane.showInputDialog("Lugar");
                principal.setCoordenada(x, y, lugar);
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
              }
          });
          JPanel panel = new JPanel();
          panel.add(view, BorderLayout.CENTER);
          panel.setSize(700,500);
          panel.setLocation(0, 100);
          
          frame.add(boton);
          frame.add(panel);
          frame.setLayout(null);
          frame.setLocationRelativeTo(null);
          frame.setVisible(true);

          browser.navigation().loadUrl("https://www.google.com/maps/@14.0697536,-87.1708245,13z");
        }
        );
    }
}
