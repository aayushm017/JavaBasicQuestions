package Graphs;

import java.util.Scanner;

public class DijkstrasAlgo {
    private static void dijkstras(int[][] adjacencyMatrix){
        int v = adjacencyMatrix.length;
        boolean visited[]=new boolean[v];
        int distance[] = new int[v];
        distance[0]=0;
        for(int i=1; i<v; i++){
            distance[i] = Integer.MAX_VALUE; //SET AS INFINITY
        }
        for(int i= 0; i<v; i++){

            //TODO: Pick Vertex with min. weight
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex]=true;

            //TODO: Explore its Unvisited neighbours
            for(int j = 0; j < v; j++){
                if(adjacencyMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex]!=Integer.MAX_VALUE){
                    int newDist = distance[minVertex] + adjacencyMatrix[minVertex][j];
                    if(newDist < distance[j]){
                        distance[j] = newDist;
                    }
                }
            }
        }

        //TODO:Print edge of MST
        for(int i=1; i<v; i++){
            System.out.println(i + " " + distance[i]);
        }
    }

    private static int findMinVertex(int[] distance, boolean visited[]){
        int minVertex = -1;
        for(int i=0; i < distance.length; i++){
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        int adjacencyMatrix[][] = new int[v][v];
        for(int i= 0; i<e; i++){
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            int distance = s.nextInt();
            adjacencyMatrix[v1][v2] = distance;
            adjacencyMatrix[v1][v2] = distance;
        }
        dijkstras(adjacencyMatrix);
    }
}
