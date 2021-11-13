package javainterview;
import java.util.ArrayList;

public class Team {
public ArrayList<String>getDevicesList(String teamName)
{
	System.out.println("team name is:" +teamName);
	ArrayList<String> devicesList=new ArrayList<String>();
	if(teamName.equals("QA"))
	{
		devicesList.add("iphone X");
		devicesList.add("iphone 7");
		devicesList.add("Samsung 5");
	}
	else if(teamName.equals("Dev"))
	{
		devicesList.add("iphone12");
		devicesList.add("iphone8");
		devicesList.add("iphone9");
		
	}
	else if(teamName.equals("DevOps"))
			{
		System.out.println("iphone plus 12");
			}
	
	else
	{
		System.out.println(" team is not found..."+teamName);
	}
	return devicesList;
	
}
	
	
}
