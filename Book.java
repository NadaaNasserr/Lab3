import java.util.ArrayList;

public class Book extends Media{
    private int stock;

    private  ArrayList<Review> reviews = new ArrayList<Review>();

    public Book(int stock, ArrayList<Review> reviews) {
        this.stock = stock;
        this.reviews = reviews;
    }

    public Book(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = reviews;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReviews(Review r) {

      reviews.add(r);
    }

    public double getAverageRating() {
   int rating=0;
        for (int i = 0; i < reviews.size() ; i++) {
            rating=rating+reviews.get(i).getRating();

        }
        double sum= rating/reviews.size();
        return sum;
    }

//    public void purchase(User user) {
//
//
//user.getPurchaseMediaList().add(Media);
//
//setStock(getStock()-1);
//
//    }
public boolean isBestseller(){

        if(getAverageRating() >= 4.5) {
            return true;
        }
        else return false;


}


    public void restock(int quantity) {

        if (getStock() == 0) {
            quantity += getStock();
            System.out.println("restocking");

        }
    }

    public String getMediaType(){

            for (int i = 0; i <reviews.size(); i++) {

                if(getAverageRating() >=4.5){
                    return getTitle();
                }
            }
           return null;
        }






    @Override
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", reviews=" + reviews +
                '}' + super.toString();
    }
}
