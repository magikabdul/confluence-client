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
 * NavigationLookAndFeelHoverOrFocus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T01:00:55.766609049+02:00[Europe/Warsaw]")
public class NavigationLookAndFeelHoverOrFocus {
  public static final String SERIALIZED_NAME_BACKGROUND_COLOR = "backgroundColor";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_COLOR)
  private String backgroundColor;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public NavigationLookAndFeelHoverOrFocus() {
  }

  public NavigationLookAndFeelHoverOrFocus backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Get backgroundColor
   * @return backgroundColor
  **/
  @javax.annotation.Nonnull
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  public NavigationLookAndFeelHoverOrFocus color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nonnull
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NavigationLookAndFeelHoverOrFocus navigationLookAndFeelHoverOrFocus = (NavigationLookAndFeelHoverOrFocus) o;
    return Objects.equals(this.backgroundColor, navigationLookAndFeelHoverOrFocus.backgroundColor) &&
        Objects.equals(this.color, navigationLookAndFeelHoverOrFocus.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NavigationLookAndFeelHoverOrFocus {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
    openapiFields.add("backgroundColor");
    openapiFields.add("color");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("backgroundColor");
    openapiRequiredFields.add("color");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NavigationLookAndFeelHoverOrFocus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NavigationLookAndFeelHoverOrFocus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NavigationLookAndFeelHoverOrFocus is not found in the empty JSON string", NavigationLookAndFeelHoverOrFocus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NavigationLookAndFeelHoverOrFocus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NavigationLookAndFeelHoverOrFocus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NavigationLookAndFeelHoverOrFocus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("backgroundColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backgroundColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backgroundColor").toString()));
      }
      if (!jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NavigationLookAndFeelHoverOrFocus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NavigationLookAndFeelHoverOrFocus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NavigationLookAndFeelHoverOrFocus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NavigationLookAndFeelHoverOrFocus.class));

       return (TypeAdapter<T>) new TypeAdapter<NavigationLookAndFeelHoverOrFocus>() {
           @Override
           public void write(JsonWriter out, NavigationLookAndFeelHoverOrFocus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NavigationLookAndFeelHoverOrFocus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NavigationLookAndFeelHoverOrFocus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NavigationLookAndFeelHoverOrFocus
  * @throws IOException if the JSON string is invalid with respect to NavigationLookAndFeelHoverOrFocus
  */
  public static NavigationLookAndFeelHoverOrFocus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NavigationLookAndFeelHoverOrFocus.class);
  }

 /**
  * Convert an instance of NavigationLookAndFeelHoverOrFocus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

