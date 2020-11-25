package com.kh.sample02;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kh.sample02.dao.BoardDao;
import com.kh.sample02.dao.MemberDao;
import com.kh.sample02.domain.BoardVo;
import com.kh.sample02.domain.MemberVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardDaoTest {

	@Inject
	BoardDao boardDao;
	
	@Test
	public void testInsertArticle() {
		BoardVo boardVo = new BoardVo();
		boardVo.setB_title("제목3");
		boardVo.setB_content("내용3");
		boardVo.setUser_id("user02");
		boardDao.insertArticle(boardVo);
	}
	
	@Test
	public void testBoardList() {
		List<BoardVo> boardList = boardDao.boardList(); // ???
	}
	
	@Test
	public void testselectArticle() {
		BoardVo boardVo = boardDao.selectArticle(1);
	}
	
	@Test
	public void testUpdateArticle() {
		BoardVo boardVo = new BoardVo();
		boardVo.setB_title("제목3");
		boardVo.setB_content("내용3");
		boardVo.setB_no(3);
		boardDao.updateArticle(boardVo);
	}
	
	@Test
	public void testDeleteArticle() {
		boardDao.deleteArticle(2);
	}
	
}