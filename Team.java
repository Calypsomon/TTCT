public class Team {
    String name;
    String shortname;
    String[] players;
    int Points;
    int teamsize;

    public Team(String name,String shortname ,int teamsize){
        this.name = name;
        if(shortname.length() > 3)
            throw new IllegalArgumentException("Shortname must be 3 characters or less");
        this.shortname = shortname;
        this.players = new String[teamsize];
        this.Points = 0;
        this.teamsize = teamsize;
    }
    public void getTeamname(){
        System.out.println("Team name: " + name + "/ " + shortname);
    }
    public void getPlayers(){
        for(int i = 0; i < players.length; i++){
            if (players[i] == null){
                System.out.println("Player " + (i+1) + ": " + "_____" + "");
            }   else {
                System.out.println("Player " + (i+1) + ": " + players[i] + "");
            }
        }
    }
    public void getTeam(){
        getTeamname();
        getPlayers();
        System.out.println("Points: " + Points);
    }
    public int getPoint(){
        return Points;
    }
    public String getteampoints(){
     return (name + "  Points: " + Points);
    }
    public int getTeamsize(){ 
        return teamsize;
    }
    public void addplayer(int x,String player){
        players[x] = player;
    }
    public void addPoint(int point){
        Points += point;
    }
    public void removePlayer(String player){
        for(int i = 0; i < players.length; i++){
            if(players[i].equals(player)){
                players[i] = null;
                break;
            }
        }
    }
    public void removePoint(int point){
        Points -= point;
    }
    public void changeTeamname(String name){
        this.name = name;
    }
    public void changeShortname(String shortname){
        if(shortname.length() > 3)
            throw new IllegalArgumentException("Shortname must be 3 characters or less");
        this.shortname = shortname;
    }
} //by Calypsomon