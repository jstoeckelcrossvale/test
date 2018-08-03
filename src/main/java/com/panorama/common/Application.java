package com.panorama.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Application implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("applicationNumber")
   private java.lang.String applicationNumber;
   @org.kie.api.definition.type.Label("customerNumber")
   private java.lang.String customerNumber;
   @org.kie.api.definition.type.Label("identity")
   private Identity identity;

   @org.kie.api.definition.type.Label(value = "contactInfo")
   private com.panorama.common.ContactInfo contactInfo;

   @org.kie.api.definition.type.Label(value = "fund")
   private com.panorama.common.Fund fund;

   public Application()
   {
   }

   public java.lang.String getApplicationNumber()
   {
      return this.applicationNumber;
   }

   public void setApplicationNumber(java.lang.String applicationNumber)
   {
      this.applicationNumber = applicationNumber;
   }

   public java.lang.String getCustomerNumber()
   {
      return this.customerNumber;
   }

   public void setCustomerNumber(java.lang.String customerNumber)
   {
      this.customerNumber = customerNumber;
   }

   public com.panorama.common.Identity getIdentity()
   {
      return this.identity;
   }

   public void setIdentity(com.panorama.common.Identity identity)
   {
      this.identity = identity;
   }

   public com.panorama.common.ContactInfo getContactInfo()
   {
      return this.contactInfo;
   }

   public void setContactInfo(com.panorama.common.ContactInfo contactInfo)
   {
      this.contactInfo = contactInfo;
   }

   public com.panorama.common.Fund getFund()
   {
      return this.fund;
   }

   public void setFund(com.panorama.common.Fund fund)
   {
      this.fund = fund;
   }

   public Application(java.lang.String applicationNumber,
         java.lang.String customerNumber,
         com.panorama.common.Identity identity,
         com.panorama.common.ContactInfo contactInfo,
         com.panorama.common.Fund fund)
   {
      this.applicationNumber = applicationNumber;
      this.customerNumber = customerNumber;
      this.identity = identity;
      this.contactInfo = contactInfo;
      this.fund = fund;
   }

}