/*
 * Name:
 *
 * Description:
 *
 *
 *  Data files:  Runs breadth first search algorithm from source s on a graph G.
 *  After preprocessing the graph, can process shortest path queries
 *  from s to any vertex t.
 *
 *  % java PathFinder data/graphs/routes.txt " " JFK
 *  LAX
 *     JFK
 *     ORD
 *     PHX
 *     LAX
 *  distance 3
 *  MCO
 *     JFK
 *     MCO
 *  distance 1
 *  DFW
 *     JFK
 *     ORD
 *     DFW
 *  distance 2
 *
 ******************************************************************************/

import java.io.FileNotFoundException;
import java.util.LinkedList;

public class PathFinder {

  // TODO: Use Symbol tables
  // prev[v] = previous vertex on shortest path from s to v
  // dist[v] = length of shortest path from s to v
  private __<String, String>  prev = new __<String, String>();
  private __<String, Integer> dist = new __<String, Integer>();

  // run BFS in graph G from given source vertex s
  public PathFinder(Graph G, String s) {

    // TODO: Lookup BFS algorithm from OMOF17P24.java

    // put source on the queue
    ____ queue = new ____;
    dist.___(s, 0);

    // repeated remove next vertex v from queue and insert
    // all its neighbors, provided they haven't yet been visited
    while (!queue.____()) {
      String v = queue.____();
      for (String w : G.adjacentTo(v)) {
        // TODO: How do you know if w is visited?
        if (!dist.____(w)) {
          // Put w on the queue
          dist.__(w, 1 + dist.get(v));
          prev.___(w, v);
        }
      }
    }
  }

  // is v reachable from the source s?
  public boolean hasPathTo(String v) {
    return dist.____(v);
  }

  // return the length of the shortest path from v to s
  public int distanceTo(String v) {
    if (!hasPathTo(v)) return Integer.MAX_VALUE;
    return dist.___(v);
  }

  // return the shortest path from v to s as an Iterable
  public Iterable<String> pathTo(String v) {
    LinkedList<String> path = new LinkedList<>();
    while (v != null && dist.____(v)) {
      path.push(v);
      v = prev.___(v);
    }
    return path;
  }


  public static void main(String[] args) throws FileNotFoundException {
    String filename  = args[0];
    String delimiter = args[1];
    Graph G = new Graph(filename, delimiter);
    String s = args[2];
    PathFinder pf = new PathFinder(G, s);
    while (!StdIn.isEmpty()) {
      String t = StdIn.readLine();
      for (String v : pf.pathTo(t)) {
        StdOut.println("   " + v);
      }
      StdOut.println("distance " + pf.distanceTo(t));
    }
  }
}
