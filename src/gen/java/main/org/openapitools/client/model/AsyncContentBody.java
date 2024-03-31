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
import org.openapitools.client.model.AsyncContentBodyExpandable;
import org.openapitools.client.model.AsyncContentBodyMediaToken;
import org.openapitools.client.model.EmbeddedContent;
import org.openapitools.client.model.GenericLinksValue;
import org.openapitools.client.model.WebResourceDependencies;

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
 * AsyncContentBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T01:00:55.766609049+02:00[Europe/Warsaw]")
public class AsyncContentBody {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  /**
   * Gets or Sets representation
   */
  @JsonAdapter(RepresentationEnum.Adapter.class)
  public enum RepresentationEnum {
    VIEW("view"),
    
    EXPORT_VIEW("export_view"),
    
    STYLED_VIEW("styled_view"),
    
    STORAGE("storage"),
    
    EDITOR("editor"),
    
    EDITOR2("editor2"),
    
    ANONYMOUS_EXPORT_VIEW("anonymous_export_view"),
    
    WIKI("wiki"),
    
    ATLAS_DOC_FORMAT("atlas_doc_format");

    private String value;

    RepresentationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RepresentationEnum fromValue(String value) {
      for (RepresentationEnum b : RepresentationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RepresentationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RepresentationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RepresentationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RepresentationEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RepresentationEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_REPRESENTATION = "representation";
  @SerializedName(SERIALIZED_NAME_REPRESENTATION)
  private RepresentationEnum representation;

  public static final String SERIALIZED_NAME_RENDER_TASK_ID = "renderTaskId";
  @SerializedName(SERIALIZED_NAME_RENDER_TASK_ID)
  private String renderTaskId;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  /**
   * Rerunning is reserved for when the job is working, but there is a previous run&#39;s value in the cache. You may choose to continue polling, or use the cached value.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    WORKING("WORKING"),
    
    QUEUED("QUEUED"),
    
    FAILED("FAILED"),
    
    COMPLETED("COMPLETED"),
    
    RERUNNING("RERUNNING");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_EMBEDDED_CONTENT = "embeddedContent";
  @SerializedName(SERIALIZED_NAME_EMBEDDED_CONTENT)
  private List<EmbeddedContent> embeddedContent;

  public static final String SERIALIZED_NAME_WEBRESOURCE = "webresource";
  @SerializedName(SERIALIZED_NAME_WEBRESOURCE)
  private WebResourceDependencies webresource;

  public static final String SERIALIZED_NAME_MEDIA_TOKEN = "mediaToken";
  @SerializedName(SERIALIZED_NAME_MEDIA_TOKEN)
  private AsyncContentBodyMediaToken mediaToken;

  public static final String SERIALIZED_NAME_EXPANDABLE = "_expandable";
  @SerializedName(SERIALIZED_NAME_EXPANDABLE)
  private AsyncContentBodyExpandable expandable;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, GenericLinksValue> links = new HashMap<>();

  public AsyncContentBody() {
  }

  public AsyncContentBody value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public AsyncContentBody representation(RepresentationEnum representation) {
    this.representation = representation;
    return this;
  }

   /**
   * Get representation
   * @return representation
  **/
  @javax.annotation.Nullable
  public RepresentationEnum getRepresentation() {
    return representation;
  }

  public void setRepresentation(RepresentationEnum representation) {
    this.representation = representation;
  }


  public AsyncContentBody renderTaskId(String renderTaskId) {
    this.renderTaskId = renderTaskId;
    return this;
  }

   /**
   * Get renderTaskId
   * @return renderTaskId
  **/
  @javax.annotation.Nullable
  public String getRenderTaskId() {
    return renderTaskId;
  }

  public void setRenderTaskId(String renderTaskId) {
    this.renderTaskId = renderTaskId;
  }


  public AsyncContentBody error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  public AsyncContentBody status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Rerunning is reserved for when the job is working, but there is a previous run&#39;s value in the cache. You may choose to continue polling, or use the cached value.
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public AsyncContentBody embeddedContent(List<EmbeddedContent> embeddedContent) {
    this.embeddedContent = embeddedContent;
    return this;
  }

  public AsyncContentBody addEmbeddedContentItem(EmbeddedContent embeddedContentItem) {
    if (this.embeddedContent == null) {
      this.embeddedContent = new ArrayList<>();
    }
    this.embeddedContent.add(embeddedContentItem);
    return this;
  }

   /**
   * Get embeddedContent
   * @return embeddedContent
  **/
  @javax.annotation.Nullable
  public List<EmbeddedContent> getEmbeddedContent() {
    return embeddedContent;
  }

  public void setEmbeddedContent(List<EmbeddedContent> embeddedContent) {
    this.embeddedContent = embeddedContent;
  }


  public AsyncContentBody webresource(WebResourceDependencies webresource) {
    this.webresource = webresource;
    return this;
  }

   /**
   * Get webresource
   * @return webresource
  **/
  @javax.annotation.Nullable
  public WebResourceDependencies getWebresource() {
    return webresource;
  }

  public void setWebresource(WebResourceDependencies webresource) {
    this.webresource = webresource;
  }


  public AsyncContentBody mediaToken(AsyncContentBodyMediaToken mediaToken) {
    this.mediaToken = mediaToken;
    return this;
  }

   /**
   * Get mediaToken
   * @return mediaToken
  **/
  @javax.annotation.Nullable
  public AsyncContentBodyMediaToken getMediaToken() {
    return mediaToken;
  }

  public void setMediaToken(AsyncContentBodyMediaToken mediaToken) {
    this.mediaToken = mediaToken;
  }


  public AsyncContentBody expandable(AsyncContentBodyExpandable expandable) {
    this.expandable = expandable;
    return this;
  }

   /**
   * Get expandable
   * @return expandable
  **/
  @javax.annotation.Nullable
  public AsyncContentBodyExpandable getExpandable() {
    return expandable;
  }

  public void setExpandable(AsyncContentBodyExpandable expandable) {
    this.expandable = expandable;
  }


  public AsyncContentBody links(Map<String, GenericLinksValue> links) {
    this.links = links;
    return this;
  }

  public AsyncContentBody putLinksItem(String key, GenericLinksValue linksItem) {
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
    AsyncContentBody asyncContentBody = (AsyncContentBody) o;
    return Objects.equals(this.value, asyncContentBody.value) &&
        Objects.equals(this.representation, asyncContentBody.representation) &&
        Objects.equals(this.renderTaskId, asyncContentBody.renderTaskId) &&
        Objects.equals(this.error, asyncContentBody.error) &&
        Objects.equals(this.status, asyncContentBody.status) &&
        Objects.equals(this.embeddedContent, asyncContentBody.embeddedContent) &&
        Objects.equals(this.webresource, asyncContentBody.webresource) &&
        Objects.equals(this.mediaToken, asyncContentBody.mediaToken) &&
        Objects.equals(this.expandable, asyncContentBody.expandable) &&
        Objects.equals(this.links, asyncContentBody.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, representation, renderTaskId, error, status, embeddedContent, webresource, mediaToken, expandable, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncContentBody {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    representation: ").append(toIndentedString(representation)).append("\n");
    sb.append("    renderTaskId: ").append(toIndentedString(renderTaskId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    embeddedContent: ").append(toIndentedString(embeddedContent)).append("\n");
    sb.append("    webresource: ").append(toIndentedString(webresource)).append("\n");
    sb.append("    mediaToken: ").append(toIndentedString(mediaToken)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("representation");
    openapiFields.add("renderTaskId");
    openapiFields.add("error");
    openapiFields.add("status");
    openapiFields.add("embeddedContent");
    openapiFields.add("webresource");
    openapiFields.add("mediaToken");
    openapiFields.add("_expandable");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AsyncContentBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AsyncContentBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AsyncContentBody is not found in the empty JSON string", AsyncContentBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AsyncContentBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AsyncContentBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("representation") != null && !jsonObj.get("representation").isJsonNull()) && !jsonObj.get("representation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `representation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("representation").toString()));
      }
      // validate the optional field `representation`
      if (jsonObj.get("representation") != null && !jsonObj.get("representation").isJsonNull()) {
        RepresentationEnum.validateJsonElement(jsonObj.get("representation"));
      }
      if ((jsonObj.get("renderTaskId") != null && !jsonObj.get("renderTaskId").isJsonNull()) && !jsonObj.get("renderTaskId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `renderTaskId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("renderTaskId").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("embeddedContent") != null && !jsonObj.get("embeddedContent").isJsonNull() && !jsonObj.get("embeddedContent").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `embeddedContent` to be an array in the JSON string but got `%s`", jsonObj.get("embeddedContent").toString()));
      }
      // validate the optional field `webresource`
      if (jsonObj.get("webresource") != null && !jsonObj.get("webresource").isJsonNull()) {
        WebResourceDependencies.validateJsonElement(jsonObj.get("webresource"));
      }
      // validate the optional field `mediaToken`
      if (jsonObj.get("mediaToken") != null && !jsonObj.get("mediaToken").isJsonNull()) {
        AsyncContentBodyMediaToken.validateJsonElement(jsonObj.get("mediaToken"));
      }
      // validate the optional field `_expandable`
      if (jsonObj.get("_expandable") != null && !jsonObj.get("_expandable").isJsonNull()) {
        AsyncContentBodyExpandable.validateJsonElement(jsonObj.get("_expandable"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AsyncContentBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AsyncContentBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AsyncContentBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AsyncContentBody.class));

       return (TypeAdapter<T>) new TypeAdapter<AsyncContentBody>() {
           @Override
           public void write(JsonWriter out, AsyncContentBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AsyncContentBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AsyncContentBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AsyncContentBody
  * @throws IOException if the JSON string is invalid with respect to AsyncContentBody
  */
  public static AsyncContentBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AsyncContentBody.class);
  }

 /**
  * Convert an instance of AsyncContentBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
