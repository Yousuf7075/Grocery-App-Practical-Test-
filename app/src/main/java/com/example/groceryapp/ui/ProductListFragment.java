package com.example.groceryapp.ui;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.example.groceryapp.ApiResponse.CatalogProduct;
import com.example.groceryapp.ApiResponse.ProductDetailsResponse;
import com.example.groceryapp.ApiResponse.ProductDetailsServiceApi;
import com.example.groceryapp.R;
import com.example.groceryapp.adapter.ProductListAdapter;
import com.example.groceryapp.retrofit_client.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductListFragment extends Fragment {
    private Context context;


    public ProductListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final RecyclerView productRecycler = view.findViewById(R.id.productRecycler);

        final String END_URL = "api/catalog-contents/1/cereals?page=1";

        //extract data
        ProductDetailsServiceApi serviceApi = RetrofitClient.getClient()
                .create(ProductDetailsServiceApi.class);
        serviceApi.getProductDetails(END_URL)
                .enqueue(new Callback<ProductDetailsResponse>() {
                    @Override
                    public void onResponse(Call<ProductDetailsResponse> call, Response<ProductDetailsResponse> response) {
                        if (response.isSuccessful()){
                            ProductDetailsResponse detailsResponse = response.body();
                            List<CatalogProduct> productList = detailsResponse.getCatalogProducts();
                            if (productList.size() > 0){
                                //set adapter
                                ProductListAdapter adapter = new ProductListAdapter(context, productList);
                                GridLayoutManager glm = new GridLayoutManager(context, 2);

                                //set layout
                                productRecycler.setLayoutManager(glm);
                                productRecycler.setAdapter(adapter);

                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<ProductDetailsResponse> call, Throwable t) {
                        Log.e("failed", t.getLocalizedMessage());

                    }
                });

    }
}
