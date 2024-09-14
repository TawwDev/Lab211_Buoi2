package model;

public class Category {
    private String categoryId,nameCategory;

    public Category(String categoryId, String nameCategory) {
        this.categoryId = categoryId;
        this.nameCategory = nameCategory;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    
}
