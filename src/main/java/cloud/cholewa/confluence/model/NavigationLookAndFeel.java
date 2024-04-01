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
import cloud.cholewa.confluence.model.NavigationLookAndFeelHoverOrFocus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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
 * NavigationLookAndFeel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NavigationLookAndFeel {
  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_HIGHLIGHT_COLOR = "highlightColor";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHT_COLOR)
  private String highlightColor;

  public static final String SERIALIZED_NAME_HOVER_OR_FOCUS = "hoverOrFocus";
  @SerializedName(SERIALIZED_NAME_HOVER_OR_FOCUS)
  private NavigationLookAndFeelHoverOrFocus hoverOrFocus;

  public NavigationLookAndFeel() {
  }

  public NavigationLookAndFeel color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nonnull
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public NavigationLookAndFeel highlightColor(String highlightColor) {
    this.highlightColor = highlightColor;
    return this;
  }

   /**
   * Get highlightColor
   * @return highlightColor
  **/
  @javax.annotation.Nullable
  public String getHighlightColor() {
    return highlightColor;
  }

  public void setHighlightColor(String highlightColor) {
    this.highlightColor = highlightColor;
  }


  public NavigationLookAndFeel hoverOrFocus(NavigationLookAndFeelHoverOrFocus hoverOrFocus) {
    this.hoverOrFocus = hoverOrFocus;
    return this;
  }

   /**
   * Get hoverOrFocus
   * @return hoverOrFocus
  **/
  @javax.annotation.Nonnull
  public NavigationLookAndFeelHoverOrFocus getHoverOrFocus() {
    return hoverOrFocus;
  }

  public void setHoverOrFocus(NavigationLookAndFeelHoverOrFocus hoverOrFocus) {
    this.hoverOrFocus = hoverOrFocus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NavigationLookAndFeel navigationLookAndFeel = (NavigationLookAndFeel) o;
    return Objects.equals(this.color, navigationLookAndFeel.color) &&
        Objects.equals(this.highlightColor, navigationLookAndFeel.highlightColor) &&
        Objects.equals(this.hoverOrFocus, navigationLookAndFeel.hoverOrFocus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, highlightColor, hoverOrFocus);
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
    sb.append("class NavigationLookAndFeel {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    highlightColor: ").append(toIndentedString(highlightColor)).append("\n");
    sb.append("    hoverOrFocus: ").append(toIndentedString(hoverOrFocus)).append("\n");
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
    openapiFields.add("color");
    openapiFields.add("highlightColor");
    openapiFields.add("hoverOrFocus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("color");
    openapiRequiredFields.add("hoverOrFocus");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NavigationLookAndFeel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NavigationLookAndFeel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NavigationLookAndFeel is not found in the empty JSON string", NavigationLookAndFeel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NavigationLookAndFeel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NavigationLookAndFeel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NavigationLookAndFeel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if ((jsonObj.get("highlightColor") != null && !jsonObj.get("highlightColor").isJsonNull()) && !jsonObj.get("highlightColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `highlightColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("highlightColor").toString()));
      }
      // validate the required field `hoverOrFocus`
      NavigationLookAndFeelHoverOrFocus.validateJsonElement(jsonObj.get("hoverOrFocus"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NavigationLookAndFeel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NavigationLookAndFeel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NavigationLookAndFeel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NavigationLookAndFeel.class));

       return (TypeAdapter<T>) new TypeAdapter<NavigationLookAndFeel>() {
           @Override
           public void write(JsonWriter out, NavigationLookAndFeel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NavigationLookAndFeel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NavigationLookAndFeel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NavigationLookAndFeel
  * @throws IOException if the JSON string is invalid with respect to NavigationLookAndFeel
  */
  public static NavigationLookAndFeel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NavigationLookAndFeel.class);
  }

 /**
  * Convert an instance of NavigationLookAndFeel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

