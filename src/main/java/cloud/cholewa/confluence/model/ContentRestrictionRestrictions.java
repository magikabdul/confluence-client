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
import cloud.cholewa.confluence.model.ContentRestrictionRestrictionsExpandable;
import cloud.cholewa.confluence.model.GroupArray;
import cloud.cholewa.confluence.model.UserArray;
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
 * ContentRestrictionRestrictions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContentRestrictionRestrictions {
  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserArray user;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private GroupArray group;

  public static final String SERIALIZED_NAME_EXPANDABLE = "_expandable";
  @SerializedName(SERIALIZED_NAME_EXPANDABLE)
  private ContentRestrictionRestrictionsExpandable expandable;

  public ContentRestrictionRestrictions() {
  }

  public ContentRestrictionRestrictions user(UserArray user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  public UserArray getUser() {
    return user;
  }

  public void setUser(UserArray user) {
    this.user = user;
  }


  public ContentRestrictionRestrictions group(GroupArray group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  public GroupArray getGroup() {
    return group;
  }

  public void setGroup(GroupArray group) {
    this.group = group;
  }


  public ContentRestrictionRestrictions expandable(ContentRestrictionRestrictionsExpandable expandable) {
    this.expandable = expandable;
    return this;
  }

   /**
   * Get expandable
   * @return expandable
  **/
  @javax.annotation.Nullable
  public ContentRestrictionRestrictionsExpandable getExpandable() {
    return expandable;
  }

  public void setExpandable(ContentRestrictionRestrictionsExpandable expandable) {
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
    ContentRestrictionRestrictions contentRestrictionRestrictions = (ContentRestrictionRestrictions) o;
    return Objects.equals(this.user, contentRestrictionRestrictions.user) &&
        Objects.equals(this.group, contentRestrictionRestrictions.group) &&
        Objects.equals(this.expandable, contentRestrictionRestrictions.expandable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, group, expandable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentRestrictionRestrictions {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
    openapiFields.add("user");
    openapiFields.add("group");
    openapiFields.add("_expandable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ContentRestrictionRestrictions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContentRestrictionRestrictions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContentRestrictionRestrictions is not found in the empty JSON string", ContentRestrictionRestrictions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContentRestrictionRestrictions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContentRestrictionRestrictions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        UserArray.validateJsonElement(jsonObj.get("user"));
      }
      // validate the optional field `group`
      if (jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) {
        GroupArray.validateJsonElement(jsonObj.get("group"));
      }
      // validate the optional field `_expandable`
      if (jsonObj.get("_expandable") != null && !jsonObj.get("_expandable").isJsonNull()) {
        ContentRestrictionRestrictionsExpandable.validateJsonElement(jsonObj.get("_expandable"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentRestrictionRestrictions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentRestrictionRestrictions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentRestrictionRestrictions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentRestrictionRestrictions.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentRestrictionRestrictions>() {
           @Override
           public void write(JsonWriter out, ContentRestrictionRestrictions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContentRestrictionRestrictions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContentRestrictionRestrictions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContentRestrictionRestrictions
  * @throws IOException if the JSON string is invalid with respect to ContentRestrictionRestrictions
  */
  public static ContentRestrictionRestrictions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentRestrictionRestrictions.class);
  }

 /**
  * Convert an instance of ContentRestrictionRestrictions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

