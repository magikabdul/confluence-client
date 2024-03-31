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

import org.openapitools.client.JSON;

/**
 * AsyncContentBodyExpandable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T01:00:55.766609049+02:00[Europe/Warsaw]")
public class AsyncContentBodyExpandable {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_EMBEDDED_CONTENT = "embeddedContent";
  @SerializedName(SERIALIZED_NAME_EMBEDDED_CONTENT)
  private String embeddedContent;

  public static final String SERIALIZED_NAME_WEBRESOURCE = "webresource";
  @SerializedName(SERIALIZED_NAME_WEBRESOURCE)
  private String webresource;

  public static final String SERIALIZED_NAME_MEDIA_TOKEN = "mediaToken";
  @SerializedName(SERIALIZED_NAME_MEDIA_TOKEN)
  private String mediaToken;

  public AsyncContentBodyExpandable() {
  }

  public AsyncContentBodyExpandable content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public AsyncContentBodyExpandable embeddedContent(String embeddedContent) {
    this.embeddedContent = embeddedContent;
    return this;
  }

   /**
   * Get embeddedContent
   * @return embeddedContent
  **/
  @javax.annotation.Nullable
  public String getEmbeddedContent() {
    return embeddedContent;
  }

  public void setEmbeddedContent(String embeddedContent) {
    this.embeddedContent = embeddedContent;
  }


  public AsyncContentBodyExpandable webresource(String webresource) {
    this.webresource = webresource;
    return this;
  }

   /**
   * Get webresource
   * @return webresource
  **/
  @javax.annotation.Nullable
  public String getWebresource() {
    return webresource;
  }

  public void setWebresource(String webresource) {
    this.webresource = webresource;
  }


  public AsyncContentBodyExpandable mediaToken(String mediaToken) {
    this.mediaToken = mediaToken;
    return this;
  }

   /**
   * Get mediaToken
   * @return mediaToken
  **/
  @javax.annotation.Nullable
  public String getMediaToken() {
    return mediaToken;
  }

  public void setMediaToken(String mediaToken) {
    this.mediaToken = mediaToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncContentBodyExpandable asyncContentBodyExpandable = (AsyncContentBodyExpandable) o;
    return Objects.equals(this.content, asyncContentBodyExpandable.content) &&
        Objects.equals(this.embeddedContent, asyncContentBodyExpandable.embeddedContent) &&
        Objects.equals(this.webresource, asyncContentBodyExpandable.webresource) &&
        Objects.equals(this.mediaToken, asyncContentBodyExpandable.mediaToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, embeddedContent, webresource, mediaToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncContentBodyExpandable {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    embeddedContent: ").append(toIndentedString(embeddedContent)).append("\n");
    sb.append("    webresource: ").append(toIndentedString(webresource)).append("\n");
    sb.append("    mediaToken: ").append(toIndentedString(mediaToken)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("embeddedContent");
    openapiFields.add("webresource");
    openapiFields.add("mediaToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AsyncContentBodyExpandable
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AsyncContentBodyExpandable.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AsyncContentBodyExpandable is not found in the empty JSON string", AsyncContentBodyExpandable.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AsyncContentBodyExpandable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AsyncContentBodyExpandable` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("embeddedContent") != null && !jsonObj.get("embeddedContent").isJsonNull()) && !jsonObj.get("embeddedContent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `embeddedContent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("embeddedContent").toString()));
      }
      if ((jsonObj.get("webresource") != null && !jsonObj.get("webresource").isJsonNull()) && !jsonObj.get("webresource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webresource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webresource").toString()));
      }
      if ((jsonObj.get("mediaToken") != null && !jsonObj.get("mediaToken").isJsonNull()) && !jsonObj.get("mediaToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mediaToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AsyncContentBodyExpandable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AsyncContentBodyExpandable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AsyncContentBodyExpandable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AsyncContentBodyExpandable.class));

       return (TypeAdapter<T>) new TypeAdapter<AsyncContentBodyExpandable>() {
           @Override
           public void write(JsonWriter out, AsyncContentBodyExpandable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AsyncContentBodyExpandable read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AsyncContentBodyExpandable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AsyncContentBodyExpandable
  * @throws IOException if the JSON string is invalid with respect to AsyncContentBodyExpandable
  */
  public static AsyncContentBodyExpandable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AsyncContentBodyExpandable.class);
  }

 /**
  * Convert an instance of AsyncContentBodyExpandable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

