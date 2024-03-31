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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.Content;
import org.openapitools.client.model.GenericLinksValue;
import org.openapitools.client.model.User;
import org.openapitools.client.model.UsersUserKeys;
import org.openapitools.client.model.VersionExpandable;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Version
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T01:00:55.766609049+02:00[Europe/Warsaw]")
public class Version {
  public static final String SERIALIZED_NAME_BY = "by";
  @SerializedName(SERIALIZED_NAME_BY)
  private User by;

  public static final String SERIALIZED_NAME_WHEN = "when";
  @SerializedName(SERIALIZED_NAME_WHEN)
  private OffsetDateTime when;

  public static final String SERIALIZED_NAME_FRIENDLY_WHEN = "friendlyWhen";
  @SerializedName(SERIALIZED_NAME_FRIENDLY_WHEN)
  private String friendlyWhen;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_MINOR_EDIT = "minorEdit";
  @SerializedName(SERIALIZED_NAME_MINOR_EDIT)
  private Boolean minorEdit;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private Content content;

  public static final String SERIALIZED_NAME_COLLABORATORS = "collaborators";
  @SerializedName(SERIALIZED_NAME_COLLABORATORS)
  private UsersUserKeys collaborators;

  public static final String SERIALIZED_NAME_EXPANDABLE = "_expandable";
  @SerializedName(SERIALIZED_NAME_EXPANDABLE)
  private VersionExpandable expandable;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, GenericLinksValue> links = new HashMap<>();

