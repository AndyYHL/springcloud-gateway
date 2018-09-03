package com.tuyou.common;



public class ReturnMsg {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String primaryKey = "statuscode";

	public String statuscode;// 状态编号
	public String message;// 返回信息
	public Object result; // 结果
	//当前页码
	public Integer currentPage=0;
	
	//总页数
	public Integer totalPageCount;
	
	//总条数
	public Integer totalRows;

	
	private Integer PreviousPage;
	private Integer NextPage;
	
	
	
	public Integer getTotalRows() {
		return totalRows;
	}


	public void setTotalRows(Integer totalRows) {
		this.totalRows = totalRows;
	}


	public ReturnMsg(String statuscode, String message, Object result,
					 Integer currentPage, Integer totalPageCount, Integer totalRows) {
		super();
		this.statuscode = statuscode;
		this.message = message;
		this.result = result;
		this.currentPage = currentPage;
		this.totalPageCount = totalPageCount;
		this.totalRows = totalRows;
	}
	

	public ReturnMsg(String statuscode, String message, Object result,
					 Integer currentPage, Integer totalPageCount) {
		super();
		this.statuscode = statuscode;
		this.message = message;
		this.result = result;
		this.currentPage = currentPage;
		this.totalPageCount = totalPageCount;
	}

	public ReturnMsg(String statuscode, String message, Object result,
					 Integer currentPage, Integer totalPageCount, Integer PreviousPage, Integer NextPage) {
		super();
		this.statuscode = statuscode;
		this.message = message;
		this.result = result;
		this.currentPage = currentPage;
		this.totalPageCount = totalPageCount;
		this.PreviousPage = PreviousPage;
		this.NextPage = NextPage;
	}
	public Integer getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(Integer totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public ReturnMsg(String statuscode, String message, Object result,
					 Integer currentPage) {
		super();
		this.statuscode = statuscode;
		this.message = message;
		this.result = result;
		this.currentPage = currentPage;
	}

	public ReturnMsg() {

	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public ReturnMsg(String statuscode, String message) {
		this.statuscode = statuscode;
		this.message = message;
	}

	public ReturnMsg(String statuscode, String message, Object result) {
		super();
		this.statuscode = statuscode;
		this.message = message;
		this.result = result;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public String getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public Integer getPreviousPage() {
		return PreviousPage;
	}


	public void setPreviousPage(Integer previousPage) {
		PreviousPage = previousPage;
	}


	public Integer getNextPage() {
		return NextPage;
	}


	public void setNextPage(Integer nextPage) {
		NextPage = nextPage;
	}
	
}
