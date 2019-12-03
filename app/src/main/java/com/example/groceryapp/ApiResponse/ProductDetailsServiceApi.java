package com.example.groceryapp.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ProductDetailsServiceApi {
    @GET
    Call<ProductDetailsResponse> getProductDetails(@Url String url);
}
