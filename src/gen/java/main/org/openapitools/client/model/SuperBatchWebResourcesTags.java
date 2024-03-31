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
 * SuperBatchWebResourcesTags
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T01:00:55.766609049+02:00[Europe/Warsaw]")
public class SuperBatchWebResourcesTags {
  public static final String SERIALIZED_NAME_ALL = "all";
  @SerializedName(SERIALIZED_NAME_ALL)
  private String all;

  public static final String SERIALIZED_NAME_CSS = "css";
  @SerializedName(SERIALIZED_NAME_CSS)
  private String css;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_JS = "js";
  @SerializedName(SERIALIZED_NAME_JS)
  private String js;

  public SuperBatchWebResourcesTags() {
  }

  public SuperBatchWebResourcesTags all(String all) {
    this.all = all;
    return this;
  }

   /**
   * Get all
   * @return all
  **/
  @javax.annotation.Nullable
  public String getAll() {
    return all;
  }

  public void setAll(String all) {
    this.all = all;
  }


  public SuperBatchWebResourcesTags css(String css) {
    this.css = css;
    return this;
  }

   /**
   * Get css
   * @return css
  **/
  @javax.annotation.Nullable
  public String getCss() {
    return css;
  }

  public void setCss(String css) {
    this.css = css;
  }


  public SuperBatchWebResourcesTags data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  public SuperBatchWebResourcesTags js(String js) {
    this.js = js;
    return this;
  }

   /**
   * Get js
   * @return js
  **/
  @javax.annotation.Nullable
  public String getJs() {
    return js;
  }

  public void setJs(String js) {
    this.js = js;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperBatchWebResourcesTags superBatchWebResourcesTags = (SuperBatchWebResourcesTags) o;
    return Objects.equals(this.all, superBatchWebResourcesTags.all) &&
        Objects.equals(this.css, superBatchWebResourcesTags.css) &&
        Objects.equals(this.data, superBatchWebResourcesTags.data) &&
        Objects.equals(this.js, superBatchWebResourcesTags.js);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, css, data, js);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperBatchWebResourcesTags {\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    css: ").append(toIndentedString(css)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    js: ").append(toIndentedString(js)).append("\n");
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
    openapiFields.add("all");
    openapiFields.add("css");
    openapiFields.add("data");
    openapiFields.add("js");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SuperBatchWebResourcesTags
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SuperBatchWebResourcesTags.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuperBatchWebResourcesTags is not found in the empty JSON string", SuperBatchWebResourcesTags.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SuperBatchWebResourcesTags.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuperBatchWebResourcesTags` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("all") != null && !jsonObj.get("all").isJsonNull()) && !jsonObj.get("all").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `all` to be a primitive type in the JSON string but got `%s`", jsonObj.get("all").toString()));
      }
      if ((jsonObj.get("css") != null && !jsonObj.get("css").isJsonNull()) && !jsonObj.get("css").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `css` to be a primitive type in the JSON string but got `%s`", jsonObj.get("css").toString()));
      }
      if ((jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if ((jsonObj.get("js") != null && !jsonObj.get("js").isJsonNull()) && !jsonObj.get("js").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `js` to be a primitive type in the JSON string but got `%s`", jsonObj.get("js").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuperBatchWebResourcesTags.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuperBatchWebResourcesTags' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuperBatchWebResourcesTags> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuperBatchWebResourcesTags.class));

       return (TypeAdapter<T>) new TypeAdapter<SuperBatchWebResourcesTags>() {
           @Override
           public void write(JsonWriter out, SuperBatchWebResourcesTags value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuperBatchWebResourcesTags read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuperBatchWebResourcesTags given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuperBatchWebResourcesTags
  * @throws IOException if the JSON string is invalid with respect to SuperBatchWebResourcesTags
  */
  public static SuperBatchWebResourcesTags fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuperBatchWebResourcesTags.class);
  }

 /**
  * Convert an instance of SuperBatchWebResourcesTags to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
