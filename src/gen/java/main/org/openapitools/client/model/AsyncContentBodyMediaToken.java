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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

import org.openapitools.client.JSON;

/**
 * AsyncContentBodyMediaToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T01:00:55.766609049+02:00[Europe/Warsaw]")
public class AsyncContentBodyMediaToken {
  public static final String SERIALIZED_NAME_COLLECTION_IDS = "collectionIds";
  @SerializedName(SERIALIZED_NAME_COLLECTION_IDS)
  private List<String> collectionIds;

  public static final String SERIALIZED_NAME_CONTENT_ID = "contentId";
  @SerializedName(SERIALIZED_NAME_CONTENT_ID)
  private String contentId;

  public static final String SERIALIZED_NAME_EXPIRY_DATE_TIME = "expiryDateTime";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE_TIME)
  private String expiryDateTime;

  public static final String SERIALIZED_NAME_FILE_IDS = "fileIds";
  @SerializedName(SERIALIZED_NAME_FILE_IDS)
  private List<String> fileIds;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public AsyncContentBodyMediaToken() {
  }

  public AsyncContentBodyMediaToken collectionIds(List<String> collectionIds) {
    this.collectionIds = collectionIds;
    return this;
  }

  public AsyncContentBodyMediaToken addCollectionIdsItem(String collectionIdsItem) {
    if (this.collectionIds == null) {
      this.collectionIds = new ArrayList<>();
    }
    this.collectionIds.add(collectionIdsItem);
    return this;
  }

   /**
   * Get collectionIds
   * @return collectionIds
  **/
  @javax.annotation.Nullable
  public List<String> getCollectionIds() {
    return collectionIds;
  }

  public void setCollectionIds(List<String> collectionIds) {
    this.collectionIds = collectionIds;
  }


  public AsyncContentBodyMediaToken contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

   /**
   * Get contentId
   * @return contentId
  **/
  @javax.annotation.Nullable
  public String getContentId() {
    return contentId;
  }

  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  public AsyncContentBodyMediaToken expiryDateTime(String expiryDateTime) {
    this.expiryDateTime = expiryDateTime;
    return this;
  }

   /**
   * Get expiryDateTime
   * @return expiryDateTime
  **/
  @javax.annotation.Nullable
  public String getExpiryDateTime() {
    return expiryDateTime;
  }

  public void setExpiryDateTime(String expiryDateTime) {
    this.expiryDateTime = expiryDateTime;
  }


  public AsyncContentBodyMediaToken fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public AsyncContentBodyMediaToken addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

   /**
   * Get fileIds
   * @return fileIds
  **/
  @javax.annotation.Nullable
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }


  public AsyncContentBodyMediaToken token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncContentBodyMediaToken asyncContentBodyMediaToken = (AsyncContentBodyMediaToken) o;
    return Objects.equals(this.collectionIds, asyncContentBodyMediaToken.collectionIds) &&
        Objects.equals(this.contentId, asyncContentBodyMediaToken.contentId) &&
        Objects.equals(this.expiryDateTime, asyncContentBodyMediaToken.expiryDateTime) &&
        Objects.equals(this.fileIds, asyncContentBodyMediaToken.fileIds) &&
        Objects.equals(this.token, asyncContentBodyMediaToken.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionIds, contentId, expiryDateTime, fileIds, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncContentBodyMediaToken {\n");
    sb.append("    collectionIds: ").append(toIndentedString(collectionIds)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    expiryDateTime: ").append(toIndentedString(expiryDateTime)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
    openapiFields.add("collectionIds");
    openapiFields.add("contentId");
    openapiFields.add("expiryDateTime");
    openapiFields.add("fileIds");
    openapiFields.add("token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AsyncContentBodyMediaToken
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AsyncContentBodyMediaToken.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AsyncContentBodyMediaToken is not found in the empty JSON string", AsyncContentBodyMediaToken.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AsyncContentBodyMediaToken.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AsyncContentBodyMediaToken` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("collectionIds") != null && !jsonObj.get("collectionIds").isJsonNull() && !jsonObj.get("collectionIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectionIds` to be an array in the JSON string but got `%s`", jsonObj.get("collectionIds").toString()));
      }
      if ((jsonObj.get("contentId") != null && !jsonObj.get("contentId").isJsonNull()) && !jsonObj.get("contentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentId").toString()));
      }
      if ((jsonObj.get("expiryDateTime") != null && !jsonObj.get("expiryDateTime").isJsonNull()) && !jsonObj.get("expiryDateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiryDateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiryDateTime").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fileIds") != null && !jsonObj.get("fileIds").isJsonNull() && !jsonObj.get("fileIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileIds` to be an array in the JSON string but got `%s`", jsonObj.get("fileIds").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AsyncContentBodyMediaToken.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AsyncContentBodyMediaToken' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AsyncContentBodyMediaToken> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AsyncContentBodyMediaToken.class));

       return (TypeAdapter<T>) new TypeAdapter<AsyncContentBodyMediaToken>() {
           @Override
           public void write(JsonWriter out, AsyncContentBodyMediaToken value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AsyncContentBodyMediaToken read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AsyncContentBodyMediaToken given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AsyncContentBodyMediaToken
  * @throws IOException if the JSON string is invalid with respect to AsyncContentBodyMediaToken
  */
  public static AsyncContentBodyMediaToken fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AsyncContentBodyMediaToken.class);
  }

 /**
  * Convert an instance of AsyncContentBodyMediaToken to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
