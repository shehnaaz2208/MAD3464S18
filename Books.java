
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Books {
    int bookID;
    String bookTitle;
    int bookRating;
    
    Books(){ 
        this.bookID =0;
        this.bookTitle ="Unknown";
        this.bookRating =0;
    }
     Books(int bookId , String bookTitle , int bookRating){ 
         this.bookID = bookID;
         this.bookTitle = bookTitle;
         this.bookRating = bookRating;
     } 
     void setID(int Id){ 
         this.bookID = bookID;
         
     }  
     void getID(int ID){ 
         this.bookID =ID;
     }
     setTitle(String Title){ 
         this.bookTitle = bookTitle;
     }
     int getID(){
          
     }
     void getRating(int rate){ 
         this.bookRating = rate;
     } 
     int getRating(){ 
         return this.bookRating;
         
     } 
     void displayInfo(){ 
         System.out.println("bookID :" + this.bookID +
                 "/n Book Title :" + this.bookTitle+ "\n Book Rating :" + this.bookRating);
     }
}
  //to sort the books in library
//"Comparator" interface is pre-placed in java

class bookTitleComparator implements Comparator<Books>{ 
    
    @Override
    public int compare(Books b1 , Books b2){ 
        return b1.bookTitle.compareToIgnoreCase(b2.bookTitle);
    }
    class bookRatingComparator implements Comparator<Books>{
         @Override 
         public int compare(Books b1, Books b2) { 
             if (b1.bookRating == b2.bookRating)
                 return 0;
                 else if (b1.bookRating <b2.bookRating)
                 return 1;
                 else
                 return -1; 
         }
         }
    }

