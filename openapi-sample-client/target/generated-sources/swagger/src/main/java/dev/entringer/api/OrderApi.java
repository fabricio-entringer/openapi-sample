package dev.entringer.api;

import dev.entringer.invoker.ApiClient;

import dev.entringer.model.OrderPub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@Component("dev.entringer.api.OrderApi")
public class OrderApi {
    private ApiClient apiClient;

    public OrderApi() {
        this(new ApiClient());
    }

    @Autowired
    public OrderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete Order
     * This service deletes an existing Order stored in the database.
     * <p><b>202</b> - Deletion accepted.
     * <p><b>400</b> - Bad Request.
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteOrder(Integer id) throws RestClientException {
        deleteOrderWithHttpInfo(id);
    }

    /**
     * Delete Order
     * This service deletes an existing Order stored in the database.
     * <p><b>202</b> - Deletion accepted.
     * <p><b>400</b> - Bad Request.
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteOrderWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteOrder");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Edit Order
     * This service edits an existing Order and return its values after stored in the database.
     * <p><b>202</b> - Edition accepted.
     * <p><b>400</b> - Bad Request.
     * @param body  (required)
     * @param id  (required)
     * @return OrderPub
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrderPub editOrder(OrderPub body, Integer id) throws RestClientException {
        return editOrderWithHttpInfo(body, id).getBody();
    }

    /**
     * Edit Order
     * This service edits an existing Order and return its values after stored in the database.
     * <p><b>202</b> - Edition accepted.
     * <p><b>400</b> - Bad Request.
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;OrderPub&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrderPub> editOrderWithHttpInfo(OrderPub body, Integer id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling editOrder");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling editOrder");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<OrderPub> returnType = new ParameterizedTypeReference<OrderPub>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Find all Orders
     * This service returns all Orders stored in the database.
     * <p><b>200</b> - Order found successful.
     * <p><b>204</b> - No data found.
     * @return List&lt;OrderPub&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<OrderPub> findAllOrders() throws RestClientException {
        return findAllOrdersWithHttpInfo().getBody();
    }

    /**
     * Find all Orders
     * This service returns all Orders stored in the database.
     * <p><b>200</b> - Order found successful.
     * <p><b>204</b> - No data found.
     * @return ResponseEntity&lt;List&lt;OrderPub&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<OrderPub>> findAllOrdersWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<OrderPub>> returnType = new ParameterizedTypeReference<List<OrderPub>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Find One Order
     * This service returns one Order stored in the database that matches with the id informed by the parameter.
     * <p><b>200</b> - Order found successful.
     * <p><b>404</b> - Order not found.
     * @param id Order Unique Identification (required)
     * @return OrderPub
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrderPub findOrder(Integer id) throws RestClientException {
        return findOrderWithHttpInfo(id).getBody();
    }

    /**
     * Find One Order
     * This service returns one Order stored in the database that matches with the id informed by the parameter.
     * <p><b>200</b> - Order found successful.
     * <p><b>404</b> - Order not found.
     * @param id Order Unique Identification (required)
     * @return ResponseEntity&lt;OrderPub&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrderPub> findOrderWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findOrder");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<OrderPub> returnType = new ParameterizedTypeReference<OrderPub>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Insert New Order
     * This service inserts a new Order and return its values after stored in the database.
     * <p><b>201</b> - Order Created.
     * <p><b>400</b> - Bad Request.
     * @param body Order to be persisted. (required)
     * @return OrderPub
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrderPub insertOrder(OrderPub body) throws RestClientException {
        return insertOrderWithHttpInfo(body).getBody();
    }

    /**
     * Insert New Order
     * This service inserts a new Order and return its values after stored in the database.
     * <p><b>201</b> - Order Created.
     * <p><b>400</b> - Bad Request.
     * @param body Order to be persisted. (required)
     * @return ResponseEntity&lt;OrderPub&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrderPub> insertOrderWithHttpInfo(OrderPub body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling insertOrder");
        }
        String path = UriComponentsBuilder.fromPath("/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<OrderPub> returnType = new ParameterizedTypeReference<OrderPub>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
