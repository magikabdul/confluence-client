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
 * AttachmentUpdateMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AttachmentUpdateMetadata {
  public static final String SERIALIZED_NAME_MEDIA_TYPE = "mediaType";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public AttachmentUpdateMetadata() {
  }

  public AttachmentUpdateMetadata mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * The media type of the attachment, e.g. &#39;img/jpg&#39;.
   * @return mediaType
  **/
  @javax.annotation.Nullable
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  public AttachmentUpdateMetadata comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * The comment for this update.
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentUpdateMetadata attachmentUpdateMetadata = (AttachmentUpdateMetadata) o;
    return Objects.equals(this.mediaType, attachmentUpdateMetadata.mediaType) &&
        Objects.equals(this.comment, attachmentUpdateMetadata.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentUpdateMetadata {\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
    openapiFields.add("mediaType");
    openapiFields.add("comment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AttachmentUpdateMetadata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AttachmentUpdateMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachmentUpdateMetadata is not found in the empty JSON string", AttachmentUpdateMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AttachmentUpdateMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttachmentUpdateMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mediaType") != null && !jsonObj.get("mediaType").isJsonNull()) && !jsonObj.get("mediaType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mediaType").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachmentUpdateMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachmentUpdateMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachmentUpdateMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachmentUpdateMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachmentUpdateMetadata>() {
           @Override
           public void write(JsonWriter out, AttachmentUpdateMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttachmentUpdateMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AttachmentUpdateMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttachmentUpdateMetadata
  * @throws IOException if the JSON string is invalid with respect to AttachmentUpdateMetadata
  */
  public static AttachmentUpdateMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachmentUpdateMetadata.class);
  }

 /**
  * Convert an instance of AttachmentUpdateMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

