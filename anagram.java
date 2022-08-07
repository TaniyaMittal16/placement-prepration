// CHECK TWO STRINGS ARE ANAGRAM
import java.util.Scanner;
public class Anagram{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x="SILENT";
    String y="LISTEN";
    char a[]=x.toCharArray();
    char b[]=y.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    // chaeck two arra are equal
    boolean result=Arrays.equals(a,b);
    if(result==true){
      System.out.println("Strings are anagram");
      }
      else {
          System.out.println("Strings are not anagram");
          }
     }
