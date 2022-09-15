package ShortestPath;/*
 *Author: Sanim Pokhrel
 *//*
 *Author: Sanim Pokhrel
 */

import java.util.Comparator;

public class Node {
    int vertex;
    int weight;

    public Node(int vertex, int weight){
        this.vertex = vertex;
        this.weight = weight;

    }

    public int getVertex() {
        return vertex;
    }

    public void setVertex(int vertex) {
        this.vertex = vertex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  Integer.toString(vertex);

    }
}

//The comparator class helps to compare betweeen items inside the proirity queue
class CustomIntegerComparator implements Comparator<PathList> {



    @Override
    public int compare(PathList o1, PathList o2) {
        return o1.cost > o2.cost ? 1:-1;
    }
}
