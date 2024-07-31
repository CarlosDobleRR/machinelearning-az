public static Player tieBreaker(Player p1, Player p2, Player p3, Player p4, Player p5){
        int weith1 = 0; 
        int weith2 = 0; 
        int weith3 = 0; 
        int weith4 = 0;
        
        Card[] hand1 = p1.getHand(); 
        Card[] hand2 = p2.getHand(); 
        Card[] hand3 = p3.getHand(); 
        Card[] hand4 = p4.getHand(); 
        
        //Create a for cycle to know the total weight of each game and determine the winner 
        //With the weights calculated use conditionals and display the winner 
        //Return the winner 
        
       for(int i=0; i<p1.getHand().length;i++){
           weith1 = weith1+hand1[1].getNumber(); 
           weith2 = weith2+hand2[i].getNumber(); 
           weith3 = weith3+hand3[i].getNumber(); 
           weith4 = weith4+hand4[i].getNumber(); 
           
       }
       
        System.out.println("WEIGHTS: ");
        System.out.println("Hand 1 weight: "+weith1);
        System.out.println("Hand 2 weight: "+weith2);
        System.out.println("Hand 3 weight: "+weith3);
        System.out.println("Hand 4 weight: "+weith4);
        
        if(weith1>weith2&&weith1>weith3&&weith1>weith4){
            System.out.println("Hand 1 winner");
            return p1;
        }else if(weith2>weith3&&weith2>weith4){
            System.out.println("Hand 2 winner");
            return p2; 
        }else if(weith3>weith4){
            System.out.println("Hand 3 winner");
            return p3; 
        }else if(weith4>weith3){
            System.out.println("Hand 4 winner ");
            return p4; 
        }else{
            System.out.println("Real tie");
            return p5; 
        }
    }
