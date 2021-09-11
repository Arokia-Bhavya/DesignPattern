package factory;

public class PerformanceReport extends Report{
	Integer reportId;	
	String reportName;
	String reportType;
	String reportHeader;
	
	public PerformanceReport(Integer reportId, String reportName, String reportType, String reportHeader) {
		super();
		this.reportId = reportId;
		this.reportName = reportName;
		this.reportType = reportType;
		this.reportHeader = reportHeader;
	}

	
	@Override
	public Integer getReportId() {		
		return this.reportId;
	}

	@Override
	public String getReportName() {
		return this.reportName;
	}

	@Override
	public String getReportType() {
		return this.reportType;
	}

	@Override
	public String getReportHeader() {
		return this.reportHeader;
	}

}
