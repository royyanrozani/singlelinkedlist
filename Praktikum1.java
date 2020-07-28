/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg1;

/**
 *
 * @author ASUS
 */
public class Praktikum1 {

   public Praktikum1 head =null;
   public Praktikum1 tail = null;
   
   public int data;
   public Praktikum1 next;
   
   public Praktikum1 (int a){
       this.data = a;
       this.next = null;
   }
   
  public void pertama (int namanya){
      Praktikum1 newnode = new Praktikum1 (namanya);
      
      if (head == null){
      head = newnode;
      tail = newnode;
  } else{
          Praktikum1 isinya = head;
          head = newnode;
          head.next = isinya;
      }
}
  public void terakhir (int namanya){
      Praktikum1 newnode = new Praktikum1 (namanya);
      
      if (head == null){
          head = newnode;
          tail = newnode;
      } else {
          tail.next = newnode;
          tail = newnode;
      }
  }
  public void hapus (int post){
      if (post == 0){
          head = head.getnext();
          return;
      }
      Praktikum1 current = head;
      int count = 0;
      while (count < post-1){
          current = current.getnext();
          if (current == null){
              throw new IndexOutOfBoundsException("dimana itu");
          }
          count++;
      }if (current.getnext()== null){
          throw new IndexOutOfBoundsException("gk tau ke mana");
      }
      current.setnext(current.getnext().getnext());
  }
          
 public Praktikum1 (){
     this.getClass();
 }
 public String txt(){
     String output ="";
     Praktikum1 current = head;
     while (current != null) {
         output += current.getdata()+",";
         
         current = current.getnext();
         
     }return output;
 }
 public int getdata(){return data;}
 public Praktikum1 getnext(){return next;}
 
 public void setdata(int a){data = a;}
 public void setnext (Praktikum1 b){next = b;}
 
    public static void main(String[] args) {
        

     Praktikum1 masuk = new Praktikum1 ();
     masuk.pertama(5);
     masuk.pertama(35);
     masuk.pertama(56);
     masuk.pertama(3);
     masuk.terakhir(6);
     masuk.terakhir(21);
     
        System.out.println(masuk.txt());
 }
 
}
