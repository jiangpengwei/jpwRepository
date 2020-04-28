package com.web.model;
/**
 * @文件名: LoginInfo.java
 * @类功能说明: 登录日志实体类
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年3月2日上午11:23:01
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年3月2日上午11:23:01</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class LogInfo {
	private Integer log_id;
	private String log_name;
	private String log_date;
	private String log_content;
	private String log_remark;
	public LogInfo() {}
	public LogInfo(String log_name, String log_date, String log_content) {
		this.log_name = log_name;
		this.log_date = log_date;
		this.log_content = log_content;
	}
	public LogInfo(Integer log_id, String log_name, String log_date, String log_content, String log_remark) {
		this.log_id = log_id;
		this.log_name = log_name;
		this.log_date = log_date;
		this.log_content = log_content;
		this.log_remark = log_remark;
	}
	public Integer getLog_id() {
		return log_id;
	}
	public void setLog_id(Integer log_id) {
		this.log_id = log_id;
	}
	public String getLog_name() {
		return log_name;
	}
	public void setLog_name(String log_name) {
		this.log_name = log_name;
	}
	public String getLog_date() {
		return log_date;
	}
	public void setLog_date(String log_date) {
		this.log_date = log_date;
	}
	public String getLog_content() {
		return log_content;
	}
	public void setLog_content(String log_content) {
		this.log_content = log_content;
	}
	public String getLog_remark() {
		return log_remark;
	}
	public void setLog_remark(String log_remark) {
		this.log_remark = log_remark;
	}
	
	
}














