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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.GenericLinksValue;
import org.openapitools.client.model.Icon;
import org.openapitools.client.model.OperationCheckResult;
import org.openapitools.client.model.UserAnonymousExpandable;

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
 * UserAnonymous
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T01:00:55.766609049+02:00[Europe/Warsaw]")
public class UserAnonymous {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PROFILE_PICTURE = "profilePicture";
  @SerializedName(SERIALIZED_NAME_PROFILE_PICTURE)
  private Icon profilePicture;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  private List<OperationCheckResult> operations;

  public static final String SERIALIZED_NAME_IS_EXTERNAL_COLLABORATOR = "isExternalCollaborator";
  @SerializedName(SERIALIZED_NAME_IS_EXTERNAL_COLLABORATOR)
  private Boolean isExternalCollaborator;

  public static final String SERIALIZED_NAME_EXPANDABLE = "_expandable";
  @SerializedName(SERIALIZED_NAME_EXPANDABLE)
  private UserAnonymousExpandable expandable;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, GenericLinksValue> links = new HashMap<>();

  public UserAnonymous() {
  }

  public UserAnonymous type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public UserAnonymous profilePicture(Icon profilePicture) {
    this.profilePicture = profilePicture;
    return this;
  }

   /**
   * Get profilePicture
   * @return profilePicture
  **/
  @javax.annotation.Nullable
  public Icon getProfilePicture() {
    return profilePicture;
  }

  public void setProfilePicture(Icon profilePicture) {
    this.profilePicture = profilePicture;
  }


  public UserAnonymous displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public UserAnonymous operations(List<OperationCheckResult> operations) {
    this.operations = operations;
    return this;
  }

  public UserAnonymous addOperationsItem(OperationCheckResult operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @javax.annotation.Nullable
  public List<OperationCheckResult> getOperations() {
    return operations;
  }

  public void setOperations(List<OperationCheckResult> operations) {
    this.operations = operations;
  }


  public UserAnonymous isExternalCollaborator(Boolean isExternalCollaborator) {
    this.isExternalCollaborator = isExternalCollaborator;
    return this;
  }

   /**
   * Whether the user is an external collaborator user
   * @return isExternalCollaborator
  **/
  @javax.annotation.Nullable
  public Boolean getIsExternalCollaborator() {
    return isExternalCollaborator;
  }

  public void setIsExternalCollaborator(Boolean isExternalCollaborator) {
    this.isExternalCollaborator = isExternalCollaborator;
  }


  public UserAnonymous expandable(UserAnonymousExpandable expandable) {
    this.expandable = expandable;
    return this;
  }

   /**
   * Get expandable
   * @return expandable
  **/
  @javax.annotation.Nullable
  public UserAnonymousExpandable getExpandable() {
    return expandable;
  }

  public void setExpandable(UserAnonymousExpandable expandable) {
    this.expandable = expandable;
  }


  public UserAnonymous links(Map<String, GenericLinksValue> links) {
    this.links = links;
    return this;
  }

  public UserAnonymous putLinksItem(String key, GenericLinksValue linksItem) {
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
  @javax.annotation.Nonnull
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
    UserAnonymous userAnonymous = (UserAnonymous) o;
    return Objects.equals(this.type, userAnonymous.type) &&
        Objects.equals(this.profilePicture, userAnonymous.profilePicture) &&
        Objects.equals(this.displayName, userAnonymous.displayName) &&
        Objects.equals(this.operations, userAnonymous.operations) &&
        Objects.equals(this.isExternalCollaborator, userAnonymous.isExternalCollaborator) &&
        Objects.equals(this.expandable, userAnonymous.expandable) &&
        Objects.equals(this.links, userAnonymous.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, profilePicture, displayName, operations, isExternalCollaborator, expandable, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAnonymous {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    isExternalCollaborator: ").append(toIndentedString(isExternalCollaborator)).append("\n");
    sb.append("    expandable: ").append(toIndentedString(expandable)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("profilePicture");
    openapiFields.add("displayName");
    openapiFields.add("operations");
    openapiFields.add("isExternalCollaborator");
    openapiFields.add("_expandable");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("profilePicture");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("_links");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UserAnonymous
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserAnonymous.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserAnonymous is not found in the empty JSON string", UserAnonymous.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserAnonymous.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserAnonymous` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserAnonymous.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `profilePicture`
      Icon.validateJsonElement(jsonObj.get("profilePicture"));
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (jsonObj.get("operations") != null && !jsonObj.get("operations").isJsonNull()) {
        JsonArray jsonArrayoperations = jsonObj.getAsJsonArray("operations");
        if (jsonArrayoperations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("operations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `operations` to be an array in the JSON string but got `%s`", jsonObj.get("operations").toString()));
          }

          // validate the optional field `operations` (array)
          for (int i = 0; i < jsonArrayoperations.size(); i++) {
            OperationCheckResult.validateJsonElement(jsonArrayoperations.get(i));
          };
        }
      }
      // validate the optional field `_expandable`
      if (jsonObj.get("_expandable") != null && !jsonObj.get("_expandable").isJsonNull()) {
        UserAnonymousExpandable.validateJsonElement(jsonObj.get("_expandable"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserAnonymous.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserAnonymous' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserAnonymous> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserAnonymous.class));

       return (TypeAdapter<T>) new TypeAdapter<UserAnonymous>() {
           @Override
           public void write(JsonWriter out, UserAnonymous value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserAnonymous read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserAnonymous given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserAnonymous
  * @throws IOException if the JSON string is invalid with respect to UserAnonymous
  */
  public static UserAnonymous fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserAnonymous.class);
  }

 /**
  * Convert an instance of UserAnonymous to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

