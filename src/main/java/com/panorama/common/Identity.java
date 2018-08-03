package com.panorama.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Identity implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "accountType")
   private java.lang.String accountType;
   @org.kie.api.definition.type.Label(value = "accountName")
   private java.lang.String accountName;
   @org.kie.api.definition.type.Label(value = "firstName")
   private java.lang.String firstName;
   @org.kie.api.definition.type.Label(value = "middleInitial")
   private java.lang.String middleInitial;
   @org.kie.api.definition.type.Label(value = "lastName")
   private java.lang.String lastName;
   @org.kie.api.definition.type.Label(value = "suffix")
   private java.lang.String suffix;
   @org.kie.api.definition.type.Label(value = "dateOfBirth")
   private java.lang.String dateOfBirth;
   @org.kie.api.definition.type.Label(value = "ssn")
   private java.lang.String ssn;
   @org.kie.api.definition.type.Label(value = "citizenFlag")
   private java.lang.String citizenFlag;
   @org.kie.api.definition.type.Label(value = "idType")
   private java.lang.String idType;
   @org.kie.api.definition.type.Label(value = "idNumber")
   private java.lang.String idNumber;
   @org.kie.api.definition.type.Label(value = "issuedLocation")
   private java.lang.String issuedLocation;
   @org.kie.api.definition.type.Label(value = "issuedDate")
   private java.lang.String issuedDate;
   @org.kie.api.definition.type.Label(value = "expDate")
   private java.lang.String expDate;

   public Identity()
   {
   }

   public java.lang.String getAccountType()
   {
      return this.accountType;
   }

   public void setAccountType(java.lang.String accountType)
   {
      this.accountType = accountType;
   }

   public java.lang.String getAccountName()
   {
      return this.accountName;
   }

   public void setAccountName(java.lang.String accountName)
   {
      this.accountName = accountName;
   }

   public java.lang.String getFirstName()
   {
      return this.firstName;
   }

   public void setFirstName(java.lang.String firstName)
   {
      this.firstName = firstName;
   }

   public java.lang.String getMiddleInitial()
   {
      return this.middleInitial;
   }

   public void setMiddleInitial(java.lang.String middleInitial)
   {
      this.middleInitial = middleInitial;
   }

   public java.lang.String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(java.lang.String lastName)
   {
      this.lastName = lastName;
   }

   public java.lang.String getSuffix()
   {
      return this.suffix;
   }

   public void setSuffix(java.lang.String suffix)
   {
      this.suffix = suffix;
   }

   public java.lang.String getDateOfBirth()
   {
      return this.dateOfBirth;
   }

   public void setDateOfBirth(java.lang.String dateOfBirth)
   {
      this.dateOfBirth = dateOfBirth;
   }

   public java.lang.String getSsn()
   {
      return this.ssn;
   }

   public void setSsn(java.lang.String ssn)
   {
      this.ssn = ssn;
   }

   public java.lang.String getCitizenFlag()
   {
      return this.citizenFlag;
   }

   public void setCitizenFlag(java.lang.String citizenFlag)
   {
      this.citizenFlag = citizenFlag;
   }

   public java.lang.String getIdType()
   {
      return this.idType;
   }

   public void setIdType(java.lang.String idType)
   {
      this.idType = idType;
   }

   public java.lang.String getIdNumber()
   {
      return this.idNumber;
   }

   public void setIdNumber(java.lang.String idNumber)
   {
      this.idNumber = idNumber;
   }

   public java.lang.String getIssuedLocation()
   {
      return this.issuedLocation;
   }

   public void setIssuedLocation(java.lang.String issuedLocation)
   {
      this.issuedLocation = issuedLocation;
   }

   public java.lang.String getIssuedDate()
   {
      return this.issuedDate;
   }

   public void setIssuedDate(java.lang.String issuedDate)
   {
      this.issuedDate = issuedDate;
   }

   public java.lang.String getExpDate()
   {
      return this.expDate;
   }

   public void setExpDate(java.lang.String expDate)
   {
      this.expDate = expDate;
   }

   public Identity(java.lang.String accountType, java.lang.String accountName,
         java.lang.String firstName, java.lang.String middleInitial,
         java.lang.String lastName, java.lang.String suffix,
         java.lang.String dateOfBirth, java.lang.String ssn,
         java.lang.String citizenFlag, java.lang.String idType,
         java.lang.String idNumber, java.lang.String issuedLocation,
         java.lang.String issuedDate, java.lang.String expDate)
   {
      this.accountType = accountType;
      this.accountName = accountName;
      this.firstName = firstName;
      this.middleInitial = middleInitial;
      this.lastName = lastName;
      this.suffix = suffix;
      this.dateOfBirth = dateOfBirth;
      this.ssn = ssn;
      this.citizenFlag = citizenFlag;
      this.idType = idType;
      this.idNumber = idNumber;
      this.issuedLocation = issuedLocation;
      this.issuedDate = issuedDate;
      this.expDate = expDate;
   }

}