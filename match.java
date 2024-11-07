
public class match {
    
    int matchcode;
    Team team1;
    Team team2;
    int resultteam1;
    int resultteam2;
public match (Team team1, Team team2, int matchcode) {   
this.team1 = team1;
this.team2 = team2;
this.matchcode = matchcode;
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
public void draw(){
    resultteam1 = 1;
    resultteam2 = 1;
}
public void finishmatch(){
    team1.addPoint(resultteam1);
    team2.addPoint(resultteam2);
}
}