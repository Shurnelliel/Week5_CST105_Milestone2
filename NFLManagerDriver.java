/** Program: NFLManagerDriver Program
* File: NFLPManagerDriver.java
* Summary: This class is test for NFL Manager Driver.
* Author: Shertonia S. Stanley
* Date: December 17, 2017 
**/
import java.util.ArrayList;
import java.util.List;
//This class is used to create , display and manage NFLPlayers
public class NFLManagerDriver {
//List of NFLPlayers
private List<NFLManagerDriver> list=null;
public NFLManagerDriver() {
list=new ArrayList<>();
}
//This method creates atleast 6 players of Type NFLPlayer
public void createPlayers(){
NFLManagerDriver player1=new NFLManagerDriver();
player1.setId(1);
player1.setName("John");
player1.setAddress("California");
NFLManagerDriver player2=new NFLManagerDriver();
player2.setId(2);
player2.setName("Peter");
player2.setAddress("New Southwales");
NFLManagerDriver player3=new NFLManagerDriver();
player3.setId(3);
player3.setName("Harry");
player3.setAddress("New Zealand");
NFLManagerDriver player4=new NFLManagerDriver();
player4.setId(4);
player4.setName("Kevin");
player4.setAddress("California");
NFLManagerDriver player5=new NFLManagerDriver();
player5.setId(5);
player5.setName("Johnny");
player5.setAddress("London");
NFLManagerDriver player6=new NFLManagerDriver();
player6.setId(6);
player6.setName("Andrew");
player6.setAddress("Korea");
list.add(player1);
list.add(player2);
list.add(player3);
list.add(player4);
list.add(player5);
list.add(player6);
}
private void setAddress(String string) {
	// TODO Auto-generated method stub
	
}
private void setName(String string) {
	// TODO Auto-generated method stub
	
}
private void setId(int i) {
	// TODO Auto-generated method stub
	
}
//This method is used to display all 6 players
public void driver(){
for (NFLManagerDriver nflPlayer : list) {
System.out.println("Player id :"+nflPlayer.getId()+" Name :"+nflPlayer.getName()+" Address :"+nflPlayer.getAddress());
}
}
private String getAddress() {
	// TODO Auto-generated method stub
	return null;
}
private String getName() {
	// TODO Auto-generated method stub
	return null;
}
private String getId() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String toString() {
return "NFLPlayerManager [list=" + list + "]";
}
public static void main(String[] args) {
NFLManagerDriver manager=new NFLManagerDriver();
manager.createPlayers();
manager.driver();
}
}
