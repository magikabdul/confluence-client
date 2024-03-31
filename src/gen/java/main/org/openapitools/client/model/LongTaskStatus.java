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
import java.util.List;
import org.openapitools.client.model.LongTaskStatusAdditionalDetails;
import org.openapitools.client.model.LongTaskStatusName;
import org.openapitools.client.model.Message;

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
 * Current status of a long running task  Status keys:  - &#x60;ERROR_UNKNOWN&#x60; - Generic error - &#x60;ERROR_LOCK_FAILED&#x60; - Could not get the lock on destination space - &#x60;ERROR_RELINK&#x60; - Error when relink pages/attachments - &#x60;ERROR_COPY_PAGE&#x60; - Error while copying 1 page - &#x60;WARN_RENAME_PAGE&#x60; - Warning page is rename during copy - &#x60;WARN_IGNORE_COPY_PERMISSION&#x60; - Warning could not copy permission - &#x60;WARN_IGNORE_COPY_ATTACHMENT&#x60; - Warning could not copy attachment - &#x60;WARN_IGNORE_DELETE_PAGE&#x60; - Warning ignoring delete of a non agreed on page - &#x60;STATUS_COPIED_PAGES&#x60; - Message total pages are copied - &#x60;STATUS_COPYING_PAGES&#x60; - Message copy pages - &#x60;STATUS_RELINK_PAGES&#x60; - Message relink pages/attachments - &#x60;STATUS_DELETING_PAGES&#x60; - Message delete pages - &#x60;STATUS_DELETED_PAGES&#x60; - Message total pages are deleted - &#x60;STATUS_MOVING_PAGES&#x60; - Message move pages - &#x60;WARN_IGNORE_VIEW_RESTRICTED&#x60; - Permission changed - view restricted - &#x60;WARN_IGNORE_EDIT_RESTRICTED&#x60; - Permission changed - edit restricted - &#x60;INITIALIZING_TASK&#x60; - Message when initializing task - &#x60;UNKNOWN_STATUS&#x60; - Message when status is unknown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T01:00:55.766609049+02:00[Europe/Warsaw]")
public class LongTaskStatus {
  public static final String SERIALIZED_NAME_ARI = "ari";
  @SerializedName(SERIALIZED_NAME_ARI)
  private String ari;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private LongTaskStatusName name;

  public static final String SERIALIZED_NAME_ELAPSED_TIME = "elapsedTime";
  @SerializedName(SERIALIZED_NAME_ELAPSED_TIME)
  private Long elapsedTime;

