package com.panorama.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Fund implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "acctActiviy")
   private java.util.List<java.lang.String> acctActivity;
   @org.kie.api.definition.type.Label(value = "occupation")
   private java.lang.String occupation;
   @org.kie.api.definition.type.Label(value = "sourceOfIncome")
   private java.lang.String sourceOfIncome;
   @org.kie.api.definition.type.Label(value = "account")
   private java.lang.String account;
   @org.kie.api.definition.type.Label(value = "amount")
   private java.lang.Double amount;

   public Fund()
   {
   }

   public java.util.List<java.lang.String> getAcctActivity()
   {
      return this.acctActivity;
   }

   public void setAcctActivity(java.util.List<java.lang.String> acctActivity)
   {
      this.acctActivity = acctActivity;
   }

   public java.lang.String getOccupation()
   {
      return this.occupation;
   }

   public void setOccupation(java.lang.String occupation)
   {
      this.occupation = occupation;
   }

   public java.lang.String getSourceOfIncome()
   {
      return this.sourceOfIncome;
   }

   public void setSourceOfIncome(java.lang.String sourceOfIncome)
   {
      this.sourceOfIncome = sourceOfIncome;
   }

   public java.lang.String getAccount()
   {
      return this.account;
   }

   public void setAccount(java.lang.String account)
   {
      this.account = account;
   }

   public java.lang.Double getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Double amount)
   {
      this.amount = amount;
   }

   public Fund(java.util.List<java.lang.String> acctActivity,
         java.lang.String occupation, java.lang.String sourceOfIncome,
         java.lang.String account, java.lang.Double amount)
   {
      this.acctActivity = acctActivity;
      this.occupation = occupation;
      this.sourceOfIncome = sourceOfIncome;
      this.account = account;
      this.amount = amount;
   }

}