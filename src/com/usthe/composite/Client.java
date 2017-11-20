/**
 * 
 */
package com.usthe.composite;

/**
 * @ClassName Client
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月18日 下午4:21:15
 * @site usthe.com
 */
public class Client {

	public static void main(String[] args) {
		AbstractFile f2,f3;
		Folder f1 = new Folder("file1");
		f2 = new ImageFile("iamge1");
		f3 = new VideoFile("video1");
		f1.add(f2);
		f1.add(f3);
		Folder f4 = new Folder("file2");
		f4.add(f1);
		Folder f5 = new Folder("file3");
		f5.add(f4);
		System.out.println("***************");
		f5.killVirus();
		System.out.println("***************");
		f5.remove(f4);
		f5.killVirus();
		System.out.println("****************");
		f4.getFile(0).killVirus();
		
	}
}
