package dto;

/*
    implementasi getter dan setter
    app/CategoriApp
 */
public class Categori {
    private String id;
    private boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
