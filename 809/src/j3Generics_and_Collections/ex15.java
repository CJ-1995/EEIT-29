package j3Generics_and_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex15 {

	public static void main(String[] args) {
		
		

	}

}

/*
Given:

class Block {
	String color;
	int size;
	Block(int size,String color) {
		this.size=size;
		this.color=color;	
	}
}

and the code fragment:

List<Block> blocks=new ArrayList<>();
blocks.add(new Block(10,"Green"));
blocks.add(new Block(7,"Red"));
blocks.add(new Block(12,"Blue"));
Collections.sort(blocks,new ColorSorter());

Which definition of the ColorScoter class sorts the blocks list?

A) class ColorSorter implements Comparable<Block> {
   		public boolean compare(Block o1,Block o2) {
   			return o1.color.equals(o2.color);   		
   		}  
   }
   
   
B) class ColorSorter implements Comparator<Block> {
		public int compare(Block o1,Block o2) {
			return o1.color.compareTo(o2.color);		
		}
   }
   
   
C) class ColorSorter implements Comparable<Block> {
		public int compareTo(Block o1,Block o2) {
			return o1.color.compareTo(o2.color);		
		}
   }
   
D) class ColorSorter implements Comparator<Block> {
		public boolean compare(Block o1,Block o2) {
			return o1.color.compareTo(o2.color);
		
		}

   }
   
   
   
ans: B



*/