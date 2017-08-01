
import java.util.Optional;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.ArrayList;

public class GraphTutorial {


 class ColorFactory {
		Optional<String> color;	
		private static ColorFactory colorFactory;
		public static ColorFactory getInstance(){
				if(colorFactory == null){
					colorFactory = new ColorFactory();
				}
				return colorFactory;
		}
	public  Optional<String> generateNextColor(int i){
		switch(i){
			case 0:
			color = new GreenColor().generateColor();
			break;

			case 1:
			color = new RedColor().generateColor();
			break;
			
			case 2:
			color = new YellowColor().generateColor();
			break;
			
			case 3:
			color = new GrayColor().generateColor();
			break;
			
		}

return color;
	}
	}


private interface Color{
	public  abstract Optional<String> generateColor();

}

private class GreenColor implements Color{
Optional<String> color;
public Optional<String> generateColor(){
	color= Optional.of("Green");
	return color;
}
}
private class RedColor implements Color{
Optional<String> color;
public Optional<String> generateColor(){
	color= Optional.of("Red");
	return color;
}
}
private class YellowColor implements Color{
Optional<String> color;
public Optional<String> generateColor(){
	color= Optional.of("Yellow");
	return color;
}
}
private class GrayColor implements Color{
Optional<String> color;
public Optional<String> generateColor(){
	color= Optional.of("Gray");
	return color;
}
}


	static class GraphNode{

		private String label;

		private Set<GraphNode> neighbors ;

		private Optional<String> color;

	public GraphNode(String label){
		this.label = label;
        neighbors = new HashSet<GraphNode>();
        color = Optional.empty();

	}



	public void addNeighbor(GraphNode node ){
		neighbors.add(node);

	}

	public Set<GraphNode> getNeighborSet(){

		return neighbors;
	}

	public List<GraphNode> getNeighborAsList(){
		List<GraphNode> graphNodeList =  new ArrayList(neighbors);

		return graphNodeList;
	}




	public boolean hasColor(){

		return color.isPresent();
	}

	public void setColor(Optional<String> mColor){

		color =  Optional.of(mColor.get());
	}

	public String getColor(){
		return color.get();
	}
	
	public boolean checkIfNeighbourHasSameColor(GraphNode currentNode){
		boolean sameColorFlag = false;
		Optional<String> currentNodeColor = currentNode.color;
		List<GraphNode> neighborNodes = currentNode.getNeighborAsList();

		for (GraphNode node: neighborNodes){
			if(currentNodeColor.get().equals(node.color)){
				sameColorFlag = true;
				break;
			}
		}
		return sameColorFlag;

	}
	}

public static void main(String[] args){
	GraphNode a = new GraphNode("a");
	GraphNode b = new GraphNode("b");
	GraphNode c = new GraphNode("c");
	GraphNode d = new GraphNode("d");
	GraphNode e = new GraphNode("e");
	GraphNode f = new GraphNode("f");
	GraphNode g = new GraphNode("g");
	GraphNode h = new GraphNode("h");
	GraphNode i = new GraphNode("i");
	GraphNode j = new GraphNode("j");
	GraphNode k = new GraphNode("k");
	GraphNode l = new GraphNode("l");
	

	

	a.addNeighbor(b);
	a.addNeighbor(c);
	a.addNeighbor(i);

	b.addNeighbor(a);
	b.addNeighbor(d);
	b.addNeighbor(e);

	c.addNeighbor(a);
	c.addNeighbor(h);
	c.addNeighbor(i);

	d.addNeighbor(e);
	d.addNeighbor(h);

	e.addNeighbor(d);
	e.addNeighbor(f);

	f.addNeighbor(l);
	f.addNeighbor(g);
	f.addNeighbor(e);

	g.addNeighbor(h);
	g.addNeighbor(k);
	g.addNeighbor(f);

	h.addNeighbor(d);
	h.addNeighbor(g);
	h.addNeighbor(c);

	i.addNeighbor(c);
	i.addNeighbor(f);
	i.addNeighbor(a);

	j.addNeighbor(i);
	j.addNeighbor(k);
	j.addNeighbor(l);

	k.addNeighbor(g);
	k.addNeighbor(j);
	k.addNeighbor(l);

	l.addNeighbor(j);
	l.addNeighbor(k);
	l.addNeighbor(f);

	List<GraphNode> graph = Arrays.asList(a, b, c, d, e, f, g, h, i, j, k, l);

	ArrayList<String> colors =  new ArrayList<String>();
	ColorFactory colorFactory = ColorFactory.getInstance();

	for(GraphNode node : graph){
		System.out.println("Node value"+ node.label);
		// List<GraphNode> neighborList = node.getNeighborAsList;
		int colorCount= 0 ;
		for(GraphNode neighbor : node.getNeighborAsList()){
			System.out.println("Node "+ node.label + " neighbor is"+ neighbor.label);
			colorCount %=4;
			colorFactory.generateNextColor(colorCount);
			colorCount++;
			neighbor.setColor(colorFactory.color);

			// check if any neighbor has this color, if so generate next color and check for same
			// while(checkIfNeighbourHasSameColor(	)
		}
	}

}


}