package com.cardpay.pccredit.manager.model;

import com.wicresoft.jrad.base.web.form.BaseForm;

/**
 * @author songchen
 *
 * 2014-11-14下午5:50:49
 */
public class ManagerSalaryForm extends BaseForm {
	private static final long serialVersionUID = 1L;
   
	private String id;
	
	private String customerId;
	// 客户经理姓名
	private String managerName;
	// 客户经理奖励激励金额（包含风险准备金 ）= 绩效工资
	private String rewardIncentiveInformation;
	// 扣除金额
	private String deductAmount;
	// 底薪
	private String basePay;
	// 津贴
	private String allowance;
	// 责任工资
	private String dutySalary;
	// 返还金额
	private String returnPrepareAmount;
	// 准备金额总额
	private String insertPrepareAmount;
	// 风险准备金余额
	private String riskReserveBalances;
	// 罚款
	private String fine;
	//年份
	private String year;
	//月份
	private String month;
	//备注
	private String describe;
	//本月工资
	private String wage;
	//机构
	private String instCode;
	
    private String basicTaskBonus;
	
	private String middleAllowance;
	
	private String attendDeduct;
	
	private String rowIndex;
	
	private String  monthLoanNum;

	private String  monthEffectNum;
 
	private String  monthOverdueDays;  

	private String  monthTimes;
	
	//业务量绩效
	private String volumePerformance;
	//利润提成
	private String profitDraw;
	//逾期扣款
	private String overdueDeduct;
	private String managerType;
	
	private String subsidies;
	private String auditNum;
	
	//太原添加部分
		//基本工资
		private String zhbasepay;
		
		//当月贷款绩效
		private String MonthPerformance;
		
		//主办
		private String zb;
		
		//协办
		private String xb;
		
		//当月放款绩效
		private String dyffdkjx;
		
		//当月管户绩效
		private String gh;
		
		//当月承担审批的贷款笔数绩效
		private String sp;
		
		//客户经理等级岗位绩效
		private String dj;
		
		//理辅助调查绩效
		private String fd;
		
		//任务完成度绩效
		private String rw;
		
		//不良贷款比率超过容忍度的处罚标准blje-被扣掉的绩效
		private String bl;
		
		//客户经理主管加成绩效
		private String zg;
		
		
		//当月承担审批的避暑
		private String MonthApprovalNum;
		
		//客户经理当月辅助调查笔数
		private String MonthAcasiNum;
		
		

	
	public String getMonthAcasiNum() {
			return MonthAcasiNum;
		}

		public void setMonthAcasiNum(String monthAcasiNum) {
			MonthAcasiNum = monthAcasiNum;
		}

	public String getMonthApprovalNum() {
			return MonthApprovalNum;
		}

		public void setMonthApprovalNum(String monthApprovalNum) {
			MonthApprovalNum = monthApprovalNum;
		}

	public String getZb() {
			return zb;
		}

		public void setZb(String zb) {
			this.zb = zb;
		}

		public String getXb() {
			return xb;
		}

		public void setXb(String xb) {
			this.xb = xb;
		}

	public String getZhbasepay() {
			return zhbasepay;
		}

		public void setZhbasepay(String zhbasepay) {
			this.zhbasepay = zhbasepay;
		}

		public String getMonthPerformance() {
			return MonthPerformance;
		}

		public void setMonthPerformance(String monthPerformance) {
			MonthPerformance = monthPerformance;
		}

		public String getDyffdkjx() {
			return dyffdkjx;
		}

		public void setDyffdkjx(String dyffdkjx) {
			this.dyffdkjx = dyffdkjx;
		}

		public String getGh() {
			return gh;
		}

		public void setGh(String gh) {
			this.gh = gh;
		}

		public String getSp() {
			return sp;
		}

		public void setSp(String sp) {
			this.sp = sp;
		}

		public String getDj() {
			return dj;
		}

		public void setDj(String dj) {
			this.dj = dj;
		}

		public String getFd() {
			return fd;
		}

		public void setFd(String fd) {
			this.fd = fd;
		}

		public String getRw() {
			return rw;
		}

		public void setRw(String rw) {
			this.rw = rw;
		}

