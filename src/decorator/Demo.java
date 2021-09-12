package decorator;

public class Demo {
	public static void main(String[] args)
	{
		Report report=new PortfolioReport(new BasicReport());
		report.stitchContents();
		
		Report PortfolioPerfomanceReport=new PerformanceReport(new PortfolioReport(new BasicReport()));
		PortfolioPerfomanceReport.stitchContents();
	}

}
