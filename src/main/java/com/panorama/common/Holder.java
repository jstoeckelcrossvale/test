package com.panorama.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Holder implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label(value = "is_alias")
   private java.lang.Boolean is_alias;
   @org.kie.api.definition.type.Label(value = "alias")
   private java.lang.String alias;

   public Holder()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.Boolean getIs_alias()
   {
      return this.is_alias;
   }

   public void setIs_alias(java.lang.Boolean is_alias)
   {
      this.is_alias = is_alias;
   }

   public java.lang.String getAlias()
   {
      return this.alias;
   }

   public void setAlias(java.lang.String alias)
   {
      this.alias = alias;
   }

   public Holder(java.lang.String name, java.lang.Boolean is_alias,
         java.lang.String alias)
   {
      this.name = name;
      this.is_alias = is_alias;
      this.alias = alias;
   }

}