package pe.edu.upc.aww.takemehomes.dtos;

public class CategoryDTO {
    private int idCategory;
    private String nameCategory;
    private String detailsCategory;

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getDetailsCategory() {
        return detailsCategory;
    }

    public void setDetailsCategory(String detailsCategory) {
        this.detailsCategory = detailsCategory;
    }
}
