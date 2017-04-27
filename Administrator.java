package com.wipro.bus.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.wipro.bus.bean.ScheduleBean;
public class Administrator {
	Connection conn;
	public String addSchedule(ScheduleBean scheduleBean)
	{
		ScheduleBean sb=new ScheduleBean();
		if(sb.getSource()=="Chennai " && sb.getDestination()=="Chennai")
		{
		return "Source and Destination Same";
		}
		return "INVALID INPUT";
		
		
	}
	public ArrayList<ScheduleBean> viewSchedule(String source,String destination) throws ClassNotFoundException, SQLException
	{
		
		return null;
			}
}
