package com.cx.dragonnest.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 资产清单管理Entity
 *
 * @author chenxin
 * @date 2023/07/10 16:18
 */
@Data
@TableName(value = "inso_asset_inventory")
public class InsoAssetInventory implements Serializable {
	private static final long serialVersionUID = -5471046916489513189L;

	/**
	 * 主键 资产id
	 */
	private Integer assetId;

	/**
	 * *一级归属
	 */
	private String firstAttribution;

	/**
	 * *二级归属
	 */
	private String secondarySecondary;

	/**
	 * *三级归属
	 */
	private String thirdSecondary;

	/**
	 * *应用系统名称
	 */
	private String applicationSystemName;

	/**
	 * *网络单元
	 */
	private String networkUnit;

	/**
	 * ip地址
	 */
	private String ipAddress;

	/**
	 * 资产名称
	 */
	private String assetName;

	/**
	 * ip类型
	 */
	private String ipType;

	/**
	 * 状态;1 在用 0 不在用
	 */
	private int assetStatus;

	/**
	 * 网络类型
	 */
	private String networkType;

	/**
	 * 设备类型
	 */
	private String deviceType;

	/**
	 * 设备备注
	 */
	private String deviceNotes;

	/**
	 * ip访问控制
	 */
	private String ipAccessControl;

	/**
	 * 访问控制备注
	 */
	private String accessControlNotes;

	/**
	 * 标签名称
	 */
	private String labelName;

	/**
	 * 资产备注
	 */
	private String assetNotes;

	/**
	 * 直接负责人部门
	 */
	private String directlyResponsibleDepartment;

	/**
	 * 直接负责人
	 */
	private String directlyResponsible;

	/**
	 * 直接负责人电话
	 */
	private String directlyResponsiblePhone;

	/**
	 * 直接负责人邮箱
	 */
	private String directlyResponsibleEmailAddress;

	/**
	 * 管理负责人部门
	 */
	private String manageTheDepartment;

	/**
	 * 管理负责人
	 */
	private String headOfManagement;

	/**
	 * 管理负责人电话
	 */
	private String managePhone;

	/**
	 * 管理负责人邮箱
	 */
	private String manageEmailAddress;

	/**
	 * 领导负责人部门
	 */
	private String leadDepartmen;

	/**
	 * 领导负责人
	 */
	private String headOfLeader;

	/**
	 * 领导负责人电话
	 */
	private String leaderPhone;

	/**
	 * 领导负责人邮箱
	 */
	private String leaderEmailAddress;

	/**
	 * 物理区域
	 */
	private String physicalArea;

	/**
	 * 物理位置
	 */
	private String physicalLocation;

	private String systemCode;

	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public String getFirstAttribution() {
		return firstAttribution;
	}

	public void setFirstAttribution(String firstAttribution) {
		this.firstAttribution = firstAttribution;
	}

	public String getSecondarySecondary() {
		return secondarySecondary;
	}

	public void setSecondarySecondary(String secondarySecondary) {
		this.secondarySecondary = secondarySecondary;
	}

	public String getThirdSecondary() {
		return thirdSecondary;
	}

	public void setThirdSecondary(String thirdSecondary) {
		this.thirdSecondary = thirdSecondary;
	}

	public String getApplicationSystemName() {
		return applicationSystemName;
	}

	public void setApplicationSystemName(String applicationSystemName) {
		this.applicationSystemName = applicationSystemName;
	}

	public String getNetworkUnit() {
		return networkUnit;
	}

	public void setNetworkUnit(String networkUnit) {
		this.networkUnit = networkUnit;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getIpType() {
		return ipType;
	}

	public void setIpType(String ipType) {
		this.ipType = ipType;
	}

	public int getAssetStatus() {
		return assetStatus;
	}

	public void setAssetStatus(int assetStatus) {
		this.assetStatus = assetStatus;
	}

	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceNotes() {
		return deviceNotes;
	}

	public void setDeviceNotes(String deviceNotes) {
		this.deviceNotes = deviceNotes;
	}

	public String getIpAccessControl() {
		return ipAccessControl;
	}

	public void setIpAccessControl(String ipAccessControl) {
		this.ipAccessControl = ipAccessControl;
	}

	public String getAccessControlNotes() {
		return accessControlNotes;
	}

	public void setAccessControlNotes(String accessControlNotes) {
		this.accessControlNotes = accessControlNotes;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getAssetNotes() {
		return assetNotes;
	}

	public void setAssetNotes(String assetNotes) {
		this.assetNotes = assetNotes;
	}

	public String getDirectlyResponsibleDepartment() {
		return directlyResponsibleDepartment;
	}

	public void setDirectlyResponsibleDepartment(String directlyResponsibleDepartment) {
		this.directlyResponsibleDepartment = directlyResponsibleDepartment;
	}

	public String getDirectlyResponsible() {
		return directlyResponsible;
	}

	public void setDirectlyResponsible(String directlyResponsible) {
		this.directlyResponsible = directlyResponsible;
	}

	public String getDirectlyResponsiblePhone() {
		return directlyResponsiblePhone;
	}

	public void setDirectlyResponsiblePhone(String directlyResponsiblePhone) {
		this.directlyResponsiblePhone = directlyResponsiblePhone;
	}

	public String getDirectlyResponsibleEmailAddress() {
		return directlyResponsibleEmailAddress;
	}

	public void setDirectlyResponsibleEmailAddress(String directlyResponsibleEmailAddress) {
		this.directlyResponsibleEmailAddress = directlyResponsibleEmailAddress;
	}

	public String getManageTheDepartment() {
		return manageTheDepartment;
	}

	public void setManageTheDepartment(String manageTheDepartment) {
		this.manageTheDepartment = manageTheDepartment;
	}

	public String getHeadOfManagement() {
		return headOfManagement;
	}

	public void setHeadOfManagement(String headOfManagement) {
		this.headOfManagement = headOfManagement;
	}

	public String getManagePhone() {
		return managePhone;
	}

	public void setManagePhone(String managePhone) {
		this.managePhone = managePhone;
	}

	public String getManageEmailAddress() {
		return manageEmailAddress;
	}

	public void setManageEmailAddress(String manageEmailAddress) {
		this.manageEmailAddress = manageEmailAddress;
	}

	public String getLeadDepartmen() {
		return leadDepartmen;
	}

	public void setLeadDepartmen(String leadDepartmen) {
		this.leadDepartmen = leadDepartmen;
	}

	public String getHeadOfLeader() {
		return headOfLeader;
	}

	public void setHeadOfLeader(String headOfLeader) {
		this.headOfLeader = headOfLeader;
	}

	public String getLeaderPhone() {
		return leaderPhone;
	}

	public void setLeaderPhone(String leaderPhone) {
		this.leaderPhone = leaderPhone;
	}

	public String getLeaderEmailAddress() {
		return leaderEmailAddress;
	}

	public void setLeaderEmailAddress(String leaderEmailAddress) {
		this.leaderEmailAddress = leaderEmailAddress;
	}

	public String getPhysicalArea() {
		return physicalArea;
	}

	public void setPhysicalArea(String physicalArea) {
		this.physicalArea = physicalArea;
	}

	public String getPhysicalLocation() {
		return physicalLocation;
	}

	public void setPhysicalLocation(String physicalLocation) {
		this.physicalLocation = physicalLocation;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
}
