import java.util.Scanner;
public class Tree {
    Team[]  teamlist;
    match[] matchlist;
    int teamcount;
    Scanner scanner = new Scanner(System.in);
    public Tree() {
    }

    public void creattopf(int teamcount,int teamplayers){           //erstellt einen raum mit allen Teams und deren anzahl
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
        System.out.print("Gib den Teamnamen für team " + x + " ein!");
        teamlist[x-1].changeTeamname(scanner.nextLine());
        System.out.print("Gib einen Kürze mit 3 Buchstaben ein!");
        teamlist[x-1].changeShortname(scanner.nextLine());
        for(int i = 0; i < teamlist[x-1].getTeamsize(); i++){
            System.out.print("Gib den Namen von Spieler " + (i+1) + " ein!");
            teamlist[x-1].addplayer(i,scanner.nextLine());
        }
    }
    public void addPoint(int x, int point){
        teamlist[x].addPoint(point);
    }
    public void removepoints(int x, int point){
        teamlist[x].removePoint(point);
    }
    public void team1wins(int x){
        matchlist[x].team1wins();
        matchlist[x].finishmatch();
    }
    public void team2wins(int x){
        matchlist[x].team2wins();
        matchlist[x].finishmatch();
    }
    public void getmatch(int x){
        matchlist[x].getmatch();
    }
    public void FFA(){                                      // noch nicht fertig soll ein FFa Tournament mit runden werden.
    /*if (teamcount%2 != 0) {
        Team hTeam = new Team("FreeWin","WIN",teamlist[0].getTeamsize());
    }*/
    int matchcode = 0;
    int zähler = teamcount - teamcount/2;
    int a,i;
    int x = 1;
    int y = 1;
    match[] match = new match[1];
        for (i= 1;i<teamcount-1;i++){
            System.out.println("Runde" + i + "\n");
    for (a= 0;a<zähler;a++){
    matchcode = matchcode + 1;
    match[matchcode] = new match(teamlist[x],teamlist[y],matchcode);
    }
    }}
    public void Swiss(){                                                        //packt alle Teams eines Raumes in ein Swiss tournament
           
            Team hteam = new Team("FreeWin187","WIN",0);
            int matchcode = 0;
            int zähler = teamcount - teamcount/2;
            int a,i, y= 0, x= 1;
            matchlist = new match[zähler];
            
                    System.out.println("Runde 1 \n");       //Create the first round
            for (a= 0;a<zähler;a++){
            matchcode ++;
            if (x<teamcount){
        	    matchlist[matchcode-1] = new match(teamlist[y],teamlist[x],matchcode);
            } else {
                matchlist[matchcode-1] = new match(teamlist[y],hteam,matchcode);
            }
            matchlist[matchcode-1].getmatch();
            y = y + 2;
            x = x + 2;
        }
            for (i=0;i<berechneRunden(teamcount);i++){              //desides who won the matches 1 by 1
                int abfragen =0;
                while (abfragen< matchlist.length){
                    System.out.println("Wer hat match "+ (matchlist[abfragen].getmatchcode()) + " gewonnen?");
                    System.out.println("1 = " + matchlist[abfragen].getname1());
                    System.out.println("2 = " + matchlist[abfragen].getname2());
                    int d = scanner.nextInt();
                    if (d == 1){
                        matchlist[abfragen].team1wins();
                    } else if (d == 2){
                        matchlist[abfragen].team2wins();
                    }
                    matchlist[abfragen].finishmatch();
                    abfragen ++;
                    }
                
                System.out.println("\n Runde " + (i+2) + "\n");
                zähler = zähler/2;
                y=0;x=1;
                match[] Matches2= new match[zähler];
                for (a= 0;a<zähler;a++){ 
                    matchcode ++;
                    Matches2[a] = new match(matchlist[y].getWinner(),matchlist[x].getWinner(),matchcode);
                    y = y + 2;
                    x = x + 2;
                    Matches2[a].getmatch();
                }
                matchlist = Matches2;
            }  
        System.out.println("\n Das Turnier ist vorbei!");
    }

    int berechneRunden(int teilnehmer) {
    int runden = 0;
    if (teamcount%2 != 0) {
        teilnehmer++;
    }
    while (teilnehmer > 1) {
        teilnehmer /= 2;
        runden++;
    }
    return runden ;
    }
} //by Calypsomon