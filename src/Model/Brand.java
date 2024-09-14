package model;

public class Brand {
    private String brandId,name;

    public Brand(String brandId, String name) {
        this.brandId = brandId;
        this.name = name;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