  public static final String SERIALIZED_NAME_CONTENT_TYPE_MODIFIED = "contentTypeModified";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE_MODIFIED)
  private Boolean contentTypeModified;

  public static final String SERIALIZED_NAME_CONF_REV = "confRev";
  @SerializedName(SERIALIZED_NAME_CONF_REV)
  private String confRev;

  public static final String SERIALIZED_NAME_SYNC_REV = "syncRev";
  @SerializedName(SERIALIZED_NAME_SYNC_REV)
  private String syncRev;

  public static final String SERIALIZED_NAME_SYNC_REV_SOURCE = "syncRevSource";
  @SerializedName(SERIALIZED_NAME_SYNC_REV_SOURCE)
  private String syncRevSource;

  public Version() {
  }

  public Version by(User by) {
    this.by = by;
    return this;
  }

   /**
   * Get by
   * @return by
  **/
  @javax.annotation.Nullable
  public User getBy() {
    return by;
  }

  public void setBy(User by) {
    this.by = by;
  }


  public Version when(OffsetDateTime when) {
    this.when = when;
    return this;
  }

   /**
   * Get when
   * @return when
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getWhen() {
    return when;
  }

  public void setWhen(OffsetDateTime when) {
    this.when = when;
  }


  public Version friendlyWhen(String friendlyWhen) {
    this.friendlyWhen = friendlyWhen;
    return this;
  }

   /**
   * Get friendlyWhen
   * @return friendlyWhen
  **/
  @javax.annotation.Nullable
  public String getFriendlyWhen() {
    return friendlyWhen;
  }

  public void setFriendlyWhen(String friendlyWhen) {
    this.friendlyWhen = friendlyWhen;
  }


  public Version message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public Version number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Set this to the current version number incremented by one
   * @return number
  **/
  @javax.annotation.Nonnull
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }


  public Version minorEdit(Boolean minorEdit) {
    this.minorEdit = minorEdit;
    return this;
  }

   /**
   * If &#x60;minorEdit&#x60; is set to &#39;true&#39;, no notification email or activity stream will be generated for the change.
   * @return minorEdit
  **/
  @javax.annotation.Nonnull
  public Boolean getMinorEdit() {
    return minorEdit;
  }

  public void setMinorEdit(Boolean minorEdit) {
    this.minorEdit = minorEdit;
  }


  public Version content(Content content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  public Content getContent() {
    return content;
  }

  public void setContent(Content content) {
    this.content = content;
  }


  public Version collaborators(UsersUserKeys collaborators) {
    this.collaborators = collaborators;
    return this;
  }

   /**
   * Get collaborators
   * @return collaborators
  **/
  @javax.annotation.Nullable
  public UsersUserKeys getCollaborators() {
    return collaborators;
  }

  public void setCollaborators(UsersUserKeys collaborators) {
    this.collaborators = collaborators;
  }


  public Version expandable(VersionExpandable expandable) {
    this.expandable = expandable;
    return this;
  }

   /**
   * Get expandable
   * @return expandable
  **/
  @javax.annotation.Nullable
  public VersionExpandable getExpandable() {
    return expandable;
  }

  public void setExpandable(VersionExpandable expandable) {
    this.expandable = expandable;
  }


  public Version links(Map<String, GenericLinksValue> links) {
    this.links = links;
    return this;
  }

  public Version putLinksItem(String key, GenericLinksValue linksItem) {
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


  public Version contentTypeModified(Boolean contentTypeModified) {
    this.contentTypeModified = contentTypeModified;
    return this;
  }

   /**
   * True if content type is modifed in this version (e.g. page to blog)
   * @return contentTypeModified
  **/
  @javax.annotation.Nullable
  public Boolean getContentTypeModified() {
    return contentTypeModified;
  }

  public void setContentTypeModified(Boolean contentTypeModified) {
    this.contentTypeModified = contentTypeModified;
  }


  public Version confRev(String confRev) {
    this.confRev = confRev;
    return this;
  }

   /**
   * The revision id provided by confluence to be used as a revision in Synchrony
   * @return confRev
  **/
  @javax.annotation.Nullable
  public String getConfRev() {
    return confRev;
  }

  public void setConfRev(String confRev) {
    this.confRev = confRev;
  }


  public Version syncRev(String syncRev) {
    this.syncRev = syncRev;
    return this;
  }

   /**
   * The revision id provided by Synchrony
   * @return syncRev
  **/
  @javax.annotation.Nullable
  public String getSyncRev() {
    return syncRev;
  }

  public void setSyncRev(String syncRev) {
    this.syncRev = syncRev;
  }


  public Version syncRevSource(String syncRevSource) {
    this.syncRevSource = syncRevSource;
    return this;
  }

   /**
   * Source of the synchrony revision
   * @return syncRevSource
  **/
  @javax.annotation.Nullable
  public String getSyncRevSource() {
    return syncRevSource;
  }

  public void setSyncRevSource(String syncRevSource) {
    this.syncRevSource = syncRevSource;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Version instance itself
   */
  public Version putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.by, version.by) &&
        Objects.equals(this.when, version.when) &&
        Objects.equals(this.friendlyWhen, version.friendlyWhen) &&
        Objects.equals(this.message, version.message) &&
        Objects.equals(this.number, version.number) &&
        Objects.equals(this.minorEdit, version.minorEdit) &&
        Objects.equals(this.content, version.content) &&
        Objects.equals(this.collaborators, version.collaborators) &&
        Objects.equals(this.expandable, version.expandable) &&
        Objects.equals(this.links, version.links) &&
        Objects.equals(this.contentTypeModified, version.contentTypeModified) &&
        Objects.equals(this.confRev, version.confRev) &&
        Objects.equals(this.syncRev, version.syncRev) &&
        Objects.equals(this.syncRevSource, version.syncRevSource)&&
        Objects.equals(this.additionalProperties, version.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(by, when, friendlyWhen, message, number, minorEdit, content, collaborators, expandable, links, contentTypeModified, confRev, syncRev, syncRevSource, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    friendlyWhen: ").append(toIndentedString(friendlyWhen)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    minorEdit: ").append(toIndentedString(minorEdit)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    collaborators: ").append(toIndentedString(collaborators)).append("\n");
    sb.append("    expandable: ").append(toIndentedString(expandable)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    contentTypeModified: ").append(toIndentedString(contentTypeModified)).append("\n");
    sb.append("    confRev: ").append(toIndentedString(confRev)).append("\n");
    sb.append("    syncRev: ").append(toIndentedString(syncRev)).append("\n");
    sb.append("    syncRevSource: ").append(toIndentedString(syncRevSource)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("by");
    openapiFields.add("when");
    openapiFields.add("friendlyWhen");
    openapiFields.add("message");
    openapiFields.add("number");
    openapiFields.add("minorEdit");
    openapiFields.add("content");
    openapiFields.add("collaborators");
    openapiFields.add("_expandable");
    openapiFields.add("_links");
    openapiFields.add("contentTypeModified");
    openapiFields.add("confRev");
    openapiFields.add("syncRev");
    openapiFields.add("syncRevSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("when");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("minorEdit");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Version
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Version.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Version is not found in the empty JSON string", Version.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Version.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("friendlyWhen") != null && !jsonObj.get("friendlyWhen").isJsonNull()) && !jsonObj.get("friendlyWhen").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `friendlyWhen` to be a primitive type in the JSON string but got `%s`", jsonObj.get("friendlyWhen").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the optional field `_expandable`
      if (jsonObj.get("_expandable") != null && !jsonObj.get("_expandable").isJsonNull()) {
        VersionExpandable.validateJsonElement(jsonObj.get("_expandable"));
      }
      if ((jsonObj.get("confRev") != null && !jsonObj.get("confRev").isJsonNull()) && !jsonObj.get("confRev").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confRev` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confRev").toString()));
      }
      if ((jsonObj.get("syncRev") != null && !jsonObj.get("syncRev").isJsonNull()) && !jsonObj.get("syncRev").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `syncRev` to be a primitive type in the JSON string but got `%s`", jsonObj.get("syncRev").toString()));
      }
      if ((jsonObj.get("syncRevSource") != null && !jsonObj.get("syncRevSource").isJsonNull()) && !jsonObj.get("syncRevSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `syncRevSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("syncRevSource").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Version.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Version' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Version> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Version.class));

       return (TypeAdapter<T>) new TypeAdapter<Version>() {
           @Override
           public void write(JsonWriter out, Version value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Version read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Version instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Version given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Version
  * @throws IOException if the JSON string is invalid with respect to Version
  */
  public static Version fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Version.class);
  }

 /**
  * Convert an instance of Version to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
