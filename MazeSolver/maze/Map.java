package maze;

public class Map {
    int[][] MyMap = {
        {1,1,1,1,1,1,0,0},
        {0,0,0,1,0,1,0,0},
        {2,1,0,1,1,1,1,1},
        {1,1,0,0,1,0,0,1},
        {0,1,0,0,1,1,1,1},
        {0,1,1,1,1,0,0,0},
        {1,1,0,1,0,0,1,0},
        {0,1,0,1,1,1,1,0},
    };

    //Constructor
    public Map() {}

    public int[][] getMap() {
        return MyMap;
    }
}

