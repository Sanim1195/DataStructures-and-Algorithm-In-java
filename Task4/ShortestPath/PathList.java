package ShortestPath;/*
 *Author: Sanim Pokhrel
 *//*
 *Author: Sanim Pokhrel
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PathList implements Comparable<PathList> {
     int cost;
     ArrayList<Node> path ;

    public PathList(int cost, ArrayList<Node> path){
        this.cost = cost;
        this.path = (ArrayList<Node>) path.stream().collect(Collectors.toList());

    }
    public int compareTo(PathList p) {

        return 0;
    }

    @Override
    public String toString() {


//        return cost + " " + path;


        return "PathList{" +
                "cost=" + cost +
                ", path=" + path +
                '}';


}}
