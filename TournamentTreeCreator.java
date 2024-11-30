public class TournamentTreeCreator {
    public static void main(String[] args) {
        Team l= new Team(" Billi billi gaming","BLG",5);
        l.getTeam();
        Tree csWingman= new Tree();
        csWingman.creattopf(7,2);
        csWingman.Swiss();
        System.out.println("hello");
        csWingman.leaderboard();
        csWingman.getteams();
    }
}
