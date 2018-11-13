package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import eneity.Cluster;
import eneity.KMeansRun;

public class Main {
    @SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
        ArrayList<float[]> dataSet = new ArrayList<float[]>();
        BufferedReader br= new BufferedReader(new FileReader(new File("D:/football.txt")));
        int i=0;
        String read=null;
        String[] name = new String[20];
        int name_index=0;
        while((read=br.readLine())!=null){
            // 可能两个数字之间的空格数不固定,可以是n个.
        	String[] str=read.split("\\s+");
        	name[name_index]=str[0];
        	float[] fl=new float[4];
        	for (int j = 0; j < str.length-1; j++) {
        		
        		if (!str[i].equals(null)) {
        			fl[i]=Float.parseFloat(str[i+1]);
            		i++;
            		
				}else {
					return;
				}
			}
        	dataSet.add(fl);
        	i=0;
        }

        

        KMeansRun kRun =new KMeansRun(3, dataSet);
 
        Set<Cluster> clusterSet = kRun.run();
        System.out.println("单次迭代运行次数："+kRun.getIterTimes());
        for (Cluster cluster : clusterSet) {
            System.out.println(cluster);
        }
    }
}

