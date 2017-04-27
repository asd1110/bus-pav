package com.wipro.bus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.wipro.bus.bean.ScheduleBean;
import com.wipro.bus.util.DBUtil;
public class ScheduleDAO {
	Connection conn;
	PreparedStatement ps;
	public String createSchedule(ScheduleBean scheduleBean) throws ClassNotFoundException, SQLException
	{
		conn=DBUtil.getDBConnection();
		ps=conn.prepareStatement("insert into  SCHEDULE_TB values(?,?,?,?,?)");
		ps.setString(1,scheduleBean.getScheduleId());
		ps.setString(2,scheduleBean.getSource());
		ps.setString(3,scheduleBean.getDestination());
		ps.setString(4,scheduleBean.getStartTime());
		ps.setString(5,scheduleBean.getArrivalTime());
		 ps.executeUpdate();
		return  "SUCCESS";
		
	}
	public String generateID(String source, String destination) throws SQLException, ClassNotFoundException
	{
		conn=DBUtil.getDBConnection();
		int SCHEDULE_SEQ=1000;
		String source1=source.substring(0,2);
		String des1=destination.substring(0,2);
    	ps=conn.prepareStatement("select SCHEDULE_SEQ.nextval from dual");
    	ResultSet rs=ps.executeQuery();
    	while(rs.next())
    	{
    		SCHEDULE_SEQ=rs.getInt(1);
    	}
    	System.out.println(source1.toUpperCase()+des1.toUpperCase() +SCHEDULE_SEQ );
    	return source1.toUpperCase()+ des1.toUpperCase()+SCHEDULE_SEQ;
    	}
	public  ArrayList<ScheduleBean> viewSchedule(String source,String destination) throws ClassNotFoundException, SQLException
	{
		ArrayList<ScheduleBean> list=new ArrayList<ScheduleBean>();
		conn=DBUtil.getDBConnection();
		@SuppressWarnings("unused")
		ScheduleBean scb=new ScheduleBean();
		return list;
}
}
