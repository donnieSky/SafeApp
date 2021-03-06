package com.donnie.safe.bean;

import android.graphics.drawable.Drawable;

/**  
 * @Title: TaskInfo.java
 * @Package com.donnie.safe.bean
 * @Description: TODO(任务信息)
 * @author donnieSky
 * @date 2015年7月13日 下午3:20:10   
 * @version V1.0  
 */
public class TaskInfo {
	
	private Drawable task_icon;
	private String task_name;
	private String packageName;
	private int pid;
	private long task_memory;
	private boolean isChecked;
	private boolean isUserTask;
	
	public boolean isUserTask() {
		return isUserTask;
	}
	
	public void setUserTask(boolean isUserTask) {
		this.isUserTask = isUserTask;
	}

	public boolean isChecked() {
		return isChecked;
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

	public TaskInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TaskInfo(Drawable task_icon, String task_name, String packageName,
			int pid, long task_memory) {
		super();
		this.task_icon = task_icon;
		this.task_name = task_name;
		this.packageName = packageName;
		this.pid = pid;
		this.task_memory = task_memory;
	}

	public Drawable getTask_icon() {
		return task_icon;
	}
	public void setTask_icon(Drawable task_icon) {
		this.task_icon = task_icon;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public long getTask_memory() {
		return task_memory;
	}
	public void setTask_memory(long task_memory) {
		this.task_memory = task_memory;
	}
	

}
