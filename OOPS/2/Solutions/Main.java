import java.util.Scanner;
class Player
{
        String team,name;
        int globalSum;
        int score[];
        static String highest;
        Player(String team,String name)
        {
                this.team = team;
                this.name = name;
                highest = "";
                globalSum=0;
                score = new int[5];
        }
        void getScore()
        {
                System.out.println("Enter 5 scores");
                int sum = 0;
                Scanner sc= new Scanner(System.in);
                for(int i=0;i<5;i++)
                {
                       score[i] = sc.nextInt();
                       sum += score[i];
                }
                if(globalSum<sum)
                {
                        globalSum = sum;
                        highest = name;
                }
                System.out.println("TOTAL : "+sum+" AVG : "+sum/5.0);
        }
        static void high()
        {
                System.out.println(highest);
        }
}

public class Main
{
        public static void main(String [] args)
        {
                 for(int i=0;i<2;i++)
                 {
                        System.out.println("Enter details of players");
                        String team,name;
                        Scanner sc = new Scanner(System.in);
                        team = sc.next();
                        name = sc.next();
                        Player p = new Player(team,name);
                        p.getScore();
                  }
                  Player.high();
        }
}
