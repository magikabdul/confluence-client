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
import cloud.cholewa.confluence.model.SuperBatchWebResourcesTags;
import cloud.cholewa.confluence.model.SuperBatchWebResourcesUris;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
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
 * SuperBatchWebResources
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SuperBatchWebResources {
  public static final String SERIALIZED_NAME_URIS = "uris";
  @SerializedName(SERIALIZED_NAME_URIS)
  private SuperBatchWebResourcesUris uris;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private SuperBatchWebResourcesTags tags;

  public static final String SERIALIZED_NAME_METATAGS = "metatags";
  @SerializedName(SERIALIZED_NAME_METATAGS)
  private String metatags;

  public static final String SERIALIZED_NAME_EXPANDABLE = "_expandable";
  @SerializedName(SERIALIZED_NAME_EXPANDABLE)
  private Map<String, Object> expandable = new HashMap<>();

  public SuperBatchWebResources() {
  }

  public SuperBatchWebResources uris(SuperBatchWebResourcesUris uris) {
    this.uris = uris;
    return this;
  }

   /**
   * Get uris
   * @return uris
  **/
  @javax.annotation.Nullable
  public SuperBatchWebResourcesUris getUris() {
    return uris;
  }

  public void setUris(SuperBatchWebResourcesUris uris) {
    this.uris = uris;
  }


  public SuperBatchWebResources tags(SuperBatchWebResourcesTags tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public SuperBatchWebResourcesTags getTags() {
    return tags;
  }

  public void setTags(SuperBatchWebResourcesTags tags) {
    this.tags = tags;
  }


  public SuperBatchWebResources metatags(String metatags) {
    this.metatags = metatags;
    return this;
  }

   /**
   * Get metatags
   * @return metatags
  **/
  @javax.annotation.Nullable
  public String getMetatags() {
    return metatags;
  }

  public void setMetatags(String metatags) {
    this.metatags = metatags;
  }


  public SuperBatchWebResources expandable(Map<String, Object> expandable) {
    this.expandable = expandable;
    return this;
  }

  public SuperBatchWebResources putExpandableItem(String key, Object expandableItem) {
    if (this.expandable == null) {
      this.expandable = new HashMap<>();
    }
    this.expandable.put(key, expandableItem);
    return this;
  }

   /**
   * Get expandable
   * @return expandable
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getExpandable() {
    return expandable;
  }

  public void setExpandable(Map<String, Object> expandable) {
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
    SuperBatchWebResources superBatchWebResources = (SuperBatchWebResources) o;
    return Objects.equals(this.uris, superBatchWebResources.uris) &&
        Objects.equals(this.tags, superBatchWebResources.tags) &&
        Objects.equals(this.metatags, superBatchWebResources.metatags) &&
        Objects.equals(this.expandable, superBatchWebResources.expandable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uris, tags, metatags, expandable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperBatchWebResources {\n");
    sb.append("    uris: ").append(toIndentedString(uris)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metatags: ").append(toIndentedString(metatags)).append("\n");
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
    openapiFields.add("uris");
    openapiFields.add("tags");
    openapiFields.add("metatags");
    openapiFields.add("_expandable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SuperBatchWebResources
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SuperBatchWebResources.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuperBatchWebResources is not found in the empty JSON string", SuperBatchWebResources.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SuperBatchWebResources.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuperBatchWebResources` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `uris`
      if (jsonObj.get("uris") != null && !jsonObj.get("uris").isJsonNull()) {
        SuperBatchWebResourcesUris.validateJsonElement(jsonObj.get("uris"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        SuperBatchWebResourcesTags.validateJsonElement(jsonObj.get("tags"));
      }
      if ((jsonObj.get("metatags") != null && !jsonObj.get("metatags").isJsonNull()) && !jsonObj.get("metatags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metatags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metatags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuperBatchWebResources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuperBatchWebResources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuperBatchWebResources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuperBatchWebResources.class));

       return (TypeAdapter<T>) new TypeAdapter<SuperBatchWebResources>() {
           @Override
           public void write(JsonWriter out, SuperBatchWebResources value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuperBatchWebResources read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuperBatchWebResources given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuperBatchWebResources
  * @throws IOException if the JSON string is invalid with respect to SuperBatchWebResources
  */
  public static SuperBatchWebResources fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuperBatchWebResources.class);
  }

 /**
  * Convert an instance of SuperBatchWebResources to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

