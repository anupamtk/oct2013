package com.anupam.file;

import java.io.File;

public class Path {
	public static void main(String args[]) {
        File dir1 = new File(".\\src\\com\\lib");
        File dir2 = new File(".");
        File dir3 = new File("..");
        try {
            System.out.println("Current dir : " + dir1.getCanonicalPath());
            System.out.println("Parent  dir : " + dir2.getCanonicalPath());
            System.out.println("Parent  dir : " + dir3.getCanonicalPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