  public static final String SERIALIZED_NAME_PERCENTAGE_COMPLETE = "percentageComplete";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_COMPLETE)
  private Integer percentageComplete;

  public static final String SERIALIZED_NAME_SUCCESSFUL = "successful";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL)
  private Boolean successful;

  public static final String SERIALIZED_NAME_FINISHED = "finished";
  @SerializedName(SERIALIZED_NAME_FINISHED)
  private Boolean finished;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<Message> messages = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Message> errors;

  public static final String SERIALIZED_NAME_ADDITIONAL_DETAILS = "additionalDetails";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DETAILS)
  private LongTaskStatusAdditionalDetails additionalDetails;

  public LongTaskStatus() {
  }

  public LongTaskStatus ari(String ari) {
    this.ari = ari;
    return this;
  }

   /**
   * the ARI for the long task, based on its ID
   * @return ari
  **/
  @javax.annotation.Nullable
  public String getAri() {
    return ari;
  }

  public void setAri(String ari) {
    this.ari = ari;
  }


  public LongTaskStatus id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public LongTaskStatus name(LongTaskStatusName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public LongTaskStatusName getName() {
    return name;
  }

  public void setName(LongTaskStatusName name) {
    this.name = name;
  }


  public LongTaskStatus elapsedTime(Long elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * Get elapsedTime
   * @return elapsedTime
  **/
  @javax.annotation.Nonnull
  public Long getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Long elapsedTime) {
    this.elapsedTime = elapsedTime;
  }


  public LongTaskStatus percentageComplete(Integer percentageComplete) {
    this.percentageComplete = percentageComplete;
    return this;
  }

   /**
   * Get percentageComplete
   * @return percentageComplete
  **/
  @javax.annotation.Nonnull
  public Integer getPercentageComplete() {
    return percentageComplete;
  }

  public void setPercentageComplete(Integer percentageComplete) {
    this.percentageComplete = percentageComplete;
  }


  public LongTaskStatus successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @javax.annotation.Nonnull
  public Boolean getSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public LongTaskStatus finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

   /**
   * Get finished
   * @return finished
  **/
  @javax.annotation.Nonnull
  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }


  public LongTaskStatus messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public LongTaskStatus addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nonnull
  public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }


  public LongTaskStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public LongTaskStatus errors(List<Message> errors) {
    this.errors = errors;
    return this;
  }

  public LongTaskStatus addErrorsItem(Message errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<Message> getErrors() {
    return errors;
  }

  public void setErrors(List<Message> errors) {
    this.errors = errors;
  }


  public LongTaskStatus additionalDetails(LongTaskStatusAdditionalDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * Get additionalDetails
   * @return additionalDetails
  **/
  @javax.annotation.Nullable
  public LongTaskStatusAdditionalDetails getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(LongTaskStatusAdditionalDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongTaskStatus longTaskStatus = (LongTaskStatus) o;
    return Objects.equals(this.ari, longTaskStatus.ari) &&
        Objects.equals(this.id, longTaskStatus.id) &&
        Objects.equals(this.name, longTaskStatus.name) &&
        Objects.equals(this.elapsedTime, longTaskStatus.elapsedTime) &&
        Objects.equals(this.percentageComplete, longTaskStatus.percentageComplete) &&
        Objects.equals(this.successful, longTaskStatus.successful) &&
        Objects.equals(this.finished, longTaskStatus.finished) &&
        Objects.equals(this.messages, longTaskStatus.messages) &&
        Objects.equals(this.status, longTaskStatus.status) &&
        Objects.equals(this.errors, longTaskStatus.errors) &&
        Objects.equals(this.additionalDetails, longTaskStatus.additionalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ari, id, name, elapsedTime, percentageComplete, successful, finished, messages, status, errors, additionalDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongTaskStatus {\n");
    sb.append("    ari: ").append(toIndentedString(ari)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    percentageComplete: ").append(toIndentedString(percentageComplete)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
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
    openapiFields.add("ari");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("elapsedTime");
    openapiFields.add("percentageComplete");
    openapiFields.add("successful");
    openapiFields.add("finished");
    openapiFields.add("messages");
    openapiFields.add("status");
    openapiFields.add("errors");
    openapiFields.add("additionalDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("elapsedTime");
    openapiRequiredFields.add("percentageComplete");
    openapiRequiredFields.add("successful");
    openapiRequiredFields.add("finished");
    openapiRequiredFields.add("messages");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LongTaskStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LongTaskStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LongTaskStatus is not found in the empty JSON string", LongTaskStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LongTaskStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LongTaskStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LongTaskStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ari") != null && !jsonObj.get("ari").isJsonNull()) && !jsonObj.get("ari").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ari` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ari").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `name`
      LongTaskStatusName.validateJsonElement(jsonObj.get("name"));
      // ensure the required json array is present
      if (jsonObj.get("messages") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull() && !jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }
      // validate the optional field `additionalDetails`
      if (jsonObj.get("additionalDetails") != null && !jsonObj.get("additionalDetails").isJsonNull()) {
        LongTaskStatusAdditionalDetails.validateJsonElement(jsonObj.get("additionalDetails"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LongTaskStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LongTaskStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LongTaskStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LongTaskStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<LongTaskStatus>() {
           @Override
           public void write(JsonWriter out, LongTaskStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LongTaskStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LongTaskStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LongTaskStatus
  * @throws IOException if the JSON string is invalid with respect to LongTaskStatus
  */
  public static LongTaskStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LongTaskStatus.class);
  }

 /**
  * Convert an instance of LongTaskStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

