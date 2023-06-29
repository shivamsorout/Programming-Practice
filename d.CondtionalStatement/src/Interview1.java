public class Interview1 {
    public static void main(String[] args) {
       int x = 0, y = 0;
       for(int i=0;i<5;i++){
           if(++x>2 || y++>4){
               x++;
               y--;
           }
       }
        System.out.println(x +" - " +y);
    }
}