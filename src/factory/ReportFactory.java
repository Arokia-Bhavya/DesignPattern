package factory;

public class ReportFactory {
	private ReportFactory()
	{
		
	}
	
	public static Report getReport(Integer reportId,String reportName,String reportType,String reportHeader)
	{
		if(reportId==10)
			return new PortfolioReport(reportId,reportName,reportType,reportHeader);
		else if(reportId==11)
			return new PerformanceReport(reportId,reportName,reportType,reportHeader);
		return null;
	}
	public static void main(String[] args)
	{
		Report report1=getReport(10,"PortfolioReport","PDF","Report By Porfolio");
		System.out.println(report1);
		Report report2=getReport(11,"PerformaceReport","CSV","Report By Performance");
		System.out.println(report2);
	}

}
