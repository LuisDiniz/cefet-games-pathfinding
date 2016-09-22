package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;

public class HeuristicaNula implements Heuristic<TileNode>{

    @Override
    public float estimate(TileNode n, TileNode n1) {
        return 0;
    }
    
}
