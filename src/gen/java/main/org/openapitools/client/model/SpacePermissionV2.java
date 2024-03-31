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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.GenericLinksValue;
import org.openapitools.client.model.PermissionSubject;
import org.openapitools.client.model.SpacePermissionV2Operation;

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
 * This object represents a single space permission. Permissions consist of at least one operation object with an accompanying subjects object.  The following combinations of &#x60;operation.key&#x60; and &#x60;operation.target&#x60; values are valid for the &#x60;operation&#x60; object: &#x60;&#x60;&#x60; bash &#39;create&#39;: &#39;page&#39;, &#39;blogpost&#39;, &#39;comment&#39;, &#39;attachment&#39; &#39;read&#39;: &#39;space&#39; &#39;delete&#39;: &#39;page&#39;, &#39;blogpost&#39;, &#39;comment&#39;, &#39;attachment&#39;, &#39;space&#39; &#39;export&#39;: &#39;space&#39; &#39;administer&#39;: &#39;space&#39; &#39;archive&#39;: &#39;page&#39; &#39;restrict_content&#39;: &#39;space&#39; &#x60;&#x60;&#x60;  For example, to enable Delete Own permission, set the &#x60;operation&#x60; object to the following: &#x60;&#x60;&#x60; \&quot;operation\&quot;: {     \&quot;key\&quot;: \&quot;delete\&quot;,     \&quot;target\&quot;: \&quot;space\&quot; } &#x60;&#x60;&#x60; To enable Add/Delete Restrictions permissions, set the &#x60;operation&#x60; object to the following: &#x60;&#x60;&#x60; \&quot;operation\&quot;: {     \&quot;key\&quot;: \&quot;restrict_content\&quot;,     \&quot;target\&quot;: \&quot;space\&quot; } &#x60;&#x60;&#x60;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T01:00:55.766609049+02:00[Europe/Warsaw]")
public class SpacePermissionV2 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private PermissionSubject subject;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private SpacePermissionV2Operation operation;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, GenericLinksValue> links = new HashMap<>();

  public SpacePermissionV2() {
  }

  public SpacePermissionV2 id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public SpacePermissionV2 subject(PermissionSubject subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nonnull
  public PermissionSubject getSubject() {
    return subject;
  }

  public void setSubject(PermissionSubject subject) {
    this.subject = subject;
  }


  public SpacePermissionV2 operation(SpacePermissionV2Operation operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nonnull
  public SpacePermissionV2Operation getOperation() {
    return operation;
  }

  public void setOperation(SpacePermissionV2Operation operation) {
    this.operation = operation;
  }


  public SpacePermissionV2 links(Map<String, GenericLinksValue> links) {
    this.links = links;
    return this;
  }

  public SpacePermissionV2 putLinksItem(String key, GenericLinksValue linksItem) {
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
    SpacePermissionV2 spacePermissionV2 = (SpacePermissionV2) o;
    return Objects.equals(this.id, spacePermissionV2.id) &&
        Objects.equals(this.subject, spacePermissionV2.subject) &&
        Objects.equals(this.operation, spacePermissionV2.operation) &&
        Objects.equals(this.links, spacePermissionV2.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subject, operation, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpacePermissionV2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("subject");
    openapiFields.add("operation");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("subject");
    openapiRequiredFields.add("operation");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SpacePermissionV2
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SpacePermissionV2.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpacePermissionV2 is not found in the empty JSON string", SpacePermissionV2.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SpacePermissionV2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpacePermissionV2` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SpacePermissionV2.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `subject`
      PermissionSubject.validateJsonElement(jsonObj.get("subject"));
      // validate the required field `operation`
      SpacePermissionV2Operation.validateJsonElement(jsonObj.get("operation"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpacePermissionV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpacePermissionV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpacePermissionV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpacePermissionV2.class));

       return (TypeAdapter<T>) new TypeAdapter<SpacePermissionV2>() {
           @Override
           public void write(JsonWriter out, SpacePermissionV2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpacePermissionV2 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SpacePermissionV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpacePermissionV2
  * @throws IOException if the JSON string is invalid with respect to SpacePermissionV2
  */
  public static SpacePermissionV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpacePermissionV2.class);
  }

 /**
  * Convert an instance of SpacePermissionV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

