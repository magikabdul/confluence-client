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
import java.util.Arrays;
import org.openapitools.client.model.LabelCreate;



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

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T01:00:55.766609049+02:00[Europe/Warsaw]")
public class AddLabelsToContentRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AddLabelsToContentRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AddLabelsToContentRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AddLabelsToContentRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

            final Type typeInstance = new TypeToken<List<LabelCreate>>(){}.getType();
            final TypeAdapter<List<LabelCreate>> adapterLabelCreateList = (TypeAdapter<List<LabelCreate>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstance));
            final TypeAdapter<LabelCreate> adapterLabelCreate = gson.getDelegateAdapter(this, TypeToken.get(LabelCreate.class));

            return (TypeAdapter<T>) new TypeAdapter<AddLabelsToContentRequest>() {
                @Override
                public void write(JsonWriter out, AddLabelsToContentRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `List<LabelCreate>`
                    if (value.getActualInstance() instanceof List<?>) {
                      List<?> list = (List<?>) value.getActualInstance();
        	            if(list.get(0) instanceof LabelCreate) {
        		            JsonArray array = adapterLabelCreateList.toJsonTree((List<LabelCreate>)value.getActualInstance()).getAsJsonArray();
                        elementAdapter.write(out, array);
                        return;
        	            }
                    }
                    // check if the actual instance is of the type `LabelCreate`
                    if (value.getActualInstance() instanceof LabelCreate) {
                      JsonElement element = adapterLabelCreate.toJsonTree((LabelCreate)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: LabelCreate, List<LabelCreate>");
                }

                @Override
                public AddLabelsToContentRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize List<LabelCreate>
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if (!jsonElement.isJsonArray()) {
                        throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                      }

                      JsonArray array = jsonElement.getAsJsonArray();
                      // validate array items
                      for(JsonElement element : array) {
                        LabelCreate.validateJsonElement(element);
                      }
                      actualAdapter = adapterLabelCreateList;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'List<LabelCreate>'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for List<LabelCreate> failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'List<LabelCreate>'", e);
                    }
                    // deserialize LabelCreate
                    try {
                      // validate the JSON object to see if any exception is thrown
                      LabelCreate.validateJsonElement(jsonElement);
                      actualAdapter = adapterLabelCreate;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'LabelCreate'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for LabelCreate failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'LabelCreate'", e);
                    }

                    if (match == 1) {
                        AddLabelsToContentRequest ret = new AddLabelsToContentRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for AddLabelsToContentRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public AddLabelsToContentRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public AddLabelsToContentRequest(LabelCreate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AddLabelsToContentRequest(List<LabelCreate> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<LabelCreate>", List.class);
        schemas.put("LabelCreate", LabelCreate.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AddLabelsToContentRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * LabelCreate, List<LabelCreate>
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
        	if(list.get(0) instanceof LabelCreate) {
        		super.setActualInstance(instance);
        		return;
        	}
        }

        if (instance instanceof LabelCreate) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be LabelCreate, List<LabelCreate>");
    }

    /**
     * Get the actual instance, which can be the following:
     * LabelCreate, List<LabelCreate>
     *
     * @return The actual instance (LabelCreate, List<LabelCreate>)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<LabelCreate>`. If the actual instance is not `List<LabelCreate>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<LabelCreate>`
     * @throws ClassCastException if the instance is not `List<LabelCreate>`
     */
    public List<LabelCreate> getLabelCreateList() throws ClassCastException {
        return (List<LabelCreate>)super.getActualInstance();
    }
    /**
     * Get the actual instance of `LabelCreate`. If the actual instance is not `LabelCreate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LabelCreate`
     * @throws ClassCastException if the instance is not `LabelCreate`
     */
    public LabelCreate getLabelCreate() throws ClassCastException {
        return (LabelCreate)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddLabelsToContentRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with List<LabelCreate>
    try {
      if (!jsonElement.isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
      }
      JsonArray array = jsonElement.getAsJsonArray();
      // validate array items
      for(JsonElement element : array) {
        LabelCreate.validateJsonElement(element);
      }
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for List<LabelCreate> failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with LabelCreate
    try {
      LabelCreate.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for LabelCreate failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for AddLabelsToContentRequest with oneOf schemas: LabelCreate, List<LabelCreate>. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of AddLabelsToContentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddLabelsToContentRequest
  * @throws IOException if the JSON string is invalid with respect to AddLabelsToContentRequest
  */
  public static AddLabelsToContentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddLabelsToContentRequest.class);
  }

 /**
  * Convert an instance of AddLabelsToContentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

