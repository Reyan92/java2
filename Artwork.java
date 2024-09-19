public class Artwork{

private String artTitle;
private int year;
private Artist artistName;


Artwork(String Title,int year,Artist artname){
this.artTitle=Title;
this.year=year;
this.artistName=artname;

}
Artwork(String Title,int year){
System.out.println("Unknown Artist");

}

public String getarttitle(){
return artTitle;
}
public int getyear(){
return year;

}
public Artist getartist(){
return artistName;
}


public void displayart(){
System.out.println("Art Title is "+artTitle);
System.out.println("Year in which art is made "+year);
artistName.displayname();

}


}