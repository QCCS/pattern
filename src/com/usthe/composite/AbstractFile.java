/**
 * 
 */
package com.usthe.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName AbstractFile
 * @Description TODO组合模式实例  文件查杀
 * @author tomsun28
 * @Date 2017年11月18日 下午4:02:37
 * @site usthe.com
 */
public interface AbstractFile {

	void killVirus();
}


//叶子节点
class ImageFile implements AbstractFile{

	private String name;
	@Override
	public void killVirus() {

		System.out.println("图像文件："+name+" 进行查杀 ");
		
	}
	/**
	 * @Title ImageFile
	 * @Description TODO
	 * @param @param name
	 * @throws 
	 */
	public ImageFile(String name) {
		super();
		this.name = name;
	}
	
}
class TextFile implements AbstractFile{

	private String name;
	@Override
	public void killVirus() {

		System.out.println("文本文件："+name+" 进行查杀 ");
		
	}
	/**
	 * @Title ImageFile
	 * @Description TODO
	 * @param @param name
	 * @throws 
	 */
	public TextFile(String name) {
		super();
		this.name = name;
	}
	
}
class VideoFile implements AbstractFile{

	private String name;
	@Override
	public void killVirus() {

		System.out.println("音频文件："+name+" 进行查杀 ");
		
	}
	/**
	 * @Title ImageFile
	 * @Description TODO
	 * @param @param name
	 * @throws 
	 */
	public VideoFile(String name) {
		super();
		this.name = name;
	}
	
}

//容器节点

class Folder implements AbstractFile{

	private String name;
	//存储个容器节点下面的子节点
	private List<AbstractFile> list  = new ArrayList<>();
	
	/**
	 * @Title Folder
	 * @Description TODO
	 * @param @param name
	 * @throws 
	 */
	public Folder(String name) {
		super();
		this.name = name;
	}
	
	public void add(AbstractFile file){
		list.add(file);
	}
	public void remove(AbstractFile file){
		list.remove(file);
	}
	public AbstractFile getFile(int index){
		
		return list.get(index);
	}


	@Override
	public void killVirus() {

		System.out.println("文件夹："+name+"进行查杀！");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			AbstractFile file = (AbstractFile) iterator.next();
			file.killVirus();
			
		}
	}
	
	
}
