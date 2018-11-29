import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class PieChartExample extends ApplicationFrame {
   
	static double average = 2.5;
   
	public PieChartExample( String title ) {
      super( title ); 
      setContentPane(createDemoPanel( ));
   }
   
   private static PieDataset createDataset( ) {
	  
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "Æò±Õ" , new Double( average ));
      dataset.setValue( "ÀüÃ¼" , new Double( 4.5 - average ));
      
      return dataset;         
   }
   
   private static JFreeChart createChart( PieDataset dataset ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         "ÇÐÁ¡ Æò±Õ",   // chart title 
         dataset,          // data    
         true,             // include legend   
         true, 
         false);

      chart.getLegend().setItemFont(new Font("¸¼Àº °íµñ",Font.BOLD, 13));
      chart.getTitle().setFont(new Font("¸¼Àº °íµñ",Font.BOLD, 13));
      
      final PiePlot plot = (PiePlot) chart.getPlot();
      plot.setInteriorGap(0.0);
      plot.setLabelGenerator(null);
      plot.setBackgroundPaint(Color.lightGray);
      
      return chart;
   }
   
   public static JPanel createDemoPanel( ) {
      JFreeChart chart = createChart(createDataset( ) ); 
      return new ChartPanel( chart ); 
   }

   public static void main( String[ ] args ) {
	  PieChartExample demo = new PieChartExample( "ÇÐÁ¡ Æò±Õ" );  
      demo.setSize( 560 , 367 );    
      RefineryUtilities.centerFrameOnScreen( demo );    
      demo.setVisible( true ); 
   }
}