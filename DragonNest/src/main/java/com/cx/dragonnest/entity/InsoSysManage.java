package com.cx.dragonnest.entity;

import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 纳管系统表 inso_sys_manage
 * 
 * @author insocp
 * @date 2023-04-19
 */
@TableName(value = "inso_sys_manage")
public class InsoSysManage
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long systemId;

    /** 系统编码 */
//    @Excel(name = "系统编码")
    private String systemCode;

    /** 系统名称 */
//    @Excel(name = "系统名称")
    private String systemName;

    /** 系统名称 */
//    @Excel(name = "系统描述")
    private String systemDetail;


    /** 上线时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
//    @Excel(name = "上线时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date onlineTime;

    /** 运行状态1.正常 */
//    @Excel(name = "运行状态1.正常")
    private String validFlag;

    /** 归属域 */
//    @Excel(name = "归属域")
    private String belongLand;

    /** 系统类型 */
//    @Excel(name = "系统类型")
    private Long systemType;

    /** 支撑厂家 */
//    @Excel(name = "支撑厂家")
    private String supportFactory;

    /** 系统主管 */
//    @Excel(name = "系统主管")
    private String systemManager;

    /** 文档组 */
//    @Excel(name = "文档组")
    private String documentGroup;

    /** 定级备案系统 */
//    @Excel(name = "定级备案系统")
    private String scoreRecordSystem;

    /** 定级备案时间 */
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    @Excel(name = "定级备案时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date scoreRecordTime;

    /** 安全扫描时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
//    @Excel(name = "安全扫描时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date safeScanTime;

    /** 安全检测进度 */
//    @Excel(name = "安全检测进度")
    private String safeCheckProgress;

    /** 是否核心系统1.是 */
//    @Excel(name = "是否核心系统1.是")
    private String coreSystem;

    /** 影响范围 */
//    @Excel(name = "影响范围")
    private String influenceScope;

    @JsonFormat(pattern = "yyyy-MM-dd")
//    @Excel(name = "下线时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date offlineTime;
//    @Excel(name = "系统证书")
    private String systemCertificate;

    @JsonFormat(pattern = "yyyy-MM-dd")
//    @Excel(name = "系统证书过期时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date systemCertificateExpiryTime;

    public void setSystemId(Long systemId) 
    {
        this.systemId = systemId;
    }

    public Long getSystemId() 
    {
        return systemId;
    }
    public void setSystemCode(String systemCode) 
    {
        this.systemCode = systemCode;
    }

    public String getSystemCode() 
    {
        return systemCode;
    }
    public void setSystemName(String systemName) 
    {
        this.systemName = systemName;
    }

    public String getSystemName() 
    {
        return systemName;
    }
    public void setOnlineTime(Date onlineTime) 
    {
        this.onlineTime = onlineTime;
    }

    public String getSystemDetail()
    {
        return systemDetail;
    }
    public void setSystemDetail(String systemDetail)
    {
        this.systemDetail = systemDetail;
    }

    public Date getOnlineTime() 
    {
        return onlineTime;
    }
    public void setValidFlag(String validFlag) 
    {
        this.validFlag = validFlag;
    }

    public String getValidFlag() 
    {
        return validFlag;
    }
    public void setBelongLand(String belongLand) 
    {
        this.belongLand = belongLand;
    }

    public String getBelongLand() 
    {
        return belongLand;
    }
    public void setSystemType(Long systemType) 
    {
        this.systemType = systemType;
    }

    public Long getSystemType() 
    {
        return systemType;
    }
    public void setSupportFactory(String supportFactory) 
    {
        this.supportFactory = supportFactory;
    }

    public String getSupportFactory() 
    {
        return supportFactory;
    }
    public void setSystemManager(String systemManager) 
    {
        this.systemManager = systemManager;
    }

    public String getSystemManager() 
    {
        return systemManager;
    }
    public void setDocumentGroup(String documentGroup) 
    {
        this.documentGroup = documentGroup;
    }

    public String getDocumentGroup() 
    {
        return documentGroup;
    }
    public void setScoreRecordSystem(String scoreRecordSystem) 
    {
        this.scoreRecordSystem = scoreRecordSystem;
    }

    public String getScoreRecordSystem() 
    {
        return scoreRecordSystem;
    }
    public void setScoreRecordTime(Date scoreRecordTime) 
    {
        this.scoreRecordTime = scoreRecordTime;
    }

    public Date getScoreRecordTime() 
    {
        return scoreRecordTime;
    }
    public void setSafeScanTime(Date safeScanTime) 
    {
        this.safeScanTime = safeScanTime;
    }

    public Date getSafeScanTime() 
    {
        return safeScanTime;
    }
    public void setSafeCheckProgress(String safeCheckProgress) 
    {
        this.safeCheckProgress = safeCheckProgress;
    }

    public String getSafeCheckProgress() 
    {
        return safeCheckProgress;
    }
    public void setCoreSystem(String coreSystem) 
    {
        this.coreSystem = coreSystem;
    }

    public String getCoreSystem() 
    {
        return coreSystem;
    }
    public void setInfluenceScope(String influenceScope) 
    {
        this.influenceScope = influenceScope;
    }

    public String getInfluenceScope() 
    {
        return influenceScope;
    }

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public String getSystemCertificate() {
        return systemCertificate;
    }

    public void setSystemCertificate(String systemCertificate) {
        this.systemCertificate = systemCertificate;
    }

    public Date getSystemCertificateExpiryTime() {
        return systemCertificateExpiryTime;
    }

    public void setSystemCertificateExpiryTime(Date systemCertificateExpiryTime) {
        this.systemCertificateExpiryTime = systemCertificateExpiryTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("systemId", getSystemId())
            .append("systemCode", getSystemCode())
            .append("systemName", getSystemName())
            .append("onlineTime", getOnlineTime())
            .append("validFlag", getValidFlag())
            .append("belongLand", getBelongLand())
            .append("systemType", getSystemType())
            .append("supportFactory", getSupportFactory())
            .append("systemManager", getSystemManager())
            .append("documentGroup", getDocumentGroup())
            .append("scoreRecordSystem", getScoreRecordSystem())
            .append("scoreRecordTime", getScoreRecordTime())
            .append("safeScanTime", getSafeScanTime())
            .append("safeCheckProgress", getSafeCheckProgress())
            .append("coreSystem", getCoreSystem())
            .append("influenceScope", getInfluenceScope())
            .append("offLineTime", getOfflineTime())
            .append("systemCertificate", getSystemCertificate())
            .append("systemCertificateExpiryTime", getSystemCertificateExpiryTime())
            .toString();
    }
}
