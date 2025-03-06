package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		ByteService byteservice = new ByteService();
		
	/*	//불변성(Immutable)의 String
		String str1 = "Hola";
		String str2 = "Hola";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		str2 = str2 + " world";
		System.out.println(str2.hashCode());
		
		//가변성(Mutable)의 Stringbuilder, StringBuffer
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode());
		sb.append("OMG");
		sb.append("daa");
		System.out.println(sb.hashCode());*/
		
		byteservice.fileCopy();
		
	}
}
