


import java.util.Scanner;


/**
 *
 * @author User
 */


public class TicTacToeV1 {
    
    
    public static void Board(String[] boxes){
        System.out.println("-------------");
        for(int i = 0; i < 9; i = i + 3){
            System.out.println("| " + boxes[i] + " | " + boxes[i+1] + " | " + boxes[i + 2] + " | " );
            System.out.println("-------------");
        }
    }
    
    public static void mark(String curPlayer, String[] boxes){
        String winner = null;
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        
        for(int i = 0; i < 9; i++){
            System.out.print("Give a number to put " + curPlayer + ": ");
            int num = in.nextInt();
            
           
                while(!(boxes[num - 1].equals(String.valueOf(num)))){
                    System.out.println("You can't put " + curPlayer +" here, try again: ");
                    num = in.nextInt();
                }
                boxes[num - 1] = curPlayer;
            
            
            Board(boxes);
          
            if(boxes[i].equals(curPlayer) && boxes[i + 1].equals(curPlayer) && boxes[i + 2].equals(curPlayer) ){
                System.out.println("The winner is: " + curPlayer);
                break;
            }else if(boxes[i].equals(curPlayer) && boxes[i + 3].equals(curPlayer) && boxes[i + 3].equals(curPlayer)){
                System.out.println("The winner is: " + curPlayer);
                break;
            }else if(boxes[i].equals(curPlayer) && boxes[i + 4].equals(curPlayer) && boxes[i + 4].equals(curPlayer)){
                System.out.println("The winner is: " + curPlayer);
                break;
            }
            
            curPlayer = ChangePlayer(curPlayer);
        
        }
    }
    
    
    
    
    
    public static String ChangePlayer(String curPlayer){
        
        if(curPlayer.equals("X")){
           curPlayer = "O";
            }else{
           curPlayer = "X";
        } 
        return curPlayer;
    }
    
    
    public static void main(String[] args){
        String[] boxes = {"1", "2", "3", "4", "5", "6", "7" , "8", "9"};
        
        String curPlayer = "X" ;
        
        Board(boxes);
        mark(curPlayer, boxes);
        
    }
    
    
}
