package com.panorama.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountMetadata implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "public_alias")
   private java.lang.String public_alias;
   @org.kie.api.definition.type.Label(value = "private_alias")
   private java.lang.String private_alias;
   @org.kie.api.definition.type.Label(value = "more_info")
   private java.lang.String more_info;
   @org.kie.api.definition.type.Label(value = "image_URL")
   private java.lang.String image_URL;
   @org.kie.api.definition.type.Label(value = "open_corporates_URL")
   private java.lang.String open_corporates_URL;
   @org.kie.api.definition.type.Label(value = "corporate_location")
   private com.panorama.common.Location corporate_location;
   @org.kie.api.definition.type.Label(value = "physical_location")
   private com.panorama.common.Location physical_location;
   @org.kie.api.definition.type.Label(value = "URL")
   private java.lang.String URL;

   public AccountMetadata()
   {
   }

   public java.lang.String getPublic_alias()
   {
      return this.public_alias;
   }

   public void setPublic_alias(java.lang.String public_alias)
   {
      this.public_alias = public_alias;
   }

   public java.lang.String getPrivate_alias()
   {
      return this.private_alias;
   }

   public void setPrivate_alias(java.lang.String private_alias)
   {
      this.private_alias = private_alias;
   }

   public java.lang.String getMore_info()
   {
      return this.more_info;
   }

   public void setMore_info(java.lang.String more_info)
   {
      this.more_info = more_info;
   }

   public java.lang.String getImage_URL()
   {
      return this.image_URL;
   }

   public void setImage_URL(java.lang.String image_URL)
   {
      this.image_URL = image_URL;
   }

   public java.lang.String getOpen_corporates_URL()
   {
      return this.open_corporates_URL;
   }

   public void setOpen_corporates_URL(java.lang.String open_corporates_URL)
   {
      this.open_corporates_URL = open_corporates_URL;
   }

   public com.panorama.common.Location getCorporate_location()
   {
      return this.corporate_location;
   }

   public void setCorporate_location(
         com.panorama.common.Location corporate_location)
   {
      this.corporate_location = corporate_location;
   }

   public com.panorama.common.Location getPhysical_location()
   {
      return this.physical_location;
   }

   public void setPhysical_location(
         com.panorama.common.Location physical_location)
   {
      this.physical_location = physical_location;
   }

   public java.lang.String getURL()
   {
      return this.URL;
   }

   @JsonProperty("URL")
   public void setURL(java.lang.String URL)
   {
      this.URL = URL;
   }

   public AccountMetadata(java.lang.String public_alias,
         java.lang.String private_alias, java.lang.String more_info,
         java.lang.String image_URL, java.lang.String open_corporates_URL,
         com.panorama.common.Location corporate_location,
         com.panorama.common.Location physical_location,
         java.lang.String URL)
   {
      this.public_alias = public_alias;
      this.private_alias = private_alias;
      this.more_info = more_info;
      this.image_URL = image_URL;
      this.open_corporates_URL = open_corporates_URL;
      this.corporate_location = corporate_location;
      this.physical_location = physical_location;
      this.URL = URL;
   }

}