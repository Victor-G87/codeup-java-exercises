package movies;

public class Movie {

    private String name;
    private String category;

    // Constructor
    public Movie(String name, String category) {
        setName(name);
        setCategory(category);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category){
        this.category = category;
    }


}