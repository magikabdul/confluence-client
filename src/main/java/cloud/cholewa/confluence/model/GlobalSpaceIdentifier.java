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
 * GlobalSpaceIdentifier
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GlobalSpaceIdentifier {
  public static final String SERIALIZED_NAME_SPACE_IDENTIFIER = "spaceIdentifier";
  @SerializedName(SERIALIZED_NAME_SPACE_IDENTIFIER)
  private String spaceIdentifier;

  public GlobalSpaceIdentifier() {
  }

  public GlobalSpaceIdentifier spaceIdentifier(String spaceIdentifier) {
    this.spaceIdentifier = spaceIdentifier;
    return this;
  }

   /**
   * Get spaceIdentifier
   * @return spaceIdentifier
  **/
  @javax.annotation.Nonnull
  public String getSpaceIdentifier() {
    return spaceIdentifier;
  }

  public void setSpaceIdentifier(String spaceIdentifier) {
    this.spaceIdentifier = spaceIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalSpaceIdentifier globalSpaceIdentifier = (GlobalSpaceIdentifier) o;
    return Objects.equals(this.spaceIdentifier, globalSpaceIdentifier.spaceIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spaceIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalSpaceIdentifier {\n");
    sb.append("    spaceIdentifier: ").append(toIndentedString(spaceIdentifier)).append("\n");
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
    openapiFields.add("spaceIdentifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("spaceIdentifier");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GlobalSpaceIdentifier
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GlobalSpaceIdentifier.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GlobalSpaceIdentifier is not found in the empty JSON string", GlobalSpaceIdentifier.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GlobalSpaceIdentifier.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GlobalSpaceIdentifier` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GlobalSpaceIdentifier.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("spaceIdentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spaceIdentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spaceIdentifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GlobalSpaceIdentifier.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GlobalSpaceIdentifier' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GlobalSpaceIdentifier> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GlobalSpaceIdentifier.class));

       return (TypeAdapter<T>) new TypeAdapter<GlobalSpaceIdentifier>() {
           @Override
           public void write(JsonWriter out, GlobalSpaceIdentifier value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GlobalSpaceIdentifier read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GlobalSpaceIdentifier given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GlobalSpaceIdentifier
  * @throws IOException if the JSON string is invalid with respect to GlobalSpaceIdentifier
  */
  public static GlobalSpaceIdentifier fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GlobalSpaceIdentifier.class);
  }

 /**
  * Convert an instance of GlobalSpaceIdentifier to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

