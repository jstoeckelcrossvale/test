package com.panorama.disputes;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("TransactionOwnAccount")
public class TransactionOwnAccount implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "id")
   private java.lang.String id;
   @org.kie.api.definition.type.Label(value = "bank_routing")
   private com.panorama.disputes.AccountRouting bank_routing;
   @org.kie.api.definition.type.Label(value = "account_routing")
   private com.panorama.disputes.AccountRouting account_routing;
   @org.kie.api.definition.type.Label(value = "holders")
   private java.util.List<com.panorama.disputes.Holder> holders;

   public TransactionOwnAccount()
   {
   }

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public com.panorama.disputes.AccountRouting getBank_routing()
   {
      return this.bank_routing;
   }

   public void setBank_routing(
         com.panorama.disputes.AccountRouting bank_routing)
   {
      this.bank_routing = bank_routing;
   }

   public com.panorama.disputes.AccountRouting getAccount_routing()
   {
      return this.account_routing;
   }

   public void setAccount_routing(
         com.panorama.disputes.AccountRouting account_routing)
   {
      this.account_routing = account_routing;
   }

   public java.util.List<com.panorama.disputes.Holder> getHolders()
   {
      return this.holders;
   }

   public void setHolders(
         java.util.List<com.panorama.disputes.Holder> holders)
   {
      this.holders = holders;
   }

   public TransactionOwnAccount(java.lang.String id,
         com.panorama.disputes.AccountRouting bank_routing,
         com.panorama.disputes.AccountRouting account_routing,
         java.util.List<com.panorama.disputes.Holder> holders)
   {
      this.id = id;
      this.bank_routing = bank_routing;
      this.account_routing = account_routing;
      this.holders = holders;
   }

}