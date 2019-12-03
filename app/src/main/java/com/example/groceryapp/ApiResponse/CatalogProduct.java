
package com.example.groceryapp.ApiResponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CatalogProduct {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("category_id")
    @Expose
    private Integer categoryId;
    @SerializedName("product_name")
    @Expose
    private String productName;
    @SerializedName("product_model")
    @Expose
    private String productModel;
    @SerializedName("product_desc")
    @Expose
    private String productDesc;
    @SerializedName("product_image")
    @Expose
    private String productImage;
    @SerializedName("tag")
    @Expose
    private String tag;
    @SerializedName("product_publication_status")
    @Expose
    private String productPublicationStatus;
    @SerializedName("is_feature_product")
    @Expose
    private Integer isFeatureProduct;
    @SerializedName("stock")
    @Expose
    private Integer stock;
    @SerializedName("batch_no")
    @Expose
    private Integer batchNo;
    @SerializedName("created_by")
    @Expose
    private Integer createdBy;
    @SerializedName("updated_by")
    @Expose
    private Integer updatedBy;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("tax_class_id")
    @Expose
    private Integer taxClassId;
    @SerializedName("tax_rate")
    @Expose
    private String taxRate;
    @SerializedName("weight_class_id")
    @Expose
    private Integer weightClassId;
    @SerializedName("weight_class")
    @Expose
    private String weightClass;
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("new_arrival")
    @Expose
    private Integer newArrival;
    @SerializedName("gift_voucher")
    @Expose
    private String giftVoucher;
    @SerializedName("vendor_id")
    @Expose
    private Object vendorId;
    @SerializedName("commission_type")
    @Expose
    private Object commissionType;
    @SerializedName("commission")
    @Expose
    private Object commission;
    @SerializedName("specification")
    @Expose
    private String specification;
    @SerializedName("warranty")
    @Expose
    private String warranty;
    @SerializedName("emi")
    @Expose
    private String emi;
    @SerializedName("product_id")
    @Expose
    private Integer productId;
    @SerializedName("outlet_id")
    @Expose
    private Integer outletId;
    @SerializedName("stock_qty")
    @Expose
    private Integer stockQty;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("discount")
    @Expose
    private Object discount;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("start_date")
    @Expose
    private Object startDate;
    @SerializedName("end_date")
    @Expose
    private Object endDate;
    @SerializedName("max_in_cart")
    @Expose
    private Object maxInCart;
    @SerializedName("images")
    @Expose
    private List<String> images = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getProductPublicationStatus() {
        return productPublicationStatus;
    }

    public void setProductPublicationStatus(String productPublicationStatus) {
        this.productPublicationStatus = productPublicationStatus;
    }

    public Integer getIsFeatureProduct() {
        return isFeatureProduct;
    }

    public void setIsFeatureProduct(Integer isFeatureProduct) {
        this.isFeatureProduct = isFeatureProduct;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(Integer batchNo) {
        this.batchNo = batchNo;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getTaxClassId() {
        return taxClassId;
    }

    public void setTaxClassId(Integer taxClassId) {
        this.taxClassId = taxClassId;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public Integer getWeightClassId() {
        return weightClassId;
    }

    public void setWeightClassId(Integer weightClassId) {
        this.weightClassId = weightClassId;
    }

    public String getWeightClass() {
        return weightClass;
    }

    public void setWeightClass(String weightClass) {
        this.weightClass = weightClass;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getNewArrival() {
        return newArrival;
    }

    public void setNewArrival(Integer newArrival) {
        this.newArrival = newArrival;
    }

    public String getGiftVoucher() {
        return giftVoucher;
    }

    public void setGiftVoucher(String giftVoucher) {
        this.giftVoucher = giftVoucher;
    }

    public Object getVendorId() {
        return vendorId;
    }

    public void setVendorId(Object vendorId) {
        this.vendorId = vendorId;
    }

    public Object getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(Object commissionType) {
        this.commissionType = commissionType;
    }

    public Object getCommission() {
        return commission;
    }

    public void setCommission(Object commission) {
        this.commission = commission;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getEmi() {
        return emi;
    }

    public void setEmi(String emi) {
        this.emi = emi;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOutletId() {
        return outletId;
    }

    public void setOutletId(Integer outletId) {
        this.outletId = outletId;
    }

    public Integer getStockQty() {
        return stockQty;
    }

    public void setStockQty(Integer stockQty) {
        this.stockQty = stockQty;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Object getDiscount() {
        return discount;
    }

    public void setDiscount(Object discount) {
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getStartDate() {
        return startDate;
    }

    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public Object getMaxInCart() {
        return maxInCart;
    }

    public void setMaxInCart(Object maxInCart) {
        this.maxInCart = maxInCart;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

}
