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

import cloud.cholewa.confluence.JSON;

/**
 * The CQL queries to be converted.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CQLPersonalDataMigrationRequest {
  public static final String SERIALIZED_NAME_QUERY_STRINGS = "queryStrings";
  @SerializedName(SERIALIZED_NAME_QUERY_STRINGS)
  private List<String> queryStrings = new ArrayList<>();

  public CQLPersonalDataMigrationRequest() {
  }

  public CQLPersonalDataMigrationRequest queryStrings(List<String> queryStrings) {
    this.queryStrings = queryStrings;
    return this;
  }

  public CQLPersonalDataMigrationRequest addQueryStringsItem(String queryStringsItem) {
    if (this.queryStrings == null) {
      this.queryStrings = new ArrayList<>();
    }
    this.queryStrings.add(queryStringsItem);
    return this;
  }

   /**
   * A list of queries with user identifiers. Maximum of 100 queries.
   * @return queryStrings
  **/
  @javax.annotation.Nonnull
  public List<String> getQueryStrings() {
    return queryStrings;
  }

  public void setQueryStrings(List<String> queryStrings) {
    this.queryStrings = queryStrings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CQLPersonalDataMigrationRequest cqLPersonalDataMigrationRequest = (CQLPersonalDataMigrationRequest) o;
    return Objects.equals(this.queryStrings, cqLPersonalDataMigrationRequest.queryStrings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryStrings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CQLPersonalDataMigrationRequest {\n");
    sb.append("    queryStrings: ").append(toIndentedString(queryStrings)).append("\n");
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
    openapiFields.add("queryStrings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("queryStrings");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CQLPersonalDataMigrationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CQLPersonalDataMigrationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CQLPersonalDataMigrationRequest is not found in the empty JSON string", CQLPersonalDataMigrationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CQLPersonalDataMigrationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CQLPersonalDataMigrationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CQLPersonalDataMigrationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("queryStrings") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("queryStrings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `queryStrings` to be an array in the JSON string but got `%s`", jsonObj.get("queryStrings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CQLPersonalDataMigrationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CQLPersonalDataMigrationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CQLPersonalDataMigrationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CQLPersonalDataMigrationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CQLPersonalDataMigrationRequest>() {
           @Override
           public void write(JsonWriter out, CQLPersonalDataMigrationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CQLPersonalDataMigrationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CQLPersonalDataMigrationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CQLPersonalDataMigrationRequest
  * @throws IOException if the JSON string is invalid with respect to CQLPersonalDataMigrationRequest
  */
  public static CQLPersonalDataMigrationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CQLPersonalDataMigrationRequest.class);
  }

 /**
  * Convert an instance of CQLPersonalDataMigrationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

