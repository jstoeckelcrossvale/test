package com.panorama.crosssale;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CrossSale implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "checkingCrossSale")
   private java.lang.Boolean checkingCrossSale;
   @org.kie.api.definition.type.Label(value = "creditCardCrossale")
   private java.lang.Boolean creditCardCrossSale;
   @org.kie.api.definition.type.Label(value = "loanCrossSale")
   private java.lang.Boolean loanCrossSale;
   @org.kie.api.definition.type.Label(value = "savingsCrossSale")
   private java.lang.Boolean savingsCrossSale;
   @org.kie.api.definition.type.Label(value = "creditScore")
   private java.lang.Integer creditScore;
   @org.kie.api.definition.type.Label(value = "hasChecking")
   private java.lang.Boolean hasChecking;
   @org.kie.api.definition.type.Label(value = "hasCreditCard")
   private java.lang.Boolean hasCreditCard;
   @org.kie.api.definition.type.Label(value = "hasSavings")
   private java.lang.Boolean hasSavings;
   @org.kie.api.definition.type.Label(value = "hasLoan")
   private java.lang.Boolean hasLoan;
   @org.kie.api.definition.type.Label(value = "rating")
   private java.lang.String rating;

   public CrossSale()
   {
   }

   public java.lang.Boolean getCheckingCrossSale()
   {
      return this.checkingCrossSale;
   }

   public void setCheckingCrossSale(java.lang.Boolean checkingCrossSale)
   {
      this.checkingCrossSale = checkingCrossSale;
   }

   public java.lang.Boolean getCreditCardCrossSale()
   {
      return this.creditCardCrossSale;
   }

   public void setCreditCardCrossSale(java.lang.Boolean creditCardCrossSale)
   {
      this.creditCardCrossSale = creditCardCrossSale;
   }

   public java.lang.Boolean getLoanCrossSale()
   {
      return this.loanCrossSale;
   }

   public void setLoanCrossSale(java.lang.Boolean loanCrossSale)
   {
      this.loanCrossSale = loanCrossSale;
   }

   public java.lang.Boolean getSavingsCrossSale()
   {
      return this.savingsCrossSale;
   }

   public void setSavingsCrossSale(java.lang.Boolean savingsCrossSale)
   {
      this.savingsCrossSale = savingsCrossSale;
   }

   public java.lang.Integer getCreditScore()
   {
      return this.creditScore;
   }

   public void setCreditScore(java.lang.Integer creditScore)
   {
      this.creditScore = creditScore;
   }

   public java.lang.Boolean getHasChecking()
   {
      return this.hasChecking;
   }

   public void setHasChecking(java.lang.Boolean hasChecking)
   {
      this.hasChecking = hasChecking;
   }

   public java.lang.Boolean getHasCreditCard()
   {
      return this.hasCreditCard;
   }

   public void setHasCreditCard(java.lang.Boolean hasCreditCard)
   {
      this.hasCreditCard = hasCreditCard;
   }

   public java.lang.Boolean getHasSavings()
   {
      return this.hasSavings;
   }

   public void setHasSavings(java.lang.Boolean hasSavings)
   {
      this.hasSavings = hasSavings;
   }

   public java.lang.Boolean getHasLoan()
   {
      return this.hasLoan;
   }

   public void setHasLoan(java.lang.Boolean hasLoan)
   {
      this.hasLoan = hasLoan;
   }

   public java.lang.String getRating()
   {
      return this.rating;
   }

   public void setRating(java.lang.String rating)
   {
      this.rating = rating;
   }

   public CrossSale(java.lang.Boolean checkingCrossSale,
         java.lang.Boolean creditCardCrossSale,
         java.lang.Boolean loanCrossSale,
         java.lang.Boolean savingsCrossSale, java.lang.Integer creditScore,
         java.lang.Boolean hasChecking, java.lang.Boolean hasCreditCard,
         java.lang.Boolean hasSavings, java.lang.Boolean hasLoan,
         java.lang.String rating)
   {
      this.checkingCrossSale = checkingCrossSale;
      this.creditCardCrossSale = creditCardCrossSale;
      this.loanCrossSale = loanCrossSale;
      this.savingsCrossSale = savingsCrossSale;
      this.creditScore = creditScore;
      this.hasChecking = hasChecking;
      this.hasCreditCard = hasCreditCard;
      this.hasSavings = hasSavings;
      this.hasLoan = hasLoan;
      this.rating = rating;
   }

}