package dao;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.*;

import entity.Blog;
import entity.PostTrend;

public class PostDaoImpl implements PostDao {
	private Connection conn;

	public PostDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean addPostTrend(PostTrend post) {
		try {
			String sql = "Insert into posttrend(title, description, img) values(?,?,?)";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setString(1, post.getTitle());
			p.setString(2, post.getDescription());
			p.setString(3, post.getImg());
			int i = p.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<PostTrend> getAllPostTrend() {
		List<PostTrend> lst = new ArrayList<PostTrend>();
		PostTrend post = null;
		try {
			String sql = "Select * from posttrend";
			PreparedStatement p = conn.prepareStatement(sql);
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				post = new PostTrend();
				post.setId(rs.getInt(1));
				post.setTitle(rs.getString(2));
				post.setDescription(rs.getString(3));
				post.setImg(rs.getString(4));
				lst.add(post);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public PostTrend getPostTrend(int id) {
		PostTrend post = null;
		try {
			String sql = "Select * from posttrend where id=? ";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setInt(1, id);
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				post = new PostTrend();
				post.setId(rs.getInt(1));
				post.setTitle(rs.getString(2));
				post.setDescription(rs.getString(3));
				post.setImg(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return post;
	}

	@Override
	public boolean updatePostTrend(PostTrend post) {
		try {
			String sql = "UPDATE posttrend SET title=?, description=?, img=? WHERE id=?";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setString(1, post.getTitle());
			p.setString(2, post.getDescription());
			p.setString(3, post.getImg());
			p.setInt(4, post.getId());
			int i = p.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deletePostTrend(int id) {
		try {
			String sql = "delete from posttrend where id=?";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setInt(1, id);
			int i = p.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
