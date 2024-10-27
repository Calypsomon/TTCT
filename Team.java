public class Team {
String name;
String shortname;
String[] players;
int Points;

    public Team(String name,String shortname ,int teamsize){
        this.name = name;
        if(shortname.length() > 3)
            throw new IllegalArgumentException("Shortname must be 3 characters or less");
        this.shortname = shortname;
        this.players = new String[teamsize];
    }
    public void getTeam(){
        System.out.println("Team name: " + name);
    }
    public void getPlayers(){
        for(int i = 0; i < players.length; i++){
            System.out.println("Player " + (i+1) + ": " + players[i] + "\n");
            if (players[i] == null){
                System.out.println("Player " + (i+1) + ": " + "---" + "\n");
            }
        }
    }
}