
public class match {
    
    int matchcode;
    Team team1;
    Team team2;
    Team Gewinnerteam;
    Team Verliererteam;
    int resultteam1;
    int resultteam2;
    boolean finischt = false;
public match (Team team1, Team team2, int matchcode) {          //Construcor erstellt mit 2 teams ein match mit dem matchcode
this.team1 = team1;
this.team2 = team2;
this.matchcode = matchcode;
if (team2.getname() =="FreeWin187"){
team1wins();
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
public int getmatchcode(){
return matchcode;
}
public void finishmatch(){              //macht das ausgewählte team zum Winner/verlierer, setzt matchcode hoch.
    team1.addPoint(resultteam1);
    team2.addPoint(resultteam2);
    if (resultteam1 > resultteam2){
        Gewinnerteam = team1;
        Verliererteam = team2;
    } else {
        Gewinnerteam = team2;
        Verliererteam = team1;
    }
        matchcode = matchcode + 100;
        finischt = true;
}
public Team getWinner(){
    if (Gewinnerteam == team1){
    return team1;
    } else {
    return team2;
}}
public Team getLooser(){
    if (Verliererteam == team1){
        return team1;
        } else {
        return team2;
    }}
public String getname1(){
    return team1.getname();
}
public String getname2(){
    return team2.getname();
}
public boolean finished(){
return finischt;
}
} //by Calypsomon