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
import cloud.cholewa.confluence.model.ContentRestrictionUpdate;
import cloud.cholewa.confluence.model.GenericLinksValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * ContentRestrictionAddOrUpdateArrayOneOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContentRestrictionAddOrUpdateArrayOneOf {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<ContentRestrictionUpdate> results = new ArrayList<>();

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_RESTRICTIONS_HASH = "restrictionsHash";
  @SerializedName(SERIALIZED_NAME_RESTRICTIONS_HASH)
  private String restrictionsHash;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, GenericLinksValue> links = new HashMap<>();

  public ContentRestrictionAddOrUpdateArrayOneOf() {
  }

  public ContentRestrictionAddOrUpdateArrayOneOf results(List<ContentRestrictionUpdate> results) {
    this.results = results;
    return this;
  }

  public ContentRestrictionAddOrUpdateArrayOneOf addResultsItem(ContentRestrictionUpdate resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nonnull
  public List<ContentRestrictionUpdate> getResults() {
    return results;
  }

  public void setResults(List<ContentRestrictionUpdate> results) {
    this.results = results;
  }


  public ContentRestrictionAddOrUpdateArrayOneOf start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }


  public ContentRestrictionAddOrUpdateArrayOneOf limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public ContentRestrictionAddOrUpdateArrayOneOf size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  public ContentRestrictionAddOrUpdateArrayOneOf restrictionsHash(String restrictionsHash) {
    this.restrictionsHash = restrictionsHash;
    return this;
  }

   /**
   * This property is used by the UI to figure out whether a set of restrictions has changed.
   * @return restrictionsHash
  **/
  @javax.annotation.Nullable
  public String getRestrictionsHash() {
    return restrictionsHash;
  }

  public void setRestrictionsHash(String restrictionsHash) {
    this.restrictionsHash = restrictionsHash;
  }


  public ContentRestrictionAddOrUpdateArrayOneOf links(Map<String, GenericLinksValue> links) {
    this.links = links;
    return this;
  }

  public ContentRestrictionAddOrUpdateArrayOneOf putLinksItem(String key, GenericLinksValue linksItem) {
    if (this.links == null) {
      this.links = new HashMap<>();
    }
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public Map<String, GenericLinksValue> getLinks() {
    return links;
  }

  public void setLinks(Map<String, GenericLinksValue> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentRestrictionAddOrUpdateArrayOneOf contentRestrictionAddOrUpdateArrayOneOf = (ContentRestrictionAddOrUpdateArrayOneOf) o;
    return Objects.equals(this.results, contentRestrictionAddOrUpdateArrayOneOf.results) &&
        Objects.equals(this.start, contentRestrictionAddOrUpdateArrayOneOf.start) &&
        Objects.equals(this.limit, contentRestrictionAddOrUpdateArrayOneOf.limit) &&
        Objects.equals(this.size, contentRestrictionAddOrUpdateArrayOneOf.size) &&
        Objects.equals(this.restrictionsHash, contentRestrictionAddOrUpdateArrayOneOf.restrictionsHash) &&
        Objects.equals(this.links, contentRestrictionAddOrUpdateArrayOneOf.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, start, limit, size, restrictionsHash, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentRestrictionAddOrUpdateArrayOneOf {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    restrictionsHash: ").append(toIndentedString(restrictionsHash)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("results");
    openapiFields.add("start");
    openapiFields.add("limit");
    openapiFields.add("size");
    openapiFields.add("restrictionsHash");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("results");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ContentRestrictionAddOrUpdateArrayOneOf
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContentRestrictionAddOrUpdateArrayOneOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContentRestrictionAddOrUpdateArrayOneOf is not found in the empty JSON string", ContentRestrictionAddOrUpdateArrayOneOf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContentRestrictionAddOrUpdateArrayOneOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContentRestrictionAddOrUpdateArrayOneOf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContentRestrictionAddOrUpdateArrayOneOf.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
      }

      JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
      // validate the required field `results` (array)
      for (int i = 0; i < jsonArrayresults.size(); i++) {
        ContentRestrictionUpdate.validateJsonElement(jsonArrayresults.get(i));
      };
      if ((jsonObj.get("restrictionsHash") != null && !jsonObj.get("restrictionsHash").isJsonNull()) && !jsonObj.get("restrictionsHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restrictionsHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restrictionsHash").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentRestrictionAddOrUpdateArrayOneOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentRestrictionAddOrUpdateArrayOneOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentRestrictionAddOrUpdateArrayOneOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentRestrictionAddOrUpdateArrayOneOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentRestrictionAddOrUpdateArrayOneOf>() {
           @Override
           public void write(JsonWriter out, ContentRestrictionAddOrUpdateArrayOneOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContentRestrictionAddOrUpdateArrayOneOf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContentRestrictionAddOrUpdateArrayOneOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContentRestrictionAddOrUpdateArrayOneOf
  * @throws IOException if the JSON string is invalid with respect to ContentRestrictionAddOrUpdateArrayOneOf
  */
  public static ContentRestrictionAddOrUpdateArrayOneOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentRestrictionAddOrUpdateArrayOneOf.class);
  }

 /**
  * Convert an instance of ContentRestrictionAddOrUpdateArrayOneOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

