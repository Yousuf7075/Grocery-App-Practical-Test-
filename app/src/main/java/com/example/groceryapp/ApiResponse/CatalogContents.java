
package com.example.groceryapp.ApiResponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CatalogContents {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("category_name")
    @Expose
    private String categoryName;
    @SerializedName("slug_url")
    @Expose
    private String slugUrl;
    @SerializedName("category_banner")
    @Expose
    private String categoryBanner;
    @SerializedName("category_logo")
    @Expose
    private Object categoryLogo;
    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("lft")
    @Expose
    private Object lft;
    @SerializedName("rgt")
    @Expose
    private Object rgt;
    @SerializedName("depth")
    @Expose
    private Object depth;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("category_publication_status")
    @Expose
    private Integer categoryPublicationStatus;
    @SerializedName("created_by")
    @Expose
    private Integer createdBy;
    @SerializedName("updated_by")
    @Expose
    private Integer updatedBy;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("children_recursive")
    @Expose
    private List<Object> childrenRecursive = null;
    @SerializedName("active_children")
    @Expose
    private List<Object> activeChildren = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSlugUrl() {
        return slugUrl;
    }

    public void setSlugUrl(String slugUrl) {
        this.slugUrl = slugUrl;
    }

    public String getCategoryBanner() {
        return categoryBanner;
    }

    public void setCategoryBanner(String categoryBanner) {
        this.categoryBanner = categoryBanner;
    }

    public Object getCategoryLogo() {
        return categoryLogo;
    }

    public void setCategoryLogo(Object categoryLogo) {
        this.categoryLogo = categoryLogo;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Object getLft() {
        return lft;
    }

    public void setLft(Object lft) {
        this.lft = lft;
    }

    public Object getRgt() {
        return rgt;
    }

    public void setRgt(Object rgt) {
        this.rgt = rgt;
    }

    public Object getDepth() {
        return depth;
    }

    public void setDepth(Object depth) {
        this.depth = depth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategoryPublicationStatus() {
        return categoryPublicationStatus;
    }

    public void setCategoryPublicationStatus(Integer categoryPublicationStatus) {
        this.categoryPublicationStatus = categoryPublicationStatus;
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

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<Object> getChildrenRecursive() {
        return childrenRecursive;
    }

    public void setChildrenRecursive(List<Object> childrenRecursive) {
        this.childrenRecursive = childrenRecursive;
    }

    public List<Object> getActiveChildren() {
        return activeChildren;
    }

    public void setActiveChildren(List<Object> activeChildren) {
        this.activeChildren = activeChildren;
    }

}
