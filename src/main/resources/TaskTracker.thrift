namespace java   com.datapump.jobtracker


struct ReportReq {
  1: i32 job_id ,
  2: i32 job_state,
  3: i64 sink_count,
  4: i64 source_count
}

struct ReportResp {
  1: i32 job_id,
  2: i32 operation


}

service JobTrackerReportService

{

  ReportResp report(1:ReportReq req)

}