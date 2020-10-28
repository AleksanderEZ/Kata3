/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata3;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import kata3.core.Histogram;
import kata3.core.HistogramDisplay;

public class Main extends JFrame{
    
    private HistogramDisplay histogramDisplay;
    
    public static void main(String[] args) {
        new Main().execute();
    }
    
    public Main(){
        setTitle("Histogram");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        rootPane.setLayout(new BorderLayout());
        rootPane.add(createHistogramDisplay(), BorderLayout.CENTER);
    }

    private void execute() {
        Histogram histogram = new DefaultHistogramLoader().load();
        histogramDisplay.display(histogram);
        setVisible(true);
    }
    private DefaultHistogramDisplay createHistogramDisplay(){
        DefaultHistogramDisplay display = new DefaultHistogramDisplay();
        this.histogramDisplay = display;
        return display;
    }

}
