/*
* Author - Dhruvi Shah
* Banner - B00931528
* CSCI 2110 - Assignment 1
*/

public class Demo {
    public static void main(String[] args){

        //create a field, ball and 2 player objects
        Field hogwarts = new Field(0.0 , 0.0, 500.0, 400.0);
        Ball quaffle = new Ball(100, 200);
        Player player1 = new Player("Sirius");
        Player player2 = new Player("James");

        System.out.println(player1 + "\n" + player2 + "\n" + hogwarts + "\n" + quaffle);
        System.out.println("\n");

        //each player alternates in taking turns -- total 20 turns
        //array to hold the distance for each kick
        double[] distances = new double[]{300, 500, 100, 256, 365, 189, 521, 45, 398, 287, 564,
                73, 543, 156, 412, 289, 499, 94, 578, 365};

        //array to hold the angle for each kick
        double[] angles = new double[]{45, 0, 270, 179, 90, 321, 248, 132, 204, 53, 297, 216,
                331, 287, 64, 152, 326, 217, 82, 315};

        //alternating the 2 players, 20 turns total
        for(int i = 0; i < 19; i+= 2){

            //player 1 kicks the ball
            player1.kick(hogwarts, quaffle, distances[i], angles[i]);
            System.out.println(player1 + " kicks the ball for a distance of " + distances[i] + " pixels at " +
                    angles[i] + " degrees");
            //prints if the ball is reflected
            if(player1.isReflected()){System.out.println("Ball was reflected");}
            System.out.println(quaffle + "\n");

            //player 2 kicks the ball
            player2.kick(hogwarts, quaffle, distances[i + 1], angles[i + 1]);
            System.out.println(player2 + " kicks the ball for a distance of " + distances[i + 1] + " pixels at " +
                    angles[i + 1] + " degrees");
            //prints if the ball was reflected
            if(player2.isReflected()){System.out.println("Ball was reflected");}
            System.out.println(quaffle + "\n");
        }


    }
}

