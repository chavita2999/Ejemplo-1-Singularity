public class ejemplo {
    
    public static void main(String[] args) {
        Act_Rec(10,3);
    }
    
    public static void Act_Rec(int x, int y){
        
        
        if(x>=0){
            System.out.println(x);
            Act_Rec(x-1,y);
        }
        else if(y>=0){
            System.out.println(y);
            Act_Rec(x,y-1);
        }
    }
}