package factory;

public abstract class Report {
	public abstract Integer getReportId();
	public abstract String getReportName();
	public abstract String getReportType();
	public abstract String getReportHeader();
	
	@Override
	public String toString(){
		return "ReportId"+ getReportId()+", ReportName= "+this.getReportName()+", ReportType="+this.getReportType()+", ReportHeader="+this.getReportHeader();
	}

}
