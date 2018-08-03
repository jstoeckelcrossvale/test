package com.panorama.disputes;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Transaction")
public class Transaction implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("ticketNumber")
   private java.lang.String ticketNumber;
   @org.kie.api.definition.type.Label("id")
   private java.lang.String id;

   @org.kie.api.definition.type.Label("other_account")
   private TransactionOtherAccount other_account;

   @org.kie.api.definition.type.Label("this_account")
   private com.panorama.disputes.TransactionOwnAccount this_account;

   @org.kie.api.definition.type.Label("details")
   private com.panorama.disputes.TransactionDetails details;

   @org.kie.api.definition.type.Label("metadata")
   private com.panorama.disputes.TransactionMetadata metadata;

   @org.kie.api.definition.type.Label(value = "entities")
   private java.util.List<com.panorama.disputes.Entity> entities;

   public Transaction()
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

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public com.panorama.disputes.TransactionOtherAccount getOther_account()
   {
      return this.other_account;
   }

   public void setOther_account(
         com.panorama.disputes.TransactionOtherAccount other_account)
   {
      this.other_account = other_account;
   }

   public com.panorama.disputes.TransactionOwnAccount getThis_account()
   {
      return this.this_account;
   }

   public void setThis_account(
         com.panorama.disputes.TransactionOwnAccount this_account)
   {
      this.this_account = this_account;
   }

   public com.panorama.disputes.TransactionDetails getDetails()
   {
      return this.details;
   }

   public void setDetails(com.panorama.disputes.TransactionDetails details)
   {
      this.details = details;
   }

   public com.panorama.disputes.TransactionMetadata getMetadata()
   {
      return this.metadata;
   }

   public void setMetadata(com.panorama.disputes.TransactionMetadata metadata)
   {
      this.metadata = metadata;
   }

   public java.util.List<com.panorama.disputes.Entity> getEntities()
   {
      return this.entities;
   }

   public void setEntities(
         java.util.List<com.panorama.disputes.Entity> entities)
   {
      this.entities = entities;
   }

   public Transaction(java.lang.String ticketNumber, java.lang.String id,
         com.panorama.disputes.TransactionOtherAccount other_account,
         com.panorama.disputes.TransactionOwnAccount this_account,
         com.panorama.disputes.TransactionDetails details,
         com.panorama.disputes.TransactionMetadata metadata,
         java.util.List<com.panorama.disputes.Entity> entities)
   {
      this.ticketNumber = ticketNumber;
      this.id = id;
      this.other_account = other_account;
      this.this_account = this_account;
      this.details = details;
      this.metadata = metadata;
      this.entities = entities;
   }

}