package com.panorama.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CreditRating implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("rating")
   private java.lang.String rating;
   @org.kie.api.definition.type.Label("source")
   private java.lang.String source;

   public CreditRating()
   {
   }

   public java.lang.String getRating()
   {
      return this.rating;
   }

   public void setRating(java.lang.String rating)
   {
      this.rating = rating;
   }

   public java.lang.String getSource()
   {
      return this.source;
   }

   public void setSource(java.lang.String source)
   {
      this.source = source;
   }

   public CreditRating(java.lang.String rating, java.lang.String source)
   {
      this.rating = rating;
      this.source = source;
   }

}