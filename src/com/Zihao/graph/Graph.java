package com.Zihao.graph;

import java.util.ArrayList;

public class Graph {
    private ArrayList<String> vertexes;
    private int[][] edges;
    private int vertexNum;
    private boolean[] visited;

    public Graph(int vertexNum) {
        this.vertexNum = vertexNum;
        vertexes = new ArrayList<>(vertexNum);
        edges = new int[vertexNum][vertexNum];
        visited = new boolean[vertexNum];
    }

    public void addVertex(String vertex){
        vertexes.add(vertex);
    }

    public void addEdge(int v1, int v2, int weight) {
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
    }

    public void show(){
        for (int i = 0; i < vertexNum; i++){
            for (int j = 0; j < vertexNum; j++){
                System.out.print(edges[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void DFS(){

    }
}
