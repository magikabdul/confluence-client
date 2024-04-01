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
import cloud.cholewa.confluence.model.LookAndFeel;
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
 * LookAndFeelSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LookAndFeelSettings {
  /**
   * Gets or Sets selected
   */
  @JsonAdapter(SelectedEnum.Adapter.class)
  public enum SelectedEnum {
    GLOBAL("global"),
    
    CUSTOM("custom");

    private String value;

    SelectedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SelectedEnum fromValue(String value) {
      for (SelectedEnum b : SelectedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SelectedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SelectedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SelectedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SelectedEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SelectedEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  private SelectedEnum selected;

  public static final String SERIALIZED_NAME_GLOBAL = "global";
  @SerializedName(SERIALIZED_NAME_GLOBAL)
  private LookAndFeel global;

  public static final String SERIALIZED_NAME_THEME = "theme";
  @SerializedName(SERIALIZED_NAME_THEME)
  private LookAndFeel theme;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private LookAndFeel custom;

  public LookAndFeelSettings() {
  }

  public LookAndFeelSettings selected(SelectedEnum selected) {
    this.selected = selected;
    return this;
  }

   /**
   * Get selected
   * @return selected
  **/
  @javax.annotation.Nonnull
  public SelectedEnum getSelected() {
    return selected;
  }

  public void setSelected(SelectedEnum selected) {
    this.selected = selected;
  }


  public LookAndFeelSettings global(LookAndFeel global) {
    this.global = global;
    return this;
  }

   /**
   * Get global
   * @return global
  **/
  @javax.annotation.Nonnull
  public LookAndFeel getGlobal() {
    return global;
  }

  public void setGlobal(LookAndFeel global) {
    this.global = global;
  }


  public LookAndFeelSettings theme(LookAndFeel theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Get theme
   * @return theme
  **/
  @javax.annotation.Nullable
  public LookAndFeel getTheme() {
    return theme;
  }

  public void setTheme(LookAndFeel theme) {
    this.theme = theme;
  }


  public LookAndFeelSettings custom(LookAndFeel custom) {
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @javax.annotation.Nonnull
  public LookAndFeel getCustom() {
    return custom;
  }

  public void setCustom(LookAndFeel custom) {
    this.custom = custom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookAndFeelSettings lookAndFeelSettings = (LookAndFeelSettings) o;
    return Objects.equals(this.selected, lookAndFeelSettings.selected) &&
        Objects.equals(this.global, lookAndFeelSettings.global) &&
        Objects.equals(this.theme, lookAndFeelSettings.theme) &&
        Objects.equals(this.custom, lookAndFeelSettings.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selected, global, theme, custom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookAndFeelSettings {\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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
    openapiFields.add("selected");
    openapiFields.add("global");
    openapiFields.add("theme");
    openapiFields.add("custom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("selected");
    openapiRequiredFields.add("global");
    openapiRequiredFields.add("custom");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LookAndFeelSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LookAndFeelSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LookAndFeelSettings is not found in the empty JSON string", LookAndFeelSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LookAndFeelSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LookAndFeelSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LookAndFeelSettings.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("selected").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selected` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selected").toString()));
      }
      // validate the required field `selected`
      SelectedEnum.validateJsonElement(jsonObj.get("selected"));
      // validate the required field `global`
      LookAndFeel.validateJsonElement(jsonObj.get("global"));
      // validate the optional field `theme`
      if (jsonObj.get("theme") != null && !jsonObj.get("theme").isJsonNull()) {
        LookAndFeel.validateJsonElement(jsonObj.get("theme"));
      }
      // validate the required field `custom`
      LookAndFeel.validateJsonElement(jsonObj.get("custom"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LookAndFeelSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LookAndFeelSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LookAndFeelSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LookAndFeelSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<LookAndFeelSettings>() {
           @Override
           public void write(JsonWriter out, LookAndFeelSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LookAndFeelSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LookAndFeelSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LookAndFeelSettings
  * @throws IOException if the JSON string is invalid with respect to LookAndFeelSettings
  */
  public static LookAndFeelSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LookAndFeelSettings.class);
  }

 /**
  * Convert an instance of LookAndFeelSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

