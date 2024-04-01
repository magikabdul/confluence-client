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
import cloud.cholewa.confluence.model.Icon;
import cloud.cholewa.confluence.model.OperationCheckResult;
import cloud.cholewa.confluence.model.UserDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

import cloud.cholewa.confluence.JSON;

/**
 * This essentially the same as the &#x60;User&#x60; object, but no &#x60;_links&#x60; property and no &#x60;_expandable&#x60; property (therefore, different required fields).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WatchUser {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_USER_KEY = "userKey";
  @SerializedName(SERIALIZED_NAME_USER_KEY)
  private String userKey;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_PROFILE_PICTURE = "profilePicture";
  @SerializedName(SERIALIZED_NAME_PROFILE_PICTURE)
  private Icon profilePicture;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  private List<OperationCheckResult> operations;

  public static final String SERIALIZED_NAME_IS_EXTERNAL_COLLABORATOR = "isExternalCollaborator";
  @SerializedName(SERIALIZED_NAME_IS_EXTERNAL_COLLABORATOR)
  private Boolean isExternalCollaborator;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private UserDetails details;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PUBLIC_NAME = "publicName";
  @SerializedName(SERIALIZED_NAME_PUBLIC_NAME)
  private String publicName;

  public static final String SERIALIZED_NAME_PERSONAL_SPACE = "personalSpace";
  @SerializedName(SERIALIZED_NAME_PERSONAL_SPACE)
  private Object personalSpace;

  public static final String SERIALIZED_NAME_EXTERNAL_COLLABORATOR = "externalCollaborator";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_COLLABORATOR)
  private Boolean externalCollaborator;

  public WatchUser() {
  }

  public WatchUser type(String type) {
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


  public WatchUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. Use &#x60;accountId&#x60; instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public WatchUser userKey(String userKey) {
    this.userKey = userKey;
    return this;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. Use &#x60;accountId&#x60; instead. See the [deprecation notice](/cloud/confluence/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return userKey
  **/
  @javax.annotation.Nullable
  public String getUserKey() {
    return userKey;
  }

  public void setUserKey(String userKey) {
    this.userKey = userKey;
  }


  public WatchUser accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, &#x60;384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192&#x60;.
   * @return accountId
  **/
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public WatchUser profilePicture(Icon profilePicture) {
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


  public WatchUser displayName(String displayName) {
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


  public WatchUser timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @javax.annotation.Nullable
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public WatchUser operations(List<OperationCheckResult> operations) {
    this.operations = operations;
    return this;
  }

  public WatchUser addOperationsItem(OperationCheckResult operationsItem) {
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


  public WatchUser isExternalCollaborator(Boolean isExternalCollaborator) {
    this.isExternalCollaborator = isExternalCollaborator;
    return this;
  }

   /**
   * Get isExternalCollaborator
   * @return isExternalCollaborator
  **/
  @javax.annotation.Nonnull
  public Boolean getIsExternalCollaborator() {
    return isExternalCollaborator;
  }

  public void setIsExternalCollaborator(Boolean isExternalCollaborator) {
    this.isExternalCollaborator = isExternalCollaborator;
  }


  public WatchUser details(UserDetails details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  public UserDetails getDetails() {
    return details;
  }

  public void setDetails(UserDetails details) {
    this.details = details;
  }


  public WatchUser accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public WatchUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public WatchUser publicName(String publicName) {
    this.publicName = publicName;
    return this;
  }

   /**
   * Get publicName
   * @return publicName
  **/
  @javax.annotation.Nonnull
  public String getPublicName() {
    return publicName;
  }

  public void setPublicName(String publicName) {
    this.publicName = publicName;
  }


  public WatchUser personalSpace(Object personalSpace) {
    this.personalSpace = personalSpace;
    return this;
  }

   /**
   * Get personalSpace
   * @return personalSpace
  **/
  @javax.annotation.Nullable
  public Object getPersonalSpace() {
    return personalSpace;
  }

  public void setPersonalSpace(Object personalSpace) {
    this.personalSpace = personalSpace;
  }


  public WatchUser externalCollaborator(Boolean externalCollaborator) {
    this.externalCollaborator = externalCollaborator;
    return this;
  }

   /**
   * Get externalCollaborator
   * @return externalCollaborator
  **/
  @javax.annotation.Nonnull
  public Boolean getExternalCollaborator() {
    return externalCollaborator;
  }

  public void setExternalCollaborator(Boolean externalCollaborator) {
    this.externalCollaborator = externalCollaborator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchUser watchUser = (WatchUser) o;
    return Objects.equals(this.type, watchUser.type) &&
        Objects.equals(this.username, watchUser.username) &&
        Objects.equals(this.userKey, watchUser.userKey) &&
        Objects.equals(this.accountId, watchUser.accountId) &&
        Objects.equals(this.profilePicture, watchUser.profilePicture) &&
        Objects.equals(this.displayName, watchUser.displayName) &&
        Objects.equals(this.timeZone, watchUser.timeZone) &&
        Objects.equals(this.operations, watchUser.operations) &&
        Objects.equals(this.isExternalCollaborator, watchUser.isExternalCollaborator) &&
        Objects.equals(this.details, watchUser.details) &&
        Objects.equals(this.accountType, watchUser.accountType) &&
        Objects.equals(this.email, watchUser.email) &&
        Objects.equals(this.publicName, watchUser.publicName) &&
        Objects.equals(this.personalSpace, watchUser.personalSpace) &&
        Objects.equals(this.externalCollaborator, watchUser.externalCollaborator);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, username, userKey, accountId, profilePicture, displayName, timeZone, operations, isExternalCollaborator, details, accountType, email, publicName, personalSpace, externalCollaborator);
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
    sb.append("class WatchUser {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userKey: ").append(toIndentedString(userKey)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    isExternalCollaborator: ").append(toIndentedString(isExternalCollaborator)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    publicName: ").append(toIndentedString(publicName)).append("\n");
    sb.append("    personalSpace: ").append(toIndentedString(personalSpace)).append("\n");
    sb.append("    externalCollaborator: ").append(toIndentedString(externalCollaborator)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("userKey");
    openapiFields.add("accountId");
    openapiFields.add("profilePicture");
    openapiFields.add("displayName");
    openapiFields.add("timeZone");
    openapiFields.add("operations");
    openapiFields.add("isExternalCollaborator");
    openapiFields.add("details");
    openapiFields.add("accountType");
    openapiFields.add("email");
    openapiFields.add("publicName");
    openapiFields.add("personalSpace");
    openapiFields.add("externalCollaborator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("accountId");
    openapiRequiredFields.add("profilePicture");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("operations");
    openapiRequiredFields.add("isExternalCollaborator");
    openapiRequiredFields.add("accountType");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("publicName");
    openapiRequiredFields.add("personalSpace");
    openapiRequiredFields.add("externalCollaborator");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WatchUser
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WatchUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WatchUser is not found in the empty JSON string", WatchUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WatchUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WatchUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WatchUser.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("userKey") != null && !jsonObj.get("userKey").isJsonNull()) && !jsonObj.get("userKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userKey").toString()));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      // validate the required field `profilePicture`
      Icon.validateJsonElement(jsonObj.get("profilePicture"));
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("timeZone") != null && !jsonObj.get("timeZone").isJsonNull()) && !jsonObj.get("timeZone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZone").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("operations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operations` to be an array in the JSON string but got `%s`", jsonObj.get("operations").toString()));
      }

      JsonArray jsonArrayoperations = jsonObj.getAsJsonArray("operations");
      // validate the required field `operations` (array)
      for (int i = 0; i < jsonArrayoperations.size(); i++) {
        OperationCheckResult.validateJsonElement(jsonArrayoperations.get(i));
      };
      // validate the optional field `details`
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        UserDetails.validateJsonElement(jsonObj.get("details"));
      }
      if (!jsonObj.get("accountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("publicName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WatchUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WatchUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WatchUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WatchUser.class));

       return (TypeAdapter<T>) new TypeAdapter<WatchUser>() {
           @Override
           public void write(JsonWriter out, WatchUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WatchUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WatchUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WatchUser
  * @throws IOException if the JSON string is invalid with respect to WatchUser
  */
  public static WatchUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WatchUser.class);
  }

 /**
  * Convert an instance of WatchUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

