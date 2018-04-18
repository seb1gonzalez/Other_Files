public class LabDiGraphSG{
  public static void main (String[]args){
    try{
    ArrayDiGraph hanSolo = new ArrayDiGraph();
    hanSolo.addVertex("A","a");
    hanSolo.addVertex("B","b");
    hanSolo.addVertex("C","c");
    hanSolo.addEdge("A","B",1);
    hanSolo.addEdge("A","C",2);
    hanSolo.addVertex("D","d");
    hanSolo.addEdge("B","C",3);
    hanSolo.addEdge("C","D",4);
    hanSolo.addEdge("B","D",5);
    int x = hanSolo.numVertices();
      System.out.println("Num of vertices= "+x);
      System.out.println("A (in degree == "+hanSolo.inDegree("A")+" out degree == "+hanSolo.outDegree("A")+")");
      
    }
    catch(NoSuchVertexException e1){System.out.println("this vertex is not in the graph");}
  }
    
}