		public String getBl() {
			return bl;
		}

		public void setBl(String bl) {
			this.bl = bl;
		}

		public String getZg() {
			return zg;
		}

		public void setZg(String zg) {
			this.zg = zg;
		}

	public String getAuditNum() {
		return auditNum;
	}

	public void setAuditNum(String auditNum) {
		this.auditNum = auditNum;
	}

	public String getSubsidies() {
		return subsidies;
	}

	public void setSubsidies(String subsidies) {
		this.subsidies = subsidies;
	}

	public String getManagerType() {
		return managerType;
	}

	public void setManagerType(String managerType) {
		this.managerType = managerType;
	}

	public String getVolumePerformance() {
		return volumePerformance;
	}

	public void setVolumePerformance(String volumePerformance) {
		this.volumePerformance = volumePerformance;
	}

	public String getProfitDraw() {
		return profitDraw;
	}

	public void setProfitDraw(String profitDraw) {
		this.profitDraw = profitDraw;
	}

	public String getOverdueDeduct() {
		return overdueDeduct;
	}

	public void setOverdueDeduct(String overdueDeduct) {
		this.overdueDeduct = overdueDeduct;
	}

	public String getMonthLoanNum() {
		return monthLoanNum;
	}

	public void setMonthLoanNum(String monthLoanNum) {
		this.monthLoanNum = monthLoanNum;
	}

	public String getMonthEffectNum() {
		return monthEffectNum;
	}

	public void setMonthEffectNum(String monthEffectNum) {
		this.monthEffectNum = monthEffectNum;
	}

	public String getMonthOverdueDays() {
		return monthOverdueDays;
	}

	public void setMonthOverdueDays(String monthOverdueDays) {
		this.monthOverdueDays = monthOverdueDays;
	}

	public String getMonthTimes() {
		return monthTimes;
	}

	public void setMonthTimes(String monthTimes) {
		this.monthTimes = monthTimes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(String rowIndex) {
		this.rowIndex = rowIndex;
	}

	public String getBasicTaskBonus() {
		return basicTaskBonus;
	}

	public void setBasicTaskBonus(String basicTaskBonus) {
		this.basicTaskBonus = basicTaskBonus;
	}

	public String getMiddleAllowance() {
		return middleAllowance;
	}

	public void setMiddleAllowance(String middleAllowance) {
		this.middleAllowance = middleAllowance;
	}

	public String getAttendDeduct() {
		return attendDeduct;
	}

	public void setAttendDeduct(String attendDeduct) {
		this.attendDeduct = attendDeduct;
	}

	public String getInstCode() {
		return instCode;
	}

	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getWage() {
		return wage;
	}

	public void setWage(String wage) {
		this.wage = wage;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getRewardIncentiveInformation() {
		return rewardIncentiveInformation;
	}

	public void setRewardIncentiveInformation(String rewardIncentiveInformation) {
		this.rewardIncentiveInformation = rewardIncentiveInformation;
	}

	public String getDeductAmount() {
		return deductAmount;
	}

	public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
	}

	public String getBasePay() {
		return basePay;
	}

	public void setBasePay(String basePay) {
		this.basePay = basePay;
	}

	public String getAllowance() {
		return allowance;
	}

	public void setAllowance(String allowance) {
		this.allowance = allowance;
	}

	public String getDutySalary() {
		return dutySalary;
	}

	public void setDutySalary(String dutySalary) {
		this.dutySalary = dutySalary;
	}

	public String getReturnPrepareAmount() {
		return returnPrepareAmount;
	}

	public void setReturnPrepareAmount(String returnPrepareAmount) {
		this.returnPrepareAmount = returnPrepareAmount;
	}

	public String getInsertPrepareAmount() {
		return insertPrepareAmount;
	}

	public void setInsertPrepareAmount(String insertPrepareAmount) {
		this.insertPrepareAmount = insertPrepareAmount;
	}

	public String getFine() {
		return fine;
	}

	public void setFine(String fine) {
		this.fine = fine;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getRiskReserveBalances() {
		return riskReserveBalances;
	}

	public void setRiskReserveBalances(String riskReserveBalances) {
		this.riskReserveBalances = riskReserveBalances;
	}
}
