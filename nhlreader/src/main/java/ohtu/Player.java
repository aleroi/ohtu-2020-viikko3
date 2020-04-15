
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private int goals;
    private int assists;
    private String team;
    private String nationality;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setGoals(int goals) {
        this.goals = goals;
    }
    public int getGoals() {
        return this.goals;
    }
    public void setAssists(int assists) {
        this.assists = assists;
    }
    public int getAssists() {
        return this.assists;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public String getTeam() {
        return this.team;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getNationality() {
        return this.nationality;
    }
    public int getGoalsAndAssists() {
        return getGoals() + getAssists();
    }
    @Override
    public String toString() {
        return name + "\t" + team + "\t" + goals + " + " + assists + " = " + getGoalsAndAssists();
    }

        @Override
        public int compareTo(Player p) {
            return p.assists + p.goals - this.assists - this.goals;
        }

}
