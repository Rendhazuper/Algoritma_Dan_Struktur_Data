package Praktikum.Praktikum13;

public class GraphMain24 {
    public static void main(String[] args) throws Exception {
    Graph24 gedung = new Graph24(6);    
    gedung.addEdge(0,1,50);
    gedung.addEdge(0,2 , 100);
    gedung.addEdge(1,3,70);
    gedung.addEdge(2,3,40);
    gedung.addEdge(3,4,60);
    gedung.addEdge(4,5,80);
    gedung.degree(0);
    gedung.printGraph();
    gedung.removeEdge(1, 3);
    gedung.printGraph();

    GraphMatriks24 gdg = new GraphMatriks24(4);
    gdg.makeEdge(0, 1, 50);
    gdg.makeEdge(1, 0, 60);
    gdg.makeEdge(1, 2, 70);
    gdg.makeEdge(2, 1, 80);
    gdg.makeEdge(2, 3, 40);
    gdg.makeEdge(3, 0, 90);
    gdg.printGraph();
    System.out.println("Hasil setelah penghapus edge");
    gdg.removeEdge(2, 1);
    gdg.printGraph();
    }
}
