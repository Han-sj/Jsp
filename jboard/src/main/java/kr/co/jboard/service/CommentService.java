package kr.co.jboard.service;

import java.util.List;

import kr.co.jboard.dao.ArticleDAO;
import kr.co.jboard.dto.ArticleDTO;

public enum CommentService {

	// 열거 상수 객체(싱글톤)
	instance;
	
	// DAO 가져오기
	private ArticleDAO dao = ArticleDAO.getInstance();
	
	// DAO 호출 서비스 메서드
	public void register(ArticleDTO dto) {
		dao.insert(dto);
	}
	
	public ArticleDTO findById(String ano) {
		return dao.select(ano);
	}
	
	public List<ArticleDTO> findAll(int start) {
		return dao.selectAll(start);
	}
	
	public void modify(ArticleDTO dto) {
		dao.update(dto);
	}
	
	public void remove(String ano) {
		dao.delete(ano);
	}
	
	
}
