import java.awt.Color;
import java.awt.Dimension;
import java.util.LinkedList;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;

public class DDAssistantWindow extends ApplicationFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String title = "DDAsistant";
	
	private XYDataset dataset;
	//private CategoryDataset dataset;
	private JFreeChart chart;
	private ChartPanel chartPanel;
	
	private void initComponents(){
		dataset = createDataset();
		chart = createChart(dataset);
		chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new Dimension(500, 270));
		setContentPane(chartPanel);
	}
	
	private JFreeChart createChart(XYDataset dataset){
		final JFreeChart chart = ChartFactory.createXYLineChart("DDAssistant", "Horizontal Distance", "Vertical Depth", dataset, PlotOrientation.VERTICAL, false, false, false);
		
		chart.setBackgroundPaint(Color.white);
		final XYPlot plot = (XYPlot) chart.getPlot();
		plot.setDomainAxisLocation(AxisLocation.TOP_OR_LEFT);
		plot.setBackgroundPaint(Color.lightGray);
		plot.setRangeGridlinePaint(Color.white);
		
		
		/*final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		rangeAxis.setAutoRangeIncludesZero(true);*/
		
		
		
		
		/*final LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
		
		   renderer.setSeriesStroke(
		            0, new BasicStroke(
		                2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,
		                1.0f, new float[] {10.0f, 6.0f}, 0.0f
		            )
		   );*/
		
		return chart;
	}
	private XYDataset createDataset(){
		final LinkedList<Double> depth = new LinkedList<Double>();
		final LinkedList<Double> width = new LinkedList<Double>();
		XYSeriesCollection xyCollect = new XYSeriesCollection();
		XYSeries series = new XYSeries("");
		
		for(int i = 0; i < 100; i++){
			series.add(i * i, -i);
		}
		
		
		xyCollect.addSeries(series);
		return xyCollect;
		
	}
	public DDAssistantWindow(){
		super(title);
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initComponents();
	}
}
