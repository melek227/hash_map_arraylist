/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hash_map_arraylist;

import java.util.HashMap;
/**
 *
 * @author melek
 */
public class Hash_map_arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap<String, String> sozluk=new HashMap<String, String>();
        sozluk.put("book","kitap"); //mapa eleman eklemeyi sağlar
        //sağ taraf(kitap) değer sol taraf(book) anahtar
        sozluk.put("computer","bilgisayar");
        sozluk.put("table","masa");
        sozluk.size();


        for(String item:sozluk.keySet()){ //book table computer elemanlarını ve değerlerini liste olarak verecek.Elemanları indis sırasına göre değil karışık listeleyecek
            System.out.println("eleman:"+item+ "Değer:"+sozluk.get(item));
            //eleman-book değer-kitap


        }


        sozluk.remove("table");//sözlükten eleman silmek istersek anahtarı kullanırız
        
        System.out.println(sozluk.get("table")); //istediğimiz elemana ulaşmamızı sağlar



                
                
                
                
                
    }
    
}
