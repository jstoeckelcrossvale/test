package com.panorama.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Task implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "taskNumber")
   private java.lang.String taskNumber;
   @org.kie.api.definition.type.Label(value = "ticketNumber")
   private java.lang.String ticketNumber;
   @org.kie.api.definition.type.Label(value = "taskCode")
   private java.lang.String taskCode;
   @org.kie.api.definition.type.Label(value = "customData")
   private java.lang.String customData;
   @org.kie.api.definition.type.Label(value = "slaDate")
   private java.lang.String slaDate;
   @org.kie.api.definition.type.Label(value = "taskBpm")
   private java.lang.String taskBpm;
   @org.kie.api.definition.type.Label(value = "createdDate")
   private java.lang.String createdDate;
   @org.kie.api.definition.type.Label(value = "status")
   private com.panorama.common.CodeValue status;
   @org.kie.api.definition.type.Label(value = "assignTo")
   private com.panorama.common.AssignTo assignTo;
   @org.kie.api.definition.type.Label(value = "slaStatus")
   private com.panorama.common.CodeValue slaStatus;
   @org.kie.api.definition.type.Label(value = "audit")
   private com.panorama.common.Audit audit;

   public Task()
   {
   }

   public java.lang.String getTaskNumber()
   {
      return this.taskNumber;
   }

   public void setTaskNumber(java.lang.String taskNumber)
   {
      this.taskNumber = taskNumber;
   }

   public java.lang.String getTicketNumber()
   {
      return this.ticketNumber;
   }

   public void setTicketNumber(java.lang.String ticketNumber)
   {
      this.ticketNumber = ticketNumber;
   }

   public java.lang.String getTaskCode()
   {
      return this.taskCode;
   }

   public void setTaskCode(java.lang.String taskCode)
   {
      this.taskCode = taskCode;
   }

   public java.lang.String getCustomData()
   {
      return this.customData;
   }

   public void setCustomData(java.lang.String customData)
   {
      this.customData = customData;
   }

   public java.lang.String getSlaDate()
   {
      return this.slaDate;
   }

   public void setSlaDate(java.lang.String slaDate)
   {
      this.slaDate = slaDate;
   }

   public java.lang.String getTaskBpm()
   {
      return this.taskBpm;
   }

   public void setTaskBpm(java.lang.String taskBpm)
   {
      this.taskBpm = taskBpm;
   }

   public java.lang.String getCreatedDate()
   {
      return this.createdDate;
   }

   public void setCreatedDate(java.lang.String createdDate)
   {
      this.createdDate = createdDate;
   }

   public com.panorama.common.CodeValue getStatus()
   {
      return this.status;
   }

   public void setStatus(com.panorama.common.CodeValue status)
   {
      this.status = status;
   }

   public com.panorama.common.AssignTo getAssignTo()
   {
      return this.assignTo;
   }

   public void setAssignTo(com.panorama.common.AssignTo assignTo)
   {
      this.assignTo = assignTo;
   }

   public com.panorama.common.CodeValue getSlaStatus()
   {
      return this.slaStatus;
   }

   public void setSlaStatus(com.panorama.common.CodeValue slaStatus)
   {
      this.slaStatus = slaStatus;
   }

   public com.panorama.common.Audit getAudit()
   {
      return this.audit;
   }

   public void setAudit(com.panorama.common.Audit audit)
   {
      this.audit = audit;
   }

   public Task(java.lang.String taskNumber, java.lang.String ticketNumber,
         java.lang.String taskCode, java.lang.String customData,
         java.lang.String slaDate, java.lang.String taskBpm,
         java.lang.String createdDate,
         com.panorama.common.CodeValue status,
         com.panorama.common.AssignTo assignTo,
         com.panorama.common.CodeValue slaStatus,
         com.panorama.common.Audit audit)
   {
      this.taskNumber = taskNumber;
      this.ticketNumber = ticketNumber;
      this.taskCode = taskCode;
      this.customData = customData;
      this.slaDate = slaDate;
      this.taskBpm = taskBpm;
      this.createdDate = createdDate;
      this.status = status;
      this.assignTo = assignTo;
      this.slaStatus = slaStatus;
      this.audit = audit;
   }

}