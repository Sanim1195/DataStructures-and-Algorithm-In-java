package ShortestPath;/*
 *Author: Sanim Pokhrel
 *//*
 *Author: Sanim Pokhrel
 */

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.*;

public class Graph {
//    Array list of nodes that stores vertex with edges and weight (e:1->2,w: 2)
    ArrayList<Node>[] arr;

//    array that holds boolean value for visited nodes
    boolean[] visited;

//    array that holds special vertex
    int [] specialVertex;

//    Priority queue that holds the weight(cost) and it's corresponding path list in descending order
    static PriorityQueue <PathList> p ;



    public Graph(int vertices, int edges) {
        arr = new ArrayList[edges];
        initializeArraylist(edges);
        specialVertex = new int[vertices];
        visited = new boolean[vertices];
//        Instantiating priroity q
         p = new PriorityQueue<PathList>(new CustomIntegerComparator());



    }

//    Adding edge between two nodes
    void addEdge(int source, int destination, int weight) {
        Node n = new Node(destination, weight);
        arr[source].add(n);
    }

    static boolean checkEdge(ArrayList<Node> a){
        if (a.size() >= 2) {
            for (int i = 1; i < a.size() - 1; i++) {
                if (a.get(i).weight / 2 <= a.get(i + 1).weight && a.get(i + 1).weight <= a.get(i).weight * 2) {
                    return true;
                }

            }
        }
        return false;

    }

    boolean checkSpecialVertex(ArrayList<Node> a, int[] specialVertex){
        for (int i = 0; i <a.size() ; i++) {
            for (int j = 0; j <specialVertex.length ; j++) {

                if (a.get(i).vertex == specialVertex[j] ){
                    return true;
                }
            }
        }
        return false;

    }
    void initializeArraylist(int edges) {
        for (int i = 0; i < edges; i++) {
            arr[i] = new ArrayList();
        }
    }

    void initializespecialVertex(int vertices){
        specialVertex = new int[vertices];
        for (int i = 0; i <vertices ; i++) {
            specialVertex[i] = 0;
        }
    }

    void dfsHelper(int start, int end, ArrayList<Node> tempPathList) {
        if (start == end) {

            int cost = calculateCost(tempPathList);
            System.out.println(tempPathList);

            PathList pl = new PathList(cost,tempPathList);
            if (checkEdge(tempPathList) && checkSpecialVertex(tempPathList,specialVertex)) {
                p.add(pl);
            }

            return;
        }

        visited[start] = true;
        for (Node i : arr[start]) {

            if (!visited[i.vertex]) {
                tempPathList.add(i);
                dfsHelper(i.vertex, end, tempPathList);
                tempPathList.remove(i);
            }
        }
        visited[start] = false;
    }

    void dfs(int startVertex, int destination) {
        ArrayList<Node> pathList = new ArrayList<>();
        pathList.add(new Node (startVertex,0));
        dfsHelper(startVertex, destination, pathList);

    }

//    Functions that calculates the cost of the path
    private int calculateCost(List <Node> pathList){
        int cost = 0;
        for (Node n : pathList){
          cost += n.weight;
        }
        return cost;
    }



    public static void main(String[] args) {
        Graph g = new Graph(4,5);
        g.addEdge(0, 1, 2);
        g.addEdge(0, 2, 2);
        g.addEdge(1, 2, 2);
        g.addEdge(1,3,3);
        g.addEdge(2,3,2);


        int source = 0;
        int destination = 3;
        //initializespecialVertex(1);
        g.specialVertex[0] = 1;
        System.out.println(" The possible " + source + " " +destination + " are ");
        g.dfs(source,destination);
        System.out.println(p.peek());


    }


}