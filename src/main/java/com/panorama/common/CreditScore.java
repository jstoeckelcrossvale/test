package com.panorama.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CreditScore implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "rating")
   private java.lang.String rating;
   @org.kie.api.definition.type.Label(value = "score")
   private java.lang.Integer score;

   public CreditScore()
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

   public java.lang.Integer getScore()
   {
      return this.score;
   }

   public void setScore(java.lang.Integer score)
   {
      this.score = score;
   }

   public CreditScore(java.lang.String rating, java.lang.Integer score)
   {
      this.rating = rating;
      this.score = score;
   }

}