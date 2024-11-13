package Graph1;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph(5);  

        graph.addVertex('A');
        graph.addVertex('H');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('W');

        graph.addEdge('A', 'H', 100);
        graph.addEdge('A', 'W', 800);
        graph.addEdge('H', 'W', 750);
        graph.addEdge('W', 'C', 400);
        graph.addEdge('C', 'D', 370);

        graph.printAdjacencyMatrix();
    }
}
