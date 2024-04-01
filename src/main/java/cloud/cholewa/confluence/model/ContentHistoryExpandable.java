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
 * ContentHistoryExpandable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContentHistoryExpandable {
  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private String lastUpdated;

  public static final String SERIALIZED_NAME_PREVIOUS_VERSION = "previousVersion";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_VERSION)
  private String previousVersion;

  public static final String SERIALIZED_NAME_CONTRIBUTORS = "contributors";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTORS)
  private String contributors;

  public static final String SERIALIZED_NAME_NEXT_VERSION = "nextVersion";
  @SerializedName(SERIALIZED_NAME_NEXT_VERSION)
  private String nextVersion;

  public static final String SERIALIZED_NAME_OWNED_BY = "ownedBy";
  @SerializedName(SERIALIZED_NAME_OWNED_BY)
  private String ownedBy;

  public static final String SERIALIZED_NAME_LAST_OWNED_BY = "lastOwnedBy";
  @SerializedName(SERIALIZED_NAME_LAST_OWNED_BY)
  private String lastOwnedBy;

  public ContentHistoryExpandable() {
  }

  public ContentHistoryExpandable lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public ContentHistoryExpandable previousVersion(String previousVersion) {
    this.previousVersion = previousVersion;
    return this;
  }

   /**
   * Get previousVersion
   * @return previousVersion
  **/
  @javax.annotation.Nullable
  public String getPreviousVersion() {
    return previousVersion;
  }

  public void setPreviousVersion(String previousVersion) {
    this.previousVersion = previousVersion;
  }


  public ContentHistoryExpandable contributors(String contributors) {
    this.contributors = contributors;
    return this;
  }

   /**
   * Get contributors
   * @return contributors
  **/
  @javax.annotation.Nullable
  public String getContributors() {
    return contributors;
  }

  public void setContributors(String contributors) {
    this.contributors = contributors;
  }


  public ContentHistoryExpandable nextVersion(String nextVersion) {
    this.nextVersion = nextVersion;
    return this;
  }

   /**
   * Get nextVersion
   * @return nextVersion
  **/
  @javax.annotation.Nullable
  public String getNextVersion() {
    return nextVersion;
  }

  public void setNextVersion(String nextVersion) {
    this.nextVersion = nextVersion;
  }


  public ContentHistoryExpandable ownedBy(String ownedBy) {
    this.ownedBy = ownedBy;
    return this;
  }

   /**
   * Get ownedBy
   * @return ownedBy
  **/
  @javax.annotation.Nullable
  public String getOwnedBy() {
    return ownedBy;
  }

  public void setOwnedBy(String ownedBy) {
    this.ownedBy = ownedBy;
  }


  public ContentHistoryExpandable lastOwnedBy(String lastOwnedBy) {
    this.lastOwnedBy = lastOwnedBy;
    return this;
  }

   /**
   * Get lastOwnedBy
   * @return lastOwnedBy
  **/
  @javax.annotation.Nullable
  public String getLastOwnedBy() {
    return lastOwnedBy;
  }

  public void setLastOwnedBy(String lastOwnedBy) {
    this.lastOwnedBy = lastOwnedBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentHistoryExpandable contentHistoryExpandable = (ContentHistoryExpandable) o;
    return Objects.equals(this.lastUpdated, contentHistoryExpandable.lastUpdated) &&
        Objects.equals(this.previousVersion, contentHistoryExpandable.previousVersion) &&
        Objects.equals(this.contributors, contentHistoryExpandable.contributors) &&
        Objects.equals(this.nextVersion, contentHistoryExpandable.nextVersion) &&
        Objects.equals(this.ownedBy, contentHistoryExpandable.ownedBy) &&
        Objects.equals(this.lastOwnedBy, contentHistoryExpandable.lastOwnedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdated, previousVersion, contributors, nextVersion, ownedBy, lastOwnedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentHistoryExpandable {\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    previousVersion: ").append(toIndentedString(previousVersion)).append("\n");
    sb.append("    contributors: ").append(toIndentedString(contributors)).append("\n");
    sb.append("    nextVersion: ").append(toIndentedString(nextVersion)).append("\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
    sb.append("    lastOwnedBy: ").append(toIndentedString(lastOwnedBy)).append("\n");
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
    openapiFields.add("lastUpdated");
    openapiFields.add("previousVersion");
    openapiFields.add("contributors");
    openapiFields.add("nextVersion");
    openapiFields.add("ownedBy");
    openapiFields.add("lastOwnedBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ContentHistoryExpandable
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContentHistoryExpandable.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContentHistoryExpandable is not found in the empty JSON string", ContentHistoryExpandable.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContentHistoryExpandable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContentHistoryExpandable` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("lastUpdated") != null && !jsonObj.get("lastUpdated").isJsonNull()) && !jsonObj.get("lastUpdated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastUpdated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastUpdated").toString()));
      }
      if ((jsonObj.get("previousVersion") != null && !jsonObj.get("previousVersion").isJsonNull()) && !jsonObj.get("previousVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousVersion").toString()));
      }
      if ((jsonObj.get("contributors") != null && !jsonObj.get("contributors").isJsonNull()) && !jsonObj.get("contributors").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contributors` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contributors").toString()));
      }
      if ((jsonObj.get("nextVersion") != null && !jsonObj.get("nextVersion").isJsonNull()) && !jsonObj.get("nextVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextVersion").toString()));
      }
      if ((jsonObj.get("ownedBy") != null && !jsonObj.get("ownedBy").isJsonNull()) && !jsonObj.get("ownedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownedBy").toString()));
      }
      if ((jsonObj.get("lastOwnedBy") != null && !jsonObj.get("lastOwnedBy").isJsonNull()) && !jsonObj.get("lastOwnedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastOwnedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastOwnedBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentHistoryExpandable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentHistoryExpandable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentHistoryExpandable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentHistoryExpandable.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentHistoryExpandable>() {
           @Override
           public void write(JsonWriter out, ContentHistoryExpandable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContentHistoryExpandable read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContentHistoryExpandable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContentHistoryExpandable
  * @throws IOException if the JSON string is invalid with respect to ContentHistoryExpandable
  */
  public static ContentHistoryExpandable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentHistoryExpandable.class);
  }

 /**
  * Convert an instance of ContentHistoryExpandable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

