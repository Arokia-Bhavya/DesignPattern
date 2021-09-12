package decorator;

public class PerformanceReport extends BasicReportDecorator{
	public PerformanceReport(Report report)
	{
		super(report);
	}
	
	@Override
	public void stitchContents() {
		super.stitchContents();
		System.out.println(" Adding features of Performance report.");	
	}
}
