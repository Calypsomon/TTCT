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
        System.out.print("Gib den Teamnamen für team " + x + " ein!");
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
    
    public void FFA(){
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
    public void Swiss(){
           
            Team hteam = new Team("FreeWin187","WIN",0);
            int matchcode = 0;
            int zähler = teamcount - teamcount/2;
            int a,i, y= 1, x= 2;
            match[] Matches = new match[zähler];
            
                    System.out.println("Runde 1 \n");
            for (a= 0;a<zähler;a++){
            matchcode ++;
            if (x<=teamcount){
        	    Matches[matchcode-1] = new match(teamlist[y],teamlist[x],matchcode);
            } else {
                Matches[matchcode-1] = new match(teamlist[y],hteam,matchcode);
            }
            y = y + 2;
            x = x + 2;
        }
            for (i=1;i<berechneRunden(teamcount);i++){
                    boolean allFinished = false;
                    while (!allFinished) {
                        allFinished = true; 
                        for (int f = 0; f < Matches.length; f++) {
                            if (!Matches[f].finished()) {  // Falls ein Match noch nicht fertig ist
                                allFinished = false;  // Setze allFinished auf false und verlasse die Schleife
                                break;
                            }
                        }
                
                        if (!allFinished) {
                            try {
                                Thread.sleep(5000);  // Warte 5 Sekunden
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();  // Falls der Thread unterbrochen wird, die Schleife verlassen
                                break;
                            }
                        }
                    }
                
                zähler = zähler/2;
                y=1;x=2;
                match[] Matches2= new match[zähler];
                for (a= 0;a<zähler;a++){ 
                    matchcode ++;
                    Matches2[a] = new match(Matches[y].getWinner(),Matches[x].getWinner(),matchcode);
                    y = y + 2;
                    x = x + 2;
                }
                Matches = Matches2;
            }
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