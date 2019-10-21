package lab6;
import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    /**
     *
     */
    public int[] rateList = new int[3];
    public int id;
    public String title;
    public String publishDate;
    public String author;
    public String content;
    public float averageRate;



    public New(){

    }

    public New(int id, String title, String publishDate, String content) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.content = content;
    }


    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    //2.c
    @Override
    public void Display(){
        System.out.println("=======================================");
        System.out.println("id :"+" "+this.getId());
        System.out.println("title :"+" "+this.getTitle());
        System.out.println("publishDate :"+" "+this.getPublishDate());
        System.out.println("author :"+" "+this.getAuthor());
        System.out.println("content  :"+" "+this.getContent());
        System.out.println("averageRate :"+" "+this.getAverageRate());
    }


    //2.e
    public void Calculate(){
        float f = 0;
           for (int r : rateList) {
            f +=r;
        }
        this.averageRate = f/3;
    }

    
}