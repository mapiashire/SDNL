package Graph1;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertexList;
    private int[][] adjacencyMatrix;
    private int vertexCount;

    public Graph(int size) {
        vertexList = new ArrayList<>();
        adjacencyMatrix = new int[size][size];
        vertexCount = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                adjacencyMatrix[i][j] = -1;
            }
        }
    }

    public void addVertex(char label) {
        vertexList.add(new Vertex(label));
        vertexCount++;
        adjacencyMatrix[vertexCount - 1][vertexCount - 1] = 0;
    }

    public void addEdge(int a, int b, int c) {
        if (a < vertexCount && b < vertexCount) {
            adjacencyMatrix[a][b] = c;
            adjacencyMatrix[b][a] = c;
        } else {
            System.out.println("Vertex index out of bounds.");
        }
    }

    private int indexVertex(char label) {
        for (int i = 0; i < vertexCount; i++) {
            if (vertexList.get(i).label == label) {
                return i;
            }
        }
        return -1;
    }

    public void addEdge(char a, char b, int c) {
        int indexA = indexVertex(a);
        int indexB = indexVertex(b);

        if (indexA != -1 && indexB != -1) {
            adjacencyMatrix[indexA][indexB] = c;
            adjacencyMatrix[indexB][indexA] = c;
        }
    }


    public void printAdjacencyMatrix() {
        System.out.print("  ");
        for (Vertex vertex : vertexList) {
            System.out.printf("|%-4s",vertex.label + " ");
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.printf("%3s", "=");

        }
        System.out.println();

        for (int i = 0; i < vertexCount; i++) {
            System.out.print(vertexList.get(i).label + " ");
            for (int j = 0; j < vertexCount; j++) {
                System.out.printf("|%-4d",adjacencyMatrix[i][j]);
            }
            System.out.println();
        }
    }
}