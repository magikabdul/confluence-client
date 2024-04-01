/*
 * The Confluence Cloud REST API
 * This document describes the REST API and resources provided by Confluence. The REST APIs are for developers who want to integrate Confluence into their application and for administrators who want to script interactions with the Confluence server.Confluence's REST APIs provide access to resources (data entities) via URI paths. To use a REST API, your application will make an HTTP request and parse the response. The response format is JSON. Your methods will be the standard HTTP methods like GET, PUT, POST and DELETE. Because the REST API is based on open standards, you can use any web development language to access the API.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cloud.cholewa.confluence.model;

import java.util.Objects;
import cloud.cholewa.confluence.model.CopyPageRequestBody;
import cloud.cholewa.confluence.model.CopyPageRequestDestination;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cloud.cholewa.confluence.JSON;

/**
 * CopyPageRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CopyPageRequest {
  public static final String SERIALIZED_NAME_COPY_ATTACHMENTS = "copyAttachments";
  @SerializedName(SERIALIZED_NAME_COPY_ATTACHMENTS)
  private Boolean copyAttachments = false;

  public static final String SERIALIZED_NAME_COPY_PERMISSIONS = "copyPermissions";
  @SerializedName(SERIALIZED_NAME_COPY_PERMISSIONS)
  private Boolean copyPermissions = false;

  public static final String SERIALIZED_NAME_COPY_PROPERTIES = "copyProperties";
  @SerializedName(SERIALIZED_NAME_COPY_PROPERTIES)
  private Boolean copyProperties = false;

  public static final String SERIALIZED_NAME_COPY_LABELS = "copyLabels";
  @SerializedName(SERIALIZED_NAME_COPY_LABELS)
  private Boolean copyLabels = false;

  public static final String SERIALIZED_NAME_COPY_CUSTOM_CONTENTS = "copyCustomContents";
  @SerializedName(SERIALIZED_NAME_COPY_CUSTOM_CONTENTS)
  private Boolean copyCustomContents = false;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private CopyPageRequestDestination destination;

  public static final String SERIALIZED_NAME_PAGE_TITLE = "pageTitle";
  @SerializedName(SERIALIZED_NAME_PAGE_TITLE)
  private String pageTitle;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private CopyPageRequestBody body;

  public CopyPageRequest() {
  }

  public CopyPageRequest copyAttachments(Boolean copyAttachments) {
    this.copyAttachments = copyAttachments;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, attachments are copied to the destination page.
   * @return copyAttachments
  **/
  @javax.annotation.Nullable
  public Boolean getCopyAttachments() {
    return copyAttachments;
  }

  public void setCopyAttachments(Boolean copyAttachments) {
    this.copyAttachments = copyAttachments;
  }


  public CopyPageRequest copyPermissions(Boolean copyPermissions) {
    this.copyPermissions = copyPermissions;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, page permissions are copied to the destination page.
   * @return copyPermissions
  **/
  @javax.annotation.Nullable
  public Boolean getCopyPermissions() {
    return copyPermissions;
  }

  public void setCopyPermissions(Boolean copyPermissions) {
    this.copyPermissions = copyPermissions;
  }


  public CopyPageRequest copyProperties(Boolean copyProperties) {
    this.copyProperties = copyProperties;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, content properties are copied to the destination page.
   * @return copyProperties
  **/
  @javax.annotation.Nullable
  public Boolean getCopyProperties() {
    return copyProperties;
  }

  public void setCopyProperties(Boolean copyProperties) {
    this.copyProperties = copyProperties;
  }


  public CopyPageRequest copyLabels(Boolean copyLabels) {
    this.copyLabels = copyLabels;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, labels are copied to the destination page.
   * @return copyLabels
  **/
  @javax.annotation.Nullable
  public Boolean getCopyLabels() {
    return copyLabels;
  }

  public void setCopyLabels(Boolean copyLabels) {
    this.copyLabels = copyLabels;
  }


  public CopyPageRequest copyCustomContents(Boolean copyCustomContents) {
    this.copyCustomContents = copyCustomContents;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, custom contents are copied to the destination page.
   * @return copyCustomContents
  **/
  @javax.annotation.Nullable
  public Boolean getCopyCustomContents() {
    return copyCustomContents;
  }

  public void setCopyCustomContents(Boolean copyCustomContents) {
    this.copyCustomContents = copyCustomContents;
  }


  public CopyPageRequest destination(CopyPageRequestDestination destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nonnull
  public CopyPageRequestDestination getDestination() {
    return destination;
  }

  public void setDestination(CopyPageRequestDestination destination) {
    this.destination = destination;
  }


  public CopyPageRequest pageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
    return this;
  }

   /**
   * If defined, this will replace the title of the destination page.
   * @return pageTitle
  **/
  @javax.annotation.Nullable
  public String getPageTitle() {
    return pageTitle;
  }

  public void setPageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
  }


  public CopyPageRequest body(CopyPageRequestBody body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  public CopyPageRequestBody getBody() {
    return body;
  }

  public void setBody(CopyPageRequestBody body) {
    this.body = body;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyPageRequest copyPageRequest = (CopyPageRequest) o;
    return Objects.equals(this.copyAttachments, copyPageRequest.copyAttachments) &&
        Objects.equals(this.copyPermissions, copyPageRequest.copyPermissions) &&
        Objects.equals(this.copyProperties, copyPageRequest.copyProperties) &&
        Objects.equals(this.copyLabels, copyPageRequest.copyLabels) &&
        Objects.equals(this.copyCustomContents, copyPageRequest.copyCustomContents) &&
        Objects.equals(this.destination, copyPageRequest.destination) &&
        Objects.equals(this.pageTitle, copyPageRequest.pageTitle) &&
        Objects.equals(this.body, copyPageRequest.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyAttachments, copyPermissions, copyProperties, copyLabels, copyCustomContents, destination, pageTitle, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyPageRequest {\n");
    sb.append("    copyAttachments: ").append(toIndentedString(copyAttachments)).append("\n");
    sb.append("    copyPermissions: ").append(toIndentedString(copyPermissions)).append("\n");
    sb.append("    copyProperties: ").append(toIndentedString(copyProperties)).append("\n");
    sb.append("    copyLabels: ").append(toIndentedString(copyLabels)).append("\n");
    sb.append("    copyCustomContents: ").append(toIndentedString(copyCustomContents)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("copyAttachments");
    openapiFields.add("copyPermissions");
    openapiFields.add("copyProperties");
    openapiFields.add("copyLabels");
    openapiFields.add("copyCustomContents");
    openapiFields.add("destination");
    openapiFields.add("pageTitle");
    openapiFields.add("body");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("destination");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CopyPageRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CopyPageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CopyPageRequest is not found in the empty JSON string", CopyPageRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CopyPageRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CopyPageRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CopyPageRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `destination`
      CopyPageRequestDestination.validateJsonElement(jsonObj.get("destination"));
      if ((jsonObj.get("pageTitle") != null && !jsonObj.get("pageTitle").isJsonNull()) && !jsonObj.get("pageTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageTitle").toString()));
      }
      // validate the optional field `body`
      if (jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) {
        CopyPageRequestBody.validateJsonElement(jsonObj.get("body"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CopyPageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CopyPageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CopyPageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CopyPageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CopyPageRequest>() {
           @Override
           public void write(JsonWriter out, CopyPageRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CopyPageRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CopyPageRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CopyPageRequest
  * @throws IOException if the JSON string is invalid with respect to CopyPageRequest
  */
  public static CopyPageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CopyPageRequest.class);
  }

 /**
  * Convert an instance of CopyPageRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

