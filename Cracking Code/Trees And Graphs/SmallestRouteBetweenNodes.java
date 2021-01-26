//import org.w3c.dom.Node;
//
//import java.lang.reflect.Array;
//import java.util.LinkedList;
//
//public class SmallestRouteBetweenNodes {
//    enum State { Unvisited, Visited, Visiting; }
//    boolean search(Graph g, Node start, Node end) {
//        if (start == end) return true;
//        // operates as Queue
//        LinkedList<Node> q = new LinkedList<>();
//        for (Node u : g.getNodes()) {
//            u.state = State.Unvisited;
//        }
//        start.state = State.Visiting;
//        q.add(start);
//        Node u;
//        while (!q.isEmpty()) {
//            u = q.removeFirst();//II i.e., dequeue()
//            if (u != null) {
//                for (Node v : u.getAdjacent()) {
//                    if (v.state == State.Unvisited) {
//                        if (v == end) {
//                            return true;
//                        } else {
//                            v.state = State.Visiting;
//                            q.add(v);
//                        }
//                    }
//                }
//            }
//            u.state = State.Visited;
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//
//    }
//}
