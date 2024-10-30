public class TournamentTreeCreator {
    public static void main(String[] args) {
        Team l= new Team(" Billi billi gaming","BLG",5);
        l.getTeam();
        Tree csWingman= new Tree();
        csWingman.creattopf(8,2);
        csWingman.additteam(3);
        csWingman.additteam(0);
        csWingman.addPoint(0,2);
        csWingman.addPoint(3,7);
        csWingman.addPoint(6,1);
        csWingman.getteams();
        csWingman.leaderboard();
    }
}
