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
 * SpaceSettingsUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T01:00:55.766609049+02:00[Europe/Warsaw]")
public class SpaceSettingsUpdate {
  public static final String SERIALIZED_NAME_ROUTE_OVERRIDE_ENABLED = "routeOverrideEnabled";
  @SerializedName(SERIALIZED_NAME_ROUTE_OVERRIDE_ENABLED)
  private Boolean routeOverrideEnabled;

  public SpaceSettingsUpdate() {
  }

  public SpaceSettingsUpdate routeOverrideEnabled(Boolean routeOverrideEnabled) {
    this.routeOverrideEnabled = routeOverrideEnabled;
    return this;
  }

   /**
   * Defines whether an override for the space home should be used. This is used in conjunction with a space theme provided by an app. For example, if this property is set to true, a theme can display a page other than the space homepage when users visit the root URL for a space. This property allows apps to provide content-only theming without overriding the space home.
   * @return routeOverrideEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getRouteOverrideEnabled() {
    return routeOverrideEnabled;
  }

  public void setRouteOverrideEnabled(Boolean routeOverrideEnabled) {
    this.routeOverrideEnabled = routeOverrideEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpaceSettingsUpdate spaceSettingsUpdate = (SpaceSettingsUpdate) o;
    return Objects.equals(this.routeOverrideEnabled, spaceSettingsUpdate.routeOverrideEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeOverrideEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceSettingsUpdate {\n");
    sb.append("    routeOverrideEnabled: ").append(toIndentedString(routeOverrideEnabled)).append("\n");
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
    openapiFields.add("routeOverrideEnabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SpaceSettingsUpdate
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SpaceSettingsUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpaceSettingsUpdate is not found in the empty JSON string", SpaceSettingsUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SpaceSettingsUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpaceSettingsUpdate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpaceSettingsUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpaceSettingsUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpaceSettingsUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpaceSettingsUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<SpaceSettingsUpdate>() {
           @Override
           public void write(JsonWriter out, SpaceSettingsUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpaceSettingsUpdate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SpaceSettingsUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpaceSettingsUpdate
  * @throws IOException if the JSON string is invalid with respect to SpaceSettingsUpdate
  */
  public static SpaceSettingsUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpaceSettingsUpdate.class);
  }

 /**
  * Convert an instance of SpaceSettingsUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
