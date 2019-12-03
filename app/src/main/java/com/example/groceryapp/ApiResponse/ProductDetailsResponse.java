
package com.example.groceryapp.ApiResponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductDetailsResponse {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("catalog_contents")
    @Expose
    private CatalogContents catalogContents;
    @SerializedName("subCategories")
    @Expose
    private List<Object> subCategories = null;
    @SerializedName("catalog_products")
    @Expose
    private List<CatalogProduct> catalogProducts = null;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public CatalogContents getCatalogContents() {
        return catalogContents;
    }

    public void setCatalogContents(CatalogContents catalogContents) {
        this.catalogContents = catalogContents;
    }

    public List<Object> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Object> subCategories) {
        this.subCategories = subCategories;
    }

    public List<CatalogProduct> getCatalogProducts() {
        return catalogProducts;
    }

    public void setCatalogProducts(List<CatalogProduct> catalogProducts) {
        this.catalogProducts = catalogProducts;
    }

}
