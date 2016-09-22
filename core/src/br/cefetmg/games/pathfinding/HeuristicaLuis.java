package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import static java.lang.Math.abs;

public class HeuristicaLuis implements Heuristic<TileNode>{

    @Override
    public float estimate(TileNode n, TileNode n1) {
        return ((abs(n.getPosition().x - n1.getPosition().x) + abs(n.getPosition().y - n1.getPosition().y))/30);
    }    
}
