package br.com.contacts;

import java.util.List;

public interface ITaskController {
	
	public boolean save();

	public List<TaskPresenter> loadTasks();

	public void load(Integer id);

	public boolean delete();

	public void create();

	public void onDescriptionChange(String email);

	
	
	public void setActionBarListener(ActionBarListener listener);


}
