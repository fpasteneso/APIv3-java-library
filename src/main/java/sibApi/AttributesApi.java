/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibApi;

import sendinblue.ApiCallback;
import sendinblue.ApiClient;
import sendinblue.ApiException;
import sendinblue.ApiResponse;
import sendinblue.Configuration;
import sendinblue.Pair;
import sendinblue.ProgressRequestBody;
import sendinblue.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import sibModel.CreateAttribute;
import sibModel.ErrorModel;
import sibModel.GetAttributes;
import sibModel.UpdateAttribute;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttributesApi {
    private ApiClient apiClient;

    public AttributesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AttributesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createAttribute
     * @param attributeCategory Category of the attribute (required)
     * @param attributeName Name of the attribute (required)
     * @param createAttribute Values to create an attribute (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createAttributeCall(String attributeCategory, String attributeName, CreateAttribute createAttribute, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createAttribute;

        // create path and map variables
        String localVarPath = "/contacts/attributes/{attributeCategory}/{attributeName}"
            .replaceAll("\\{" + "attributeCategory" + "\\}", apiClient.escapeString(attributeCategory.toString()))
            .replaceAll("\\{" + "attributeName" + "\\}", apiClient.escapeString(attributeName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createAttributeValidateBeforeCall(String attributeCategory, String attributeName, CreateAttribute createAttribute, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'attributeCategory' is set
        if (attributeCategory == null) {
            throw new ApiException("Missing the required parameter 'attributeCategory' when calling createAttribute(Async)");
        }
        
        // verify the required parameter 'attributeName' is set
        if (attributeName == null) {
            throw new ApiException("Missing the required parameter 'attributeName' when calling createAttribute(Async)");
        }
        
        // verify the required parameter 'createAttribute' is set
        if (createAttribute == null) {
            throw new ApiException("Missing the required parameter 'createAttribute' when calling createAttribute(Async)");
        }
        

        com.squareup.okhttp.Call call = createAttributeCall(attributeCategory, attributeName, createAttribute, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates contact attribute
     * 
     * @param attributeCategory Category of the attribute (required)
     * @param attributeName Name of the attribute (required)
     * @param createAttribute Values to create an attribute (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void createAttribute(String attributeCategory, String attributeName, CreateAttribute createAttribute) throws ApiException {
        createAttributeWithHttpInfo(attributeCategory, attributeName, createAttribute);
    }

    /**
     * Creates contact attribute
     * 
     * @param attributeCategory Category of the attribute (required)
     * @param attributeName Name of the attribute (required)
     * @param createAttribute Values to create an attribute (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> createAttributeWithHttpInfo(String attributeCategory, String attributeName, CreateAttribute createAttribute) throws ApiException {
        com.squareup.okhttp.Call call = createAttributeValidateBeforeCall(attributeCategory, attributeName, createAttribute, null, null);
        return apiClient.execute(call);
    }

    /**
     * Creates contact attribute (asynchronously)
     * 
     * @param attributeCategory Category of the attribute (required)
     * @param attributeName Name of the attribute (required)
     * @param createAttribute Values to create an attribute (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAttributeAsync(String attributeCategory, String attributeName, CreateAttribute createAttribute, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createAttributeValidateBeforeCall(attributeCategory, attributeName, createAttribute, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteAttribute
     * @param attributeCategory Category of the attribute (required)
     * @param attributeName Name of the existing attribute (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteAttributeCall(String attributeCategory, String attributeName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/contacts/attributes/{attributeCategory}/{attributeName}"
            .replaceAll("\\{" + "attributeCategory" + "\\}", apiClient.escapeString(attributeCategory.toString()))
            .replaceAll("\\{" + "attributeName" + "\\}", apiClient.escapeString(attributeName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteAttributeValidateBeforeCall(String attributeCategory, String attributeName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'attributeCategory' is set
        if (attributeCategory == null) {
            throw new ApiException("Missing the required parameter 'attributeCategory' when calling deleteAttribute(Async)");
        }
        
        // verify the required parameter 'attributeName' is set
        if (attributeName == null) {
            throw new ApiException("Missing the required parameter 'attributeName' when calling deleteAttribute(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteAttributeCall(attributeCategory, attributeName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes an attribute
     * 
     * @param attributeCategory Category of the attribute (required)
     * @param attributeName Name of the existing attribute (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteAttribute(String attributeCategory, String attributeName) throws ApiException {
        deleteAttributeWithHttpInfo(attributeCategory, attributeName);
    }

    /**
     * Deletes an attribute
     * 
     * @param attributeCategory Category of the attribute (required)
     * @param attributeName Name of the existing attribute (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteAttributeWithHttpInfo(String attributeCategory, String attributeName) throws ApiException {
        com.squareup.okhttp.Call call = deleteAttributeValidateBeforeCall(attributeCategory, attributeName, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an attribute (asynchronously)
     * 
     * @param attributeCategory Category of the attribute (required)
     * @param attributeName Name of the existing attribute (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAttributeAsync(String attributeCategory, String attributeName, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteAttributeValidateBeforeCall(attributeCategory, attributeName, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAttributes
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAttributesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/contacts/attributes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAttributesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAttributesCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lists all attributes
     * 
     * @return GetAttributes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetAttributes getAttributes() throws ApiException {
        ApiResponse<GetAttributes> resp = getAttributesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Lists all attributes
     * 
     * @return ApiResponse&lt;GetAttributes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetAttributes> getAttributesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAttributesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<GetAttributes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists all attributes (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAttributesAsync(final ApiCallback<GetAttributes> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAttributesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetAttributes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateAttribute
     * @param attributeCategory Category of the attribute (required)
     * @param attributeName Name of the existing attribute (required)
     * @param updateAttribute Values to update an attribute (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateAttributeCall(String attributeCategory, String attributeName, UpdateAttribute updateAttribute, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateAttribute;

        // create path and map variables
        String localVarPath = "/contacts/attributes/{attributeCategory}/{attributeName}"
            .replaceAll("\\{" + "attributeCategory" + "\\}", apiClient.escapeString(attributeCategory.toString()))
            .replaceAll("\\{" + "attributeName" + "\\}", apiClient.escapeString(attributeName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateAttributeValidateBeforeCall(String attributeCategory, String attributeName, UpdateAttribute updateAttribute, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'attributeCategory' is set
        if (attributeCategory == null) {
            throw new ApiException("Missing the required parameter 'attributeCategory' when calling updateAttribute(Async)");
        }
        
        // verify the required parameter 'attributeName' is set
        if (attributeName == null) {
            throw new ApiException("Missing the required parameter 'attributeName' when calling updateAttribute(Async)");
        }
        
        // verify the required parameter 'updateAttribute' is set
        if (updateAttribute == null) {
            throw new ApiException("Missing the required parameter 'updateAttribute' when calling updateAttribute(Async)");
        }
        

        com.squareup.okhttp.Call call = updateAttributeCall(attributeCategory, attributeName, updateAttribute, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates contact attribute
     * 
     * @param attributeCategory Category of the attribute (required)
     * @param attributeName Name of the existing attribute (required)
     * @param updateAttribute Values to update an attribute (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateAttribute(String attributeCategory, String attributeName, UpdateAttribute updateAttribute) throws ApiException {
        updateAttributeWithHttpInfo(attributeCategory, attributeName, updateAttribute);
    }

    /**
     * Updates contact attribute
     * 
     * @param attributeCategory Category of the attribute (required)
     * @param attributeName Name of the existing attribute (required)
     * @param updateAttribute Values to update an attribute (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateAttributeWithHttpInfo(String attributeCategory, String attributeName, UpdateAttribute updateAttribute) throws ApiException {
        com.squareup.okhttp.Call call = updateAttributeValidateBeforeCall(attributeCategory, attributeName, updateAttribute, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates contact attribute (asynchronously)
     * 
     * @param attributeCategory Category of the attribute (required)
     * @param attributeName Name of the existing attribute (required)
     * @param updateAttribute Values to update an attribute (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAttributeAsync(String attributeCategory, String attributeName, UpdateAttribute updateAttribute, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateAttributeValidateBeforeCall(attributeCategory, attributeName, updateAttribute, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
