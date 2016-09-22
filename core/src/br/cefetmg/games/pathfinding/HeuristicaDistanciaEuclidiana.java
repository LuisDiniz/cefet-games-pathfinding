package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;

public class HeuristicaDistanciaEuclidiana implements Heuristic<TileNode>{

    @Override
    public float estimate(TileNode n, TileNode n1) {
        float distancia = ((n1.getPosition().dst(n.getPosition())) / 30);
        return (distancia);    
    }
    
}
