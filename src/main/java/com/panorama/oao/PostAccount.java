package com.panorama.oao;

import com.panorama.common.AccountRouting;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PostAccount implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("customerNumber")
   private java.lang.String customerNumber;
   @org.kie.api.definition.type.Label("label")
   private java.lang.String label;
   @org.kie.api.definition.type.Label("type")
   private java.lang.String type;
   @org.kie.api.definition.type.Label("branch_id")
   private java.lang.String branch_id;

   @org.kie.api.definition.type.Label("balance")
   private com.panorama.common.Balance balance;

   @org.kie.api.definition.type.Label("account_routing")
   private AccountRouting account_routing;

   public PostAccount()
   {
   }

   public java.lang.String getCustomerNumber()
   {
      return this.customerNumber;
   }

   public void setCustomerNumber(java.lang.String customerNumber)
   {
      this.customerNumber = customerNumber;
   }

   public java.lang.String getLabel()
   {
      return this.label;
   }

   public void setLabel(java.lang.String label)
   {
      this.label = label;
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public java.lang.String getBranch_id()
   {
      return this.branch_id;
   }

   public void setBranch_id(java.lang.String branch_id)
   {
      this.branch_id = branch_id;
   }

   public com.panorama.common.Balance getBalance()
   {
      return this.balance;
   }

   public void setBalance(com.panorama.common.Balance balance)
   {
      this.balance = balance;
   }

   public com.panorama.common.AccountRouting getAccount_routing()
   {
      return this.account_routing;
   }

   public void setAccount_routing(
         com.panorama.common.AccountRouting account_routing)
   {
      this.account_routing = account_routing;
   }

   public PostAccount(java.lang.String customerNumber, java.lang.String label,
         java.lang.String type, java.lang.String branch_id,
         com.panorama.common.Balance balance,
         com.panorama.common.AccountRouting account_routing)
   {
      this.customerNumber = customerNumber;
      this.label = label;
      this.type = type;
      this.branch_id = branch_id;
      this.balance = balance;
      this.account_routing = account_routing;
   }

}