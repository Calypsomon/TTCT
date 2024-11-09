
public class match {
    
    int matchcode;
    Team team1;
    Team team2;
    Team Gewinnerteam;
    Team Verliererteam;
    int resultteam1;
    int resultteam2;
    boolean finischt = false;
public match (Team team1, Team team2, int matchcode) {   
this.team1 = team1;
this.team2 = team2;
this.matchcode = matchcode;
if (team2.getname() =="FreeWin187"){
team1wins();
finishmatch();
}
if (team1.getname() =="FreeWin187"){
    team2wins();
    finishmatch();
    }
}
public void getmatch(){
    System.out.println("" + team1.getshortname() + " vs " + team2.getshortname()+ "//" + matchcode);
}
public void team1wins(){
    resultteam1 = 2;
    resultteam2 = 0;
}
public void team2wins(){
    resultteam1 = 0;
    resultteam2 = 2;
}
public void finishmatch(){
    team1.addPoint(resultteam1);
    team2.addPoint(resultteam2);
    if (resultteam1 > resultteam2){
        Gewinnerteam = team1;
        Verliererteam = team2;
        matchcode = matchcode + 100;
        finischt = true;
    }
}
public Team getWinner(){
    return Gewinnerteam;
}
public Team getLooser(){
    return Verliererteam;
}
public boolean finished(){
return finischt;
}
} //by Calypsomon