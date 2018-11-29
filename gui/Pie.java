import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


public class Pie {
	
	 static double average = 2.5;
	 public static void main( String[ ] args ) throws IOException {
	  
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "Æò±Õ" , new Double( average ));
      dataset.setValue( "ÀüÃ¼" , new Double( 4.5 - average ));      
  
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
 
      int width = 640;   /* Width of the image */
      int height = 480;  /* Height of the image */ 
      File pieChart = new File( "PieChart.jpeg" ); 
      ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
   }
}
   