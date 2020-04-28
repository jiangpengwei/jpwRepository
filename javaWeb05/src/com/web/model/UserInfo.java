package com.web.model;
/**
 * @文件名: UserInfo.java
 * @类功能说明: 用户信息实体类
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年2月28日下午12:44:52
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年2月28日下午12:44:52</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class UserInfo {
		private Integer u_id;
		private String u_name;
		private String u_pwd;
		private Integer delflag;
		
		public UserInfo() {
		}

		public UserInfo(String u_name, String u_pwd, Integer delflag) {
			super();
			this.u_name = u_name;
			this.u_pwd = u_pwd;
			this.delflag = delflag;
		}

		public UserInfo(Integer u_id, String u_name, String u_pwd, Integer delflag) {
			super();
			this.u_id = u_id;
			this.u_name = u_name;
			this.u_pwd = u_pwd;
			this.delflag = delflag;
		}

		public UserInfo(String u_name, String u_pwd) {
			super();
			this.u_name = u_name;
			this.u_pwd = u_pwd;
		}

		public Integer getU_id() {
			return u_id;
		}

		public void setU_id(Integer u_id) {
			this.u_id = u_id;
		}

		public String getU_name() {
			return u_name;
		}

		public void setU_name(String u_name) {
			this.u_name = u_name;
		}

		public String getU_pwd() {
			return u_pwd;
		}

		public void setU_pwd(String u_pwd) {
			this.u_pwd = u_pwd;
		}

		public Integer getDelflag() {
			return delflag;
		}

		public void setDelflag(Integer delflag) {
			this.delflag = delflag;
		}

		
}
