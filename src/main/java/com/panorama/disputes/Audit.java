package com.panorama.disputes;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Audit")
public class Audit implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("userCreation")
   private java.lang.String userCreation;
   @org.kie.api.definition.type.Label("timeCreation")
   private String timeCreation;
   @org.kie.api.definition.type.Label("timeModification")
   private String timeModification;

   public Audit()
   {
   }

   public java.lang.String getUserCreation()
   {
      return this.userCreation;
   }

   public void setUserCreation(java.lang.String userCreation)
   {
      this.userCreation = userCreation;
   }

   public java.lang.String getTimeCreation()
   {
      return this.timeCreation;
   }

   public void setTimeCreation(java.lang.String timeCreation)
   {
      this.timeCreation = timeCreation;
   }

   public java.lang.String getTimeModification()
   {
      return this.timeModification;
   }

   public void setTimeModification(java.lang.String timeModification)
   {
      this.timeModification = timeModification;
   }

   public Audit(java.lang.String userCreation, java.lang.String timeCreation,
         java.lang.String timeModification)
   {
      this.userCreation = userCreation;
      this.timeCreation = timeCreation;
      this.timeModification = timeModification;
   }

}