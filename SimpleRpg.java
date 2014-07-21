import Entity;
import Attack;
import SpecialAttack;
import RpgBot;
import java.util.*;
public class SimpleRpg
{
	public static void main(String[] args)
	{
		Class[] competitors = {};
		Entity[][] field = new Entity[500][500];
		// TODO populate with obstacles and stuff
		// populate with goblins
		ArrayList<ArrayList<int> > emptySquares = new ArrayList<ArrayList<int> >();
		for(int x = 0, x < 500; x++)
		{
		    for(int y = 0, y < 500; y++)
		    {
			   if(field[x][y] = Entity.NONE)
				  emptySquares.put(x, y);
		    }
		}
		Random r = new Random();
		int goblinsSpawned = 0;
		int goblinsToSpawn = 1000;
		while(goblinsSpawned < goblinsToSpawn)
		{
		    ArrayList<int> newLocation = emptySquares.get(r.nextInt(emptySqures.size()));
		    int newX = newLocation.get(0);
		    int newY = newLocation.get(1);
		    if(field[x][y] != Entity.NONE) continue;
		    field[x][y] = Entity.GOBLIN;
		}

		// spawn orcs
		ArrayList<ArrayList<int> > emptySquares = new ArrayList<ArrayList<int> >();
		for(int x = 0, x < 500; x++)
		{
		    for(int y = 0, y < 500; y++)
		    {
			   if(field[x][y] = Entity.NONE)
				  emptySquares.put(x, y);
		    }
		}
		int orcsSpawned = 0;
		int orcsToSpawn = 300;
		while(orcsSpawned < orcsToSpawn)
		{
		    ArrayList<int> newLocation = emptySquares.get(r.nextInt(emptySqures.size()));
		    int newX = newLocation.get(0);
		    int newY = newLocation.get(1);
		    if(field[x][y] != Entity.NONE) continue;
		    field[x][y] = Entity.ORC;
		}

		// spawn trolls
		ArrayList<ArrayList<int> > emptySquares = new ArrayList<ArrayList<int> >();
		for(int x = 0, x < 500; x++)
		{
		    for(int y = 0, y < 500; y++)
		    {
			   if(field[x][y] = Entity.NONE)
				  emptySquares.put(x, y);
		    }
		}
		int trollsSpawned = 0;
		int trollsToSpawn = 100;
		while(trollsSpawned < trollsToSpawn)
		{
		    ArrayList<int> newLocation = emptySquares.get(r.nextInt(emptySqures.size()));
		    int newX = newLocation.get(0);
		    int newY = newLocation.get(1);
		    if(field[x][y] != Entity.NONE) continue;
		    field[x][y] = Entity.TROLL;
		}

		// spawn giants
		ArrayList<ArrayList<int> > emptySquares = new ArrayList<ArrayList<int> >();
		for(int x = 0, x < 500; x++)
		{
		    for(int y = 0, y < 500; y++)
		    {
			   if(field[x][y] = Entity.NONE)
				  emptySquares.put(x, y);
		    }
		}
		int giantsSpawned = 0;
		int giantsToSpawn = 50;
		while(giantsSpawned < giantsToSpawn)
		{
		    ArrayList<int> newLocation = emptySquares.get(r.nextInt(emptySqures.size()));
		    int newX = newLocation.get(0);
		    int newY = newLocation.get(1);
		    if(field[x][y] != Entity.NONE) continue;
		    field[x][y] = Entity.GIANT;
		}

		// spawn dragons
		ArrayList<ArrayList<int> > emptySquares = new ArrayList<ArrayList<int> >();
		for(int x = 0, x < 500; x++)
		{
		    for(int y = 0, y < 500; y++)
		    {
			   if(field[x][y] = Entity.NONE)
				  emptySquares.put(x, y);
		    }
		}
		int dragonsSpawned = 0;
		int dragonsToSpawn = 50;
		while(dragonsSpawned < dragonsToSpawn)
		{
		    ArrayList<int> newLocation = emptySquares.get(r.nextInt(emptySqures.size()));
		    int newX = newLocation.get(0);
		    int newY = newLocation.get(1);
		    if(field[x][y] != Entity.NONE) continue;
		    field[x][y] = Entity.DRAGON;
		}
	}
}
