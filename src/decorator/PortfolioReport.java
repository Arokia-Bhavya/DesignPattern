package decorator;

public class PortfolioReport extends BasicReportDecorator{
	public PortfolioReport(Report report)
	{
		super(report);
	}
	
	@Override
	public void stitchContents() {
		super.stitchContents();
		System.out.println(" Adding features of Portfolio report.");	
	}
}
