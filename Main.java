import java.util.ArrayList;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Media m1 =new Media();




        Movie movie1 = new Movie("Blacklist", "auteur1" , "123" , 55.5,100 );
        Movie movie2 = new Movie("one piece", "Eiichirō Oda" , "22" , 88.2,150 );


        System.out.println( movie1.getMediaType());

        ArrayList<Movie> movieArrayList = new ArrayList<>();
        movieArrayList.add(movie1);
        movieArrayList.add(movie2);

        System.out.println(movieArrayList.toString() + "    ");
        System.out.println();
       movie1.recommendSimilarMovies(movieArrayList);





        Review r1 = new Review("x1" , 1 , "enjoyable book");
        Review r2 = new Review("x4" , 3 , "I will read watch the book again");

        ArrayList<Review> arrayR = new ArrayList<Review>();
        arrayR.add(r1);
        arrayR.add(r2);

        Book book1 = new Book("Data Since" , "Ahmed" ,"2201" , 12,4 , arrayR);
        Book book2 = new Book("Computer Science" , "Omar" ,"1102" , 15,10 , arrayR);

       book1.addReviews(r2);
       // System.out.println(book2.getReviews());
        book1.getAverageRating();
        System.out.println(book1.isBestseller());

        Music music1 = new Music("Music1" ,"khlaed","3321",44.3,"khlaed" );
        Music music2 = new Music("Music2" ,"Moath","8812",4,"Moath" );

        System.out.println(music1.getMediaType());
        System.out.println(music2.getMediaType());


        AcademicBook academicBook1 = new AcademicBook("Data Since" , "Ahmed" ,"2201" , 12,4 , arrayR,"Data Since");
        System.out.println(academicBook1.getMediaType());

         Novel novel = new Novel("Data Since" , "Ahmed" ,"2201" , 12,4 , arrayR,"disney");
        System.out.println(novel.getAverageRating());
        System.out.println(novel.toString());


        ArrayList<Media> purchaseMediaList = new ArrayList<>();
        ArrayList<Media> shoppingCart = new ArrayList<>();

        User user1 = new User("nada12" , "na@gmail.com" ,purchaseMediaList,shoppingCart );
        User user2 = new User("sarah99" , "sa@gmail.com" ,purchaseMediaList,shoppingCart );

        ArrayList<User> arrayListUser = new ArrayList<>();
        ArrayList<Media> arrayListMedia = new ArrayList<>();
        arrayListUser.add(user1);
        arrayListUser.add(user2);
        System.out.println(arrayListUser.toString());
        user1.addToCart(m1);
        user1.removeFromCart(m1);
        Store store1 = new Store(arrayListUser, arrayListMedia);
        store1.addUser(user1);
        store1.displayMedia();
        store1.displayUsers();
        
    }
}