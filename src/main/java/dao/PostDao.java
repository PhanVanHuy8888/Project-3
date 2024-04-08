package dao;

import java.util.List;

import entity.Blog;
import entity.PostTrend;

public interface PostDao {
	public boolean addPostTrend(PostTrend post);
	public List<PostTrend> getAllPostTrend();
	public PostTrend getPostTrend(int id);
	public boolean updatePostTrend(PostTrend post);
	public boolean deletePostTrend(int id);
	
}
