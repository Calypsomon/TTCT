public class TournamentTreeCreator {
    public static void main(String[] args) {
        Team l= new Team(" Billi billi gaming","BLG",5);
        l.getTeam();
        Tree csWingman= new Tree();
        csWingman.creattopf(7,2);
        csWingman.Swiss();
        csWingman.team1wins(0);
        csWingman.team1wins(1);
        csWingman.team1wins(2);
        csWingman.getteams();
        csWingman.leaderboard();
    }
}
