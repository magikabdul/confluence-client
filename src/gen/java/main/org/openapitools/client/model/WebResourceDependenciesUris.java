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
import org.openapitools.client.model.SuperBatchWebResourcesUrisAll;
import org.openapitools.client.model.WebResourceDependenciesUrisExpandable;

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
 * WebResourceDependenciesUris
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T01:00:55.766609049+02:00[Europe/Warsaw]")
public class WebResourceDependenciesUris {
  public static final String SERIALIZED_NAME_ALL = "all";
  @SerializedName(SERIALIZED_NAME_ALL)
  private SuperBatchWebResourcesUrisAll all;

  public static final String SERIALIZED_NAME_CSS = "css";
  @SerializedName(SERIALIZED_NAME_CSS)
  private SuperBatchWebResourcesUrisAll css;

  public static final String SERIALIZED_NAME_JS = "js";
  @SerializedName(SERIALIZED_NAME_JS)
  private SuperBatchWebResourcesUrisAll js;

  public static final String SERIALIZED_NAME_EXPANDABLE = "_expandable";
  @SerializedName(SERIALIZED_NAME_EXPANDABLE)
  private WebResourceDependenciesUrisExpandable expandable;

  public WebResourceDependenciesUris() {
  }

  public WebResourceDependenciesUris all(SuperBatchWebResourcesUrisAll all) {
    this.all = all;
    return this;
  }

   /**
   * Get all
   * @return all
  **/
  @javax.annotation.Nullable
  public SuperBatchWebResourcesUrisAll getAll() {
    return all;
  }

  public void setAll(SuperBatchWebResourcesUrisAll all) {
    this.all = all;
  }


  public WebResourceDependenciesUris css(SuperBatchWebResourcesUrisAll css) {
    this.css = css;
    return this;
  }

   /**
   * Get css
   * @return css
  **/
  @javax.annotation.Nullable
  public SuperBatchWebResourcesUrisAll getCss() {
    return css;
  }

  public void setCss(SuperBatchWebResourcesUrisAll css) {
    this.css = css;
  }


  public WebResourceDependenciesUris js(SuperBatchWebResourcesUrisAll js) {
    this.js = js;
    return this;
  }

   /**
   * Get js
   * @return js
  **/
  @javax.annotation.Nullable
  public SuperBatchWebResourcesUrisAll getJs() {
    return js;
  }

  public void setJs(SuperBatchWebResourcesUrisAll js) {
    this.js = js;
  }


  public WebResourceDependenciesUris expandable(WebResourceDependenciesUrisExpandable expandable) {
    this.expandable = expandable;
    return this;
  }

   /**
   * Get expandable
   * @return expandable
  **/
  @javax.annotation.Nullable
  public WebResourceDependenciesUrisExpandable getExpandable() {
    return expandable;
  }

  public void setExpandable(WebResourceDependenciesUrisExpandable expandable) {
    this.expandable = expandable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebResourceDependenciesUris webResourceDependenciesUris = (WebResourceDependenciesUris) o;
    return Objects.equals(this.all, webResourceDependenciesUris.all) &&
        Objects.equals(this.css, webResourceDependenciesUris.css) &&
        Objects.equals(this.js, webResourceDependenciesUris.js) &&
        Objects.equals(this.expandable, webResourceDependenciesUris.expandable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, css, js, expandable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebResourceDependenciesUris {\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    css: ").append(toIndentedString(css)).append("\n");
    sb.append("    js: ").append(toIndentedString(js)).append("\n");
    sb.append("    expandable: ").append(toIndentedString(expandable)).append("\n");
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
    openapiFields.add("js");
    openapiFields.add("_expandable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WebResourceDependenciesUris
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebResourceDependenciesUris.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebResourceDependenciesUris is not found in the empty JSON string", WebResourceDependenciesUris.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebResourceDependenciesUris.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebResourceDependenciesUris` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `all`
      if (jsonObj.get("all") != null && !jsonObj.get("all").isJsonNull()) {
        SuperBatchWebResourcesUrisAll.validateJsonElement(jsonObj.get("all"));
      }
      // validate the optional field `css`
      if (jsonObj.get("css") != null && !jsonObj.get("css").isJsonNull()) {
        SuperBatchWebResourcesUrisAll.validateJsonElement(jsonObj.get("css"));
      }
      // validate the optional field `js`
      if (jsonObj.get("js") != null && !jsonObj.get("js").isJsonNull()) {
        SuperBatchWebResourcesUrisAll.validateJsonElement(jsonObj.get("js"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebResourceDependenciesUris.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebResourceDependenciesUris' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebResourceDependenciesUris> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebResourceDependenciesUris.class));

       return (TypeAdapter<T>) new TypeAdapter<WebResourceDependenciesUris>() {
           @Override
           public void write(JsonWriter out, WebResourceDependenciesUris value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebResourceDependenciesUris read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebResourceDependenciesUris given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebResourceDependenciesUris
  * @throws IOException if the JSON string is invalid with respect to WebResourceDependenciesUris
  */
  public static WebResourceDependenciesUris fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebResourceDependenciesUris.class);
  }

 /**
  * Convert an instance of WebResourceDependenciesUris to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
