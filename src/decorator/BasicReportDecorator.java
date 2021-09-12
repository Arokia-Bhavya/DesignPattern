package decorator;

public class BasicReportDecorator implements Report {
	protected Report report;
	
	public BasicReportDecorator(Report report){
		this.report=report;
	}

	@Override
	public void stitchContents() {
		this.report.stitchContents();
	}

}
