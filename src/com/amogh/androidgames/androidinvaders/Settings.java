package com.amogh.androidgames.androidinvaders;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import com.amogh.androidgames.framework.FileIO;

public class Settings {
	public static boolean soundEnabled = true;
	public static boolean touchEnabled = true;
	public final static String file = ".androidinvaders";
	
	public static void load(FileIO files){
		BufferedReader in = null;
		
		try{
			in = new BufferedReader(new InputStreamReader(files.readFile(file)));
			soundEnabled = Boolean.parseBoolean(in.readLine());
			touchEnabled = Boolean.parseBoolean(in.readLine());	
		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}finally{
			try{
				if(in != null)
					in.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void save(FileIO files){
		BufferedWriter out = null;
		try{
			out = new BufferedWriter(new OutputStreamWriter(files.writeFile(file)));
			out.write(Boolean.toString(soundEnabled));
			out.write("\n");
			out.write(Boolean.toString(touchEnabled));
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(out != null)
					out.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}



















