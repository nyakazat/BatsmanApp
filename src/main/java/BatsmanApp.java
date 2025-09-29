public class BatsmanApp {
public static void main(String[] args) {

String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};


String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};


int[][] runs = {
{5000, 3500, 6200}, 
{3800, 3700, 5000}, 
{4200, 3900, 5200} 
};


System.out.println("******************************");
System.out.println(" CRICKET RUNS REPORT");
System.out.println("******************************\n");


System.out.printf("%-18s", "Batsman");
for (String stadium : stadiums) {
System.out.printf("%-12s", stadium);
}
System.out.println();

for (int i = 0; i < batsmen.length; i++) {
System.out.printf("%-18s", batsmen[i]);
for (int j = 0; j < stadiums.length; j++) {
System.out.printf("%-12d", runs[i][j]);
}
System.out.println();
}


System.out.println("\n******************************");
System.out.println(" TOTAL RUNS PER BATSMAN");
System.out.println("******************************");
for (int i = 0; i < batsmen.length; i++) {
int total = 0;
for (int j = 0; j < stadiums.length; j++) {
total += runs[i][j];
}
System.out.println(batsmen[i] + ": " + total);
}


System.out.println("\n******************************");
System.out.println(" Highest runs per Stadium");
System.out.println("******************************");

int maxStadiumTotal = 0;
String topStadium = "";

for (int j = 0; j < stadiums.length; j++) {
int maxRuns = runs[0][j];
String topBatsman = batsmen[0];
int stadiumTotal = 0;

for (int i = 0; i < batsmen.length; i++) {
stadiumTotal += runs[i][j];
if (runs[i][j] > maxRuns) {
maxRuns = runs[i][j];
topBatsman = batsmen[i];
}
}

System.out.println(stadiums[j] + " ? " + topBatsman + " (" + maxRuns + " runs)");

if (stadiumTotal > maxStadiumTotal) {
maxStadiumTotal = stadiumTotal;
topStadium = stadiums[j];
}
}


System.out.println("\n******************************");
System.out.println(" Stadium with MOST runs scored ");
System.out.println("******************************");
System.out.println(topStadium + " with " + maxStadiumTotal + " runs");
}
}