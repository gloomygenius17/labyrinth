package pth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class labirintmain {
	
	public static void main(String[] args) {
		labirintmain prog = new labirintmain();
		prog.run();
	}
	
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\small-test.in.txt"));
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\small.output.txt"));
			
			int ci = Integer.parseInt(br.readLine());
			for (int i = 0; i < ci; i++) {
		    	String[] words = br.readLine().split("\\s");
		    	String one = words[0];
		    	String two = words[1];
		    	labirint maze = new labirint();
		    	List<String> l = new ArrayList<>();
				l = maze.lab(one,two);
				
	            bw.write("Case #"+ (i+1) +":"+ "\n");
	            for (int j = 0; j < l.size(); j++) {       	
	            	bw.write(l.get(j) + "\n");
				}
	            bw.flush();
		    }
		
			 br.close();
	         bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Готово!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}