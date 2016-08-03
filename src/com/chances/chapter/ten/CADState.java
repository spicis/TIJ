package com.chances.chapter.ten;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class CADState {

	public static void main(String[] args) 
		throws Exception {
		Vector shapeTypes, shapes;
		if(args.length == 0) {
			shapeTypes = new Vector();
			shapes = new Vector();
			shapeTypes.addElement(Circle.class);
			shapeTypes.addElement(Square.class);
			shapeTypes.addElement(Line.class);
			for(int i = 0; i < 10; i++) {
				shapes.addElement(Shape.randomFactory());
			}
			for(int i = 0; i < 10; i++) {
				((Shape)shapes.elementAt(i))
					.setColor(Shape.GREEN);
			}
			ObjectOutputStream out = 
				new ObjectOutputStream(
					new FileOutputStream("CADState.out"));
			out.writeObject(shapeTypes);
			Line.serializeStaticState(out);
			out.writeObject(shapes);
		} else {
			ObjectInputStream in = 
				new ObjectInputStream(
					new FileInputStream(args[0]));
			shapeTypes = (Vector)in.readObject();
			Line.DeserializeStaticState(in);
			shapes = (Vector)in.readObject();
		}
		
		System.out.println(shapes);
	}
}
