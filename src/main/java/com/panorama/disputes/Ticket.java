package com.panorama.disputes;

import java.util.Date;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Ticket")
public class Ticket implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("ticketNumber")
   private java.lang.String ticketNumber;
   @org.kie.api.definition.type.Label("narrative")
   private java.lang.String narrative;
   @org.kie.api.definition.type.Label("complaintFlag")
   private java.lang.String complaintFlag;

   @org.kie.api.definition.type.Label("approvalFlag")
   private java.lang.String approvalFlag;

   @org.kie.api.definition.type.Label("securityLevelCode")
   private java.lang.String securityLevelCode;

   @org.kie.api.definition.type.Label("createdDate")
   private String createdDate;

   @org.kie.api.definition.type.Label("receivedDate")
   private String receivedDate;

   @org.kie.api.definition.type.Label("assignTo")
   private com.panorama.disputes.AssignTo assignTo;

   @org.kie.api.definition.type.Label("audit")
   private com.panorama.disputes.Audit audit;

   @org.kie.api.definition.type.Label("category")
   private com.panorama.disputes.CodeValue category;

   @org.kie.api.definition.type.Label("item")
   private com.panorama.disputes.CodeValue item;

   @org.kie.api.definition.type.Label("status")
   private com.panorama.disputes.CodeValue status;

   @org.kie.api.definition.type.Label("severity")
   private com.panorama.disputes.CodeValue severity;

   @org.kie.api.definition.type.Label("priority")
   private com.panorama.disputes.CodeValue priority;

   @org.kie.api.definition.type.Label("originator")
   private com.panorama.disputes.Originator originator;

   @org.kie.api.definition.type.Label("requestor")
   private com.panorama.disputes.Requestor requestor;

   @org.kie.api.definition.type.Label("contactMethod")
   private com.panorama.disputes.ContactMethod contactMethod;

   @org.kie.api.definition.type.Label("classification")
   private com.panorama.disputes.Classification classification;

   @org.kie.api.definition.type.Label("transactionList")
   private java.util.List<com.panorama.disputes.Transaction> transactionList;

   @org.kie.api.definition.type.Label("attributeList")
   private java.util.List<com.panorama.disputes.Attribute> attributeList;

   @org.kie.api.definition.type.Label("attachmentList")
   private java.util.List<com.panorama.disputes.Attachment> attachmentList;

   @org.kie.api.definition.type.Label("actionList")
   private java.util.List<com.panorama.disputes.Action> actionList;

   @org.kie.api.definition.type.Label("taskList")
   private java.util.List<com.panorama.disputes.Task> taskList;

   @org.kie.api.definition.type.Label(value = "sla")
   private java.lang.String sla;

   public Ticket()
   {
   }

   public java.lang.String getTicketNumber()
   {
      return this.ticketNumber;
   }

   public void setTicketNumber(java.lang.String ticketNumber)
   {
      this.ticketNumber = ticketNumber;
   }

   public java.lang.String getNarrative()
   {
      return this.narrative;
   }

   public void setNarrative(java.lang.String narrative)
   {
      this.narrative = narrative;
   }

   public java.lang.String getComplaintFlag()
   {
      return this.complaintFlag;
   }

   public void setComplaintFlag(java.lang.String complaintFlag)
   {
      this.complaintFlag = complaintFlag;
   }

   public java.lang.String getApprovalFlag()
   {
      return this.approvalFlag;
   }

   public void setApprovalFlag(java.lang.String approvalFlag)
   {
      this.approvalFlag = approvalFlag;
   }

   public java.lang.String getSecurityLevelCode()
   {
      return this.securityLevelCode;
   }

   public void setSecurityLevelCode(java.lang.String securityLevelCode)
   {
      this.securityLevelCode = securityLevelCode;
   }

   public com.panorama.disputes.AssignTo getAssignTo()
   {
      return this.assignTo;
   }

   public void setAssignTo(com.panorama.disputes.AssignTo assignTo)
   {
      this.assignTo = assignTo;
   }

   public com.panorama.disputes.Audit getAudit()
   {
      return this.audit;
   }

   public void setAudit(com.panorama.disputes.Audit audit)
   {
      this.audit = audit;
   }

   public com.panorama.disputes.CodeValue getCategory()
   {
      return this.category;
   }

   public void setCategory(com.panorama.disputes.CodeValue category)
   {
      this.category = category;
   }

   public com.panorama.disputes.CodeValue getItem()
   {
      return this.item;
   }

   public void setItem(com.panorama.disputes.CodeValue item)
   {
      this.item = item;
   }

   public com.panorama.disputes.CodeValue getStatus()
   {
      return this.status;
   }

   public void setStatus(com.panorama.disputes.CodeValue status)
   {
      this.status = status;
   }

   public com.panorama.disputes.CodeValue getSeverity()
   {
      return this.severity;
   }

   public void setSeverity(com.panorama.disputes.CodeValue severity)
   {
      this.severity = severity;
   }

   public com.panorama.disputes.CodeValue getPriority()
   {
      return this.priority;
   }

   public void setPriority(com.panorama.disputes.CodeValue priority)
   {
      this.priority = priority;
   }

   public com.panorama.disputes.Originator getOriginator()
   {
      return this.originator;
   }

   public void setOriginator(com.panorama.disputes.Originator originator)
   {
      this.originator = originator;
   }

   public com.panorama.disputes.Requestor getRequestor()
   {
      return this.requestor;
   }

   public void setRequestor(com.panorama.disputes.Requestor requestor)
   {
      this.requestor = requestor;
   }

   public com.panorama.disputes.ContactMethod getContactMethod()
   {
      return this.contactMethod;
   }

   public void setContactMethod(
         com.panorama.disputes.ContactMethod contactMethod)
   {
      this.contactMethod = contactMethod;
   }

   public com.panorama.disputes.Classification getClassification()
   {
      return this.classification;
   }

   public void setClassification(
         com.panorama.disputes.Classification classification)
   {
      this.classification = classification;
   }

   public java.util.List<com.panorama.disputes.Transaction> getTransactionList()
   {
      return this.transactionList;
   }

   public void setTransactionList(
         java.util.List<com.panorama.disputes.Transaction> transactionList)
   {
      this.transactionList = transactionList;
   }

   public java.util.List<com.panorama.disputes.Attribute> getAttributeList()
   {
      return this.attributeList;
   }

   public void setAttributeList(
         java.util.List<com.panorama.disputes.Attribute> attributeList)
   {
      this.attributeList = attributeList;
   }

   public java.util.List<com.panorama.disputes.Attachment> getAttachmentList()
   {
      return this.attachmentList;
   }

   public void setAttachmentList(
         java.util.List<com.panorama.disputes.Attachment> attachmentList)
   {
      this.attachmentList = attachmentList;
   }

   public java.util.List<com.panorama.disputes.Action> getActionList()
   {
      return this.actionList;
   }

   public void setActionList(
         java.util.List<com.panorama.disputes.Action> actionList)
   {
      this.actionList = actionList;
   }

   public java.util.List<com.panorama.disputes.Task> getTaskList()
   {
      return this.taskList;
   }

   public void setTaskList(java.util.List<com.panorama.disputes.Task> taskList)
   {
      this.taskList = taskList;
   }

   public java.lang.String getCreatedDate()
   {
      return this.createdDate;
   }

   public void setCreatedDate(java.lang.String createdDate)
   {
      this.createdDate = createdDate;
   }

   public java.lang.String getReceivedDate()
   {
      return this.receivedDate;
   }

   public void setReceivedDate(java.lang.String receivedDate)
   {
      this.receivedDate = receivedDate;
   }

   public java.lang.String getSla()
   {
      return this.sla;
   }

   public void setSla(java.lang.String sla)
   {
      this.sla = sla;
   }

   public Ticket(java.lang.String ticketNumber, java.lang.String narrative,
         java.lang.String complaintFlag, java.lang.String approvalFlag,
         java.lang.String securityLevelCode, java.lang.String createdDate,
         java.lang.String receivedDate,
         com.panorama.disputes.AssignTo assignTo,
         com.panorama.disputes.Audit audit,
         com.panorama.disputes.CodeValue category,
         com.panorama.disputes.CodeValue item,
         com.panorama.disputes.CodeValue status,
         com.panorama.disputes.CodeValue severity,
         com.panorama.disputes.CodeValue priority,
         com.panorama.disputes.Originator originator,
         com.panorama.disputes.Requestor requestor,
         com.panorama.disputes.ContactMethod contactMethod,
         com.panorama.disputes.Classification classification,
         java.util.List<com.panorama.disputes.Transaction> transactionList,
         java.util.List<com.panorama.disputes.Attribute> attributeList,
         java.util.List<com.panorama.disputes.Attachment> attachmentList,
         java.util.List<com.panorama.disputes.Action> actionList,
         java.util.List<com.panorama.disputes.Task> taskList,
         java.lang.String sla)
   {
      this.ticketNumber = ticketNumber;
      this.narrative = narrative;
      this.complaintFlag = complaintFlag;
      this.approvalFlag = approvalFlag;
      this.securityLevelCode = securityLevelCode;
      this.createdDate = createdDate;
      this.receivedDate = receivedDate;
      this.assignTo = assignTo;
      this.audit = audit;
      this.category = category;
      this.item = item;
      this.status = status;
      this.severity = severity;
      this.priority = priority;
      this.originator = originator;
      this.requestor = requestor;
      this.contactMethod = contactMethod;
      this.classification = classification;
      this.transactionList = transactionList;
      this.attributeList = attributeList;
      this.attachmentList = attachmentList;
      this.actionList = actionList;
      this.taskList = taskList;
      this.sla = sla;
   }

}