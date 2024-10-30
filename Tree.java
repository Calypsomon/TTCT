import java.util.Scanner;
public class Tree {
    Team[]  teamlist;
    int teamcount;
    Scanner scanner = new Scanner(System.in);
    public Tree() {
    }

    public void creattopf(int teamcount,int teamplayers){
        this.teamcount = teamcount;
        this.teamlist = new Team[teamcount];
        for(int i = 0; i < teamcount; i++){
            teamlist[i] = new Team("_______","___",teamplayers);
        }
    }
    public void getteams(){
        for(int i = 0; i < teamcount; i++){
            teamlist[i].getTeam();
        }
    }
    public void leaderboard(){
        int count = 1000;
        int p = 0;
        while(p<teamcount){
            boolean counted = false;
            while (counted == false){   
                count = count-1;
                for(int i = 0; i < teamcount; i++){
                if (teamlist[i].getPoint() == count){
                    System.out.println(p+1 + ". " + teamlist[i].getteampoints());
                    counted = true;
                    p++;
                    }
                }
            }
        }
    }
    public void additteam(int x){
        System.out.print("Gib den Teamnamen ein!");
        teamlist[x].changeTeamname(scanner.nextLine());
        System.out.print("Gib einen Kürze mit 3 Buchstaben ein!");
        teamlist[x].changeShortname(scanner.nextLine());
        for(int i = 0; i < teamlist[x].getTeamsize(); i++){
            System.out.print("Gib den Namen von Spieler " + (i+1) + " ein!");
            teamlist[x].addplayer(i,scanner.nextLine());
        }
    }
    public void addPoint(int x, int point){
        teamlist[x].addPoint(point);
    }
    public void removepoints(int x, int point){
        teamlist[x].removePoint(point);
    }
} //by Calypsomon