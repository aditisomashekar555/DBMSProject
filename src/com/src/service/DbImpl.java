package com.src.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.src.model.Clothes;
import com.src.model.LoginModel;
import com.src.model.RegisterModel;

public class DbImpl implements DbIntr {
		private static Connection con;
		
		static {
			try {
				Class.forName("org.h2.Driver");
				
			con=DriverManager.getConnection("jdbc:h2:~/test","sa","");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public int addUser(RegisterModel rm) throws SQLException {
			String sql="insert into registration values(null,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, rm.getUsername());
			ps.setString(2,rm.getAddress());
			ps.setString(3, rm.getPhone());
			System.out.println("in backend "+rm.getPassword());
			ps.setString(4,rm.getPassword());
			return ps.executeUpdate();
		}
		
		public boolean login(LoginModel lm) throws SQLException  {
			String sql="select * from registration where name=? and password=?";
			PreparedStatement prepareStatement = con.prepareStatement(sql);
			prepareStatement.setString(1, lm.getUsername());
			prepareStatement.setString(2,lm.getPassword());
			ResultSet executeQuery = prepareStatement.executeQuery();
			return executeQuery.next();
		
		}
		
		public List<String> getUsernames() throws SQLException{
			String sql="select name from registration";
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			List<String> data=new ArrayList<>();
			while(rs.next()) {
				data.add(rs.getString(1));
				
				
			}
			return data;
		}
		
		
		
		public List<Clothes> fetchClothes() throws SQLException{
			String sql="select * from clothes";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			try {
			    rs = stmt.executeQuery();
			} catch (SQLException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
			System.err.println("Error executing "+stmt.toString());
			
			
			
			
			List<Clothes> data=new ArrayList<>();
			while(rs.next()) {
				Clothes m=new Clothes();
				m.setClothes_id(rs.getInt("clothes_id"));
				m.setCategory(rs.getString("category"));
				m.setType(rs.getString("type"));
				m.setStyle(rs.getString("style"));
				m.setColour(rs.getString("colour"));
				m.setSize(rs.getInt("size"));
				m.setCost(rs.getInt("cost"));
		//		m.setImgUrl(rs.getString("images"));
				data.add(m);
			}
			return data;
		}
		
		
		public Clothes fetchById(int id)throws SQLException {
			String sql="select * from clothes where id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			Clothes m=new Clothes();
			
			while(rs.next()) {
				m.setClothes_id(rs.getInt("clothes_id"));
				m.setCategory(rs.getString("category"));
				m.setType(rs.getString("type"));
				m.setStyle(rs.getString("style"));
				m.setColour(rs.getString("colour"));
				m.setSize(rs.getInt("size"));
				m.setCost(rs.getInt("cost"));
			}
			return m;
			
		}
		
		
		


}
