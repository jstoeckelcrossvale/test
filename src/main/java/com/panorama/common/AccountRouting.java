package com.panorama.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AccountRouting implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("scheme")
   private java.lang.String scheme;
   @org.kie.api.definition.type.Label("address")
   private java.lang.String address;

   public AccountRouting()
   {
   }

   public java.lang.String getScheme()
   {
      return this.scheme;
   }

   public void setScheme(java.lang.String scheme)
   {
      this.scheme = scheme;
   }

   public java.lang.String getAddress()
   {
      return this.address;
   }

   public void setAddress(java.lang.String address)
   {
      this.address = address;
   }

   public AccountRouting(java.lang.String scheme, java.lang.String address)
   {
      this.scheme = scheme;
      this.address = address;
   }

}