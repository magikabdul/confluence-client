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
import cloud.cholewa.confluence.model.ContentRestrictionAddOrUpdateArrayOneOf;
import cloud.cholewa.confluence.model.ContentRestrictionUpdate;
import cloud.cholewa.confluence.model.GenericLinksValue;
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



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import cloud.cholewa.confluence.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContentRestrictionAddOrUpdateArray extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ContentRestrictionAddOrUpdateArray.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ContentRestrictionAddOrUpdateArray.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ContentRestrictionAddOrUpdateArray' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ContentRestrictionAddOrUpdateArrayOneOf> adapterContentRestrictionAddOrUpdateArrayOneOf = gson.getDelegateAdapter(this, TypeToken.get(ContentRestrictionAddOrUpdateArrayOneOf.class));

            final Type typeInstance = new TypeToken<List<ContentRestrictionUpdate>>(){}.getType();
            final TypeAdapter<List<ContentRestrictionUpdate>> adapterContentRestrictionUpdateList = (TypeAdapter<List<ContentRestrictionUpdate>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstance));

            return (TypeAdapter<T>) new TypeAdapter<ContentRestrictionAddOrUpdateArray>() {
                @Override
                public void write(JsonWriter out, ContentRestrictionAddOrUpdateArray value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ContentRestrictionAddOrUpdateArrayOneOf`
                    if (value.getActualInstance() instanceof ContentRestrictionAddOrUpdateArrayOneOf) {
                      JsonElement element = adapterContentRestrictionAddOrUpdateArrayOneOf.toJsonTree((ContentRestrictionAddOrUpdateArrayOneOf)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `List<ContentRestrictionUpdate>`
                    if (value.getActualInstance() instanceof List<?>) {
                      List<?> list = (List<?>) value.getActualInstance();
        	            if(list.get(0) instanceof ContentRestrictionUpdate) {
        		            JsonArray array = adapterContentRestrictionUpdateList.toJsonTree((List<ContentRestrictionUpdate>)value.getActualInstance()).getAsJsonArray();
                        elementAdapter.write(out, array);
                        return;
        	            }
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ContentRestrictionAddOrUpdateArrayOneOf, List<ContentRestrictionUpdate>");
                }

                @Override
                public ContentRestrictionAddOrUpdateArray read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ContentRestrictionAddOrUpdateArrayOneOf
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ContentRestrictionAddOrUpdateArrayOneOf.validateJsonElement(jsonElement);
                      actualAdapter = adapterContentRestrictionAddOrUpdateArrayOneOf;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ContentRestrictionAddOrUpdateArrayOneOf'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ContentRestrictionAddOrUpdateArrayOneOf failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ContentRestrictionAddOrUpdateArrayOneOf'", e);
                    }
                    // deserialize List<ContentRestrictionUpdate>
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if (!jsonElement.isJsonArray()) {
                        throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                      }

                      JsonArray array = jsonElement.getAsJsonArray();
                      // validate array items
                      for(JsonElement element : array) {
                        ContentRestrictionUpdate.validateJsonElement(element);
                      }
                      actualAdapter = adapterContentRestrictionUpdateList;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'List<ContentRestrictionUpdate>'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for List<ContentRestrictionUpdate> failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'List<ContentRestrictionUpdate>'", e);
                    }

                    if (match == 1) {
                        ContentRestrictionAddOrUpdateArray ret = new ContentRestrictionAddOrUpdateArray();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ContentRestrictionAddOrUpdateArray: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ContentRestrictionAddOrUpdateArray() {
        super("oneOf", Boolean.FALSE);
    }

    public ContentRestrictionAddOrUpdateArray(ContentRestrictionAddOrUpdateArrayOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ContentRestrictionAddOrUpdateArray(List<ContentRestrictionUpdate> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ContentRestrictionAddOrUpdateArrayOneOf", ContentRestrictionAddOrUpdateArrayOneOf.class);
        schemas.put("List<ContentRestrictionUpdate>", List.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ContentRestrictionAddOrUpdateArray.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ContentRestrictionAddOrUpdateArrayOneOf, List<ContentRestrictionUpdate>
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ContentRestrictionAddOrUpdateArrayOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
        	if(list.get(0) instanceof ContentRestrictionUpdate) {
        		super.setActualInstance(instance);
        		return;
        	}
        }

        throw new RuntimeException("Invalid instance type. Must be ContentRestrictionAddOrUpdateArrayOneOf, List<ContentRestrictionUpdate>");
    }

    /**
     * Get the actual instance, which can be the following:
     * ContentRestrictionAddOrUpdateArrayOneOf, List<ContentRestrictionUpdate>
     *
     * @return The actual instance (ContentRestrictionAddOrUpdateArrayOneOf, List<ContentRestrictionUpdate>)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContentRestrictionAddOrUpdateArrayOneOf`. If the actual instance is not `ContentRestrictionAddOrUpdateArrayOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContentRestrictionAddOrUpdateArrayOneOf`
     * @throws ClassCastException if the instance is not `ContentRestrictionAddOrUpdateArrayOneOf`
     */
    public ContentRestrictionAddOrUpdateArrayOneOf getContentRestrictionAddOrUpdateArrayOneOf() throws ClassCastException {
        return (ContentRestrictionAddOrUpdateArrayOneOf)super.getActualInstance();
    }
    /**
     * Get the actual instance of `List<ContentRestrictionUpdate>`. If the actual instance is not `List<ContentRestrictionUpdate>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<ContentRestrictionUpdate>`
     * @throws ClassCastException if the instance is not `List<ContentRestrictionUpdate>`
     */
    public List<ContentRestrictionUpdate> getContentRestrictionUpdateList() throws ClassCastException {
        return (List<ContentRestrictionUpdate>)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ContentRestrictionAddOrUpdateArray
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ContentRestrictionAddOrUpdateArrayOneOf
    try {
      ContentRestrictionAddOrUpdateArrayOneOf.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ContentRestrictionAddOrUpdateArrayOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with List<ContentRestrictionUpdate>
    try {
      if (!jsonElement.isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
      }
      JsonArray array = jsonElement.getAsJsonArray();
      // validate array items
      for(JsonElement element : array) {
        ContentRestrictionUpdate.validateJsonElement(element);
      }
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for List<ContentRestrictionUpdate> failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ContentRestrictionAddOrUpdateArray with oneOf schemas: ContentRestrictionAddOrUpdateArrayOneOf, List<ContentRestrictionUpdate>. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of ContentRestrictionAddOrUpdateArray given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContentRestrictionAddOrUpdateArray
  * @throws IOException if the JSON string is invalid with respect to ContentRestrictionAddOrUpdateArray
  */
  public static ContentRestrictionAddOrUpdateArray fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentRestrictionAddOrUpdateArray.class);
  }

 /**
  * Convert an instance of ContentRestrictionAddOrUpdateArray to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

