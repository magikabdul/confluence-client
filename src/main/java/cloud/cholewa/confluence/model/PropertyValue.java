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
public class PropertyValue extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PropertyValue.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PropertyValue.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PropertyValue' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

            final Type typeInstance = new TypeToken<List<>>(){}.getType();
            final TypeAdapter<List<String>> adapterList = (TypeAdapter<List<>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstance));
            final TypeAdapter<Boolean> adapterBoolean = gson.getDelegateAdapter(this, TypeToken.get(Boolean.class));
            final TypeAdapter<Map<String, Object>> adapterMap<String, Object> = gson.getDelegateAdapter(this, TypeToken.get(Map<String, Object>.class));
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));

            return (TypeAdapter<T>) new TypeAdapter<PropertyValue>() {
                @Override
                public void write(JsonWriter out, PropertyValue value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `List<String>`
                    if (value.getActualInstance() instanceof List<?>) {
                      JsonPrimitive primitive = adapterList<String>.toJsonTree((List<String>)value.getActualInstance()).getAsJsonPrimitive();
                      elementAdapter.write(out, primitive);
                      return;
                      List<?> list = (List<?>) value.getActualInstance();
        	            if(list.get(0) instanceof ) {
        		            JsonArray array = adapterList.toJsonTree((List<String>)value.getActualInstance()).getAsJsonArray();
                        elementAdapter.write(out, array);
                        return;
        	            }
                    }
                    // check if the actual instance is of the type `Boolean`
                    if (value.getActualInstance() instanceof Boolean) {
                      JsonPrimitive primitive = adapterBoolean.toJsonTree((Boolean)value.getActualInstance()).getAsJsonPrimitive();
                      elementAdapter.write(out, primitive);
                      return;
                    }
                    // check if the actual instance is of the type `Map<String, Object>`
                    if (value.getActualInstance() instanceof Map<String, Object>) {
                      JsonPrimitive primitive = adapterMap<String, Object>.toJsonTree((Map<String, Object>)value.getActualInstance()).getAsJsonPrimitive();
                      elementAdapter.write(out, primitive);
                      return;
                    }
                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                      JsonPrimitive primitive = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonPrimitive();
                      elementAdapter.write(out, primitive);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Boolean, List<String>, Map<String, Object>, String");
                }

                @Override
                public PropertyValue read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize List<String>
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(!jsonElement.getAsJsonPrimitive().isNumber()) {
                        throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
                      }
                      actualAdapter = adapterList<String>;
                      if (!jsonElement.isJsonArray()) {
                        throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                      }

                      JsonArray array = jsonElement.getAsJsonArray();
                      // validate array items
                      for(JsonElement element : array) {
                      if(!element.getAsJsonPrimitive().isString()) {
                        throw new IllegalArgumentException(String.format("Expected array items to be of type String in the JSON string but got `%s`", jsonElement.toString()));
                      }
                      }
                      actualAdapter = adapterList;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'List<String>'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for List<String> failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'List<String>'", e);
                    }
                    // deserialize Boolean
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(!jsonElement.getAsJsonPrimitive().isBoolean()) {
                        throw new IllegalArgumentException(String.format("Expected json element to be of type Boolean in the JSON string but got `%s`", jsonElement.toString()));
                      }
                      actualAdapter = adapterBoolean;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'Boolean'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for Boolean failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'Boolean'", e);
                    }
                    // deserialize Map<String, Object>
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(!jsonElement.getAsJsonPrimitive().isNumber()) {
                        throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
                      }
                      actualAdapter = adapterMap<String, Object>;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'Map<String, Object>'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for Map<String, Object> failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'Map<String, Object>'", e);
                    }
                    // deserialize String
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(!jsonElement.getAsJsonPrimitive().isString()) {
                        throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
                      }
                      actualAdapter = adapterString;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'String'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'String'", e);
                    }

                    if (match == 1) {
                        PropertyValue ret = new PropertyValue();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for PropertyValue: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public PropertyValue() {
        super("oneOf", Boolean.FALSE);
    }

    public PropertyValue(Boolean o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PropertyValue(List<String> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PropertyValue(Map<String, Object> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PropertyValue(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<String>", List.class);
        schemas.put("Boolean", Boolean.class);
        schemas.put("Map<String, Object>", Map.class);
        schemas.put("String", String.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return PropertyValue.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Boolean, List<String>, Map<String, Object>, String
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
        	if(list.get(0) instanceof ) {
        		super.setActualInstance(instance);
        		return;
        	}
        }

        if (instance instanceof Boolean) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Map<String, Object>) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Boolean, List<String>, Map<String, Object>, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * Boolean, List<String>, Map<String, Object>, String
     *
     * @return The actual instance (Boolean, List<String>, Map<String, Object>, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<String>`. If the actual instance is not `List<String>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<String>`
     * @throws ClassCastException if the instance is not `List<String>`
     */
    public List<String> getList() throws ClassCastException {
        return (List<String>)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Boolean`. If the actual instance is not `Boolean`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Boolean`
     * @throws ClassCastException if the instance is not `Boolean`
     */
    public Boolean getBoolean() throws ClassCastException {
        return (Boolean)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Map<String, Object>`. If the actual instance is not `Map<String, Object>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Map<String, Object>`
     * @throws ClassCastException if the instance is not `Map<String, Object>`
     */
    public Map<String, Object> getMap<String, Object>() throws ClassCastException {
        return (Map<String, Object>)super.getActualInstance();
    }
    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PropertyValue
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with List<String>
    try {
      if(!jsonElement.getAsJsonPrimitive().isNumber()) {
        throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
      }
      if (!jsonElement.isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
      }
      JsonArray array = jsonElement.getAsJsonArray();
      // validate array items
      for(JsonElement element : array) {
        if(!element.getAsJsonPrimitive().isString()) {
          throw new IllegalArgumentException(String.format("Expected array items to be of type String in the JSON string but got `%s`", jsonElement.toString()));
        }
      }
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for List<String> failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with Boolean
    try {
      if(!jsonElement.getAsJsonPrimitive().isBoolean()) {
        throw new IllegalArgumentException(String.format("Expected json element to be of type Boolean in the JSON string but got `%s`", jsonElement.toString()));
      }
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Boolean failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with Map<String, Object>
    try {
      if(!jsonElement.getAsJsonPrimitive().isNumber()) {
        throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
      }
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Map<String, Object> failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with String
    try {
      if(!jsonElement.getAsJsonPrimitive().isString()) {
        throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
      }
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for PropertyValue with oneOf schemas: Boolean, List<String>, Map<String, Object>, String. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of PropertyValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertyValue
  * @throws IOException if the JSON string is invalid with respect to PropertyValue
  */
  public static PropertyValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertyValue.class);
  }

 /**
  * Convert an instance of PropertyValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

