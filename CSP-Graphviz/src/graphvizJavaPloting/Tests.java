package graphvizJavaPloting;

import java.io.IOException;

public class Tests {

	public static void main(String[] args) throws IOException {
		String[] arrayOfNodes = new String[3];
		arrayOfNodes[0] = "A";
		arrayOfNodes[1] = "B";
		arrayOfNodes[2] = "skip";
		GraphvizJava gv = new GraphvizJava();
		gv.ploting(arrayOfNodes);
	}

}
